package dwrDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.DBUtils;
public class NuevoPruebaDAO {

public int countRegistro() {
		String sql = "select max(id_prueba) as total from prueba";
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
	
	
	
public void adicionarPrueba(String tipo,String nombre_tp,String descr,String tipo_componente)  
{
               int   id_prueba= countRegistro();
               String sqlpw="";
	       String valores="S";
	       String positivo="N";
	       
	       sqlpw = "insert into prueba(id_prueba,descr,nombre_tp,tipo,tipo_componente,valores,positivo) values("+id_prueba+",'"+descr+"','"+nombre_tp+"','"+tipo+"', '"+tipo_componente+"', '"+valores+"','"+positivo+"');";
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
	   
public Collection listarPrueba(int id_prueba) {

	Collection list = new Vector();
	String sql="";
	String valores="S";
        
	sql ="select id_prueba,tipo from  prueba where ((id_prueba="+id_prueba+")and(valores='"+valores+"'));";
	        Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarPredo(rs);
				list.add(apartment);
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

		return list;
	}

	private NivelesRevicionLab getListarPredo(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

		ap.setId_prueba(rs.getInt("id_prueba"));
		ap.setTipo(rs.getString("tipo"));

		return ap;
      }

public void AdicionarValores (String valores)  
{
               int   id_prueba= countRegistro()-1;
               String sqlp="";
	       String positivo="N";	
			       
	       sqlp = "insert into valores(id_prueba,valores,positivo)values("+id_prueba+",'"+valores+"','"+positivo+"');";
                      	       
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


public Collection listarPrueba1(String tipo) {

	Collection list = new Vector();
	String sqlt="";
	String valores="S";
        
	sqlt ="select id_prueba,tipo from  prueba where ((tipo='"+tipo+"')and(valores='"+valores+"'));";
	        Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sqlt);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarPre(rs);
				list.add(apartment);
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

		return list;
	}

	private NivelesRevicionLab getListarPre(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

		ap.setId_prueba(rs.getInt("id_prueba"));
		ap.setTipo(rs.getString("tipo"));

		return ap;
      }


public void Principio ()  
{
               String sqlp="";
               String valores="S";	       
	       sqlp = "update prueba set  valores='N' where   valores='"+valores+"' ;";
                      	       
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



}