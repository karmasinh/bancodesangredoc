package dwrDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.DBUtils;
public class ListaMedicaDAO {
public int cont(String fecha_inicio,String fecha_final) {

	String  sql ="select count(id_aten) as cont  from atencion where (fecha_a >= '"+fecha_inicio+"')and(fecha_a <= '"+fecha_final+"');";
		
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



public int cont1(String fecha_inicio,String fecha_final) {

	String  sql ="select count(id_aten) as cont1  from atencion where(tipo_do='R')and(fecha_a >= '"+fecha_inicio+"')and(fecha_a <= '"+fecha_final+"');";
		
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
				numberApartments = rs.getInt("cont1");
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



public int cont2(String fecha_inicio,String fecha_final) {

	String  sql ="select count(id_aten) as cont2  from evaluacion e,atencion a  where (a.id_aten=e.id_aten)and(e.rechazo='Temporalmente')and(a.fecha_a >= '"+fecha_inicio+"')and(a.fecha_a <= '"+fecha_final+"');";
	
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


public int cont3(String fecha_inicio,String fecha_final) {

	String  sql ="select count(id_aten) as cont3  from evaluacion e, atencion a  where(a.id_aten=e.id_aten)and(e.rechazo='Permanente')and(a.fecha_a >= '"+fecha_inicio+"')and(a.fecha_a <= '"+fecha_final+"');";
	
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
				numberApartments = rs.getInt("cont3");
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



public int cont4(String fecha_inicio,String fecha_final) {

	String  sql ="select count(*) as cont4 from extraccion where not(cant_extra='')and(fecha_extra >= '"+fecha_inicio+"')and(fecha_extra <= '"+fecha_final+"');";
	
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
				numberApartments = rs.getInt("cont4");
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





public int cont6(String fecha_inicio,String fecha_final) {

	String  sql ="select count(*) as cont6  from atencion where(tipo_do='V') and(fecha_a >= '"+fecha_inicio+"')and(fecha_a <= '"+fecha_final+"');";
	
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
				numberApartments = rs.getInt("cont6");
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



public int cont7(String fecha_inicio,String fecha_final) {

	String  sql ="select count(*) as cont7  from atencion where(tipo_do='A') and(fecha_a >= '"+fecha_inicio+"')and(fecha_a <= '"+fecha_final+"');";
	
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
				numberApartments = rs.getInt("cont7");
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





public Collection mostrarLista() {

	Collection lista = new Vector();
	String  sqla ="select a.id_aten,d.cod_do,p.nom,p.apepa,p.apema  from atencion a,persona p,donante d  where(d.cod_do=a.cod_do)and(p.id_per=d.id_per)and(a.atendido='T')and(a.atendidop='T');";
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
		ap.setNom(rs.getString("nom"));				
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));

		return ap;
       }

public Collection mostrarListaEva(int id_aten) {

	Collection lista = new Vector();
	String  sqla ="select id_aten,fecha_a,hora_a,sistolica,diastolica,pulso,peso,talla,temperatura  from atencion where(id_aten = "+id_aten+");";
	
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
		
		ap.setId_aten(rs.getInt("id_aten"));		
		ap.setFecha_a(rs.getString("fecha_a"));		
		ap.setHora_a(rs.getString("hora_a"));
		ap.setSistolica(rs.getInt("sistolica"));				
		ap.setDiastolica(rs.getInt("diastolica"));
		ap.setPulso(rs.getInt("pulso"));
		ap.setPeso(rs.getInt("peso"));
		ap.setTalla(rs.getInt("talla"));
		ap.setTemperatura(rs.getInt("temperatura"));
		return ap;
       }
/***********************cuenta el total de evaluacion*/////////
public int contadorEva() {

		String sql = "select count(*) as total from evaluacion";
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




public void adicionarEvalu(String obs,String ayunas,String numeral,int id_aten,String r,String ingestion,String rechazo,String fecha_a,String cod_per,int id_horario, String cod_do)   
{
//                int id_eva= contadorEva();
                String atendido="A";
                //int cod_per=2233;
                String sqlpw="";
//	sqlpw = "insert into evaluacion(obs,ayunas,numeral,ingestion,rechazo,atendido,resultado,id_aten,id_horario,cod_do,cod_per) values ('"+obs+"','"+ayunas+"','"+numeral+"','"+ingestion+"','"+rechazo+"','"+atendido+"','"+r+"',"+idaten+","+id_horario+",'"+cod_do+"','"+cod_per+"');";
		sqlpw = "insert into evaluacion(obs,ayunas,numeral,ingestion,rechazo,atendido,resultado,id_horario,cod_do, cod_per,fecha_a,id_eva)values('"+obs+"','"+ayunas+"','"+numeral+"','"+ingestion+"','"+rechazo+"','"+atendido+"','"+r+"',"+id_horario+",'"+cod_do+"','"+cod_per+"','"+fecha_a+"',"+id_aten+");";
	
	        Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sqlpw);
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




            String sqlpwr="";
		
		
	        sqlpwr = "update atencion set atendido='A' where id_aten="+id_aten+" ;";

	        Connection c12 = null;
		Statement stmt12 = null;
		try {
			c12 = DBUtils.openConnection();
			stmt12 = c12.createStatement();
			// just run the sql statement
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

///////////***********PAGINACION****************//////////////
/*public int Cantidad() {

	String  sql ="select count(*) as Cantidad from atencion where atendido='T';";
		
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
				numberApartments = rs.getInt("Cantidad");
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
*/
       public int Proceso(String sql){
                int n=0;
		Collection list = new Vector();
		Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {//CARGANDO LOS DATOS
                              n = rs.getInt(1);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {	stmt.close();c.close();}
		        catch (SQLException e) {e.printStackTrace();}
		}
		return n;
       }

       public int Cantidad(){
	      return Proceso("select count(*) as Cantidad from atencion where atendido='T';");
       }


public Collection mostrarEvaluacion(int id_aten) {
	Collection lista = new Vector();

                String sql="";
		sql="select obs,ayunas,numeral,ingestion,rechazo,resultado from evaluacion  where(id_aten = "+id_aten+");";

		Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sql);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarE7(rs);
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
	
	private NivelesRevicionLab getListarE7(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		

		ap.setObs(rs.getString("obs"));
		ap.setAyunas(rs.getString("ayunas"));
		ap.setNumeral(rs.getString("numeral"));
		ap.setIngestion(rs.getString("ingestion"));
		ap.setRechazo(rs.getString("rechazo"));
		ap.setResultado(rs.getString("resultado"));
		
		return ap;
       }

public String mostrarResultado(int id_aten) {
	        String	sql="select resultado as total from evaluacion  where(id_aten = "+id_aten+");";

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


///////////////************modificar de revicion medica no eliminar**************///////
public void modificarRevicion(String ayunas,String ingestion,String obs,String resultado,String rechazo,String numeral,int id_aten)  
{
               String sqlpw="";
	  
	       sqlpw = "update evaluacion set ayunas='"+ayunas+"',ingestion='"+ingestion+"', obs='"+obs+"',resultado='"+resultado+"',rechazo='"+rechazo+"',numeral='"+numeral+"' where (id_aten="+id_aten+");";
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

/////////************estas funciones pertenecen a busqueda esta bien funcionan no borrar*********//////
////////////////*********por cod_Do***************/////////
public int cuentaPr(String cod_do) {
	    String sql="select count(id_aten) as cuentaPr  from atencion where((atendidop='A')and (id_aten=(select max(a.id_aten) from atencion a  where a.cod_do='"+cod_do+"')));";

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
				numberApartments = rs.getInt("cuentaPr");
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


public int cuentaIH(String cod_do) {
//		String sql="select count(id_aten)as cuentaIH  from atencion where((atendidoh='A')and(id_aten=(select max(id_aten) from atencion a,persona p,donante d  where(a.cod_do='"+cod_do+"')and(p.id_per=d.id_per)and(a.cod_do=d.cod_do))));";				

	    String sql="select count(id_aten) as cuentaIH  from atencion where((atendidoh='A')and (id_aten=(select max(a.id_aten) from atencion a  where a.cod_do='"+cod_do+"')));";

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
				numberApartments = rs.getInt("cuentaIH");
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


public int cuentaIS(String cod_do) {
//		String sql="select count(id_aten)as cuentaIS  from atencion where((atendidos='A')and(id_aten=(select max(id_aten) from atencion a  where(a.cod_do='"+cod_do+"'))));";		

    String sql="select count(id_aten) as cuentaIS  from atencion where((atendidos='A')and (id_aten=(select max(a.id_aten) from atencion a where a.cod_do='"+cod_do+"'   )));";

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
				numberApartments = rs.getInt("cuentaIS");
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




public int cuentaTami(String cod_do) {
        String sql="select count(id_aten) as cuentaTami from atencion where((atendido='A')and (id_aten=(select max(a.id_aten) from atencion a  where a.cod_do='"+cod_do+"')));";		
//	String sql="select count(id_aten)as cuentaTami from atencion where((atendido='A')and(id_aten=(select max(id_aten) from atencion a,persona p,donante d  where(a.cod_do='"+cod_do+"')and(p.id_per=d.id_per)and(a.cod_do=d.cod_do))));";
//	String sql="select count(id_aten)as cuentaTami from atencion;";

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
				numberApartments = rs.getInt("cuentaTami");
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
/////////////************fin por codigo***************///////////
////////////****************por ci***********************////////////
public int ciTm(int ci) {
	    String sql="select count(id_aten)as ciTm from atencion where (atendido='A')and(id_aten=(select max(a.id_aten) from atencion a,donante d,persona p  where(a.cod_do=d.cod_do)and(d.id_per=p.id_per)and(p.ci="+ci+") )  );";

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
				numberApartments = rs.getInt("ciTm");
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

public int ciPr(int ci) {
	    String sql="select count(id_aten)as ciPr from atencion where (atendidop='A')and(id_aten=(select max(a.id_aten) from atencion a,donante d,persona p  where(a.cod_do=d.cod_do)and(d.id_per=p.id_per)and(p.ci="+ci+") )  );";

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
				numberApartments = rs.getInt("ciPr");
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


public int ciIH(int ci) {
	    String sql="select count(id_aten)as ciIH from atencion where (atendidoh='A')and(id_aten=(select max(a.id_aten) from atencion a,donante d,persona p  where(a.cod_do=d.cod_do)and(d.id_per=p.id_per)and(p.ci="+ci+") )  );";

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
				numberApartments = rs.getInt("ciIH");
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


public int ciIS(int ci) {
	    String sql="select count(id_aten)as ciIS from atencion where (atendidos='A')and(id_aten=(select max(a.id_aten) from atencion a,donante d,persona p  where(a.cod_do=d.cod_do)and(d.id_per=p.id_per)and(p.ci="+ci+") )  );";

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
				numberApartments = rs.getInt("ciIS");
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

///////************por apepa*************/////////
public int apIS(String apepa) {
	    String sql="select count(id_aten)as apIS from atencion where (atendidos='A')and(id_aten=(select max(a.id_aten) from atencion a,donante d,persona p  where(a.cod_do=d.cod_do)and(d.id_per=p.id_per)and(p.apepa='"+apepa+"') )  );";

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
				numberApartments = rs.getInt("apIS");
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


public int apIH(String apepa) {
	    String sql="select count(id_aten)as apIH from atencion where (atendidoh='A')and(id_aten=(select max(a.id_aten) from atencion a,donante d,persona p  where(a.cod_do=d.cod_do)and(d.id_per=p.id_per)and(p.apepa='"+apepa+"') )  );";

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
				numberApartments = rs.getInt("apIH");
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

public int apPR(String apepa) {
	    String sql="select count(id_aten)as apPR from atencion where (atendidop='A')and(id_aten=(select max(a.id_aten) from atencion a,donante d,persona p  where(a.cod_do=d.cod_do)and(d.id_per=p.id_per)and(p.apepa='"+apepa+"') )  );";

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
				numberApartments = rs.getInt("apPR");
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


public int apTM(String apepa) {
	    String sql="select count(id_aten)as apTM from atencion where (atendido='A')and(id_aten=(select max(a.id_aten) from atencion a,donante d,persona p  where(a.cod_do=d.cod_do)and(d.id_per=p.id_per)and(p.apepa='"+apepa+"') )  );";

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
				numberApartments = rs.getInt("apTM");
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