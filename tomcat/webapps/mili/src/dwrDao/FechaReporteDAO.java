package dwrDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.DBUtils;
public class FechaReporteDAO {

public int cont(String fecha_inicio,String fecha_final) {

	String  sql ="select count(*) as cont  from prueba p,resultado_prueba rp where (nombre_tp LIKE 'HAI%')and(p.id_prueba=rp.id_prueba)and(rp.resultado='Positivo')and(fecha_prueba >= '"+fecha_inicio+"')and(fecha_prueba <= '"+fecha_final+"');";

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

	String  sql ="select count(*) as cont1  from prueba p,resultado_prueba rp where  (nombre_tp LIKE 'Chagas%')and(p.id_prueba=rp.id_prueba)and(rp.resultado='Positivo') and(fecha_prueba >= '"+fecha_inicio+"')and(fecha_prueba <= '"+fecha_final+"' ) ;";
		
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

	String  sql ="select count(*) as cont2 from prueba p,resultado_prueba rp where  (nombre_tp LIKE 'HIV%')and(p.id_prueba=rp.id_prueba)and(rp.resultado='Positivo') and(fecha_prueba >= '"+fecha_inicio+"')and(fecha_prueba <= '"+fecha_final+"')   ;";
	
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

	String  sql ="select count(*) as cont3  from extraccion ;";

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

	String  sql ="select count(*) as cont4  from prueba p,resultado_prueba rp where  (nombre_tp LIKE 'sifilis%')and(p.id_prueba=rp.id_prueba)and(rp.resultado='Positivo') and(fecha_prueba >= '"+fecha_inicio+"')and(fecha_prueba <= '"+fecha_final+"' )   ;";

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

	String  sql ="select count(*) as cont6  from prueba p,resultado_prueba rp where  (nombre_tp LIKE 'HBSAS%')and(p.id_prueba=rp.id_prueba)and(rp.resultado='Positivo') and(fecha_prueba >= '"+fecha_inicio+"')and(fecha_prueba <= '"+fecha_final+"' ) ;";
	
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

	String  sql ="select count(*) as cont7  from prueba p,resultado_prueba rp  where  (nombre_tp LIKE 'HCV%')and(p.id_prueba=rp.id_prueba)and(rp.resultado='Positivo') and(fecha_prueba >= '"+fecha_inicio+"')and(fecha_prueba <= '"+fecha_final+"' )   ;";

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



}