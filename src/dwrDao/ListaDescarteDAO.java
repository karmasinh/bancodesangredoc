package dwrDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.DBUtils;
public class ListaDescarteDAO {

public Collection mostrarLista() {

	      Collection lista = new Vector();
              String  sqla ="select distinct(fecha_prueba),cod_do,instancia from resultado_prueba  where resultado = 'on'  ;";
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
		
		
		ap.setFecha_prueba(rs.getString("fecha_prueba"));		
		ap.setCod_do(rs.getString("cod_do"));
		ap.setInstancia(rs.getString("instancia"));				
		return ap;
       }


public Collection verprueba(String cod_do,String instancia) {

	      Collection lista = new Vector();

              String  sqla ="select p.nombre_tp,rp.resultado,rp.cod_do from resultado_prueba rp,prueba p where(resultado='Positivo')and(p.id_prueba=rp.id_prueba)and(rp.cod_do='"+cod_do+"')and(rp.instancia='"+instancia+"')   ;";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarDes(rs);
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
	
	private NivelesRevicionLab getListarDes(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
		
		ap.setNombre_tp(rs.getString("nombre_tp"));		
		ap.setResultado(rs.getString("resultado"));
		ap.setCod_do(rs.getString("cod_do"));				
		return ap;
       }

//////////////// muestra la fila de pruebas 
public int contd(String instancia) {

	String  sql ="select count(*) as cont  from prueba where(tipo='"+instancia+"') ;";
		
	       int numberApartments = 0;
		Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
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

public Collection mostrarResultado_prueba(String cod_do,String instancia) {
	Collection lista = new Vector();
	String sql = "select r.resultado,r.id_prueba,p.tipo_componente,r.id_aten,r.cod_do  from resultado_prueba r,prueba p,atencion a where (r.cod_do='"+cod_do+"')and(p.tipo='pre-donacion')and(a.cod_do=r.cod_do)and(r.id_prueba=p.id_prueba)and(a.id_aten=(select max(t.id_aten) from resultado_prueba t where(t.cod_do='"+cod_do+"') and(t.instancia='"+instancia+"') ))and(a.id_aten=r.id_aten) ORDER BY id_prueba ";

	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sql);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getDa15(rs);
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
	
	private NivelesRevicionLab getDa15(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		//    r.resultado,r.id_prueba,p.tipo_componente
		ap.setResultado(rs.getString("resultado"));
		ap.setId_prueba(rs.getInt("id_prueba"));
		ap.setTipo_componente(rs.getString("tipo_componente"));
		ap.setId_aten(rs.getInt("id_aten"));
		ap.setCod_do(rs.getString("cod_do"));

		return ap;
       }


public Collection mostrarLista4(int id_prueba, String instancia) {

	Collection lista = new Vector();
	String  sqla ="select  v.valores,v.id_prueba,v.id_valor from prueba p,valores v where (tipo='"+instancia+"')and(p.id_prueba = v.id_prueba)and(p.id_prueba="+id_prueba+")and(v.positivo='N')  ;";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarP3(rs);
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
	
	private NivelesRevicionLab getListarP3(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
	
		ap.setValores(rs.getString("valores"));
		ap.setId_prueba(rs.getInt("id_prueba"));
		ap.setId_valor(rs.getInt("id_valor"));	
		return ap;
       }


//////////////////////// fin//////



}