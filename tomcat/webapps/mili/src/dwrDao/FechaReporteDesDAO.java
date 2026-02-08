package dwrDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.DBUtils;
public class FechaReporteDesDAO {

public int cont(String fecha_inicio,String fecha_final) {

	String  sql ="select count(*) as cont from produce p,hemocomponente h where(h.id_hemo=p.id_hemo)and(nombre='plasma fresco')and ((fecha_produccion >= '"+fecha_inicio+"')and(fecha_produccion <= '"+fecha_final+"'))   ;";

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




}