package dwrDao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.DBUtils;
public class ListaHemaDAO {

public Collection mostrarLista() {

	Collection lista = new Vector();

         String  sqla ="select a.id_aten,d.cod_do,p.nom,p.apepa,p.apema,rp.resultado from atencion a,persona p,donante d,evaluacion e,resultado_prueba rp where(a.id_aten=e.id_eva)and(d.cod_do=a.cod_do)and(p.id_per=d.id_per)and ((a.atendidoe='A')and(a.atendidop='A')and(e.atendido='A')and(a.atendidoh='T')) and((a.id_aten=rp.id_aten)and(rp.resultado='Donante  Apto')and(instancia='pre-donacion')) ;";

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
		ap.setResultado(rs.getString("resultado"));		
		return ap;
       }






public Collection mostrarLista3() {

	Collection lista = new Vector();
	String  sqla ="select p.id_prueba,p.nombre_tp,p.tipo_componente  from prueba p  where (p.tipo='inmunohematologia')and(p.positivo='N') order by(id_prueba)  ;";

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
	String  sqla ="select  v.valores,v.id_prueba,v.id_valor from prueba p,valores v where (tipo='inmunohematologia')and(p.id_prueba = v.id_prueba)and(p.id_prueba="+id_prueba+")and(v.positivo='N')  ;";
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

public void InsertarC(int id_prueba,String valores,int id_aten,String cod_do,String cod_per,int id_horario,String hora_prueba,String fecha_prueba)
{
                String sqlpw="";
		String m="miliydavid";
	        String instancia="inmunohematologia";
		sqlpw = "insert into resultado_prueba(resultado,id_prueba,hora_prueba,cod_do,id_aten,instancia,cod_per,id_horario,fecha_a) values('"+valores+"', "+id_prueba+",'"+hora_prueba+"','"+cod_do+"', "+id_aten+",'"+instancia+"','"+cod_per+"',"+id_horario+",'"+fecha_prueba+"');";
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

public void  ModificarC(int id_prueba,String valores,int id_aten,String cod_do,String hora_prueba,String fecha_prueba,String cod_per,int id_horario)
{
                String sqlpw="";
		String m="miliydavid";
	        String instancia="inmunohematologia";
		sqlpw = "update resultado_prueba  set resultado = '"+valores+"',hora_prueba ='"+hora_prueba+"',fecha_a='"+fecha_prueba+"',id_horario='"+id_horario+"'  where (id_prueba = "+id_prueba+")and(id_aten="+id_aten+")and(cod_do='"+cod_do+"') ;";
		
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
	        String atendidoh="A";
		
	        sqlpw = "UPDATE atencion SET atendidoh = '"+atendidoh+"' , atendido='"+atendido+"' WHERE id_aten = "+id_aten+"  ;";

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

///////////////////falta revisar
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

	String  sql ="select count(*) as cont  from prueba where(tipo='inmunohematologia')and(positivo='N') ;";
		
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


public Collection mostrarResultado_prueba(String cod_do) {
	Collection lista = new Vector();
//	String sql = "select r.resultado,r.id_prueba,p.tipo_componente,r.id_aten,r.cod_do  from resultado_prueba r,prueba p,atencion a where (r.cod_do='"+cod_do+"')and(p.tipo='inmunohematologia')and(a.cod_do=r.cod_do)and(r.id_prueba=p.id_prueba)and(a.id_aten=(select max(id_aten) from atencion))and(a.id_aten=r.id_aten) ORDER BY id_prueba ";
	String sql = "select r.fecha_a,r.resultado,r.id_prueba,p.tipo_componente,r.id_aten,r.cod_do from resultado_prueba r,prueba p, atencion a where(r.cod_do='"+cod_do+"')and(a.id_aten=(select max(t.id_aten) from resultado_prueba t where(t.cod_do='"+cod_do+"') and(t.instancia='inmunohematologia') ))and(r.id_prueba=p.id_prueba)and(r.instancia='inmunohematologia') order by(id_prueba);";
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

//****************************control de calidad**////////////////////

public Collection mostrarPrueba(String cod_do) {
	Collection lista = new Vector();
	String sql = "select r.resultado,r.id_prueba,p.tipo_componente,r.id_aten,r.cod_do from resultado_prueba r,prueba p  where(r.cod_do='"+cod_do+"')and(r.id_aten=(select max(t.id_aten) from resultado_prueba t where(t.cod_do='"+cod_do+"') and(t.instancia='control de calidad') ))and(r.id_prueba=p.id_prueba)and(r.instancia='control de calidad') order by(id_prueba);";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sql);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getDa16(rs);
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
	
	private NivelesRevicionLab getDa16(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		ap.setResultado(rs.getString("resultado"));
		ap.setId_prueba(rs.getInt("id_prueba"));
		ap.setTipo_componente(rs.getString("tipo_componente"));
		ap.setId_aten(rs.getInt("id_aten"));
		ap.setCod_do(rs.getString("cod_do"));

		return ap;
       }


public void  ModificarC1(int id_prueba,String valores,int id_aten,String cod_do)  
{
                String sqlpw="";
		String m="miliydavid";
	        String instancia="control de calidad";
		sqlpw = "update resultado_prueba  set resultado = '"+valores+"'  where (id_prueba = "+id_prueba+")and(id_aten="+id_aten+")and(cod_do='"+cod_do+"') ;";
		
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


public int contd1() {

	String  sql ="select count(*) as contd1  from prueba where(tipo='control de calidad')and(positivo='N') ;";
	
	
		
	       int numberApartments = 0;
		Connection c = null;
		Statement stmt = null;
		try {
			c = DBUtils.openConnection();
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				numberApartments = rs.getInt("contd1");
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

public Collection mostrarLista44(int id_prueba) {

	Collection lista = new Vector();
	String  sqla ="select  v.valores,v.id_prueba,v.id_valor from prueba p,valores v where (tipo='control de calidad')and(p.id_prueba = v.id_prueba)and(p.id_prueba="+id_prueba+")and(v.positivo='N')  ;";
	        Connection ca = null;
		Statement stmta = null;
		try {
			ca = DBUtils.openConnection();
			stmta = ca.createStatement();
			// just run the sql statement
			ResultSet rs = stmta.executeQuery(sqla);
			while(rs.next()) {
				NivelesRevicionLab apartment = this.getListarp3(rs);
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
	
	private NivelesRevicionLab getListarp3(ResultSet rs) throws SQLException {
		NivelesRevicionLab ap = new NivelesRevicionLab();
		
	
		ap.setValores(rs.getString("valores"));
		ap.setId_prueba(rs.getInt("id_prueba"));
		ap.setId_valor(rs.getInt("id_valor"));	
		return ap;
       }
////////////////**************************************************
public String  mostrarResultado(String cod_do) {
	        String	sql="select resultado as resultado from resultado_prueba rp,prueba p where(rp.instancia='pre-donacion') and (p.id_prueba=1) and (p.id_prueba=rp.id_prueba) and (rp.cod_do='"+cod_do+"');";

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
				numberApartments = rs.getString("resultado");
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