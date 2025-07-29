
package entidades;

public class Libro {

private int id;
private String codigo;
private String nombre;
private String editorial;
private String genero;


    public Libro(int id, String codigo, String nombre, String editorial, String genero) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.editorial = editorial;
        this.genero = genero;
    }
    
        public Libro( String codigo, String nombre, String editorial, String genero){
        this.codigo = codigo;
        this.nombre = nombre;
        this.editorial = editorial;
        this.genero = genero;
    }
    
    

    public Libro() {
        this.id = 0;
        this.codigo = "";
        this.nombre = "";
        this.editorial = "";
        this.genero = "";
    }
    public Libro(int id){    
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Libro: "+"\n"+ 
                "id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", editorial=" + editorial + ", genero=" + genero + '}';
    }
    
    




}
