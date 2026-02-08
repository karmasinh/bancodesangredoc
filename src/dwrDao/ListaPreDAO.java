package dwrDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.DBUtils;
public class ListaPreDAO {

//****************************************************************
public Collection mostrarLista() {

	Collection lista = new Vector();
	String  sqla ="select a.id_aten, d.cod_do, p.nom, p.apepa, p.apema, e.resultado ";
	        sqla+="from persona p,donante d,atencion a,evaluacion e ";
		sqla+="where (p.id_per=d.id_per)and(a.cod_do=d.cod_do)and(a.atendido='A') ";
		sqla+="and(a.atendidop='T') and(a.id_aten=e.id_eva)and(e.resultado='Donante Apto');";
//        String  sqla ="select id_aten  from atencion ;";	
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
		ap.setNom(rs.getString("nom"));				
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
                ap.setResultado(rs.getString("resultado"));
		return ap;
       }


public Collection mostrarLista1(int id_aten) {

	Collection lista = new Vector();

//	String  sqla ="select id_aten,fecha_a,sistolica,distolica,hora_a  from  atencion  where  id_aten = "+id_aten+"   ;";
        String  sqla ="select id_aten,fecha_a,sistolica,diastolica,hora_a  from  atencion  where  id_aten = "+id_aten+"   ;";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
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
		
		ap.setId_aten(rs.getInt("id_aten"));		
		ap.setFecha_a(rs.getString("fecha_a"));		
		ap.setSistolica(rs.getInt("sistolica"));
		ap.setDiastolica(rs.getInt("diastolica"));				
		ap.setHora_a(rs.getString("hora_a"));   
		return ap;
       }

public Collection mostrarLista2(int id_aten) {

	Collection lista = new Vector();
	String  sqla ="select pulso,peso,temperatura,talla  from atencion where(id_aten="+id_aten+")  ;";

	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarP1(rs);
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
	
	private NivelesRevicionLab getListarP1(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
		
		ap.setPulso(rs.getInt("pulso"));
		ap.setPeso(rs.getInt("peso"));
                ap.setTemperatura(rs.getInt("temperatura"));
		ap.setTalla(rs.getInt("talla"));
		return ap;
       }



public Collection mostrarLista3() {

	Collection lista = new Vector();
	String  sqla ="select p.id_prueba,p.nombre_tp,p.tipo_componente  from prueba p  where (p.tipo='pre-donacion')and(p.positivo='N')  ;";

	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarP2(rs);
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
	
	private NivelesRevicionLab getListarP2(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
		
		ap.setId_prueba(rs.getInt("id_prueba"));
		ap.setNombre_tp(rs.getString("nombre_tp"));
		ap.setTipo_componente(rs.getString("tipo_componente"));
		return ap;
       }



public Collection mostrarLista4(int id_prueba) {

	Collection lista = new Vector();
	String  sqla ="select  v.valores,v.id_prueba,v.id_valor from prueba p,valores v where (tipo='pre-donacion')and(p.id_prueba = v.id_prueba)and(p.id_prueba="+id_prueba+")and(v.positivo='N')  ;";
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

public int cont() {

	String  sql ="select count(*) as cont  from prueba where(tipo='pre-donacion');";
		
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
       

public int cont2(String cod_do,int id_aten) {

	String  sql ="select count(*) as cont2  from resultado_prueba where(cod_do='"+cod_do+"')and(id_aten="+id_aten+")and(resultado='on') ;";
		
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

              
public String mostrarNombre(int id_prueba) {

		String sql = "select nombre_tp as total from prueba where (id_prueba="+id_prueba+") ";
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


public Collection mostrarResultado_prueba(String cod_do) {
	Collection lista = new Vector();
	String sql = "select r.fecha_a,r.resultado,r.id_prueba,p.tipo_componente,r.id_aten,r.cod_do  from resultado_prueba r,prueba p,atencion a where (r.cod_do='"+cod_do+"')and(p.tipo='pre-donacion')and(a.cod_do=r.cod_do)and(r.id_prueba=p.id_prueba)and(a.id_aten=(select max(t.id_aten) from resultado_prueba t where(t.cod_do='"+cod_do+"') and(t.instancia='pre-donacion') ))and(a.id_aten=r.id_aten) ORDER BY id_prueba ";

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
		ap.setFecha_a(rs.getString("fecha_a"));
		ap.setResultado(rs.getString("resultado"));
		ap.setId_prueba(rs.getInt("id_prueba"));
		ap.setTipo_componente(rs.getString("tipo_componente"));
		ap.setId_aten(rs.getInt("id_aten"));
		ap.setCod_do(rs.getString("cod_do"));

		return ap;
       }




public Collection mostrarResultado_pruebaInt(String cod_do,String fecha_a) {
	Collection lista = new Vector();
	String sql = "select r.resultado,r.id_prueba,p.tipo_componente,r.id_aten,r.cod_do  from resultado_prueba r,prueba p,atencion a where (r.cod_do='"+cod_do+"')and(a.fecha_a='"+fecha_a+"')and(p.tipo='inmunohematologia')and(a.cod_do=r.cod_do)and(r.id_prueba=p.id_prueba) ORDER BY id_prueba ";

	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sql);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getDa(rs);
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
	
	private NivelesRevicionLab getDa(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		//    r.resultado,r.id_prueba,p.tipo_componente
		ap.setResultado(rs.getString("resultado"));
		ap.setId_prueba(rs.getInt("id_prueba"));
		ap.setTipo_componente(rs.getString("tipo_componente"));
		ap.setId_aten(rs.getInt("id_aten"));
		ap.setCod_do(rs.getString("cod_do"));

		return ap;
       }


public void InsertarC(int id_prueba,String valores,int id_aten,String cod_do,String fecha_prueba,String hora_prueba,String cod_per,int id_horario)  
{
                String sqlpw="";
		String m="miliydavid";
	        String instancia="pre-donacion";
		sqlpw = "insert into resultado_prueba(resultado,id_prueba,cod_do,id_aten,instancia,hora_prueba,cod_per,id_horario,fecha_a) values('"+valores+"', "+id_prueba+",'"+cod_do+"', "+id_aten+",'"+instancia+"','"+hora_prueba+"','"+cod_per+"',"+id_horario+",'"+fecha_prueba+"');";
	        Connection c122 = null;
		Statement stmt122 = null;
		try {
			c122 = DBUtils.openConnection();
			stmt122 = c122.createStatement();
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

public void InsertarDonante(String valores,String cod_do)  
{
                String sqlpw="";
		sqlpw = "update donante set gs_rh='"+valores+"' where cod_do='"+cod_do+"';";
	        Connection c122 = null;
		Statement stmt122 = null;
		try {
			c122 = DBUtils.openConnection();
			stmt122 = c122.createStatement();
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

public void  ModificarC(int id_prueba,String valores,int id_aten,String cod_do,String fecha_prueba,String hora_prueba,String cod_per,int id_horario)  
{
                String sqlpw="";
		String m="miliydavid";
	        String instancia="pre-donacion";
		sqlpw = "update resultado_prueba  set resultado = '"+valores+"',fecha_a='"+fecha_prueba+"',hora_prueba='"+hora_prueba+"',cod_per='"+cod_per+"',id_horario="+id_horario+"  where (id_prueba = "+id_prueba+")and(id_aten="+id_aten+")and(cod_do='"+cod_do+"') ;";
		
	        Connection c122 = null;
		Statement stmt122 = null;
		try {
			c122 = DBUtils.openConnection();
			stmt122 = c122.createStatement();
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


public Collection ListaT(int id_aten) {

	Collection lista = new Vector();
	String  sqla ="select  p.nombre_tp, rp.resultado  from  prueba p,resultado_prueba rp  where (p.id_prueba=rp.id_prueba) and(rp.id_aten="+id_aten+") ;";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarM(rs);
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
	
	private NivelesRevicionLab getListarM(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
	
		ap.setNombre_tp(rs.getString("nombre_tp"));
		ap.setResultado(rs.getString("resultado"));
		return ap;
       }


public void FinalizarTodo(int id_aten)  
{
                String sqlpw="";
	        String atendido="A";
	        String atendidop="A";
		
	        sqlpw = "UPDATE atencion SET atendidop = '"+atendidop+"' , atendido='"+atendido+"' WHERE id_aten = "+id_aten+"  ;";

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

public int cont1() {

	String  sql ="SELECT COUNT(*) AS CONT1 FROM PRUEBA WHERE(TIPO='pre-donacion')AND(TIPO_COMPONENTE='2') ;";

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

public int conteo(int id_prueba,String valores,int id_aten,String cod_do) {

	String  sql ="select count(*) as conteo  from resultado_prueba where(cod_do='"+cod_do+"')and(id_aten="+id_aten+")and(id_prueba="+id_prueba+")and(resultado='"+valores+"') ;";
		
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
				numberApartments = rs.getInt("conteo");
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

public Collection ListaAmodificar() {

	Collection lista = new Vector();
	String  sqla ="select  distinct(rp.id_aten),rp.cod_do,p.apepa,p.apema,p.nom  from resultado_prueba rp,persona p,atencion a,donante d  where(instancia='pre-donacion')and(rp.id_aten=a.id_aten)and (d.cod_do=a.cod_do)and(p.id_per=d.id_per)and(a.atendidop='A');";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarMILI(rs);
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
	
	private NivelesRevicionLab getListarMILI(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
		ap.setId_aten(rs.getInt("id_aten"));
		ap.setCod_do(rs.getString("cod_do"));		
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		ap.setNom(rs.getString("nom"));
		return ap;
       }

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
		ap.setCod_do(rs.getString("cod_do"));
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		ap.setNom(rs.getString("nom"));
		return ap;
       }
       public Collection mostrarBusqueda_apellidos(String apepa) {
	        String sql="";
		sql+="select  d.cod_do, p.apepa, p.apema, p.nom ";
		sql+="from persona p, donante d ";
		sql+="where (p.id_per=d.id_per)and(p.apepa ='"+apepa+"') ;";
		return ListadoApellido(sql);
	}


public int contd() {

	String  sql ="select count(*) as cont  from prueba where(tipo='pre-donacion') ;";
		
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
/*
/////////inmunohematologia//////////////////////
public Collection mostrarListaIn1() {

	Collection lista = new Vector();

         String  sqla ="select a.id_aten,d.cod_do,p.nom,p.apepa,p.apema from atencion a,persona p,donante d,evaluacion e,resultado_prueba rp where(a.id_aten=e.id_aten)and(d.cod_do=a.cod_do)and(p.id_per=d.id_per)and ((a.atendidop='A')and(e.atendido='A')and(a.atendidoh='T')) and((a.id_aten=rp.id_aten)and(rp.resultado='Donante Apto')and(instancia='pre-donacion')) ;";

	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarPre11(rs);
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
	
	private NivelesRevicionLab getListarPre11(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		 
		
		
		ap.setId_aten(rs.getInt("id_aten"));		
		ap.setCod_do(rs.getString("cod_do"));
		ap.setNom(rs.getString("nom"));				
		ap.setApepa(rs.getString("apepa"));
		ap.setApema(rs.getString("apema"));
		return ap;
       }


public Collection mostrarListaIn() {

	Collection lista = new Vector();
	String  sqla ="select p.id_prueba,p.nombre_tp,p.tipo_componente  from prueba p  where (p.tipo='inmunohematologia');";

	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarP296(rs);
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
	
	private NivelesRevicionLab getListarP296(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
		
		ap.setId_prueba(rs.getInt("id_prueba"));
		ap.setNombre_tp(rs.getString("nombre_tp"));
		ap.setTipo_componente(rs.getString("tipo_componente"));
		return ap;
       }

public int cont1Int() {
	String  sql ="SELECT COUNT(*) AS CONT1 FROM PRUEBA WHERE(TIPO='inmunohematologia')AND(TIPO_COMPONENTE='2') ;";

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

public int contdIn() {
	String  sql ="select count(*) as cont  from prueba where(tipo='inmunohematologia') ;";
		
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


public Collection mostrarLista4In(int id_prueba) {

	Collection lista = new Vector();
	String  sqla ="select  v.valores,v.id_prueba,v.id_valor from prueba p,valores v where (p.tipo='inmunohematologia')and(p.id_prueba = v.id_prueba)and(p.id_prueba="+id_prueba+");";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarP3ii(rs);
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
	
	private NivelesRevicionLab getListarP3ii(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
	
		ap.setValores(rs.getString("valores"));
		ap.setId_prueba(rs.getInt("id_prueba"));
		ap.setId_valor(rs.getInt("id_valor"));	
		return ap;
       }

public void InsertarCIn(int id_prueba,String valores,int id_aten,String cod_do)  
{
                String sqlpw="";
		String m="miliydavid";
	        String instancia="inmunohematologia";
		sqlpw = "insert into resultado_prueba(resultado,id_prueba,cod_do,id_aten,instancia) values('"+valores+"', "+id_prueba+",'"+cod_do+"', "+id_aten+",'"+instancia+"');";
	        Connection c122 = null;
		Statement stmt122 = null;
		try {
			c122 = DBUtils.openConnection();
			stmt122 = c122.createStatement();
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

//////////////////////////////////////////////////////////////////////////       
*/
/////////////////////////ESTO ES DE PRINCIAL/////////////////////////////////////////
public Collection mostrar_Apellido(String u,String c) {

	Collection lista = new Vector();
        String  sqla =" select distinct(p.nom),p.apepa,p.apema from personal pp,persona p,tiene5 t,roles r  where p.id_per=pp.id_per and pp.usuario='"+u+"' and  pp.contraseña='"+c+"' and pp.cod_per=t.cod_per and t.id_rol=r.id_rol ;";
//	String  sqla ="select r.nombre,r.id_rol,p.usuario from  personal p,roles r,tiene5 t where p.cod_per=t.cod_per and  t.id_rol=r.id_rol and (p.usuario='"+u+"') and (p.contraseña='"+c+"');";
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
		
//		ap.setId_rol(rs.getInt("id_rol"));
		ap.setNom(rs.getString("nom"));
		ap.setApepa(rs.getString("apepa"));		
		ap.setApema(rs.getString("apema"));


		return ap;
       }

///////////////inicio de busqueda de el codigo de persoanl
public String buscarCodigoPer(String u,String c) {

		String sql ="select cod_per  as total1 from personal where usuario='"+u+"' and  contraseña='"+c+"';";
		String numberApartments = "";
		// define db variables
		Connection cg = null;
		Statement stmt = null;
		try {
			cg = DBUtils.openConnection();
			stmt = cg.createStatement();
			// just run the sql statement
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				numberApartments = rs.getString("total1");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				cg.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return numberApartments;
	}



/////////////////fin
//////////INsertar tabla asiste

public void InsertarAsiste(String cod_per,String d,String h) {
               String sqlpw="";
	       sqlpw = "insert into asiste(cod_per,fecha_a,id_horario)values('"+cod_per+"','"+d+"','"+h+"');";
	       
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


/////////

public Collection mostrar_Rol(String u,String c) {

	Collection lista = new Vector();
        String  sqla ="select distinct(m.id_mod),m.nombre,m.id_rol from modulo m,personal p,tiene5 t,roles r    where p.cod_per=t.cod_per and r.id_rol=t.id_rol and r.id_rol=m.id_rol  and (p.usuario='"+u+"') and (p.contraseña='"+c+"'); ";
//	String  sqla ="select r.nombre,r.id_rol,p.usuario from  personal p,roles r,tiene5 t where p.cod_per=t.cod_per and  t.id_rol=r.id_rol and (p.usuario='"+u+"') and (p.contraseña='"+c+"');";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getLm(rs);
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
	
	private NivelesRevicionLab getLm(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
		ap.setId_mod(rs.getInt("id_mod"));
		ap.setNombre(rs.getString("nombre"));
		ap.setId_rol(rs.getInt("id_rol"));

		return ap;
       }

public Collection mostrarMenu(int id_rol) {

	Collection lista = new Vector();
//	String  sqla ="select id_mod,nombre,id_rol from modulo where id_rol=1; ";
	String  sqla ="select codmenu,nombre,enlace from menu; ";

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
		
		
/*		ap.setId_mod(rs.getInt("id_mod"));		
		ap.setNombre(rs.getString("nombre"));
		ap.setId_rol(rs.getInt("id_rol"));
		*/
		ap.setCodmenu(rs.getInt("codmenu"));		
		ap.setNombre(rs.getString("nombre"));
		ap.setEnlace(rs.getString("enlace"));
//		ap.setTipo(rs.getInt("tipo"));		
		return ap;
       }

public Collection mostrar_Menu(String u,String c) {

	Collection lista = new Vector();
//        String  sqla ="select m1.nombre1,m1.enlace,m.id_mod,m.nombre from personal p,tiene5 t, roles r,modulo m,menu m1  where p.cod_per=t.cod_per  and r.id_rol=t.id_rol and r.id_rol=m.id_rol and  m.id_mod=m1.id_mod and p.usuario='"+u+"' and p.contraseña='"+c+"' Order by(id_mod);";

//        String  sqla ="select distinct(m.id_mod),m1.nombre1,m1.enlace,m.nombre from  modulo m,menu m1,roles r,tiene5 t,personal p  where m.id_mod=m1.id_mod  and r.id_rol=m.id_rol and r.id_rol=t.id_rol and p.cod_per=t.cod_per and p.usuario='"+u+"' and p.contraseña='"+c+"';";
        String  sqla ="select distinct(m.id_mod),m.nombre from  modulo m,roles r,tiene5 t,personal p  where r.id_rol=m.id_rol and r.id_rol=t.id_rol and p.cod_per=t.cod_per and p.usuario='"+u+"' and p.contraseña='"+c+"';";

	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getL55(rs);
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
	
	private NivelesRevicionLab getL55(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		    
		ap.setId_mod(rs.getInt("id_mod"));
		ap.setNombre(rs.getString("nombre"));


		return ap;
       }

public Collection mostrar_Codper(String u,String c) {

	Collection lista = new Vector();
//        String  sqla ="select a.fecha_a,a.id_horari,p.cod_per from personal p,asiste a  where p.cod_per=a.cod_per and p.contraseña='"+c+"'   and p.usuario='"+u+"';";
        String  sqla ="select a.fecha_a,a.id_horario from personal p,asiste a where p.cod_per=a.cod_per and p.contraseña='"+c+"' and p.usuario='"+u+"' and a.fecha_a=(select max(b.fecha_a) from personal p1,asiste b where p1.cod_per=b.cod_per and p1.contraseña='"+c+"'  and p1.usuario='"+u+"') and a.id_horario =(select max(c.id_horario)from  personal p2,asiste c where p2.cod_per=c.cod_per and p2.contraseña='"+c+"' and p2.usuario='"+u+"');";

	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getL25(rs);
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
	
	private NivelesRevicionLab getL25(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		    
		ap.setFecha_a(rs.getString("fecha_a"));		
		ap.setId_horario(rs.getInt("id_horario"));

		return ap;
       }

public Collection Menu() {

	Collection lista = new Vector();
        String  sqla ="select enlace,id_mod,nombre1 from menu order by(id_mod);";

	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getL9(rs);
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
	
	private NivelesRevicionLab getL9(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		    
		
		ap.setEnlace(rs.getString("enlace"));		
		ap.setId_mod(rs.getInt("id_mod"));
		ap.setNombre1(rs.getString("nombre1"));

		return ap;
       }

}