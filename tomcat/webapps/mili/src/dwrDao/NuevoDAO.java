package dwrDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.DBUtils;
public class NuevoDAO {
	
	public int countRegistro_datos() {
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

	public int cont() {
		String sql = "select count(*) as cont from horario";
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
		
		return numberApartments+1;
	}
	
	
	public int count_personal() {
		String sql = "select count(*) as total from personal";
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
	
/* ***********************************************************************************/
	public int contCi(int ci) {
		String sql = "select count(*) as total1 from persona where ci="+ci+" ;";
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
				numberApartments = rs.getInt("total1");
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



public void adicionarPersona(int edad,String nom,String apepa,String apema,int ci,String prof,String ocu,String fecha_naci,String sexo,String casilla,String lugar_tra,String pasaporte,String fax,String procedencia,String email,String cod_do,int fono_pro,int cel,int fono_vec,int fono_tra,String  calle_residencia,String num,String zona,String tipo_dom,String tipo_domt,String  calle_residenciat,String numt,String zonat)  
{
           int id_per=countRegistro_datos();
          String sql="";
	   sql = "insert into  persona(id_per, nom, apepa,apema,ci, prof, ocu, fecha_naci,sexo,casilla,lugar_tra,pasaporte,fax,procedencia,email,edad) values("+id_per+", '"+nom+"','"+apepa+"','"+apema+"', "+ci+",'"+prof+"','"+ocu+"','"+fecha_naci+"', '"+sexo+"','"+casilla+"','"+lugar_tra+"','"+pasaporte+"','"+fax+"','"+procedencia+"','"+email+"',"+edad+");";
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
	  
	        sqlp = "insert into  donante(id_per,cod_do) values("+id_per+", '"+cod_do+"');";
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
	  
	   sqlpp = "insert into  fonos(id_per, fono_pro, cel, fono_vec, fono_tra) values("+id_per+", "+fono_pro+", "+cel+", "+fono_vec+", "+fono_tra+");";
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




               String sqlp2="";
	  
	       sqlp2 = "insert into  domicilio(id_per, calle_residencia,num,zona,tipo_dom) values("+id_per+", '"+calle_residenciat+"','"+numt+"', '"+zonat+"', '"+tipo_domt+"');";
	        Connection c122 = null;
		Statement stmt122 = null;
		try {
			c122 = DBUtils.openConnection();
			stmt122 = c122.createStatement();
			// just run the sql statement
			ResultSet rs = stmt122.executeQuery(sqlp2);
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

////////////adiona horario////////////////////////////////////
public void adi_Horario(String semana,String hora_entrada,String hora_salida)
{
           int id_per=cont();
          String sql="insert into horario (id_horario,hrs_entrada,hrs_salida,semana)values("+id_per+",'"+hora_entrada+"','"+hora_salida+"','"+semana+"');";
	   
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

  }

////////////////////////////////////////////////////////////////
public int countRegistro() {
		String sql = "select count(*) as total from atencion";
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

            
public void adicionarEF(String fecha_a,String hora_a,int id_aten,String tipo_do,String veces,String cod_do,int sistolica,int diastolica,int pulso,int peso,float talla,float temperatura,String atendido,String atendidop,String atendidoh,String atendidos,String atendidoe,String cod_per,int id_horario)  {
               String sqlpw="";
	       sqlpw = "insert into  atencion(fecha_a,hora_a,id_aten,tipo_do,veces,cod_do,sistolica,diastolica,pulso,peso,talla,temperatura,atendido,atendidop,atendidoh,atendidos,atendidoe,cod_per,id_horario) values('"+fecha_a+"','"+hora_a+"',"+id_aten+", '"+tipo_do+"', '"+veces+"', '"+cod_do+"' ,'"+sistolica+"','"+diastolica+"','"+pulso+"','"+peso+"',"+talla+","+temperatura+",'"+atendido+"','"+atendidop+"','"+atendidoh+"','"+atendidos+"','"+atendidoe+"','"+cod_per+"',"+id_horario+");";
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



/////////////////////////////////////*********PERSONAL*****************////////////
public int countpersonal() {
		String sql = "select count(*) as total from personal";
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

///////////////////////////////////////////*******FIN********************////////
//////////*************************personal///////////////****************
public void adicionarPersonal(int edad,String nom,String apepa,String apema,int ci,String fecha_naci,String sexo,String procedencia,String email,String cod_do,int fono_pro,int cel,String  calle_residencia,String num,String zona,String tipo_dom,String cargo,String grado,String usuario)  {
           int id_per=countRegistro_datos();
          String sql="";
	   sql = "insert into  persona(id_per,nom,apepa,apema,ci,fecha_naci,sexo,procedencia,email,edad) values("+id_per+", '"+nom+"','"+apepa+"','"+apema+"', "+ci+",'"+fecha_naci+"', '"+sexo+"','"+procedencia+"','"+email+"',"+edad+");";
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
	  
	        sqlp = "insert into personal(id_per,cod_per,profesion,grado,usuario,contraseña) values ("+id_per+", '"+cod_do+"','"+cargo+"','"+grado+"','"+usuario+"','"+cod_do+"');";
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
	  
	   sqlpp = "insert into  fonos(id_per, fono_pro, cel) values("+id_per+", "+fono_pro+", "+cel+");";
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
/////////////////////horario///////////////////////////////////////////
public Collection horario() {
	        Collection lista = new Vector();
	        String  sqla ="";
	        sqla ="select hrs_entrada,hrs_salida,id_horario,semana from horario;";
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

		ap.setHrs_entrada(rs.getString("hrs_entrada"));
		ap.setHrs_salida(rs.getString("hrs_salida"));
		ap.setId_horario(rs.getInt("id_horario"));
        	ap.setSemana(rs.getString("semana"));
		return ap;
       }


}
