package dwrDao;
import dwrAtributos.NivelesRevicionLab;
import dwrBd.Db;
import java.util.*;
import java.sql.*;
public class GestionarMenu {
	
	public String AdicionarModulo(String id_rol,String nombre){
		String cod="";
		try{
				Db db=new Db();
				 cod=db.generarId("modulo", "id_mod");
				String consulta="insert into modulo(id_mod,id_rol,nombre) values("+cod+","+id_rol+",'"+nombre+"');";
				ResultSet res=db.consulta(consulta);				
			}catch(Exception a){
				a.printStackTrace();
			}
			
			return cod;
	}
	public void ModificarModulo(String id_mod,String id_rol,String nombre){
		try{
			Db db=new Db();
			String consulta="UPDATE modulo SET nombre='"+nombre+"',id_rol="+id_rol+" WHERE id_mod="+id_mod+";";
			ResultSet res=db.consulta(consulta);			
		}catch(Exception a){
			a.printStackTrace();
		}
	}
	public void EliminarModulo(String id_mod){
		try{
			Db db=new Db();
			String consulta1="DELETE FROM menu WHERE id_mod="+id_mod;
			ResultSet res1=db.consulta(consulta1);
			String consulta="DELETE FROM modulo WHERE id_mod="+id_mod;
			ResultSet res=db.consulta(consulta);
		}catch(Exception a){
			a.printStackTrace();
		}
	}
	public Collection ListarModulo(){
		Collection lista=new Vector();
		
		try{
			Db db=new Db();
			String consulta="select m.id_mod,m.nombre,m.id_rol,r.nombre from modulo m,roles r where r.id_rol=m.id_rol;";
			ResultSet res=db.consulta(consulta);
		while(res.next()){
		NivelesRevicionLab ap = new NivelesRevicionLab();
		ap.setId_mod(res.getInt(1));		
		ap.setNombre(res.getString(2));
		ap.setId_rol(res.getInt(3));
		ap.setEnlace(res.getString(4));		
		lista.add(ap);
			}
			
		}catch(Exception a){
			a.printStackTrace();			
		}
		return lista;
	}
	public Collection RecuperarModulo(String id_mod){
		Collection lista=new Vector();
		try{
			Db db=new Db();
			String consulta="select m.id_mod,m.nombre,r.nombre from modulo m,roles r where r.id_rol=m.id_rol and id_mod="+id_mod+";";
			ResultSet res=db.consulta(consulta);
		while(res.next()){
		NivelesRevicionLab ap = new NivelesRevicionLab();
		ap.setId_mod(res.getInt("id_mod"));		
		ap.setNombre(res.getString("nombre"));
		ap.setEnlace(res.getString(3));
		lista.add(ap);
			}
			
		}catch(Exception a){
			a.printStackTrace();			
		}
		return lista;
	}

	public void AdicionarMenu(String enlace,String id_mod,String nombre){
	String codmenu="";
		try{
			Db db=new Db();
			codmenu=db.generarId("menu", "codmenu");
			String consulta="insert into menu(codmenu,enlace,id_mod,nombre1)values("+codmenu+",'"+enlace+"',"+id_mod+",'"+nombre+"');";
			ResultSet res=db.consulta(consulta);			
		}catch(Exception a){
			a.printStackTrace();
		}
	}
	
	public void ModificarMenu(String codmenu,String nombre,String enlace,String id_mod){
		try{
			Db db=new Db();
			String consulta="UPDATE menu SET nombre1='"+nombre+"',enlace='"+enlace+"',id_mod="+id_mod+" WHERE codmenu="+codmenu+"";
			ResultSet res=db.consulta(consulta);			
		}catch(Exception a){
			a.printStackTrace();
		}
	}
	
	public void EliminarMenu(String codmenu){
		try{
			Db db=new Db();
			String consulta="DELETE FROM menu WHERE codmenu="+codmenu;
			ResultSet res=db.consulta(consulta);
		}catch(Exception a){
			a.printStackTrace();
		}
	}
	public Collection ListarMenu(String id_mod){
		Collection lista=new Vector();
		
		try{
			Db db=new Db();
			String consulta="select codmenu,nombre1,enlace from menu where id_mod="+id_mod+";";
			ResultSet res=db.consulta(consulta);
		while(res.next()){
		NivelesRevicionLab ap = new NivelesRevicionLab();
		ap.setCodmenu(res.getInt("codmenu"));		
		ap.setNombre(res.getString("nombre1"));
		ap.setEnlace(res.getString("enlace"));		
		lista.add(ap);
			}
			
		}catch(Exception a){
			a.printStackTrace();			
		}
		return lista;
	}
	public Collection RecuperarMenu(String codmenu){
		Collection lista=new Vector();
		
		try{
			Db db=new Db();
			String consulta="select codmenu,nombre1,enlace from menu where codmenu="+codmenu+";";
			ResultSet res=db.consulta(consulta);
		while(res.next()){
		NivelesRevicionLab ap = new NivelesRevicionLab();
		ap.setCodmenu(res.getInt("codmenu"));		
		ap.setNombre(res.getString("nombre1"));
		ap.setEnlace(res.getString("enlace"));		
		lista.add(ap);
			}
			
		}catch(Exception a){
			a.printStackTrace();			
		}
		return lista;
	}
	
	
	public Collection ListarRoles(){
		Collection lista=new Vector();
		
		try{
			Db db=new Db();
			String consulta="select id_rol,nombre from roles;";
			ResultSet res=db.consulta(consulta);
		while(res.next()){
		NivelesRevicionLab ap = new NivelesRevicionLab();
		ap.setId_rol(res.getInt("id_rol"));		
		ap.setNombre(res.getString("nombre"));
/*			Map a=new HashMap();
				a.put("cod", res.getString(1));
				a.put("nombre",res.getString(2));
				a.put("enlace",res.getString(3));
				a.put("tipo",res.getString(4));*/
		lista.add(ap);
			}
			
		}catch(Exception a){
			a.printStackTrace();			
		}
		return lista;
	}
	
	public Collection ModRecuperar(String cod){
		Collection lista=new Vector();
		try{
			Db db=new Db();
			String consulta="SELECT m.codmenu,m.nom_menu,m.enlace,m.tipo,m.codrol,r.nom_rol from menu m,rol r where m.codmenu="+cod+" and r.codrol=m.codrol";
			ResultSet res=db.consulta(consulta);
			while(res.next()){
				Map a=new HashMap();
				a.put("cod", res.getString(1));
				a.put("nombre",res.getString(2));
				a.put("enlace",res.getString(3));
				a.put("tipo",res.getString(4));
				a.put("codrol",res.getString(5));
				a.put("nom_rol",res.getString(6));
				lista.add(a);
			}			
			
		}catch(Exception a){
			a.printStackTrace();
		}
		return lista;
	}
	public Collection ModRecuperarSub(String cod){
		Collection lista=new Vector();
		try{
			Db db=new Db();
			String consulta1="SELECT m.codmenu,m.nom_menu,m.enlace,m.tipo from menu m,submenu s WHERE s.codmenu="+cod+" and m.codmenu=s.codsubmenu";
			ResultSet res1=db.consulta(consulta1);
			while(res1.next()){
				Map b=new HashMap();
				b.put("cod", res1.getString(1));
				b.put("nombre",res1.getString(2));
				b.put("enlace",res1.getString(3));
				b.put("tipo",res1.getString(4));
				lista.add(b);
			}
			
		}catch(Exception a){
			a.printStackTrace();
		}
		return lista;
	}
	
	public Collection ListaRol(){
		Collection lista=new Vector();
		try{
			Db db=new Db();
			String consulta="SELECT codrol,nom_rol from rol";
			ResultSet res=db.consulta(consulta);
			while(res.next()){
				Map a=new HashMap();
				a.put("cod", res.getString(1));
				a.put("nombre", res.getString(2));
				lista.add(a);
			}
		}catch(Exception a){
			a.printStackTrace();
		}
		return lista;
	}

}
