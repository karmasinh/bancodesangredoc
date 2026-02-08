package dwrDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.DBUtils;
public class ListaAdmPersonalDAO {

public Collection mostrarLista() {

	Collection lista = new Vector();
	
	String  sqla ="select p.id_per,p.nom,p.apepa,p.apema,pp.cod_per,pp.usuario from  personal pp,persona p where p.id_per=pp.id_per;";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListar(rs);
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
	
	private NivelesRevicionLab getListar(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

                ap.setId_per(rs.getInt("id_per"));
		ap.setNom(rs.getString("nom"));		
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));				
		ap.setCod_per(rs.getString("cod_per"));
		ap.setUsuario(rs.getString("usuario"));	
		return ap;
       }

public Collection mostrarLista8() {

	Collection lista = new Vector();
	
	String  sqla ="select p.nom,p.apepa,p.apema,t.turno,pp.cod_per,p.id_per,h.id_horario from persona p,personal pp,tiene t,horario h  where(p.id_per=pp.id_per)and(pp.cod_per=t.cod_per)and  (t.id_horario = h.id_horario) ;";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListar89(rs);
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
	
	private NivelesRevicionLab getListar89(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
			
		ap.setNom(rs.getString("nom"));		
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));				
		ap.setTurno(rs.getString("turno"));				
		ap.setCod_per(rs.getString("cod_per"));
                ap.setId_per(rs.getInt("id_per"));
                ap.setId_horario(rs.getInt("id_horario"));		
		return ap;
       }





public Collection mostrarLista1(int id_per) {

	Collection lista = new Vector();
	
         String  sqla ="select p.nom,p.apepa,p.apema,pp.contraseña,pp.usuario,p.ci,p.id_per from persona p,personal pp  where(p.id_per=pp.id_per)and(p.id_per='"+id_per+"') ;";


	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListar55(rs);
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
	
	private NivelesRevicionLab getListar55(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

		ap.setNom(rs.getString("nom"));		
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));				
		ap.setContraseña(rs.getString("contraseña"));
                ap.setUsuario(rs.getString("usuario"));
		ap.setCi(rs.getInt("ci"));
		ap.setId_per(rs.getInt("id_per"));

		return ap;
       }

public Collection mostrarLista2(int id_per) {

	Collection lista = new Vector();
	
         String  sqla ="select d.calle_residencia,d.num,d.zona,cel,fono_pro,profesion,grado from domicilio d,fonos f,personal p where tipo_dom='propio' and d.id_per=f.id_per and p.id_per=d.id_per and d.id_per='"+id_per+"' ;";

	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListar85(rs);
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
	
	private NivelesRevicionLab getListar85(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

		ap.setCalle_residencia(rs.getString("calle_residencia"));		
		ap.setNum(rs.getString("num"));
		ap.setZona(rs.getString("zona"));				
		ap.setCel(rs.getInt("cel"));
                ap.setFono_pro(rs.getInt("fono_pro"));
		ap.setProfesion(rs.getString("profesion"));
		ap.setGrado(rs.getString("grado"));

		return ap;
       }

public void eliminarPersonal(int id_per,String cod_per)
{
               String sqlp11="";

	       sqlp11 = "delete from domicilio  where id_per = "+id_per+" ;";

	        Connection c1231 = null;
		Statement stmt1231 = null;
		try {
			c1231 = DBUtils.openConnection();
			stmt1231 = c1231.createStatement();
			// just run the sql statement
			ResultSet rs = stmt1231.executeQuery(sqlp11);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt1231.close();
				c1231.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		


               String sqlp112="";

	       sqlp112 = "delete from fonos  where id_per = "+id_per+" ;";

	        Connection c1 = null;
		Statement stmt1 = null;
		try {
			c1 = DBUtils.openConnection();
			stmt1 = c1.createStatement();
			// just run the sql statement
			ResultSet rs = stmt1.executeQuery(sqlp112);
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


               String sqlx="";

	       sqlx = "delete from asiste  where cod_per = '"+cod_per+"' ;";

	        Connection c3x = null;
		Statement stmt3x = null;
		try {
			c3x = DBUtils.openConnection();
			stmt3x = c3x.createStatement();
			// just run the sql statement
			ResultSet rs = stmt3x.executeQuery(sqlx);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt3x.close();
				c3x.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		


               String sqlk="";

	       sqlk = "delete from tiene5  where cod_per = '"+cod_per+"' ;";

	        Connection c3k = null;
		Statement stmt3k = null;
		try {
			c3k = DBUtils.openConnection();
			stmt3k = c3k.createStatement();
			// just run the sql statement
			ResultSet rs = stmt3k.executeQuery(sqlk);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt3k.close();
				c3k.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		

	       
	       String sqlm="";

	       sqlm = "delete from persona  where id_per = "+id_per+" ;";

	        Connection c3z = null;
		Statement stmt3z = null;
		try {
			c3z = DBUtils.openConnection();
			stmt3z = c3z.createStatement();
			// just run the sql statement
			ResultSet rs = stmt3z.executeQuery(sqlm);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt3z.close();
				c3z.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		


               String sqlp96="";

	       sqlp96 = "delete from personal  where id_per = "+id_per+" ;";

	        Connection c3 = null;
		Statement stmt3 = null;
		try {
			c3 = DBUtils.openConnection();
			stmt3 = c3.createStatement();
			// just run the sql statement
			ResultSet rs = stmt3.executeQuery(sqlp96);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt3.close();
				c3.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
	   
	   }



public Collection informacion(String cod_per) {

	Collection lista = new Vector();
	
	String  sqla ="select t.cod_per,t.fecha,t.turno,h.hrs_entrada,h.hrs_salida,h.semana  from tiene t,horario h  where t.cod_per = "+cod_per+" and t.id_horario = h.id_horario  ;";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListar2(rs);
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
	
	private NivelesRevicionLab getListar2(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
		
		ap.setCod_per(rs.getString("cod_per"));		
		ap.setFecha(rs.getString("fecha"));
		ap.setTurno(rs.getString("turno"));				
         	ap.setHrs_entrada(rs.getString("hrs_entrada"));
		ap.setHrs_salida(rs.getString("hrs_salida"));
		ap.setSemana(rs.getString("semana"));
		return ap;
       }

public void modificarPersonal(int id_per,String nom,String apepa,String apema,String cod_per,String usuario,int ci, int cel, int fono_pro, String profesion,String grado,String calle_residencia,int num,String zona)  
{
               String sqlpw="";
	       
	       sqlpw = "update persona set nom = '"+nom+"', apepa='"+apepa+"' , apema='"+apema+"' ,ci="+ci+"  where id_per = "+id_per+" ;";

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



               String sqlpw1="";
	       sqlpw1 = "update personal set contraseña = '"+cod_per+"', profesion='"+profesion+"',grado='"+grado+"' ,usuario='"+usuario+"' where id_per = "+id_per+" ;";

	        Connection c1223 = null;
		Statement stmt1223 = null;
		try {
			c1223 = DBUtils.openConnection();
			stmt1223 = c1223.createStatement();
			// just run the sql statement
			ResultSet rs = stmt1223.executeQuery(sqlpw1);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt1223.close();
				c1223.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		


               String sqlpw5="";
	       
	       sqlpw5 = "update domicilio set calle_residencia = '"+calle_residencia+"', zona ='"+zona+"',num='"+num+"'  where id_per = "+id_per+" ;";

	        Connection c12236 = null;
		Statement stmt12236 = null;
		try {
			c12236 = DBUtils.openConnection();
			stmt12236 = c12236.createStatement();
			// just run the sql statement
			ResultSet rs = stmt12236.executeQuery(sqlpw5);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt12236.close();
				c12236.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		



                String sqlpw2="";
	       
	       sqlpw2 = "update fonos set cel = "+cel+" ,fono_pro = "+fono_pro+" where id_per = "+id_per+" ;";

	        Connection c12234 = null;
		Statement stmt12234 = null;
		try {
			c12234 = DBUtils.openConnection();
			stmt12234 = c12234.createStatement();
			// just run the sql statement
			ResultSet rs = stmt12234.executeQuery(sqlpw2);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt12234.close();
				c12234.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		           
	   
	   
	   
	   }



}
