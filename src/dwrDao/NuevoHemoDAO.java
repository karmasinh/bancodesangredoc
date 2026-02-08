package dwrDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.DBUtils;
public class NuevoHemoDAO {

public int countRegistro() {
		String sql = "select count(*) as total from hemocomponente";
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
	
public void adicionarHemo(String nombre,String descripcion )  
{                    
               int   id_hemo= countRegistro();
               String sqlpw="";
	//       String estado="N";
	       sqlpw = "insert into hemocomponente(id_hemo,nombre,descripcion,estado) values("+id_hemo+",'"+nombre+"','"+descripcion+"','N');";

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

////////////////////esto es para roles///////////////////////////
public void modificarRol(String nombre,String id)  
{
               String sqlpw="";
	       
	       sqlpw = "update roles set nombre = '"+nombre+"'  where id_rol = "+id+" ;";

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
public void eliminarRol(int id_rol)  
{
               String sqlpw="";
	       sqlpw = "delete from roles  where id_rol ="+id_rol +"  ;";
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

public Collection listaRol() {

	        Collection lista = new Vector();
	        String  sqla ="";
	        sqla ="select nombre,id_rol  from roles ;";
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

		ap.setNombre(rs.getString("nombre"));
		ap.setId_rol(rs.getInt("id_rol"));
		return ap;
       }

public int cuentaRol() {
		String sql = "select count(*) as to from roles";
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
				numberApartments = rs.getInt("to");
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


public void insertaRol(String nombre,String modulo )  
{                    
               int   id_rol= cuentaRol();
               String sqlpw="";
	       sqlpw = "insert into roles(id_rol,nombre) values("+id_rol+",'"+nombre+"');";

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

public void insertaModulo(int id_rol,String modulo )  
{                    
               String sql="";
	       sql = "insert into modulo(nombre,id_rol) values('"+modulo+"',"+id_rol+");";

	        Connection c1 = null;
		Statement stmt1 = null;
		try {
			c1 = DBUtils.openConnection();
			stmt1 = c1.createStatement();
			// just run the sql statement
			ResultSet rs = stmt1.executeQuery(sql);
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

           
	   
	   
	   }
////////////////////no eliminar destino
public int cuentaDestino() {
		String sql = "select count(*) as to1 from destino";
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
				numberApartments = rs.getInt("to1");
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

public void insertarDestino(String nombre)  
{                    
               int   id_des= cuentaDestino();
               String sqlpw="";
	       sqlpw = "insert into destino(id_destino,nombre) values("+id_des+",'"+nombre+"');";

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
public Collection listaDestino() {

	        Collection lista = new Vector();
	        String  sqla ="";
	        sqla ="select nombre,id_destino  from destino ;";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getL(rs);
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
	
	private NivelesRevicionLab getL(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

		ap.setNombre(rs.getString("nombre"));
		ap.setId_destino(rs.getInt("id_destino"));
		return ap;
       }

public Collection listaModulo() {

	        Collection lista = new Vector();
	        String  sqla ="";
	        sqla ="select nombre,id_mod  from modulo ;";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getLy(rs);
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
	
	private NivelesRevicionLab getLy(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

		ap.setNombre(rs.getString("nombre"));
		ap.setId_destino(rs.getInt("id_mod"));
		return ap;
       }

public Collection listaDestino1(int id_destino) {

	        Collection lista = new Vector();
	        String  sqla ="";
	        sqla ="select nombre,id_destino  from destino where(id_destino="+id_destino+");";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getL1(rs);
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
	
	private NivelesRevicionLab getL1(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

		ap.setNombre(rs.getString("nombre"));
		ap.setId_destino(rs.getInt("id_destino"));
		return ap;
       }

public void modificarDestino(String nombre,int id)  
{
               String sqlpw="";
	       
	       sqlpw = "update destino set nombre = '"+nombre+"'  where id_destino = "+id+" ;";

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
public void eliminarDestino(int id)  
{
               String sqlpw="";
	       
	       sqlpw = "delete from destino  where id_destino = "+id+" ;";

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