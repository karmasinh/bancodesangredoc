package dwrDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.DBUtils;
public class ListaKardexDAO {
////////------------************INICIO ID_HEMO=1////////////*************
public int cont1() {

	String  sql ="SELECT COUNT(*) AS CONT1 FROM PRODUCE WHERE(ID_HEMO=1)AND(PRUEBAS_SALIDA='N')AND(gs_rh='B+') ;";

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

public int cont3() {

	String  sql ="SELECT COUNT(*) AS CONT3 FROM PRODUCE WHERE(ID_HEMO=1)AND(PRUEBAS_SALIDA='N')AND(gs_rh='A+');";
	
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

public int cont6() {

	String  sql ="SELECT COUNT(*) AS CONT6 FROM PRODUCE WHERE(ID_HEMO=1)AND(PRUEBAS_SALIDA='N')AND(gs_rh='O+');";
	
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

public int cont31() {

	String  sql ="SELECT COUNT(*) AS CONT31 FROM PRODUCE WHERE(ID_HEMO=1)AND(PRUEBAS_SALIDA='N')AND(gs_rh='AB+');";
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
				numberApartments = rs.getInt("cont31");
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

public int cont111() {

	String  sql ="SELECT COUNT(*) AS CONT111 FROM PRODUCE WHERE(ID_HEMO=1)AND(PRUEBAS_SALIDA='N')AND(gs_rh='B-') ;";

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
				numberApartments = rs.getInt("cont111");
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

public int cont333() {

	String  sql ="SELECT COUNT(*) AS CONT333 FROM PRODUCE WHERE(ID_HEMO=1)AND(PRUEBAS_SALIDA='N')AND(gs_rh='A-');";
	
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
				numberApartments = rs.getInt("cont333");
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

public int cont666() {

	String  sql ="SELECT COUNT(*) AS CONT666 FROM PRODUCE WHERE(ID_HEMO=1)AND(PRUEBAS_SALIDA='N')AND(gs_rh='O-');";
	
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
				numberApartments = rs.getInt("cont666");
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


public int cont313() {

	String  sql ="SELECT COUNT(*) AS CONT313 FROM PRODUCE WHERE(ID_HEMO=1)AND(PRUEBAS_SALIDA='N')AND(gs_rh='AB-');";
	
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
				numberApartments = rs.getInt("cont313");
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

////////------------************FIN ID_HEMO=1////////////*************
////////////************INICIO ID_HEMO=2////////////////////////////////
public int cont7() {

	String  sql ="SELECT COUNT(*) AS CONT7 FROM PRODUCE WHERE(ID_HEMO=2)AND(PRUEBAS_SALIDA='N')AND(gs_rh='O-') ;";

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

public int cont9() {

	String  sql ="SELECT COUNT(*) AS CONT9 FROM PRODUCE WHERE(ID_HEMO=2)AND(PRUEBAS_SALIDA='N')AND(gs_rh='AB+');";

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

public int cont10() {

	String  sql ="SELECT COUNT(*) AS CONT10  FROM PRODUCE WHERE(ID_HEMO=2)AND(PRUEBAS_SALIDA='N')AND(gs_rh='AB-')  ;";

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
				numberApartments = rs.getInt("cont10");
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

public int cont12() {

	String  sql ="SELECT COUNT(*) AS CONT12 FROM PRODUCE WHERE(ID_HEMO=2)AND(PRUEBAS_SALIDA='N')AND(gs_rh='B+') ;";

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
				numberApartments = rs.getInt("cont12");
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

public int cont777() {

	String  sql ="SELECT COUNT(*) AS CONT777 FROM PRODUCE WHERE(ID_HEMO=2)AND(PRUEBAS_SALIDA='N')AND(gs_rh='O+') ;";

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
				numberApartments = rs.getInt("cont777");
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

public int cont122() {

	String  sql ="SELECT COUNT(*) AS CONT122 FROM PRODUCE WHERE(ID_HEMO=2)AND(PRUEBAS_SALIDA='N')AND(gs_rh='B-') ;";

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
				numberApartments = rs.getInt("cont122");
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

public int cont32() {

	String  sql ="SELECT COUNT(*) AS CONT32 FROM PRODUCE WHERE(ID_HEMO= 2)AND(PRUEBAS_SALIDA='N')AND(gs_rh='A-')  ;";

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
				numberApartments = rs.getInt("cont32");
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

public int cont33() {

	String  sql ="SELECT COUNT(*) AS CONT33 FROM PRODUCE WHERE(ID_HEMO= 2)AND(PRUEBAS_SALIDA='N')AND(gs_rh='A+')  ;";

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
				numberApartments = rs.getInt("cont33");
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

////////////************FIN  ID_HEMO=2////////////////////////////////
////////////***********INICIO  ID_HEMO=3////////////////////////////////
public int cont() {

	String  sql ="SELECT COUNT(*) AS CONT FROM PRODUCE WHERE(ID_HEMO=3)AND(PRUEBAS_SALIDA='N')AND(gs_rh='B+');";
	
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

public int cont2() {

	String  sql ="SELECT COUNT(*) AS CONT2 FROM PRODUCE WHERE(ID_HEMO=3)AND(PRUEBAS_SALIDA='N')AND(gs_rh='A+') ;";

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

public int cont4() {

	String  sql ="SELECT COUNT(*) AS CONT4 FROM PRODUCE WHERE(ID_HEMO=3)AND(PRUEBAS_SALIDA='N')AND(gs_rh='O+') ;";
	
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

public int cont000() {

	String  sql ="SELECT COUNT(*) AS CONT000 FROM PRODUCE WHERE(ID_HEMO=3)AND(PRUEBAS_SALIDA='N')AND(gs_rh='B-');";
	
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
				numberApartments = rs.getInt("cont000");
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

public int cont222() {

	String  sql ="SELECT COUNT(*) AS CONT222 FROM PRODUCE WHERE(ID_HEMO=3)AND(PRUEBAS_SALIDA='N')AND(gs_rh='A-') ;";

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
				numberApartments = rs.getInt("cont222");
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





public int cont444() {

	String  sql ="SELECT COUNT(*) AS CONT444 FROM PRODUCE WHERE(ID_HEMO=3)AND(PRUEBAS_SALIDA='N')AND(gs_rh='O-') ;";
	
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
				numberApartments = rs.getInt("cont444");
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

public int cont34() {

	String  sql ="SELECT COUNT(*) AS CONT34 FROM PRODUCE WHERE(ID_HEMO=3)AND(PRUEBAS_SALIDA='N')AND(gs_rh='AB+') ;";
	
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
				numberApartments = rs.getInt("cont34");
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

public int cont35() {

	String  sql ="SELECT COUNT(*) AS CONT35 FROM PRODUCE WHERE(ID_HEMO=3)AND(PRUEBAS_SALIDA='N')AND(gs_rh='AB-') ;";
	
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
				numberApartments = rs.getInt("cont35");
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

/////////****************FIN DE ID_HEMO=3/*////////////////////////////////
////////***************INICIOO DE ID_HEMO=4***********///////////////////////
public int cont15() {

	String  sql ="SELECT COUNT(*) AS CONT15 FROM PRODUCE WHERE(ID_HEMO= 4)AND(PRUEBAS_SALIDA='N')AND(gs_rh='O-')  ;";

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
				numberApartments = rs.getInt("cont15");
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

public int cont16() {

	String  sql ="SELECT COUNT(*) AS CONT16 FROM PRODUCE WHERE(ID_HEMO= 4)AND(PRUEBAS_SALIDA='N')AND(gs_rh='O+')  ;";

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
				numberApartments = rs.getInt("cont16");
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


public int cont17() {

	String  sql ="SELECT COUNT(*) AS CONT17 FROM PRODUCE WHERE(ID_HEMO= 4)AND(PRUEBAS_SALIDA='N')AND(gs_rh='AB+')  ;";

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
				numberApartments = rs.getInt("cont17");
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

public int cont18() {

	String  sql ="SELECT COUNT(*) AS CONT18 FROM PRODUCE WHERE(ID_HEMO= 4)AND(PRUEBAS_SALIDA='N')AND(gs_rh='AB-')  ;";

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
				numberApartments = rs.getInt("cont18");
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



public int cont19() {

	String  sql ="SELECT COUNT(*) AS CONT19 FROM PRODUCE WHERE(ID_HEMO= 4)AND(PRUEBAS_SALIDA='N')AND(gs_rh='B-')  ;";

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
				numberApartments = rs.getInt("cont19");
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


public int cont20() {

	String  sql ="SELECT COUNT(*) AS CONT20 FROM PRODUCE WHERE(ID_HEMO= 4)AND(PRUEBAS_SALIDA='N')AND(gs_rh='B+')  ;";

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
				numberApartments = rs.getInt("cont20");
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


public int cont21() {

	String  sql ="SELECT COUNT(*) AS CONT21 FROM PRODUCE WHERE(ID_HEMO= 4)AND(PRUEBAS_SALIDA='N')AND(gs_rh='A+')  ;";

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
				numberApartments = rs.getInt("cont21");
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


public int cont22() {

	String  sql ="SELECT COUNT(*) AS CONT22 FROM PRODUCE WHERE(ID_HEMO= 4)AND(PRUEBAS_SALIDA='N')AND(gs_rh='A-')  ;";

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
				numberApartments = rs.getInt("cont22");
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



/////////*******************FIN DE ID_HEMO=4*********////////////////////////
/////////**********INICIO ID_HEMO=5***********//////////////////////////////
public int cont23() {

	String  sql ="SELECT COUNT(*) AS CONT23 FROM PRODUCE WHERE(ID_HEMO= 5)AND(PRUEBAS_SALIDA='N')AND(gs_rh='O-')  ;";

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
				numberApartments = rs.getInt("cont23");
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


public int cont24() {

	String  sql ="SELECT COUNT(*) AS CONT24 FROM PRODUCE WHERE(ID_HEMO= 5)AND(PRUEBAS_SALIDA='N')AND(gs_rh='O+')  ;";

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
				numberApartments = rs.getInt("cont24");
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


public int cont25() {

	String  sql ="SELECT COUNT(*) AS CONT25 FROM PRODUCE WHERE(ID_HEMO= 5)AND(PRUEBAS_SALIDA='N')AND(gs_rh='AB+')  ;";

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
				numberApartments = rs.getInt("cont25");
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


public int cont26() {

	String  sql ="SELECT COUNT(*) AS CONT26 FROM PRODUCE WHERE(ID_HEMO= 5)AND(PRUEBAS_SALIDA='N')AND(gs_rh='AB-')  ;";

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
				numberApartments = rs.getInt("cont26");
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


public int cont27() {

	String  sql ="SELECT COUNT(*) AS CONT27 FROM PRODUCE WHERE(ID_HEMO= 5)AND(PRUEBAS_SALIDA='N')AND(gs_rh='B-')  ;";

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
				numberApartments = rs.getInt("cont27");
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


public int cont28() {

	String  sql ="SELECT COUNT(*) AS CONT28 FROM PRODUCE WHERE(ID_HEMO= 5)AND(PRUEBAS_SALIDA='N')AND(gs_rh='B+')  ;";

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
				numberApartments = rs.getInt("cont28");
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


public int cont29() {

	String  sql ="SELECT COUNT(*) AS CONT29 FROM PRODUCE WHERE(ID_HEMO= 5)AND(PRUEBAS_SALIDA='N')AND(gs_rh='A+')  ;";

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
				numberApartments = rs.getInt("cont29");
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


public int cont30() {

	String  sql ="SELECT COUNT(*) AS CONT30 FROM PRODUCE WHERE(ID_HEMO= 5)AND(PRUEBAS_SALIDA='N')AND(gs_rh='A-')  ;";

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
				numberApartments = rs.getInt("cont30");
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

///////////////////********FIN DE IDHEMO=5*******************//////////////


}