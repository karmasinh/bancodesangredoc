package dwrDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.DBUtils;
public class BusquedaDAO {

	   
/////////////////////////////////////////////////
public Collection resultado(int ci) {

	Collection lista = new Vector();
	
	String  sqlaa ="select a.id_aten,a.fecha_a,p.edad,rp.resultado from persona p,donante d,atencion a,prueba pu,resultado_prueba rp where  (p.ci ='"+ci+"')and (d.id_per=p.id_per)and(a.cod_do=d.cod_do)and                         (pu.nombre_tp='Predonacion')and(pu.id_prueba=rp.id_prueba)             and(a.cod_do=rp.cod_do) and                                            (a.id_aten=(select max(id_aten)  from atencion aa  where aa.cod_do=a.cod_do)); ";
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
		
		ap.setId_aten(rs.getInt("id_aten"));
		ap.setFecha_a(rs.getString("fecha_a"));
		ap.setEdad(rs.getInt("edad"));
		ap.setResultado(rs.getString("resultado"));

		

		return ap;
       }








public Collection resultado_2(String cod_do) {

	Collection lista = new Vector();
	
	String sqlp="select a.id_aten,a.fecha_a,p.edad,rp.resultado from persona p,donante d,atencion a,prueba pu,resultado_prueba rp where (a.cod_do='"+cod_do+"')and (d.id_per=p.id_per)and(a.cod_do=d.cod_do)and                         (pu.nombre_tp='Predonacion')and(pu.id_prueba=rp.id_prueba)             and(a.cod_do=rp.cod_do) and                                            (a.id_aten=(select max(id_aten)  from atencion aa  where aa.cod_do=a.cod_do)); ";
	///"select d.cod_do,p.id_per,p.apepa,p.apema,p.nom,d.gs_rh,a.id_aten,a.fecha_a,p.edad  from persona p,donante d,atencion a where ((d.id_per=p.id_per)and(a.cod_do=d.cod_do)) and(a.id_aten=(select max(id_aten) from atencion a,persona p, donante d where (a.cod_do='"+cod_do+"') and(p.id_per = d.id_per) and(a.cod_do=d.cod_do))) ;";
	
//	"select a.id_aten,a.fecha_a,pe.edad,rp.resultado  from prueba p,resultado_prueba rp,persona pe,atencion a,donante d    where(nombre_tp='Predonacion')and(p.id_prueba=rp.id_prueba)and (rp.cod_do=a.cod_do)and(a.cod_do=d.cod_do)and(d.id_per=pe.id_per)and(a.cod_do='"+cod_do+"') ;";
	
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqlp);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getK45(rs);
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
	
	private NivelesRevicionLab getK45(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
	 
		ap.setId_aten(rs.getInt("id_aten"));
		ap.setFecha_a(rs.getString("fecha_a"));
		ap.setEdad(rs.getInt("edad"));
		ap.setResultado(rs.getString("resultado"));

		return ap;
       }

public Collection resultado_3(int ci) {

	Collection lista = new Vector();
	
//	String  sqlaa ="select a.id_aten,a.fecha_a,pe.edad,rp.resultado  from prueba p,resultado_prueba rp,persona pe,atencion a,donante d    where(nombre_tp='Predonacion')and(p.id_prueba=rp.id_prueba)and (rp.cod_do=a.cod_do)and(a.cod_do=d.cod_do)and(d.id_per=pe.id_per)and(pe.ci ='"+ci+"') ;";
	String sqlaa="select rp.id_aten,rp.fecha_a,pe.edad,rp.resultado from  prueba p,resultado_prueba rp,persona pe,donante d  where(nombre_tp='Inmunoserelogia')and(p.id_prueba=rp.id_prueba)and (rp.cod_do=d.cod_do)and(d.id_per=pe.id_per)and(pe.ci='"+ci+"');";
		Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqlaa);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getLis(rs);
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
	
	private NivelesRevicionLab getLis(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

		ap.setId_aten(rs.getInt("id_aten"));
		ap.setFecha_a(rs.getString("fecha_a"));
		ap.setEdad(rs.getInt("edad"));
		ap.setResultado(rs.getString("resultado"));

		

		return ap;
       }








public Collection resultado_4(String cod_do) {

	Collection lista = new Vector();
	
	String sqlp="select rp.id_aten,rp.fecha_a,pe.edad,rp.resultado from  prueba p,resultado_prueba rp,persona pe,donante d  where(nombre_tp='Inmunoserelogia')and(p.id_prueba=rp.id_prueba)and (rp.cod_do=d.cod_do)and(d.id_per=pe.id_per)and(rp.cod_do='"+cod_do+"');";
	
///	select a.id_aten,a.fecha_a,pe.edad,rp.resultado  from prueba p,resultado_prueba rp,persona pe,atencion a,donante d    where(nombre_tp='Predonacion')and(p.id_prueba=rp.id_prueba)and (rp.cod_do=a.cod_do)and(a.cod_do=d.cod_do)and(d.id_per=pe.id_per)and(a.cod_do='"+cod_do+"') 
	
	///"select d.cod_do,p.id_per,p.apepa,p.apema,p.nom,d.gs_rh,a.id_aten,a.fecha_a,p.edad  from persona p,donante d,atencion a where ((d.id_per=p.id_per)and(a.cod_do=d.cod_do)) and(a.id_aten=(select max(id_aten) from atencion a,persona p, donante d where (a.cod_do='"+cod_do+"') and(p.id_per = d.id_per) and(a.cod_do=d.cod_do))) ;";
	
//
	
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqlp);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getKm88(rs);
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
	
	private NivelesRevicionLab getKm88(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
		ap.setId_aten(rs.getInt("id_aten"));
		ap.setFecha_a(rs.getString("fecha_a"));
		ap.setEdad(rs.getInt("edad"));
		ap.setResultado(rs.getString("resultado"));

		return ap;
       }

////////////////////////////////////////////////////////////////










       public int Proceso(String sql){
                int n=0;
		Collection list = new Vector();
		Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {//CARGANDO LOS DATOS
                              n = rs.getInt(1);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {	stmt.close();c.close();}
		        catch (SQLException e) {e.printStackTrace();}
		}
		return n;
       }

       public int contCodigo(String cod_do) {
	      return Proceso("select count(*) from donante where (cod_do='"+cod_do+"');");
       }
       public int contCi(int ci) {
	      return Proceso("select count(*) from persona where (ci="+ci+");");
       }
       public int contAp(String apepa) {
	      return Proceso("select count(*) from persona p, donante d where (p.id_per=d.id_per) and (p.apepa ='"+apepa+"') ;");
       }
       public int Cantidad(String apepa) {
	      return Proceso("select count(*) from persona p, donante d where (p.id_per=d.id_per) and (p.apepa ='"+apepa+"') ;");
       }
//***********************************************************************************************
       public Collection Listado(String sql) {
		Collection list = new Vector();
		Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {//CARGANDO LOS DATOS
				NivelesRevicionLab apartment = this.getLista(rs);
				list.add(apartment);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {	stmt.close();c.close();}
		        catch (SQLException e) {e.printStackTrace();}
		}
		return list;
       }
       private NivelesRevicionLab getLista(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		ap.setCod_do(rs.getString("cod_do"));
//		ap.setId_per(rs.getInt("id_per"));
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		ap.setNom(rs.getString("nom"));
		ap.setGs_rh(rs.getString("gs_rh"));		
		return ap;
       }
////////////////////**************************************************
       public Collection mostrarBusqueda_DonantesCodigo(String cod_do) {
                String sql="";
		sql+="select d.cod_do,p.apepa,p.apema,p.nom,d.gs_rh,p.edad ";
		sql+="from donante d,persona p ";
		sql+="where(p.id_per=d.id_per)and(d.cod_do='"+cod_do+"') ;";
		return Listado(sql);
       }
       public Collection mostrarBusqueda_DonantesCi(int ci) {
                String sql="";
		sql+="select d.cod_do,p.apepa,p.apema,p.nom,d.gs_rh ";
		sql+="from donante d,persona p ";
		sql+="where(p.id_per=d.id_per)and(p.ci='"+ci+"') ;";
		return Listado(sql);

       }
/////////*************************************************************
       public Collection mostrarBusquedaEvaluacionCi1(int ci) {
                String sql="";
		sql+="select e.id_aten,d.cod_do,p.apepa,p.apema,p.nom ";
		sql+="from donante d,persona p,atencion a,evaluacion e ";
		sql+="where(p.id_per=d.id_per)and(e.id_aten=a.id_aten)and(a.cod_do=d.cod_do)and(p.ci='"+ci+"')and(a.atendido='A')and(a.atendidop='T') ;";
		return Listado(sql);
       }

       public Collection ListadoRes(String sql) {
		Collection list = new Vector();
		Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {//CARGANDO LOS DATOS
				NivelesRevicionLab apartment = this.getListaRes(rs);
				list.add(apartment);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {	stmt.close();c.close();}
		        catch (SQLException e) {e.printStackTrace();}
		}
		return list;
       }
       private NivelesRevicionLab getListaRes(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		ap.setId_aten(rs.getInt("id_aten"));
		ap.setFecha_a(rs.getString("fecha_a"));
		ap.setEdad(rs.getInt("edad"));
		ap.setResultado(rs.getString("resultado"));
		return ap;
       }
       public Collection mostrarBusqueda_ResultadosCodigo(String cod_do) {
	        String sql="";
	        sql+="select a.id_aten,a.fecha_a,p.edad,rp.resultado ";
		sql+="from atencion a,persona p,donante d,prueba pp,resultado_prueba rp ";
		sql+="where (p.id_per=d.id_per) and (d.cod_do=a.cod_do) and (a.id_aten=rp.id_aten)";
		sql+="and (rp.id_prueba=pp.id_prueba) and (rp.instancia='inmunoserelogia') ";
		sql+="and (d.cod_do='"+cod_do+"') ;";
		return ListadoRes(sql);
	}
       public Collection mostrarBusqueda_ResultadosCi(int ci) {
	        String sql="";
		sql+="select a.id_aten,a.fecha_a,p.edad,rp.resultado ";
		sql+="from atencion a,persona p,donante d,prueba pp,resultado_prueba rp ";
		sql+="where (p.id_per=d.id_per) and (d.cod_do=a.cod_do) and (a.id_aten=rp.id_aten)";
		sql+="and(rp.id_prueba=pp.id_prueba)and(rp.instancia='inmunoserelogia') ";
		sql+="and (p.ci='"+ci+"') ;";
		return ListadoRes(sql);
	}
       public Collection ListadoApellido(String sql) {
		Collection list = new Vector();
		Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {//CARGANDO LOS DATOS
				NivelesRevicionLab apartment = this.getListaApe(rs);
				list.add(apartment);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {	stmt.close();c.close();}
		        catch (SQLException e) {e.printStackTrace();}
		}
		return list;
       }
       private NivelesRevicionLab getListaApe(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		ap.setId_aten(rs.getInt("id_aten"));
		ap.setCod_do(rs.getString("cod_do"));
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		ap.setNom(rs.getString("nom"));
		return ap;
       }
       public Collection mostrarBusqueda_apellidos(String apepa,String atendido,String atendidop,String atendidoe,String atendidoh,String atendidos) {
	        String sql="";
//		sql="select  d.cod_do, p.apepa, p.apema, p.nom from persona p,donante d,atencion a where(p.id_per=d.id_per)and(d.cod_do=a.cod_do)and(a.atendido='"+atendido+"')and(a.atendidop='"+atendidop+"')and(a.atendidoe='"+atendidoe+"')and(a.atendidoh='"+atendidoh+"')and(a.atendidos='"+atendidos+"')and(p.apepa like '"+apepa+"%') and(a.id_aten in (select max(aa.id_aten) from atencion aa group by aa.cod_do)) ;";
		sql="select a.id_aten,d.cod_do, p.apepa, p.apema, p.nom from persona p,donante d,atencion a where(p.id_per=d.id_per)and(d.cod_do=a.cod_do)and(p.apepa like '"+apepa+"%')and(a.atendido='"+atendido+"')and(a.atendidop='"+atendidop+"')and(a.atendidoe='"+atendidoe+"')and(a.atendidoh='"+atendidoh+"')and(a.atendidos='"+atendidos+"')and(a.id_aten in (select max(aa.id_aten) from atencion aa group by aa.cod_do))  ;";
		return ListadoApellido(sql);
	}
	
//*******************************************************************************************	
       public Collection ListadoDona_1(String sql) {
		Collection list = new Vector();
		Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {//CARGANDO LOS DATOS
				NivelesRevicionLab apartment = this.getDona_1(rs);
				list.add(apartment);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {	stmt.close();c.close();}
		        catch (SQLException e) {e.printStackTrace();}
		}
		return list;
       }
       public Collection ListadoDona_2(String sql) {
		Collection list = new Vector();
		Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {//CARGANDO LOS DATOS
				NivelesRevicionLab apartment = this.getDona_2(rs);
				list.add(apartment);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {	stmt.close();c.close();}
		        catch (SQLException e) {e.printStackTrace();}
		}
		return list;
       }
       public Collection ListadoDona_3(String sql) {
		Collection list = new Vector();
		Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {//CARGANDO LOS DATOS
				NivelesRevicionLab apartment = this.getDona_3(rs);
				list.add(apartment);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {	stmt.close();c.close();}
		        catch (SQLException e) {e.printStackTrace();}
		}
		return list;
       }
       private NivelesRevicionLab getDona_1(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		ap.setCod_do(rs.getString("cod_do"));
		ap.setId_per(rs.getInt("id_per"));
		ap.setNom(rs.getString("nom"));
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		ap.setCi(rs.getInt("ci"));
		ap.setProf(rs.getString("prof"));
		ap.setGs_rh(rs.getString("gs_rh"));
		ap.setOcu(rs.getString("ocu"));
		return ap;
       }
	private NivelesRevicionLab getDona_2(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		ap.setLugar_tra(rs.getString("lugar_tra"));
		ap.setEmail(rs.getString("email"));
		ap.setFono_pro(rs.getInt("fono_pro"));
		ap.setCel(rs.getInt("cel"));
		ap.setFono_vec(rs.getInt("fono_vec"));
		ap.setFono_tra(rs.getInt("fono_tra"));
		return ap;
       }
       private NivelesRevicionLab getDona_3(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		ap.setCalle_residencia(rs.getString("calle_residencia"));
		ap.setNum(rs.getString("num"));
		ap.setZona(rs.getString("zona"));
		ap.setTipo_dom(rs.getString("tipo_dom"));
		return ap;
       }
       public Collection agregar_donante_1(String cod_do) {
	        String sql="";
	        sql+="select distinct(d.cod_do),p.id_per,p.nom,p.apepa,p.apema,p.ci,p.prof,d.gs_rh,p.ocu ";
		sql+="from persona p, donante d	";
		sql+="where (p.id_per=d.id_per) and (d.cod_do='"+cod_do+"') ;";
		return ListadoDona_1(sql);
	}
        public Collection agregar_donante_2(String cod_do) {
	        String sql="";
	        sql+="select p.lugar_tra,p.email,f.fono_pro,f.cel,f.fono_vec,f.fono_tra ";
		sql+="from persona p, donante d,fonos f ";
		sql+="where (p.id_per=d.id_per)and(p.id_per=f.id_per)and(d.cod_do='"+cod_do+"') ;";
		return ListadoDona_2(sql);
	}
       public Collection agregar_donante_3(String cod_do) {
	        String sql="";
	        sql+="select  dd.calle_residencia, dd.num, dd.zona, dd.tipo_dom ";
		sql+="from persona p, donante d,domicilio dd ";
		sql+="where (p.id_per=d.id_per) and (p.id_per=dd.id_per) and (d.cod_do='"+cod_do+"') ";
	        sql+="and (tipo_dom='trabajo') ;";
		return ListadoDona_3(sql);
	}
       public Collection agregar_donante_4(String cod_do) {
	        String sql="";
	        sql+="select  dd.calle_residencia, dd.num, dd.zona, dd.tipo_dom ";
		sql+="from persona p, donante d,domicilio dd ";
		sql+="where (p.id_per=d.id_per) and (p.id_per=dd.id_per) and (d.cod_do='"+cod_do+"') ";
		sql+="and (tipo_dom='propio') ;";
		return ListadoDona_3(sql);
       }
	
//*******************************************************************************************
public void modificar_Datos_Donante(String tipo_dom,String tipo_domt,int id_per,String prof,String ocu,String lugar_tra,String email,int fono_pro,int cel,int fono_vec,int fono_tra,String calle_residencia,int num,String zona,String calle_residenciat,int numt,String zonat)  
{
               String sqlpw="";
	       
	       sqlpw = "update persona set prof = '"+prof+"', ocu='"+ocu+"', lugar_tra='"+lugar_tra+"',email='"+email+"'  where id_per = "+id_per+" ;";

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


	   String sqlpp="";
           sqlpp = "update fonos set fono_pro = '"+fono_pro+"', cel='"+cel+"', fono_vec='"+fono_vec+"' ,fono_tra='"+fono_tra+"'  where id_per = "+id_per+" ;";


	        Connection c1 = null;
		Statement stmt1 = null;
		try {
			c1 = DBUtils.openConnection();
			stmt1 = c1.createStatement();
			// just run the sql statement
			ResultSet rs = stmt1.executeQuery(sqlpp);
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


	   String sqlp1="";
	  

             sqlp1 = "update domicilio set calle_residencia = '"+calle_residencia+"', num='"+num+"', zona ='"+zona+"'  where (id_per = "+id_per+")and (tipo_dom='"+tipo_dom+"') ;";	 
	        Connection c12 = null;
		Statement stmt12 = null;
		try {
			c12 = DBUtils.openConnection();
			stmt12 = c12.createStatement();
			// just run the sql statement
			ResultSet rs = stmt12.executeQuery(sqlp1);
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




               String sqlp2="";
               sqlp2 = "update domicilio set calle_residencia = '"+calle_residenciat+"', num='"+numt+"', zona ='"+zonat+"'  where (id_per = "+id_per+")and(tipo_dom='"+tipo_domt+"') ;";	  
	        Connection c123 = null;
		Statement stmt123 = null;
		try {
			c123 = DBUtils.openConnection();
			stmt123 = c123.createStatement();
			// just run the sql statement
			ResultSet rs = stmt123.executeQuery(sqlp2);
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





public Collection mostrarBusqueda(String cod_do,String apepa,int ci) {

	Collection list = new Vector();
	String sql="select d.cod_do,p.id_per,p.apepa,p.apema,p.nom,d.gs_rh,a.id_aten,a.fecha_a,p.edad  from persona p,donante d,atencion a where ((d.id_per=p.id_per)and(a.cod_do=d.cod_do)) and(a.id_aten=(select max(id_aten) from atencion a,persona p, donante d where ((a.cod_do='"+cod_do+"')or (p.apepa='"+apepa+"')or (p.ci='"+ci+"'))  and(p.id_per = d.id_per) and(a.cod_do=d.cod_do))) ;";
	   
	        Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getBusqueda(rs);
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
	
	private NivelesRevicionLab getBusqueda(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		ap.setCod_do(rs.getString("cod_do"));
		ap.setId_per(rs.getInt("id_per"));		
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		ap.setNom(rs.getString("nom"));
		ap.setGs_rh(rs.getString("gs_rh"));		
		ap.setId_aten(rs.getInt("id_aten"));		
		ap.setFecha_a(rs.getString("fecha_a"));		
		ap.setEdad(rs.getInt("edad"));		
		return ap;
		//cod_do),p.id_per,p.apepa, p.apema, p.nom,d.gs_rh,a.id_aten,a.fecha_a
      }


public Collection mostrarResultados(String cod_do,int id_aten) {
	Collection list = new Vector();
	String sql="select a.id_aten,d.cod_do from atencion a,donante d where(d.cod_do=a.cod_do)and(a.cod_do='"+cod_do+"')and(a.id_aten='"+id_aten+"') ;";

	        Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getBusquedaResultado(rs);
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
	
	private NivelesRevicionLab getBusquedaResultado(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

		ap.setId_aten(rs.getInt("id_aten"));
		ap.setCod_do(rs.getString("cod_do"));				
		return ap;


       }


public Collection mostrarResultados_prueba0(String cod_do,String apepa,String apema) {

	Collection lista = new Vector();
	String sqlp="select rp.resultado,d.cod_do,p.id_per,p.apepa, p.apema, p.nom,d.gs_rh,a.id_aten,a.fecha_a  from resultado_prueba rp,prueba pu,persona p,donante d,atencion a  where ((d.cod_do='"+cod_do+"')or( (p.apepa='"+apepa+"')and(p.apema='"+apema+"') ))and(p.id_per = d.id_per) and(a.cod_do=d.cod_do)and(rp.instancia='pre-donacion')and(pu.nombre_tp='resultado')and(rp.id_prueba=pu.id_prueba);";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqlp);
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
		
		ap.setResultado(rs.getString("resultado"));		
		ap.setCod_do(rs.getString("cod_do"));
		ap.setId_per(rs.getInt("id_per"));		
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		ap.setNom(rs.getString("nom"));
		ap.setGs_rh(rs.getString("gs_rh"));		
		ap.setId_aten(rs.getInt("id_aten"));		
		ap.setFecha_a(rs.getString("fecha_a"));		


		return ap;
       }


public Collection mostrarResultadosPre(String cod_do,int id_aten) {

	Collection lista = new Vector();
	String  sqla ="select a.id_aten,a.cod_do,e.resultado,e.rechazo,e.numeral,e.obs,a.fecha_a,a.hora_a    from atencion a,evaluacion e  where (a.id_aten=e.id_eva)and(a.id_aten='"+id_aten+"')and(a.cod_do='"+cod_do+"');";
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
		ap.setFecha_a(rs.getString("fecha_a"));		
		ap.setHora_a(rs.getString("hora_a"));		

		return ap;
       }



public Collection mostrarResultadosPredo(String cod_do,int id_aten) {

	Collection list = new Vector();
	String sql="";
	sql ="select rp.fecha_a,p.nombre_tp,rp.resultado from prueba p,atencion a,resultado_prueba rp where (a.id_aten=rp.id_aten)and(a.id_aten='"+id_aten+"')and(a.cod_do='"+cod_do+"')and(rp.instancia='pre-donacion')and(p.id_prueba=rp.id_prueba) ;";
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

		ap.setFecha_a(rs.getString("fecha_a"));
		ap.setNombre_tp(rs.getString("nombre_tp"));				
		ap.setResultado(rs.getString("resultado"));

		return ap;
      }


public Collection mostrarResultadosSere(String cod_do,int id_aten) {

	Collection list = new Vector();
	String sql="";
	sql ="select rp.fecha_a,p.nombre_tp,rp.resultado from prueba p,atencion a,resultado_prueba rp where (a.id_aten=rp.id_aten)and(a.id_aten='"+id_aten+"')and(a.cod_do='"+cod_do+"')and(rp.instancia='inmunoserelogia')and(p.id_prueba=rp.id_prueba) ;";
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

		ap.setFecha_a(rs.getString("fecha_a"));
		ap.setNombre_tp(rs.getString("nombre_tp"));				
		ap.setResultado(rs.getString("resultado"));

		return ap;
      }

public Collection mostrarResultadosHema(String cod_do,int id_aten) {

	Collection list = new Vector();
	String sql="";
	sql ="select rp.fecha_a,p.nombre_tp,rp.resultado from prueba p,atencion a,resultado_prueba rp where (a.id_aten=rp.id_aten)and(a.id_aten='"+id_aten+"')and(a.cod_do='"+cod_do+"')and(rp.instancia='inmunohematologia')and(p.id_prueba=rp.id_prueba) ;";
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

		ap.setFecha_a(rs.getString("fecha_a"));
		ap.setNombre_tp(rs.getString("nombre_tp"));				
		ap.setResultado(rs.getString("resultado"));

		return ap;
      }





//public void modificar_Datos_Donante(String tipo_domt,String tipo_dom,int id_per,String prf,String ocu,String lugar_tra,String email,int fono_pro,int cel,int fono_vec,int fono_tra,String calle_residencia,int num,String zona,String calle_residenciat,int numt,String zonat)  

public Collection agregar_donante1(int ci) {

	Collection lista = new Vector();
	String sqlp="select distinct(d.cod_do),p.id_per,p.nom,p.apepa,p.apema,p.ci,p.prof,d.gs_rh,p.ocu  from persona p, donante d	where (p.id_per=d.id_per) and (p.ci ='"+ci+"') ;";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqlp);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getKLw(rs);
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
	
	private NivelesRevicionLab getKLw(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

		ap.setCod_do(rs.getString("cod_do"));
		ap.setId_per(rs.getInt("id_per"));
		ap.setNom(rs.getString("nom"));
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		ap.setCi(rs.getInt("ci"));
		ap.setProf(rs.getString("prof"));
		ap.setGs_rh(rs.getString("gs_rh"));
		ap.setOcu(rs.getString("ocu"));

		return ap;
       }

public Collection agregar_donante_11(int ci) {

	Collection lista = new Vector();
//String sqlp="select distinct(d.cod_do),p.nom,p.apepa,p.apema,p.ci,p.prof,p.ocu,p.lugar_tra,p.email,d.gs_rh,f.fono_pro,f.cel,f.fono_vec,f.fono_tra,dd.calle_residencia,dd.num,dd.zona,dd.tipo_dom 	from persona p, donante d,fonos f,domicilio dd	where (p.id_per=d.id_per)and(p.id_per=f.id_per)and(p.id_per=dd.id_per)and(d.cod_do='"+cod_do+"') ;";
	String sqlp="select p.lugar_tra,p.email,f.fono_pro,f.cel,f.fono_vec,f.fono_tra from persona p, donante d,fonos f   where (p.id_per=d.id_per)and(p.id_per=f.id_per)and(p.ci ='"+ci+"') ;";
	
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqlp);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getKm(rs);
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
	
	private NivelesRevicionLab getKm(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();


		ap.setLugar_tra(rs.getString("lugar_tra"));
		ap.setEmail(rs.getString("email"));
		ap.setFono_pro(rs.getInt("fono_pro"));
		ap.setCel(rs.getInt("cel"));
		ap.setFono_vec(rs.getInt("fono_vec"));
		ap.setFono_tra(rs.getInt("fono_tra"));


		return ap;
       }


public Collection agregar_donante_22(int ci) {

	Collection lista = new Vector();
	
	String sqlp="select  dd.calle_residencia,dd.num,dd.zona,dd.tipo_dom   from persona p, donante d,domicilio dd   where (p.id_per=d.id_per)and(p.id_per=dd.id_per)and(p.ci ='"+ci+"') ;";
	
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqlp);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getK(rs);
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
	
	private NivelesRevicionLab getK(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

		ap.setCalle_residencia(rs.getString("calle_residencia"));
		ap.setNum(rs.getString("num"));
		ap.setZona(rs.getString("zona"));
		ap.setTipo_dom(rs.getString("tipo_dom"));

		return ap;
       }

////////////******************inicio conteo de fecha**************************
	public int countRegistro_datos() {
		String sql = "select count(*) as total from atencion";
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

////////////******************fin conteo de fecha**************************


////////////******************inicio examen fisico**************************
public void adicionarEF(String fecha_a,String hora_a,int id_aten,String tipo_do,String veces,String cod_do,int sistolica,int diastolica,int pulso,int peso,float talla,float temperatura,String atendido,String atendidop,String atendidoh,String atendidos,String atendidoe)  
{

               String sqlpw="";
	  
	       sqlpw = "insert into  atencion(fecha_a,hora_a,id_aten,tipo_do,veces,cod_do,sistolica,diastolica,pulso,peso,talla,temperatura,atendido,atendidop,atendidoh,atendidos,atendidoe) values('"+fecha_a+"','"+hora_a+"',"+id_aten+", '"+tipo_do+"', '"+veces+"', '"+cod_do+"' ,'"+sistolica+"','"+diastolica+"','"+pulso+"','"+peso+"',"+talla+","+temperatura+",'"+atendido+"','"+atendidop+"','"+atendidoh+"','"+atendidos+"','"+atendidoe+"');";
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

///////////////***********BUSQUEDA POR CODIGO Y EVALUACION
       
public Collection mostrarBusquedaEvaluacionCod(String cod_do) {

	Collection lista = new Vector();

	String sql="";
		sql+="select e.id_aten,d.cod_do,p.apepa,p.apema,p.nom,p.edad ";
		sql+="from donante d,persona p,atencion a,evaluacion e ";
		sql+="where(p.id_per=d.id_per)and(a.cod_do=d.cod_do)and(e.id_aten=a.id_aten)and(d.cod_do='"+cod_do+"')and(a.atendido='A')and(a.atendidop='T') ;";

		Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sql);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListar88(rs);
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
	
	private NivelesRevicionLab getListar88(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
		ap.setId_aten(rs.getInt("id_aten"));
		ap.setCod_do(rs.getString("cod_do"));
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		ap.setNom(rs.getString("nom"));
		ap.setEdad(rs.getInt("edad"));

		

		return ap;
       }



public Collection mostrarBusquedaEvaluacionCi(int ci) {
	Collection lista = new Vector();

                String sql="";
		sql+="select e.id_aten,d.cod_do,p.apepa,p.apema,p.nom,p.edad ";
		sql+="from donante d,persona p,atencion a,evaluacion e ";
		sql+="where(p.id_per=d.id_per)and(e.id_aten=a.id_aten)and(a.cod_do=d.cod_do)and(p.ci='"+ci+"')and(a.atendido='A')and(a.atendidop='T') ;";

		Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sql);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListar99(rs);
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
	
	private NivelesRevicionLab getListar99(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();

		ap.setId_aten(rs.getInt("id_aten"));
		ap.setCod_do(rs.getString("cod_do"));
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		ap.setNom(rs.getString("nom"));
		ap.setEdad(rs.getInt("edad"));
		

		return ap;
       }



public Collection mostrarEvaluacion(int id_aten) {
	Collection lista = new Vector();

                String sql="";
		sql+="select obs,ayunas,numeral,ingestion,rechazo,resultado";
		sql+="from evaluacion where (id_aten='"+id_aten+"') ;";

		Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sql);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarE7(rs);
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
	
	private NivelesRevicionLab getListarE7(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		

		ap.setObs(rs.getString("obs"));
		ap.setAyunas(rs.getString("ayunas"));
		ap.setNumeral(rs.getString("numeral"));
		ap.setIngestion(rs.getString("ingestion"));
		ap.setRechazo(rs.getString("rechazo"));
		ap.setResultado(rs.getString("resultado"));
		
		return ap;
       }


public int cuentaPr(String cod_do) {
	    String sql="select count(id_aten) as cuentaPr  from atencion where((atendidop='A')and (id_aten=(select max(a.id_aten) from atencion a  where a.cod_do='"+cod_do+"')));";

//		String sql="select count(id_aten)as cuentaPr  from atencion where((atendidop='A')and(id_aten=(select max(id_aten) from atencion a,persona p,donante d  where(a.cod_do='"+cod_do+"')and(p.id_per=d.id_per)and(a.cod_do=d.cod_do))));";						
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
				numberApartments = rs.getInt("cuentaPr");
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

public int cuentaIH(String cod_do) {
//		String sql="select count(id_aten)as cuentaIH  from atencion where((atendidoh='A')and(id_aten=(select max(id_aten) from atencion a,persona p,donante d  where(a.cod_do='"+cod_do+"')and(p.id_per=d.id_per)and(a.cod_do=d.cod_do))));";				

	    String sql="select count(id_aten) as cuentaIH  from atencion where((atendidoh='A')and (id_aten=(select max(a.id_aten) from atencion a  where a.cod_do='"+cod_do+"')));";
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
				numberApartments = rs.getInt("cuentaIH");
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

public int cuentaIS(String cod_do) {
//		String sql="select count(id_aten)as cuentaIS  from atencion where((atendidos='A')and(id_aten=(select max(id_aten) from atencion a  where(a.cod_do='"+cod_do+"'))));";		

    String sql="select count(id_aten) as cuentaIS  from atencion where((atendidos='A')and (id_aten=(select max(a.id_aten) from atencion a where a.cod_do='"+cod_do+"'   )));";

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
				numberApartments = rs.getInt("cuentaIS");
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


public int cuentaTami(String cod_do) {
        String sql="select count(id_aten) as cuentaTami from atencion where((atendido='A')and (id_aten=(select max(a.id_aten) from atencion a  where a.cod_do='"+cod_do+"')));";		
//	String sql="select count(id_aten)as cuentaTami from atencion where((atendido='A')and(id_aten=(select max(id_aten) from atencion a,persona p,donante d  where(a.cod_do='"+cod_do+"')and(p.id_per=d.id_per)and(a.cod_do=d.cod_do))));";
//	String sql="select count(id_aten)as cuentaTami from atencion;";

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
				numberApartments = rs.getInt("cuentaTami");
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
