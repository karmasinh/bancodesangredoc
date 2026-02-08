package dwrDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.DBUtils;
public class ListaControlDAO {
////////////////MUESTRA LISTA DE LOS HEMOCOMPONENTES////////////////
public Collection mostrarCombo() {

	      Collection lista = new Vector();

	      String  sqla ="";
	       sqla ="select h.nombre,h.id_hemo,p.gs_rh,p.fecha_expi,e.id_ext  from hemocomponente h,produce p,extraccion e where (p.id_hemo = h.id_hemo)and(p.id_ext=e.id_ext)and(p.pruebas_salida='N')and(p.estado=1);";
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


public int contar(int id_hemo) {

	String  sql ="select count(*) as contp  from produce  where(id_hemo="+id_hemo+")and(estado=1) ;";
		
	       int numberApartments = 0;
		// define db variables
		Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				numberApartments = rs.getInt("contp");
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




private NivelesRevicionLab getListarEx(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

		ap.setNombre(rs.getString("nombre"));
		ap.setId_hemo(rs.getInt("id_hemo"));
		ap.setGs_rh(rs.getString("gs_rh"));
		ap.setFecha_expi(rs.getString("fecha_expi"));
		ap.setId_ext(rs.getInt("id_ext"));
		return ap;
       }

///////////////FIIIIIIIIIINNNNNN//////////

public Collection mostrarLista(int id_hemo) {

	      Collection lista = new Vector();
              String  sqla ="select e.id_ext,p.id_prod,p.cod_do,p.fecha_expi,h.nombre from produce p,hemocomponente h,extraccion e where(p.control_calidad='N') and(p.id_hemo=h.id_hemo)and(p.pruebas_salida='N')and(e.fraccionado='A')and(e.id_ext=p.id_ext)and(p.id_hemo="+id_hemo+")and(p.estado=1);";
	      //select rp.id_aten,p.id_prod,p.id_hemo,p.cod_do,p.cod_per,p.id_salida,p.id_ext,p.fecha_expi,h.nombre from produce p,hemocomponente h,extraccion e  where(p.control_calidad='N')and(p.id_hemo=h.id_hemo)and(p.pruebas_salida='N')and(e.fraccionado='A') and(e.id_ext=p.id_ext) 

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
		
		ap.setId_ext(rs.getInt("id_ext"));		
		ap.setId_prod(rs.getInt("id_prod"));		
		ap.setCod_do(rs.getString("cod_do"));				
		ap.setFecha_expi(rs.getString("fecha_expi"));
		ap.setNombre(rs.getString("nombre"));
		return ap;
       }


public Collection mostrarLista3(String descr) {

	Collection lista = new Vector();
	String  sqla ="select p.id_prueba,p.nombre_tp,p.tipo_componente  from prueba p  where(p.descr LIKE'%"+descr+"%') and(tipo='control de calidad')and(positivo='N') order by(id_prueba)  ;";

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
		
		
		ap.setId_prueba(rs.getInt("id_prueba"));
		ap.setNombre_tp(rs.getString("nombre_tp"));
		ap.setTipo_componente(rs.getString("tipo_componente"));
		return ap;
       }



public Collection mostrarLista4(int id_prueba) {

	Collection lista = new Vector();
	String  sqla ="select  v.valores,v.id_prueba,v.id_valor from prueba p,valores v where (p.tipo='control de calidad')and(p.id_prueba = v.id_prueba)and(p.id_prueba="+id_prueba+")and(v.positivo='N')  ;";
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
		
	
		ap.setValores(rs.getString("valores"));
		ap.setId_prueba(rs.getInt("id_prueba"));
		ap.setId_valor(rs.getInt("id_valor"));	
		return ap;
       }


public String mostrarNombre(int id_prueba) {

		String sql = "select nombre_tp as total from prueba where (id_prueba="+id_prueba+") ";
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
				numberApartments = rs.getString("total");
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

//public void adicionarR(String n1,int n0,int id_aten)  
public void adicionarR(String n1,int n0,int id_aten, int id_hemo,int id_ext,String cod_do)  
{
                String sqlpw="";
	        String instancia="control de calidad";
	    
	        sqlpw = "insert into resultado_prueba(resultado,id_prueba,cod_do,id_hemo,id_aten,instancia,id_ext) values('"+n1+"', "+n0+",'"+cod_do+"',"+id_hemo+", "+id_aten+", '"+instancia+"',"+id_ext+");";
		//sqlpw = "insert into resultado_prueba(resultado,id_prueba,id_aten,instancia) values('"+n1+"', "+n0+", "+id_aten+", '"+instancia+"');";
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

public Collection ListaT() {

	Collection lista = new Vector();
	String  sqla ="select  p.nombre_tp, rp.resultado  from  prueba p,resultado_prueba rp  where (p.id_prueba=rp.id_prueba)and(p.tipo='control de calidad')  ;";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarM(rs);
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
	
	private NivelesRevicionLab getListarM(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
	
		ap.setNombre_tp(rs.getString("nombre_tp"));
		ap.setResultado(rs.getString("resultado"));
		return ap;
       }

public void FinalizarTodo(int id_prod)  
{
                String sqlpw="";

	        String control="S";
		
	        sqlpw = "UPDATE produce SET control_calidad ='"+control+"'  WHERE id_prod = "+id_prod+"  ;";

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


public int cont2(String cod_do,int id_aten) {

	String  sql ="select count(*) as cont2  from resultado_prueba where(cod_do='"+cod_do+"')and(id_aten="+id_aten+")and(resultado='N') ;";
		
	       int numberApartments = 0;
		// define db variables
		Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				numberApartments = rs.getInt("cont2");
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

public void InsertarC(int id_prueba,String valores,int id_aten,String cod_do,String fecha_a,String hora_a,String cod_per,int id_horario,int id_hemo)  
{
                String sqlpw="";
		String m="miliydavid";
	        String instancia="control de calidad";
		sqlpw = "insert into resultado_prueba(resultado,id_hemo,instancia,id_prueba,hora_prueba,id_ext,cod_do,id_aten,cod_per,id_horario,fecha_a) values ('"+valores+"',"+id_hemo+",'"+instancia+"', "+id_prueba+",'"+hora_a+"',"+id_aten+",'"+cod_do+"', "+id_aten+",'"+cod_per+"',"+id_horario+",'"+fecha_a+"');";
	        Connection c122 = null;
		Statement stmt122 = null;
		try {
			c122 = DBUtils.openConnection();
			stmt122 = c122.createStatement();
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

public int contd(String descr) {

	String  sql ="select count(*) as cont  from prueba p  where(p.descr LIKE'%"+descr+"%') and(tipo='control de calidad')and(positivo='N')  ;";
		
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

////////////********************modificar//////////////************
public Collection mostrarResultado_prueba(String cod_do) {
	Collection lista = new Vector();
	String sql = "select r.resultado,r.id_prueba,p.tipo_componente,r.id_aten,r.cod_do  from resultado_prueba r,prueba p,atencion a where (r.cod_do='"+cod_do+"')and(p.tipo='control de calidad')and(a.cod_do=r.cod_do)and(r.id_prueba=p.id_prueba)and(a.id_aten=(select max(t.id_aten) from resultado_prueba t where(t.cod_do='"+cod_do+"') and(t.instancia='control de calidad') ))and(a.id_aten=r.id_aten) ORDER BY id_prueba; ";

	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sql);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getDa15(rs);
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
	
	private NivelesRevicionLab getDa15(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

		ap.setResultado(rs.getString("resultado"));
		ap.setId_prueba(rs.getInt("id_prueba"));
		ap.setTipo_componente(rs.getString("tipo_componente"));
		ap.setId_aten(rs.getInt("id_aten"));
		ap.setCod_do(rs.getString("cod_do"));

		return ap;
       }
public void  ModificarC(int id_prueba,String valores,int id_aten,String cod_do)  
{
                String sqlpw="";
		String m="miliydavid";
	        String instancia="control de calidad";
		sqlpw = "update resultado_prueba  set resultado = '"+valores+"'  where (id_prueba = "+id_prueba+")and(id_aten="+id_aten+")and(cod_do='"+cod_do+"') ;";
		
	        Connection c122 = null;
		Statement stmt122 = null;
		try {
			c122 = DBUtils.openConnection();
			stmt122 = c122.createStatement();
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
/*
public Collection Nose(String cod_do) {
	Collection lista = new Vector();
	String sql = "select r.resultado,r.id_prueba,p.tipo_componente,r.id_aten,r.cod_do  from resultado_prueba r,prueba p,atencion a where (r.cod_do='"+cod_do+"')and(p.tipo='control de calidad')and(a.cod_do=r.cod_do)and(r.id_prueba=p.id_prueba)and(a.id_aten=(select max(t.id_aten) from resultado_prueba t where(t.cod_do='"+cod_do+"') and(t.instancia='control de calidad') ))and(a.id_aten=r.id_aten) ORDER BY id_prueba; ";

	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sql);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getDa15(rs);
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
	
	private NivelesRevicionLab getDa15(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

		ap.setResultado(rs.getString("resultado"));
		ap.setId_prueba(rs.getInt("id_prueba"));
		ap.setTipo_componente(rs.getString("tipo_componente"));
		ap.setId_aten(rs.getInt("id_aten"));
		ap.setCod_do(rs.getString("cod_do"));

		return ap;
       }
*/

}