package dwrDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.DBUtils;
public class NuevoPersonalDAO {

public int countRegistro() {
		String sql = "select count(*) as total from persona";
		int numberApartments = -1;
		// define db variables
		Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				numberApartments = rs.getInt("total");
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
		
		return numberApartments+1;
		
	}

public int cuentaRol() {
		String sql = "select count(*) as tal from roles";
		int numberApartments = -1;
		// define db variables
		Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				numberApartments = rs.getInt("tal");
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
		
		return numberApartments+1;
		
	}

public String codigo1(String nom,String apepa) {
		String sql = "select cod_per as to from personal where nom='"+nom+"' and apepa='"+apepa+"';";
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
				numberApartments = rs.getString("to");
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


public int countRegistro1() {
		String sql = "select count(*) as total from  horario";
		int numberApartments = -1;
		// define db variables
		Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				numberApartments = rs.getInt("total");
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
		
		return numberApartments+1;
		
	}


public void adicionarPersonal1(String semanap,String semanas,String hrs_entrada,String min_entrada,String hrs_salida,String min_salida,String turno,int cod_per)  
{                    
            int id_horario=countRegistro1();
            String sqlm="";
	    
	    sqlm = "insert into horario (hrs_entrada,hrs_salida,id_horario,semana) values('"+hrs_entrada+":"+min_entrada+"','"+hrs_salida+":"+min_salida+"',"+id_horario+",'"+semanap+"-"+semanas+"');";
	        Connection c = null;
		Statement stmt = null;
               try {
			c= DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sqlm);
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
            
	      String sql="";
	      sql = "insert into  tiene(cod_per,id_horario,turno) values("+cod_per+", "+id_horario+",'"+turno+"');";
	        Connection c9 = null;
		Statement stmt9 = null;
               try {
			c9= DBUtils.openConnection();
			stmt9 = c9.createStatement();
			// just run the sql statement
			ResultSet rs = stmt9.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt9.close();
				c9.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
	



          }

public void adicionarPersonal(String nom,String apepa,String apema,int ci,String pasaporte,String fecha_naci,String sexo,String procedencia,String email,String prof,String fax,String casilla,String tipo_dom,String calle_residencia,String num,String zona,int fono_pro,int cel,int fono_vec,int cod_per,String cargo,String grado)  
{                    
            int id_per=countRegistro();
            String sql="";
	    sql = "insert into  persona(id_per,nom,apepa,apema,ci,prof,fecha_naci,sexo,casilla,pasaporte,fax,procedencia,email) values("+id_per+", '"+nom+"','"+apepa+"','"+apema+"', "+ci+",'"+prof+"','"+fecha_naci+"','"+sexo+"','"+casilla+"','"+pasaporte+"','"+fax+"','"+procedencia+"','"+email+"');";
	        Connection c = null;
		Statement stmt = null;
               try {
			c= DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sql);
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
		
                String sqlp="";
	  
	        sqlp = "insert into  personal(id_per,cod_per,cargo,grado) values("+id_per+", '"+cod_per+"','"+cargo+"','"+grado+"');";
	        Connection c11 = null;
		Statement stmt11 = null;
		try {
			c11 = DBUtils.openConnection();
			stmt11 = c11.createStatement();
			// just run the sql statement
			ResultSet rs = stmt11.executeQuery(sqlp);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt11.close();
				c11.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		



	   String sqlpp="";
	  
	   sqlpp = "insert into  fonos(id_per, fono_pro, cel, fono_vec) values("+id_per+", "+fono_pro+", "+cel+", "+fono_vec+");";
	        Connection c1 = null;
		Statement stmt1 = null;
		try {
			c1 = DBUtils.openConnection();
			stmt1 = c1.createStatement();
			// just run the sql statement
			ResultSet rs = stmt1.executeQuery(sqlpp);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt1.close();
				c1.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	
    
    
	   String sqlp1="";
	  
	   sqlp1 = "insert into  domicilio(id_per, calle_residencia,num,zona,tipo_dom) values("+id_per+", '"+calle_residencia+"','"+num+"', '"+zona+"', '"+tipo_dom+"');";
	        Connection c12 = null;
		Statement stmt12 = null;
		try {
			c12 = DBUtils.openConnection();
			stmt12 = c12.createStatement();
			// just run the sql statement
			ResultSet rs = stmt12.executeQuery(sqlp1);
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

public Collection listaPersonal() {

	        Collection lista = new Vector();
	        String  sqla ="";
	        sqla ="select p1.cod_per,p.nom,p.apepa,p.apema,p1.profesion from personal p1,persona p where p1.cod_per not in(select distinct(t.cod_per) from tiene5 t where (select count(*) from roles)<=(select count(*) from tiene5 where cod_per=t.cod_per)) and p1.id_per=p.id_per;";
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
		ap.setCod_per(rs.getString("cod_per"));
		ap.setNom(rs.getString("nom"));
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		ap.setProfesion(rs.getString("profesion"));
		return ap;
       }

public Collection listaPersonal1() {

	        Collection lista = new Vector();
	        String  sqla ="";
//	        sqla ="select p1.cod_per,p.nom,p.apepa,p.apema,p1.profesion from personal p1,persona p,asiste a where p1.cod_per  in(select cod_per from tiene5) and p1.id_per=p.id_per and p1.cod_per not in(select t.cod_per from asiste t);";
	        sqla ="select distinct(p1.cod_per),p.nom,p.apepa,p.apema,p1.profesion from personal p1,persona p,asiste a where p1.cod_per  in(select cod_per from tiene5) and p1.id_per=p.id_per;";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarEy7(rs);
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
	
	private NivelesRevicionLab getListarEy7(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		ap.setCod_per(rs.getString("cod_per"));
		ap.setNom(rs.getString("nom"));
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		ap.setProfesion(rs.getString("profesion"));
		return ap;
       }

public Collection listaPersonal2() {

	        Collection lista = new Vector();
	        String  sqla ="";
	        sqla ="select p1.cod_per,p.nom,p.apepa,p.apema,p1.profesion from personal p1,persona p where p1.cod_per  in(select cod_per from tiene5) and p1.id_per=p.id_per and p1.cod_per not in (select cod_per from asiste);";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarEy(rs);
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
	
	private NivelesRevicionLab getListarEy(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		ap.setCod_per(rs.getString("cod_per"));
		ap.setNom(rs.getString("nom"));
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		ap.setProfesion(rs.getString("profesion"));
		return ap;
       }

public Collection listaRol() {

	        Collection lista = new Vector();
	        String  sqla ="";
	        sqla ="select id_rol,nombre from roles;";
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
		ap.setId_rol(rs.getInt("id_rol"));
		ap.setNombre(rs.getString("nombre"));
		return ap;
       }
//lista de los roles que se le pueden asignar a una persona
public Collection listaAsigRol(String cod_per) {

	        Collection lista = new Vector();
	        String  sqla ="";
	        sqla ="select r.id_rol,r.nombre from roles r where id_rol not in(select distinct(id_rol) from tiene5 where cod_per='"+cod_per+"');";
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
	
	

public Collection listaTiene5(String cod_per) {

	        Collection lista = new Vector();
	        String  sqla ="";
	        sqla ="select r.id_rol,r.nombre from roles r,tiene5 t where r.id_rol=t.id_rol and t.cod_per='"+cod_per+"';";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarE1(rs);
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
	
	private NivelesRevicionLab getListarE1(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		ap.setId_rol(rs.getInt("id_rol"));
		ap.setNombre(rs.getString("nombre"));
		return ap;
       }

public void InsertarTiene5(int valores,String  cod_per)  
{                    
            int id_horario=countRegistro1();
            String sqlm="";
	    
	    sqlm = "insert into tiene5(id_rol,cod_per)values("+valores+",'"+cod_per+"');";
	        Connection c = null;
		Statement stmt = null;
               try {
			c= DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sqlm);
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


          }

public void eliminarTiene5(int id_rol,String cod_per)  
{
               String sqlpw="";
	       
	       sqlpw = "delete from tiene5  where id_rol = "+id_rol+" and cod_per='"+cod_per+"' ;";

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
public void eliminarTiene5Todo(String cod_per)  
{
               String sqlpw="";
	       
	       sqlpw = "delete from tiene5  where cod_per='"+cod_per+"' ;";

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
public void InsertarAsiste(int id_horario,String  cod_per,String fecha_a)  
{                    
            String sqlm="";
	    
	    sqlm = "insert into asiste (id_horario,cod_per,fecha_a) values("+id_horario+",'"+cod_per+"','"+fecha_a+"');";
	        Connection c = null;
		Statement stmt = null;
               try {
			c= DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sqlm);
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
            

          }
public int countHorario() {
	    
	    String    sql ="select count(*) as t from horario;";
		int numberApartments = -1;
		// define db variables
		Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				numberApartments = rs.getInt("t");
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
		
		return numberApartments+1;
		
	}

public Collection lista_Rol() {

	        Collection lista = new Vector();
	        String  sqla ="";
	        sqla ="select p1.cod_per,p.nom,p.apepa,p.apema,p1.profesion,r.nombre from personal p1,persona p,roles r,tiene5 t  where  p1.id_per=p.id_per and t.cod_per=p1.cod_per and t.id_rol=r.id_rol;";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarRol(rs);
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
	
	private NivelesRevicionLab getListarRol(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		ap.setCod_per(rs.getString("cod_per"));
		ap.setNom(rs.getString("nom"));
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		ap.setProfesion(rs.getString("profesion"));
		ap.setNombre(rs.getString("nombre"));
		return ap;
       }


}