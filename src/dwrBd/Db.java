package dwrBd;
import java.sql.*;
public class Db {
	private String User ="postgres"; 
	// richard
	private String Password = "";
	private String Host = "127.0.0.1";
	private String Base = "mili"; 
	private Connection con= null;
	private ResultSet rs = null;
	private Statement stmt= null;
	private PreparedStatement p  = null;
	private SQLException Mensaje = null; 
	public Db (){
		try 
    	{
    		Class.forName("org.postgresql.Driver"); 
    	}
    	catch (Exception e) {
			System.out.println("no se puede cargar el driver"); 
		} 
    try { 
    this.con = DriverManager.getConnection("jdbc:postgresql://"+this.getHost()+"/"+this.getBase(),this.getUser(),this.getPassword());    
    }
    catch (SQLException se) {
		this.setMensaje(se);
	}
   }
	public void abm(String Consulta){
		try {
		this.p = this.con.prepareStatement(Consulta);
		p.executeUpdate();
		}
		catch (SQLException se) {
			this.setMensaje(se);
			//se.printStackTrace(System.err);
		}
	}
	public PreparedStatement consultap (String consulta) {
		PreparedStatement valor = null;
		try 
		{
		valor = this.con.prepareStatement(consulta);
		}
		catch (SQLException se) {
			this.setMensaje(se);
			//se.printStackTrace(System.err);
		}
		return valor; 
	}
	public ResultSet consulta(String consulta){
		ResultSet valor = null; 
		try {
	
		this.stmt = this.con.createStatement();		 
		valor= stmt.executeQuery(consulta);
		}
		catch (SQLException se) {
			this.setMensaje(se);
			//se.printStackTrace(System.err);
		}
		return valor; 
	}
	
	public String generarId (String tabla,String campo) {
		String valor = null;   
		try {
		this.stmt = this.con.createStatement();
		this.rs = stmt.executeQuery("select max(to_number("+campo+",'9999'))+1 as valor from  "+tabla);
		this.rs.next();		
		valor = rs.getString("valor");
		if (valor==null){
			valor ="1"; }
		}
		catch (SQLException se) {
			this.setMensaje(se);
			//se.printStackTrace(System.err);
		}
		return valor;
	}
	/*
	public Boolean buscar(String tabla,String campo,String campob) {
		String valor = null; 
		Boolean band = null; 
		try {
			this.stmt = this.con.createStatement(); 
			this.rs = stmt.executeQuery("select max(*) as valor from  "+tabla+" where "+campo+"="+campob);
			this.rs.next();
			valor = rs.getString("valor");
			if (valor==null){
				band = false; }
			else {
				band = true;
			}
		}
		catch (SQLException se) {
			this.setMensaje(se);
			//se.printStackTrace(System.err);
		}
		 return band;
	}
	*/
	public String getUser(){
		return this.User;
	}
	public void setUser(String u){
		this.User=u; 
	}
	public String getPassword(){
		return this.Password;
	}
	public void setPassword(String p){
		this.Password=p; 
	}
	public String getHost(){
		return this.Host;
	}
	public void setHost(String h){
		this.Host=h; 
	}
	public String getBase(){
		return this.Base;
	}
	public void setBase(String b){
		this.Base=b; 
	}
	public SQLException  getMensaje(){
		return this.Mensaje;
	}
	public void setMensaje(SQLException se){
		this.Mensaje=se; 
	}
	public void destroy (){
		try {
		this.con.close();
		}
		catch (SQLException se) {
			//out.println("SQLexception" + se.getMessage());
			se.printStackTrace(System.err);
		}
	}
}