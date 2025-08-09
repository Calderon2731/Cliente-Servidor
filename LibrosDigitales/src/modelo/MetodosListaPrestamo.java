
package modelo;

import com.mysql.jdbc.*;
import com.mysql.jdbc.PreparedStatement;
import entidades.Libro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MetodosListaPrestamo extends ConectarBD{
    
    
    public ArrayList<Libro> todoLibros(){
        ArrayList<Libro> miListaLibro = new ArrayList<>();
        
        try {
             ConectarBD conn = new ConectarBD();
             Statement st = (Statement) conn.CrearStatment();
             ResultSet rs = st.executeQuery("SELECT * FROM libro");
             while(rs.next()){
                 Libro lib = new Libro(rs.getInt("iD"),
                                        rs.getString("codigo"),
                                        rs.getString("nombre"),
                                        rs.getString("editorial"),
                                        rs.getString("genero"));
                 miListaLibro.add(lib);
             }
             rs.close();
             conn.cerrarConexion();
        } catch (SQLException e) {
          Logger.getLogger(MetodosListaPrestamo.class.getName()).log(Level.SEVERE,null,e);  
        }
        return miListaLibro;
    }
    
    public ArrayList<Libro> BuscarLibroNombre(String nombre){
        ArrayList<Libro> miListaLibro = new ArrayList<>(); 
        try {
            ConectarBD conn = new ConectarBD();
            PreparedStatement sql = (PreparedStatement) conn.crearPreparedStatment("SELECT * FROM Libro WHERE nombre like ?");
            nombre = '%' + nombre + '%';
            ResultSet rs = sql.executeQuery("SELECT * FROM libro");
            while(rs.next()){
                 Libro lib = new Libro(rs.getInt("iD"),
                                        rs.getString("codigo"),
                                        rs.getString("nombre"),
                                        rs.getString("editorial"),
                                        rs.getString("genero"));
                 miListaLibro.add(lib);
             }
            rs.close();
            conn.cerrarConexion();
        } catch (SQLException e) {
            Logger.getLogger(MetodosListaPrestamo.class.getName()).log(Level.SEVERE,null,e);              
        }
        return miListaLibro;
    }
   
    
    public boolean eliminar(Libro libro){
        ConectarBD conn = new ConectarBD();
        PreparedStatement ps;
        String sql = "DELETE FROM prestamo WHERE codigo=?";
        
        try{
            ps = (PreparedStatement) conn.crearPreparedStatment(sql);
            ps.setString(1, libro.getCodigo());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            conn.cerrarConexion();
        }
    }
    
    public boolean buscar(Libro libro){
         ConectarBD conn = new ConectarBD();
         ResultSet rs = null; 
        PreparedStatement ps;
        String sql = "SELECT * FROM prestamo WHERE Codigo=?";
        
        try{
            ps =  (PreparedStatement) conn.crearPreparedStatment(sql);
            ps.setString(1, libro.getCodigo());
            rs = ps.executeQuery();
            
            if (rs.next()) {
             libro.setId(Integer.parseInt(rs.getString("id")));
             libro.setCodigo(rs.getString("codigo"));
             libro.setNombre(rs.getString("nombre"));
             libro.setEditorial(rs.getString("Editorial"));
             libro.setGenero(rs.getString("Genero"));
             return true;
            }
            return false;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            conn.cerrarConexion();
        }
    }

}
