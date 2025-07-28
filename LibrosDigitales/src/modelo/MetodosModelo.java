
package modelo;

import com.mysql.jdbc.*;
import com.mysql.jdbc.PreparedStatement;
import entidades.Libro;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MetodosModelo extends ConectarBD{
    
    public boolean registrarLibro(Libro libro){
        ConectarBD conn = new ConectarBD();
        PreparedStatement ps;
        String sql = "INSERT INTO Libro ((Id, Codigo, Nombre, Editorial,Genero) VALUES (?,?,?,?)";
        try {
         ps = (PreparedStatement) conn.crearPreparedStatment(sql);  
        ps.setString(1, libro.getCodigo());
        ps.setString(2, libro.getNombre());
        ps.setString(3, libro.getEditorial());
        ps.setString(4, libro.getGenero());
        ps.execute();
        return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }finally{
            conn.cerrarConexion();
        }
    }
    
    public boolean modificar(Libro libro){
        ConectarBD conn = new ConectarBD();
        PreparedStatement ps;
        
         String sql = "UPDATE libro SET Codigo=?, Nombre=?, Editorial=? Genero? WHERE Id=?";
         
         try{
             ps = (PreparedStatement) conn.crearPreparedStatment(sql);
             ps.setString(1, libro.getCodigo());
             ps.setString(2, libro.getNombre());
             ps.setString(3, libro.getEditorial());
             ps.setString(4, libro.getGenero());
             ps.setInt(5, libro.getId());
             ps.execute();
             return true;
         }catch(SQLException e){
             System.err.println(e);
             return false;
         }finally{
             conn.cerrarConexion();
         }   
    }
    
    public boolean eliminar(Libro libro){
        ConectarBD conn = new ConectarBD();
        PreparedStatement ps;
        String sql = "DELETE FROM Libro WHERE =?";
        
        try{
            ps = (PreparedStatement) conn.crearPreparedStatment(sql);
            ps.setInt(1, libro.getId());
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
        String sql = "SELECT * FROM Libro WHERE Codigo=?";
        
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
