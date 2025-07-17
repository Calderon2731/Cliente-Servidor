package modelo;

import java.sql.*;

public class ConectarBD {
    
    private Connection conexion = null;
    private String servidor = "Localhost:3308";
    private String database = "proyectocs";
    private String usuario = "root";
    private String password = "";
    private String url = "";
    
    public ConectarBD(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://" + servidor +"/" + database + "?autoReconnect=true&useSSL=false";
            conexion = DriverManager.getConnection(url,usuario,password);
            System.out.println("Conexion a base de datos: " + url + "....OK");
        }catch(SQLException e) {
            System.out.println(e.getMessage());          
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());     
        }      
    }
    
    public ConectarBD(String servidor, String database, String usuario, String password)
    {
        try {
            this.servidor = servidor;
            this.database = database;
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://" + servidor +"/" + database + "?autoReconnect=true&useSSL=false";
            conexion = DriverManager.getConnection(url,usuario,password);
            System.out.println("Conexion a base de datos: " + url + "....OK");
        }catch(SQLException e) {
           System.out.println(e.getMessage());
           
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
            
        }
        
    }
    
    public PreparedStatement crearPreparedStatment(String sql) throws SQLException{
        return conexion.prepareStatement(sql);
    }
    
    public Statement CrearStatment() throws SQLException{
        return conexion.createStatement();
    }
    
    public Connection getConexion(){
        return conexion;
    }
    
    public Connection cerrarConexion(){
        try {
            conexion.close();
            System.out.println("Cerrando la base de datos!!" + url);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        conexion = null;
        return conexion;
        
    }

    

}
