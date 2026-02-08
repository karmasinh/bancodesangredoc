package dwrDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.DBUtils;
public class ListaAdmHemoDAO {

public Collection mostrarLista() {

	Collection lista = new Vector();
	
	String  sqla ="select id_hemo,nombre,descripcion  from hemocomponente where(estado='N');";
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
		
		ap.setId_hemo(rs.getInt("id_hemo"));		
		ap.setNombre(rs.getString("nombre"));
		ap.setDescripcion(rs.getString("descripcion"));				

		return ap;
       }



public void eliminarH(int id_hemo)
{
               String sqlp1="";

	       sqlp1 = "update hemocomponente set estado='E' where id_hemo = "+id_hemo+" ;";

	        Connection c123 = null;
		Statement stmt123 = null;
		try {
			c123 = DBUtils.openConnection();
			stmt123 = c123.createStatement();
			// just run the sql statement
			ResultSet rs = stmt123.executeQuery(sqlp1);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt123.close();
				c123.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		


           
	   
	   
	   }



public Collection mostrarLista1(int id_hemo) {

	Collection lista = new Vector();
	
	String  sqla ="select id_hemo,nombre,descripcion  from hemocomponente where id_hemo = "+id_hemo+" ;";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListar1(rs);
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
	
	private NivelesRevicionLab getListar1(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
		ap.setId_hemo(rs.getInt("id_hemo"));		
		ap.setNombre(rs.getString("nombre"));
		ap.setDescripcion(rs.getString("descripcion"));				

		return ap;
       }


public void modificarHemo(int id_hemo,String descripcion,String nombre)  
{
               String sqlpw="";
	       
	       sqlpw = "update hemocomponente set descripcion = '"+descripcion+"', nombre='"+nombre+"'  where id_hemo = "+id_hemo+" ;";

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



}
