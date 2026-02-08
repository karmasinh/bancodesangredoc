package dwrDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.DBUtils;
public class FechaReporteFracDAO {

public int cont(String fecha_inicio,String fecha_final) {

	String  sql ="select count(*) as cont  from produce p,hemocomponente h where(h.id_hemo=p.id_hemo)and(h.nombre='Plasma Fresco Congelado')and ((fecha_produccion >= '"+fecha_inicio+"')and(fecha_produccion <= '"+fecha_final+"'))  ;";

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

	String  sql ="select count(*) as cont1  from produce p,hemocomponente h where(h.id_hemo=p.id_hemo)and(h.nombre='Plasma Fresco')and ((fecha_produccion >= '"+fecha_inicio+"')and(fecha_produccion <= '"+fecha_final+"'))    ;";

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



public int cont3(String fecha_inicio,String fecha_final) {

	String  sql ="select count(*) as cont3  from produce p,hemocomponente h where(h.id_hemo=p.id_hemo)and(h.nombre='Concentrado de Glovulos Rojos')and ((fecha_produccion >= '"+fecha_inicio+"')and(fecha_produccion <= '"+fecha_final+"')) ;";

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

	String  sql ="select count(*) as cont4  from produce p,hemocomponente h  where(h.id_hemo=p.id_hemo)and(h.nombre='Plaquetas')and ((fecha_produccion >= '"+fecha_inicio+"')and(fecha_produccion <= '"+fecha_final+"'))   ;";

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

	String  sql ="select count(*) as cont6 from produce p,hemocomponente h where(h.id_hemo=p.id_hemo)and(nombre='Crioprecipitado')and ((fecha_produccion >= '"+fecha_inicio+"')and(fecha_produccion <= '"+fecha_final+"'))  ;";
	
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

	String  sql ="select count(*) as cont7  from extraccion  where(fraccionado='T')and ((fecha_extra >= '"+fecha_inicio+"')and(fecha_extra <= '"+fecha_final+"'))   ;";

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



public int cont8(String fecha_inicio,String fecha_final) {

	String  sql ="select count(*) as cont8  from extraccion  where(fraccionado='A')and ((fecha_extra >= '"+fecha_inicio+"')and(fecha_extra <= '"+fecha_final+"'))   ;";

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
				numberApartments = rs.getInt("cont8");
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


public int cont9(String fecha_inicio,String fecha_final) {

	String  sql ="select count(*) as cont9  from extraccion   where((fecha_extra >= '"+fecha_inicio+"')and(fecha_extra <= '"+fecha_final+"'))   ;";

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
				numberApartments = rs.getInt("cont9");
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


public int contotal(String fecha_inicio,String fecha_final) {
	int cont=cont(fecha_inicio,fecha_final);
	int cont1=cont1(fecha_inicio,fecha_final);	
	int cont3=cont3(fecha_inicio,fecha_final);	
	int cont4=cont4(fecha_inicio,fecha_final);	
	int cont6=cont6(fecha_inicio,fecha_final);

	int total=cont+cont1+cont3+cont4+cont6;
	
		return total;
	}

/*
public int contotal(String fecha_inicio,String fecha_final) {
	int cont=cont(fecha_inicio,fecha_final);
	int cont1=cont1(fecha_inicio,fecha_final);	
	int cont3=cont3(fecha_inicio,fecha_final);	
	int cont4=cont4(fecha_inicio,fecha_final);	
	int cont6=cont6(fecha_inicio,fecha_final);

	int total=cont+cont3+cont4+cont6;
	
		return total;
	}
*/

public int division(int primero) {
	int d=primero+1;
		return d;
	}



}