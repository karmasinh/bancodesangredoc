package dwrDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.DBUtils;
public class ListaExtraDAO {

public Collection mostrarLista() {

	      Collection lista = new Vector();
//              String  sqla ="select a.id_aten,d.cod_do,p.nom,p.apepa,p.apema,e.resultado  from atencion a,persona p,donante d,evaluacion e,resultado_prueba rp where(a.id_aten=e.id_aten)and(d.cod_do=a.cod_do)and(p.id_per=d.id_per)and((a.atendidop='A')and(e.atendido='A')and(atendidoe='T')) and((a.id_aten=rp.id_aten)and(rp.resultado='Apto')and(instancia='pre-donacion'))and(a.id_aten=e.id_aten)  ;";
              String  sqla ="select a.id_aten,d.cod_do,p.nom,p.apepa,p.apema,e.resultado from atencion a,donante d,persona p,evaluacion e,resultado_prueba rp where a.atendido='A' and a.atendidop='A' and a.atendidoe='T' and d.cod_do=a.cod_do and d.id_per=p.id_per and e.id_eva=a.id_aten and rp.cod_do=d.cod_do and rp.id_aten=a.id_aten and rp.resultado='Donante  Apto' and rp.instancia='pre-donacion';";
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
                ap.setResultado(rs.getString("resultado"));
		return ap;
       }

public int cont() {

	String  sql ="select (max(id_ext)+1) as cont  from extraccion ;";
		
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
		
		return numberApartments+1;
	}

public String  codigo(int id_aten) {

	String  sql ="select cod_do as codigo  from atencion where id_aten="+id_aten+" ;";
		
	       String  numberApartments = "";
		// define db variables
		Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				numberApartments = rs.getString("codigo");
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

public void adicionarExtra(String fecha_extra,String hora,int id_aten,String bolsa,String tubuladora,String cant_extra,String cod_per,int id_horario)  
{
               int id_ext=cont(); 
               String sqlpw="";
	       String cod_do=codigo(id_aten);
               String fraccionado="T";

	       sqlpw = "insert into extraccion(hora,bolsa,tubuladora,cant_extra,fraccionado,cod_do,cod_per,id_horario,fecha_a,id_ext) values ('"+hora+"','"+bolsa+"','"+tubuladora+"','"+cant_extra+"','"+fraccionado+"','"+cod_do+"','"+cod_per+"',"+id_horario+",'"+fecha_extra+"',"+id_aten+");";
//	       sqlpw = "insert into  extraccion(id_ext,cod_do,fecha_extra,hora,bolsa,tubuladora,cant_extra,fraccionado,id_aten) values ("+id_ext+",'"+cod_do+"','"+fecha_extra+"','"+hora+"','"+bolsa+"','"+tubuladora+"','"+cant_extra+"','"+fraccionado+"',"+id_aten+")  ;";
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

           

               String sqlp="";
               String atendidoe="A";	       
	  
	       sqlp = "UPDATE atencion SET atendidoe = '"+atendidoe+"' WHERE id_aten = "+id_aten+"  ;";
	        Connection c12 = null;
		Statement stmt12 = null;
		try {
			c12 = DBUtils.openConnection();
			stmt12 = c12.createStatement();
			// just run the sql statement
			ResultSet rs = stmt12.executeQuery(sqlp);
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

	   


	   
	   
////////////////////////////***********MODIFICAR********************////////////


public String mostrarListaMOD(String cod_do) {
	        
		String	sql="select id_ext as total from extraccion  where(cod_do = '"+cod_do+"');";

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

public Collection mostrarListaMOD1(String cod_do) {
	      Collection lista = new Vector();

//              String  sqla ="select id_ext,bolsa,tubuladora,cant_extra  from extraccion  where  id_aten=(select max(id_aten) from extraccion)and (cod_do='"+cod_do+"');";
              String  sqla ="select fecha_a,id_ext,bolsa,tubuladora,cant_extra  from extraccion  where  id_ext=(select max(id_ext) from extraccion)and (cod_do='"+cod_do+"');";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getLi(rs);
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
	
	private NivelesRevicionLab getLi(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

		ap.setFecha_a(rs.getString("fecha_a"));
		ap.setBolsa(rs.getString("bolsa"));
                ap.setTubuladora(rs.getString("tubuladora"));
		ap.setCant_extra(rs.getString("cant_extra"));
		return ap;
       }
       
public void modificarExtra(int id_ext,String cod_do,String fecha_extra,String hora,String bolsa,String tubuladora,String cant_extra,String cod_per, int id_horario)  
{
               String sqlpw="";
               String fraccionado="T";
	//       sqlpw =" update extraccion  set  fecha_a='"+fecha_extra+"' ,hora='"+hora+"' ,bolsa='"+bolsa+"' ,tubuladora='"+tubuladora+"', cant_extra='"+cant_extra+"',cod_per='"+cod_per+"',id_horario="+id_horario+"   where id_ext ="+id_ext +"  ;";
	       sqlpw = "update extraccion set fecha_a='"+fecha_extra+"',hora='"+hora+"', bolsa='"+bolsa+"',tubuladora='"+tubuladora+"', cant_extra='"+cant_extra+"',cod_per='"+cod_per+"',   id_horario="+id_horario+" where id_ext="+id_ext+";";
	       
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

///////////////no eliminar es horario///////////////////////////               			
public void Eliminar(int id_horario)  
{
               String sqlpw="";
	       sqlpw = "delete from horario where id_horario ="+id_horario +"  ;";
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

public void modi_Horario(String semana,String hora_entrada,String hora_salida,int id_horario)
{
               String sqlp="";
               String atendidoe="A";	       
	  
	       sqlp = "UPDATE horario SET semana = '"+semana+"',hrs_entrada='"+hora_entrada+"',hrs_salida='"+hora_salida+"' WHERE id_horario = "+id_horario+"  ;";
	        Connection c12 = null;
		Statement stmt12 = null;
		try {
			c12 = DBUtils.openConnection();
			stmt12 = c12.createStatement();
			// just run the sql statement
			ResultSet rs = stmt12.executeQuery(sqlp);
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

public Collection horario1(int id_horario) {
	        Collection lista = new Vector();
	        String  sqla ="";
	        sqla ="select hrs_entrada,hrs_salida,id_horario,semana from horario where id_horario="+id_horario+";";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarEx1(rs);
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
	
	private NivelesRevicionLab getListarEx1(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

		ap.setHrs_entrada(rs.getString("hrs_entrada"));
		ap.setHrs_salida(rs.getString("hrs_salida"));
		ap.setId_horario(rs.getInt("id_horario"));
        	ap.setSemana(rs.getString("semana"));
		return ap;
       }

public void adi_Horario(String semana,String hora_entrada,String hora_salida)
{
           int id_per=conta();
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

public int conta() {
		String sql = "select max(id_horario)  as cont from horario";
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
      
/////////////////////////****************FIN********************/////////////////////////////////
public Collection listarHorario() {
	        Collection lista = new Vector();
	        String  sqla ="";
	        sqla ="select distinct(p.nom),p.apepa,p.apema,h.hrs_salida,h.semana,h.hrs_entrada from horario h,asiste a,personal p1,persona p where p.id_per=p1.id_per and p1.cod_per=a.cod_per and   a.id_horario=h.id_horario;";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getL9(rs);
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
	
	private NivelesRevicionLab getL9(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();


		ap.setNom(rs.getString("nom"));
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		ap.setHrs_salida(rs.getString("hrs_salida"));
        	ap.setSemana(rs.getString("semana"));
		ap.setHrs_entrada(rs.getString("hrs_entrada"));
		return ap;
       }


}