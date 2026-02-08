package dwrDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.DBUtils;
public class ListarSalidaDAO {


public Collection mostrarCombo() {

	        Collection lista = new Vector();
	        String  sqla ="";
	      // sqla ="select h.nombre,h.id_hemo,p.gs_rh,p.fecha_expi,e.id_aten  from hemocomponente h,produce p,extraccion e where (p.id_hemo = h.id_hemo)and(p.id_ext=e.id_ext)and(p.estado=1);";
	        sqla ="select nombre,id_hemo  from hemocomponente where estado='N';";
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
	//	ap.setGs_rh(rs.getString("gs_rh"));
	//	ap.setFecha_expi(rs.getString("fecha_expi"));
	//	ap.setId_aten(rs.getInt("id_aten"));
		return ap;
       }



public void insertar(int id_hemo)  
{
            String sqlpwr="";
	        sqlpwr = "update produce set estado1='N'  where id_hemo="+id_hemo+" ;";

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

public void cambiarEstado()  
{
            String sqlc="";
	        sqlc= "update produce set estado1='N' ;";

	        Connection c12 = null;
		Statement stmt12 = null;
		try {
			c12 = DBUtils.openConnection();
			stmt12 = c12.createStatement();
			ResultSet rs = stmt12.executeQuery(sqlc);
			
			
			
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
            
public void insertar2(int id_hemo, String valores)  
{
            String sqlpwr="";
	        sqlpwr = "update produce set estado1='"+valores+"'  where id_hemo="+id_hemo+" ;";

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


public Collection listarChec(String gs_rh, int id_hemo) {

	      Collection lista = new Vector();

	      String  sqla ="";
	    sqla ="select p.fecha_expi,h.nombre,p.id_prod,p.gs_rh,p.cod_do,e.tubuladora from hemocomponente h,produce p,extraccion e where (p.id_hemo=h.id_hemo)and(p.id_ext=e.id_ext)and(e.fraccionado='A')and(p.estado=1)and(pruebas_salida='N')and(p.gs_rh='"+gs_rh+"')and(p.id_hemo="+id_hemo+") order by(fecha_expi); ";

//	    sqla =" select p.fecha_expi,h.nombre,p.id_prod,p.gs_rh from  hemocomponente h,produce p where    (p.id_hemo=h.id_hemo)and(p.estado=1) and(pruebas_salida='N') and(p.gs_rh='"+gs_rh+"')and(p.id_hemo="+id_hemo+")    order by(fecha_expi); ";
	    
//    sqla ="select p.fecha_expi,h.nombre,p.id_prod,p.gs_rh,p.cod_do,e.tubuladora from hemocomponente h,produce p,extraccion e where (p.id_hemo=h.id_hemo)and(p.id_ext=e.id_ext)      and(e.fraccionado='A')and not(p.estado1='N')and(p.estado=1)and(pruebas_salida='N') order by(fecha_expi); ";
//sqla ="select h.nombre,p.gs_rh from hemocomponente h,produce p whre (h.id_hemo=p.id_hemo)and(h.id_hemo="+id_hemo+")and(p.gs_rh='"+gs_rh+"'); ";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getLista(rs);
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
	
	private NivelesRevicionLab getLista(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
				
		ap.setFecha_expi(rs.getString("fecha_expi"));
		ap.setNombre(rs.getString("nombre"));
		ap.setId_prod(rs.getInt("id_prod"));
		ap.setGs_rh(rs.getString("gs_rh"));
		ap.setCod_do(rs.getString("cod_do"));
		ap.setTubuladora(rs.getString("tubuladora"));

		return ap;
       
       }






public void adicionarR(String n1,int n0,int id_aten,String cod_do)  
{
                String sqlpw="";
	        String instancia="pruebas de salida";
	    
	        sqlpw = "insert into resultado_prueba(resultado,id_prueba,cod_do,id_aten,instancia) values('"+n1+"', "+n0+",'"+cod_do+"', "+id_aten+", '"+instancia+"');";
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
//	String  sqlaa ="select  nombre_tp  from  prueba ;";
	String  sqlaa ="select  p.nombre_tp, rp.resultado  from  prueba p,resultado_prueba rp  where (p.id_prueba=rp.id_prueba)and(p.tipo='pruebas de salida');";
	        Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sqlaa);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarM(rs);
				lista.add(apartment);
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
                String sqlpm="";

	        String prueba="S";
		
	        sqlpm = "UPDATE produce SET pruebas_salida = '"+prueba+"'  WHERE id_prod = "+id_prod+"  ;";

	        Connection c1229 = null;
		Statement stmt1229 = null;
		try {
			c1229 = DBUtils.openConnection();
			stmt1229 = c1229.createStatement();
			// just run the sql statement
			ResultSet rs = stmt1229.executeQuery(sqlpm);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt1229.close();
				c1229.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		


           
	   
	   
	   }


/*public boolean controlar(int id_hemo)
{
    boolean b;
    String  sqlaa ="select  id_hemo  from produce where (estado=1)and(id_hemo="+id_hemo+");";
    String  sql="";
    //if (sqlaa == sql)        
    if (sqlaa.length()> 0)        
    {b=true;}
    else
    {b=false;}
return b;
}
*/
public int controlar(int id_hemo) {

String  sql ="SELECT COUNT(*) AS CONTROLADOR FROM PRODUCE WHERE(ID_HEMO="+id_hemo+")AND(estado=1)  ;";

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
				numberApartments = rs.getInt("controlador");
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


public Collection mostrarLista3() {

	Collection lista = new Vector();
	String  sqla ="select p.id_prueba,p.nombre_tp,p.tipo_componente  from prueba p  where (tipo='salida')and(positivo='N') order by(id_prueba)  ;";

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


public void InsertarC(int id_prueba,String valores,int id_aten,String cod_do,String fecha_prueba,String hora_prueba,String cod_per,int id_horario) 
{
                String sqlpw="";
		String m="miliydavid";
	        String instancia="salida";
		sqlpw = "insert into resultado_prueba(resultado,id_prueba,cod_do,id_aten,instancia,hora_prueba,cod_per,id_horario,fecha_a) values('"+valores+"', "+id_prueba+",'"+cod_do+"', "+id_aten+",'"+instancia+"','"+hora_prueba+"','"+cod_per+"',"+id_horario+",'"+fecha_prueba+"');";
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
public int cont2(String cod_do,int id_aten) {

	String  sql ="select count(*) as cont2  from resultado_prueba where(cod_do='"+cod_do+"')and(id_aten="+id_aten+")and(resultado='on') ;";
		
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

public int contar(int id_hemo) {

	String  sql ="select count(*) as contp  from produce  where(id_hemo="+id_hemo+")and(pruebas_salida='N')and(estado=1) ;";
		
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



public int contd() {

	String  sql ="select count(*) as cont  from prueba where(tipo='salida') ;";
		
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


public Collection mostrarResultado_prueba(String cod_do) {
	Collection lista = new Vector();
	String sql = "select r.resultado,r.id_prueba,p.tipo_componente,r.id_aten,r.cod_do  from resultado_prueba r,prueba p,atencion a where (r.cod_do='"+cod_do+"')and(p.tipo='salida')and(a.cod_do=r.cod_do)and(r.id_prueba=p.id_prueba)and(a.id_aten=(select max(t.id_aten) from resultado_prueba t where(t.cod_do='"+cod_do+"') and(t.instancia='salida') ))and(a.id_aten=r.id_aten) ORDER BY id_prueba; ";

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
		//    r.resultado,r.id_prueba,p.tipo_componente
		ap.setResultado(rs.getString("resultado"));
		ap.setId_prueba(rs.getInt("id_prueba"));
		ap.setTipo_componente(rs.getString("tipo_componente"));
		ap.setId_aten(rs.getInt("id_aten"));
		ap.setCod_do(rs.getString("cod_do"));

		return ap;
       }

public Collection mostrarLista4(int id_prueba) {

	Collection lista = new Vector();
	String  sqla ="select  v.valores,v.id_prueba,v.id_valor from prueba p,valores v where (p.tipo='salida')and(p.id_prueba = v.id_prueba)and(p.id_prueba="+id_prueba+")and(v.positivo='N')  ;";
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

public void  ModificarC(int id_prueba,String valores,int id_aten,String cod_do)  
{
                String sqlpw="";
		String m="miliydavid";
	        String instancia="salida";
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

public int verificando(int id_hemo) {

	      String  sql ="SELECT COUNT(*) AS verificando FROM produce p, hemocomponente h WHERE (p.id_hemo=h.id_hemo)and(h.id_hemo="+id_hemo+")and(p.estado1='S')  ;";

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
				numberApartments = rs.getInt("verificando");
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


/////////////**********************gs_rh*************///////////////////////

public int gs_rh1(int id_hemo) {

	      String  sql ="select count(gs_rh) as gs_rh1 from  produce where (id_hemo="+id_hemo+")and(gs_rh='O-')  ;";

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
				numberApartments = rs.getInt("gs_rh1");
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

public int gs_rh2(int id_hemo) {

	      String  sql ="select count(gs_rh) as gs_rh2 from  produce where (id_hemo="+id_hemo+")and(gs_rh='O+')  ;";

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
				numberApartments = rs.getInt("gs_rh2");
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

public int gs_rh3(int id_hemo) {

	      String  sql ="select count(gs_rh) as gs_rh3 from  produce where (id_hemo="+id_hemo+")and(gs_rh='A+')  ;";

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
				numberApartments = rs.getInt("gs_rh3");
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

public int gs_rh4(int id_hemo) {

	      String  sql ="select count(gs_rh) as gs_rh4 from  produce where (id_hemo="+id_hemo+")and(gs_rh='A-')  ;";

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
				numberApartments = rs.getInt("gs_rh4");
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

public int gs_rh5(int id_hemo) {

	      String  sql ="select count(gs_rh) as gs_rh5 from  produce where (id_hemo="+id_hemo+")and(gs_rh='B+')  ;";

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
				numberApartments = rs.getInt("gs_rh5");
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

public int gs_rh6(int id_hemo) {

	      String  sql ="select count(gs_rh) as gs_rh6 from  produce where (id_hemo="+id_hemo+")and(gs_rh='AB-')  ;";

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
				numberApartments = rs.getInt("gs_rh6");
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

public int gs_rh7(int id_hemo) {

	      String  sql ="select count(gs_rh) as gs_rh7 from  produce where (id_hemo="+id_hemo+")and(gs_rh='AB+')  ;";

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
				numberApartments = rs.getInt("gs_rh7");
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

public int gs_rh8(int id_hemo) {

	      String  sql ="select count(gs_rh) as gs_rh8 from  produce where (id_hemo="+id_hemo+")and(gs_rh='B-')  ;";

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
				numberApartments = rs.getInt("gs_rh8");
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


public Collection pruebita() {

	      Collection lista = new Vector();

	      String  sqla ="";
              sqla ="select p.fecha_expi,h.nombre,p.id_prod,p.gs_rh,p.cod_do,e.tubuladora from hemocomponente h,produce p,extraccion e where (p.id_hemo=h.id_hemo)and(p.id_ext=e.id_ext)and(e.fraccionado='A')and not(p.estado1='N')and(p.estado=1)and(pruebas_salida='N')  order by(fecha_expi); ";

	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getLista51(rs);
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
	
	private NivelesRevicionLab getLista51(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
				
		ap.setFecha_expi(rs.getString("fecha_expi"));
		ap.setNombre(rs.getString("nombre"));
		ap.setId_prod(rs.getInt("id_prod"));
		ap.setGs_rh(rs.getString("gs_rh"));
		ap.setCod_do(rs.getString("cod_do"));
		ap.setTubuladora(rs.getString("tubuladora"));

		return ap;
       
       }


}
