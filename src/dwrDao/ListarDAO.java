package dwrDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.DBUtils;
public class ListarDAO {
/*	
public Collection mostrarResultados(String cod_do,String apepa,String apema) {

	Collection list = new Vector();
	String sql="";

    sql ="select  distinct(d.cod_do),p.apepa, p.apema, p.nom,a.id_aten,a.fecha_a  from persona p,donante d,atencion a where ( (d.cod_do='"+cod_do+"')or( (p.apepa='"+apepa+"')and(p.apema ='"+apema+"')) )and(p.id_per = d.id_per)and(d.cod_do=a.cod_do);";
	        Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListar(rs);
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
	
	private NivelesRevicionLab getListar(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		ap.setCod_do(rs.getString("cod_do"));
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		ap.setNom(rs.getString("nom"));
		ap.setId_aten(rs.getInt("id_aten"));		
		ap.setFecha_a(rs.getString("fecha_a"));		

		return ap;
      }
*/      

              
public String mostrarResultados(String cod_do,String apepa,String apema) {
		String sql = "select  max(fecha_a) as total  from donante d,atencion a,persona p where ((d.cod_do='"+cod_do+"')or((p.apepa='"+apepa+"')and(p.apema='"+apema+"')))and(d.cod_do=a.cod_do)and(p.id_per=d.id_per);";
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

/*
public Collection mostrarResultados(String cod_do,String apepa,String apema) {

	Collection list = new Vector();
	String sql="";

    sql ="select  max(fecha_a)  from donante d,atencion a,persona p where ((d.cod_do='"+cod_do+"')or((p.apepa='"+apepa+"')and(p.apema='"+apema+"')))and(d.cod_do=a.cod_do)and(p.id_per=d.id_per);";
	        Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarF(rs);
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
	
	private NivelesRevicionLab getListarF(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
		ap.setFecha_a(rs.getString("fecha_a"));		
		//ap.setCod_do(rs.getString("cod_do"));
		//ap.setId_aten(rs.getInt("id_aten"));		
		

		return ap;
      }
      
*/
public Collection mostrarResultadosPre(String cod_do,int id_aten) {
	Collection lista = new Vector();
	String sqla="";

    sqla ="select a.id_aten,a.cod_do,e.resultado,e.rechazo,e.numeral,e.obs,p.nom,p.apepa,p.apema,a.fecha_a,a.hora_a    from atencion a,evaluacion e,persona p,personal pp  where (a.id_aten=e.id_aten)and(p.id_per=pp.id_per)and(e.cod_per=pp.cod_per)and(a.id_aten='"+id_aten+"')and(a.cod_do='"+cod_do+"');";
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
		ap.setResultado(rs.getString("resultado"));
		ap.setRechazo(rs.getString("rechazo"));		
		ap.setNumeral(rs.getString("numeral"));		
		ap.setObs(rs.getString("obs"));
		ap.setNom(rs.getString("nom"));				
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		ap.setNom(rs.getString("nom"));
		ap.setFecha_a(rs.getString("fecha_a"));		
		ap.setHora_a(rs.getString("hora_a"));		

		return ap;
       }


public Collection mostrarResultadosPredo(String cod_do,int id_aten) {

	Collection list = new Vector();
	String sql="";
        sql ="select distinct(a.id_aten),a.cod_do,p.nom,p.apepa,p.apema,rp.fecha_prueba,instancia    from atencion a,resultado_prueba rp,persona p,personal pp    where (a.id_aten=rp.id_aten)and(p.id_per=pp.id_per)and(rp.cod_per=pp.cod_per)and(a.id_aten=rp.id_aten)  and(a.id_aten='"+id_aten+"')and(a.cod_do='"+cod_do+"')and(instancia='pre-donacion');";
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
		
		
		ap.setId_aten(rs.getInt("id_aten"));
		ap.setCod_do(rs.getString("cod_do"));
		ap.setNom(rs.getString("nom"));				
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		ap.setFecha_prueba(rs.getString("fecha_prueba"));
		ap.setInstancia(rs.getString("instancia"));		

		return ap;
      }

public Collection mostrarResultadosPredo1(String cod_do,int id_aten) {

	Collection list = new Vector();
	String sql="";
        sql ="select rp.resultado as resultado_pre ,r.nombre_tp   from atencion a, resultado_prueba rp, persona p, personal pp, prueba r     where (a.id_aten=rp.id_aten)and(p.id_per=pp.id_per)and(rp.cod_per=pp.cod_per)and(a.id_aten=rp.id_aten)  and(a.id_aten='"+id_aten+"')and(a.cod_do='"+cod_do+"')and(instancia='pre-donacion') and(r.id_prueba=rp.id_prueba);";

	        Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarPredo1(rs);
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

	private NivelesRevicionLab getListarPredo1(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
		ap.setResultado_pre(rs.getString("resultado_pre"));
		ap.setNombre_tp(rs.getString("nombre_tp"));				

		return ap;
      }


public Collection mostrarResultadosSere(String cod_do,int id_aten) {

	Collection list = new Vector();
	String sql="";
        sql ="select distinct(a.id_aten),a.cod_do,p.nom,p.apepa,p.apema,rp.fecha_prueba,instancia    from atencion a,resultado_prueba rp,persona p,personal pp    where (a.id_aten=rp.id_aten)and(p.id_per=pp.id_per)and(rp.cod_per=pp.cod_per)and(a.id_aten=rp.id_aten)    and(a.id_aten='"+id_aten+"')and(a.cod_do='"+cod_do+"')and(instancia='inmunoserelogia');";
   
	        Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarSere(rs);
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

	private NivelesRevicionLab getListarSere(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

		ap.setId_aten(rs.getInt("id_aten"));
		ap.setCod_do(rs.getString("cod_do"));
		ap.setNom(rs.getString("nom"));				
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		ap.setFecha_prueba(rs.getString("fecha_prueba"));
		ap.setInstancia(rs.getString("instancia"));		

		
		return ap;
      }


public Collection mostrarResultadosSere1(String cod_do,int id_aten) {

	Collection list = new Vector();
	String sql="";
        sql ="select rp.resultado as resultado_sere,r.nombre_tp    from atencion a, resultado_prueba rp, persona p, personal pp, prueba r    where (a.id_aten=rp.id_aten)and(p.id_per=pp.id_per)and(rp.cod_per=pp.cod_per)and(a.id_aten=rp.id_aten)   and(a.id_aten='"+id_aten+"')and(a.cod_do='"+cod_do+"')and(instancia='inmunoserelogia') and(r.id_prueba=rp.id_prueba)";

	        Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarSere1(rs);
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

	private NivelesRevicionLab getListarSere1(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
		ap.setResultado_sere(rs.getString("resultado_sere"));
		ap.setNombre_tp(rs.getString("nombre_tp"));				

		return ap;
      }

public Collection mostrarResultadosHema(String cod_do,int id_aten) {

	Collection list = new Vector();
	String sql="";
        sql ="select distinct(a.id_aten),a.cod_do,p.nom,p.apepa,p.apema,rp.fecha_prueba,instancia    from atencion a,resultado_prueba rp,persona p,personal pp    where (a.id_aten=rp.id_aten)and(p.id_per=pp.id_per)and(rp.cod_per=pp.cod_per)and(a.id_aten=rp.id_aten)    and(a.id_aten='"+id_aten+"')and(a.cod_do='"+cod_do+"')and(instancia='inmunohematologia');";
   
	        Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarHema(rs);
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

	private NivelesRevicionLab getListarHema(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

		ap.setId_aten(rs.getInt("id_aten"));
		ap.setCod_do(rs.getString("cod_do"));
		ap.setNom(rs.getString("nom"));				
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		ap.setFecha_prueba(rs.getString("fecha_prueba"));
		ap.setInstancia(rs.getString("instancia"));		

		
		return ap;
      }


public Collection mostrarResultadosHema1(String cod_do,int id_aten) {

	Collection list = new Vector();
	String sql="";
        sql ="select rp.resultado as resultado_hema,r.nombre_tp    from atencion a, resultado_prueba rp, persona p, personal pp, prueba r    where (a.id_aten=rp.id_aten)and(p.id_per=pp.id_per)and(rp.cod_per=pp.cod_per)and(a.id_aten=rp.id_aten)   and(a.id_aten='"+id_aten+"')and(a.cod_do='"+cod_do+"')and(instancia='inmunohematologia') and(r.id_prueba=rp.id_prueba)";

	        Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarHema1(rs);
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

	private NivelesRevicionLab getListarHema1(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
		ap.setResultado_hema(rs.getString("resultado_hema"));
		ap.setNombre_tp(rs.getString("nombre_tp"));				

		return ap;
      }


public Collection mostrarResultadosExtra(String cod_do,int id_aten) {

	Collection list = new Vector();
	String sql="";
        sql ="select a.id_aten,a.cod_do,p.nom,p.apepa,p.apema,e.fecha_extra,e.hora,e.bolsa,e.cant_extra   from atencion a,persona p,personal pp,extraccion e  where (a.id_aten=e.id_aten)and(p.id_per=pp.id_per)and(e.cod_per=pp.cod_per)   and(a.id_aten='"+id_aten+"')and(a.cod_do='"+cod_do+"')and(a.cod_do=e.cod_do);";

	        Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarExtra(rs);
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

	private NivelesRevicionLab getListarExtra(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();


		ap.setId_aten(rs.getInt("id_aten"));
		ap.setCod_do(rs.getString("cod_do"));
		ap.setNom(rs.getString("nom"));				
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		ap.setFecha_extra(rs.getString("fecha_extra"));
		ap.setHora(rs.getString("hora"));		
		ap.setBolsa(rs.getString("bolsa"));		
		ap.setCant_extra(rs.getString("cant_extra"));				
		
		return ap;
      }




}