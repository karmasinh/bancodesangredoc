package dwrDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.DBUtils;
public class ListaAdmPruebaDAO {
                 
public Collection mostrarLista() {

	Collection lista = new Vector();
	String N="N";
	
	String  sqla ="select id_prueba,descr,nombre_tp,tipo  from prueba where (positivo='"+N+"')and(tipo_componente!=1);";
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
		
		
		ap.setId_prueba(rs.getInt("id_prueba"));		
		ap.setDescr(rs.getString("descr"));
		ap.setNombre_tp(rs.getString("nombre_tp"));				
		ap.setTipo(rs.getString("tipo"));

		return ap;
       }

public Collection mostrarListaV(int id_prueba) {

	Collection lista = new Vector();
	String N="N";
	
	String  sql ="select id_prueba,valores,id_valor  from valores where id_prueba="+id_prueba+" and positivo='"+N+"'  ;";
//	String  sql ="select id_prueba,valores,id_valor  from valores where id_prueba="+id_prueba+"  ;";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sql);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarP(rs);
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
	
	private NivelesRevicionLab getListarP(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
		
		ap.setId_prueba(rs.getInt("id_prueba"));		
		ap.setValores(rs.getString("valores"));
		ap.setId_valor(rs.getInt("id_valor"));
		return ap;
       }



public Collection mostrarLista1(int id_prueba) {

	Collection lista = new Vector();
	String N="N";
	
	String  sqlaa ="select id_prueba,descr,nombre_tp,tipo  from prueba where id_prueba="+id_prueba+"  and positivo='"+N+"' ;";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqlaa);
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
		
		
		ap.setId_prueba(rs.getInt("id_prueba"));		
		ap.setDescr(rs.getString("descr"));
		ap.setNombre_tp(rs.getString("nombre_tp"));				
		ap.setTipo(rs.getString("tipo"));

		return ap;
       }


public void modificarPrueba(int id_prueba,String descr,String nombre_tp,String tipo)  
{
               String sqlpw="";
	       
	       sqlpw = "update prueba set descr = '"+descr+"', nombre_tp='"+nombre_tp+"', tipo='"+tipo+"' where id_prueba = "+id_prueba+" ;";

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




public void modificarPrueba1(int id_prueba)  
{
               String sqlpa="";
               String E="E";	  
	       
	       sqlpa = "update prueba set positivo = '"+E+"'  where id_prueba = "+id_prueba+" ;";

	        Connection c1224 = null;
		Statement stmt1224 = null;
		try {
			c1224 = DBUtils.openConnection();
			stmt1224 = c1224.createStatement();
			// just run the sql statement
			ResultSet rs = stmt1224.executeQuery(sqlpa);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt1224.close();
				c1224.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		


           
	   
	   
	   }

public void modificarValores1(int id_prueba , int id_valor)  
{
               String sqlp1="";
               String E="E";	  
	       sqlp1 = "update valores set positivo = '"+E+"' where id_prueba = "+id_prueba+"  and  id_valor = "+id_valor+" ;";

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

public void modificarValores(int id_prueba,String valores,int id_valor)  
{
               String sqlp="";
	       
	       sqlp = "update valores set valores = '"+valores+"' where id_prueba = "+id_prueba+"  and  id_valor = "+id_valor+" ;";

	        Connection c123 = null;
		Statement stmt123 = null;
		try {
			c123 = DBUtils.openConnection();
			stmt123 = c123.createStatement();
			// just run the sql statement
			ResultSet rs = stmt123.executeQuery(sqlp);
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



///////////////***********adicionar resultados***********///////////////

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



public Collection listarPrueba1(int id_prueba) {

	Collection list = new Vector();
	String sqlt="";
	String valores="S";
        
	sqlt ="select id_prueba,tipo from  prueba where (id_prueba="+id_prueba+");";
	        Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sqlt);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarPre11(rs);
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

	private NivelesRevicionLab getListarPre11(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

		ap.setId_prueba(rs.getInt("id_prueba"));
		ap.setTipo(rs.getString("tipo"));

		return ap;
		    }


public void AdicionarValores (String valores,int id_prueba)  
{
//               int   id_prueba= countRegistro()-1;
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
////////////////************fin*******//////










}
