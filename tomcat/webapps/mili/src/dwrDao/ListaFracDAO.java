package dwrDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.DBUtils;
public class ListaFracDAO {

public Collection mostrarLista() {

	      Collection lista = new Vector();
              String  sqla ="select distinct(a.id_aten),a.cod_do,e.fecha_a,e.id_ext,rp.resultado,p.id_prueba,e.bolsa from  atencion a,extraccion e,resultado_prueba rp,prueba p where(a.id_aten=e.id_ext)and (e.fraccionado='T')and not(e.bolsa='Simples')and((a.atendidoe='A')and(a.atendido='A')and(a.atendidop='A')and(a.atendidoh='A')and(a.atendidos='A'))and((a.id_aten=rp.id_aten)and(rp.instancia='inmunohematologia'))and((p.id_prueba=rp.id_prueba)and(p.nombre_tp='Placa Gs-Rh'))  ;";

	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarPre(rs);
				lista.add(apartment);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmta.close();
				ca.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return lista;
	}
	
	private NivelesRevicionLab getListarPre(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
	
		ap.setId_aten(rs.getInt("id_aten"));		
		ap.setCod_do(rs.getString("cod_do"));
		ap.setFecha_a(rs.getString("fecha_a"));				
		ap.setId_ext(rs.getInt("id_ext"));
		ap.setResultado(rs.getString("resultado"));
		ap.setId_prueba(rs.getInt("id_prueba"));
		ap.setBolsa(rs.getString("bolsa"));
		
		return ap;
       }

public Collection mostrar(int id_aten) {

	      Collection lista = new Vector();
              String  sqla ="select d.cod_do,e.id_ext,rp.resultado,p.id_prueba  from atencion a,donante d,extraccion e,resultado_prueba rp,prueba p  where (a.id_aten=e.id_aten)and(d.cod_do=a.cod_do)and (e.cod_do=a.cod_do) and(a.id_aten="+id_aten+")and (a.id_aten=rp.id_aten)and(p.nombre_tp='placa gs-rh')and(rp.instancia='inmunohematologia')and(p.id_prueba=rp.id_prueba) ;";

	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarE(rs);
				lista.add(apartment);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmta.close();
				ca.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return lista;
	}
	
	private NivelesRevicionLab getListarE(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
		ap.setCod_do(rs.getString("cod_do"));
		ap.setId_ext(rs.getInt("id_ext"));
		ap.setResultado(rs.getString("resultado"));
		ap.setId_prueba(rs.getInt("id_prueba"));
		return ap;
       }


public Collection mostrarCombo() {

	      Collection lista = new Vector();
              String  sqla ="select nombre,id_hemo  from hemocomponente where estado='N' and estado1='0';";

	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarEx(rs);
				lista.add(apartment);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmta.close();
				ca.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return lista;
	}
	
	private NivelesRevicionLab getListarEx(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
		ap.setNombre(rs.getString("nombre"));
		ap.setId_hemo(rs.getInt("id_hemo"));
		return ap;
       }

public void adicionarR(int n0, String fecha_produccion,String fecha_expi,int id_aten,int id_ext,String cod_do,String resultado,String cantidad,String cod_per,int id_horario)  
{
                String sqlpw="";
                int id_prod= countRegistro_datos()+1;
		String pruebas="N";
		String fraccionado="A";
		String control="N";
		//int estado=1;
		
		sqlpw = "insert into produce(id_prod,id_hemo,cod_do,cantidad,fecha_expi,id_ext,pruebas_salida,control_calidad,gs_rh,fecha_a,estado,cod_per,id_horario) values ("+id_prod+","+n0+",'"+cod_do+"','"+cantidad+"','"+fecha_expi+"',"+id_ext+",'"+pruebas+"','"+control+"','"+resultado+"','"+fecha_produccion+"',1,'"+cod_per+"',"+id_horario+")  ;";
		
	        Connection c122 = null;
		Statement stmt122 = null;
		try {
			c122 = DBUtils.openConnection();
			stmt122 = c122.createStatement();
			// just run the sql statement
			ResultSet rs = stmt122.executeQuery(sqlpw);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt122.close();
				c122.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		

	   
	   
	   }


public Collection ListaT(String cod_do,int id_aten) {

	      Collection lista = new Vector();
              String  sqla ="select h.nombre,p.fecha_a,p.fecha_expi,p.cantidad  from hemocomponente h,produce p  where (p.estado=1)and(h.id_hemo=p.id_hemo)and(p.cod_do='"+cod_do+"')and(p.fecha_a=(select max(d.fecha_a) from produce d,extraccion e where(d.cod_do='"+cod_do+"')and(e.cod_do=p.cod_do)and(e.id_ext="+id_aten+") ) ); ";

	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run	 the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarm(rs);
				lista.add(apartment);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmta.close();
				ca.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return lista;
	}
	
	private NivelesRevicionLab getListarm(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
	

		ap.setNombre(rs.getString("nombre"));
		ap.setFecha_a(rs.getString("fecha_a"));
		ap.setFecha_expi(rs.getString("fecha_expi"));
		ap.setCantidad(rs.getString("cantidad"));
		return ap;
       }


public void FinalizarTodo(int id_ext)  
{
                String sqlpw="";

	        String frac="A";
		
	        sqlpw = "UPDATE extraccion SET fraccionado = '"+frac+"' WHERE id_ext = "+id_ext+"   ;";
                  
	        Connection c122 = null;
		Statement stmt122 = null;
		try {
			c122 = DBUtils.openConnection();
			stmt122 = c122.createStatement();
			// just run the sql statement
			ResultSet rs = stmt122.executeQuery(sqlpw);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt122.close();
				c122.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		


           
	   
	   
	   }


public Collection ListaTotalL() {

	      Collection lista = new Vector();
              String  sqla ="select p.id_prod,p.cod_do,p.gs_rh,p.fecha_expi,p.fecha_a,h.nombre,h.id_hemo from produce p,hemocomponente h where (p.id_hemo=h.id_hemo)and(p.estado=1)  ;";

	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run	 the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListark(rs);
				lista.add(apartment);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmta.close();
				ca.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return lista;
	}
	
	private NivelesRevicionLab getListark(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();


		ap.setId_prod(rs.getInt("id_prod"));
		ap.setCod_do(rs.getString("cod_do"));
		ap.setGs_rh(rs.getString("gs_rh"));
		ap.setFecha_expi(rs.getString("fecha_expi"));
		ap.setFecha_a(rs.getString("fecha_a"));
		ap.setNombre(rs.getString("nombre"));
		ap.setId_hemo(rs.getInt("id_hemo"));
		return ap;
       }


public Collection modificarLista(int id_prod) {

	      Collection lista = new Vector();
              String  sqla ="select p.id_prod,p.fecha_expi,p.fecha_a,h.nombre from produce p,hemocomponente h where p.id_hemo=h.id_hemo and p.id_prod= "+id_prod+"  ;";

	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run	 the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListark2(rs);
				lista.add(apartment);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmta.close();
				ca.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return lista;
	}
	
	private NivelesRevicionLab getListark2(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

		ap.setId_prod(rs.getInt("id_prod"));
		ap.setFecha_expi(rs.getString("fecha_expi"));
		ap.setFecha_a(rs.getString("fecha_a"));
		ap.setNombre(rs.getString("nombre"));
		return ap;
       }
       

public String cont(int id_prod) {

	String  sql ="select h.nombre as CONT from produce p,hemocomponente h where p.id_hemo=h.id_hemo and p.id_prod= "+id_prod+" ;";
	       String numberApartments = "";
		// define db variables
		Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				numberApartments = rs.getString("cont");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return numberApartments;
	}

       


public void modificado(String fecha_produccion,String fecha_expi,int id_hemo,int id_prod,String cod_per,int id_horario)  
{
                String sqlpw="";

		
	        sqlpw = "UPDATE produce SET fecha_expi = '"+fecha_expi+"',fecha_a='"+fecha_produccion+"', id_hemo="+id_hemo+",cod_per='"+cod_per+"',id_horario="+id_horario+"    WHERE id_prod = "+id_prod+"   ;";
                  
	        Connection c122 = null;
		Statement stmt122 = null;
		try {
			c122 = DBUtils.openConnection();
			stmt122 = c122.createStatement();
			// just run the sql statement
			ResultSet rs = stmt122.executeQuery(sqlpw);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt122.close();
				c122.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		


           
	   
	   
	   }

public void Eliminar(int id_prod)  
{
                String sqlpw="";

	        int estado=0;
		
	        sqlpw = "UPDATE produce SET estado ="+estado+"  WHERE id_prod = "+id_prod+"  ;";

	        Connection c122 = null;
		Statement stmt122 = null;
		try {
			c122 = DBUtils.openConnection();
			stmt122 = c122.createStatement();
			// just run the sql statement
			ResultSet rs = stmt122.executeQuery(sqlpw);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt122.close();
				c122.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		

	   
	   }





public Collection combitoboy() {

	Collection lista = new Vector();
	String  sqla ="select nombre,id_hemo  from hemocomponente  ;";

	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarP2(rs);
				lista.add(apartment);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmta.close();
				ca.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return lista;
	}
	
	private NivelesRevicionLab getListarP2(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
		ap.setNombre(rs.getString("nombre"));
		ap.setId_hemo(rs.getInt("id_hemo"));
		return ap;
       }


public int countRegistro_datos() {

String  sql ="select max(id_prod) as cont  from produce ;";
		
	       int numberApartments = 0;
		Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				numberApartments = rs.getInt("cont");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return numberApartments;
	}


public void CambiarEstado(int n0)  
{
            String sqlpwr="";
	        sqlpwr = "update hemocomponente set estado1='1'  where id_hemo="+n0+" ;";

	        Connection c12 = null;
		Statement stmt12 = null;
		try {
			c12 = DBUtils.openConnection();
			stmt12 = c12.createStatement();
			ResultSet rs = stmt12.executeQuery(sqlpwr);
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt12.close();
				c12.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		


	   
	   }

public void CambiarEstadoTodos()  
{
            String sqlpwr="";
	        sqlpwr = "update hemocomponente set estado1='0' ;";

	        Connection c12 = null;
		Statement stmt12 = null;
		try {
			c12 = DBUtils.openConnection();
			stmt12 = c12.createStatement();
			ResultSet rs = stmt12.executeQuery(sqlpwr);
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt12.close();
				c12.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		


	   
	   }

public int cont() {

	String  sql ="select count(*) as cont  from hemocomponente  ;";
		
	       int numberApartments = 0;
		Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				numberApartments = rs.getInt("cont");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return numberApartments;
	}

public Collection mostrarLista4(int id_hemo) {

	Collection lista = new Vector();
	String  sqla ="select id_hemo,nombre from hemocomponente where not(id_hemo="+id_hemo+")  ;";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarP3(rs);
				lista.add(apartment);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmta.close();
				ca.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return lista;
	}
	
	private NivelesRevicionLab getListarP3(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
	
		ap.setId_hemo(rs.getInt("id_hemo"));
		ap.setNombre(rs.getString("nombre"));
		return ap;
       }
////////////**************paginacion**********/////////////////////
public int Cantidad() {
	     String  sql ="select count(*) as cont from produce where estado=1 and estado1='N';";
		
	       int numberApartments = 0;
		Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				numberApartments = rs.getInt("cont");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return numberApartments;
	}


}