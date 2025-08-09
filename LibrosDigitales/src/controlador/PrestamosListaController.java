package controlador;

import entidades.Libro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.MetodosListaPrestamo;
import vista.ListaLibrosPrestados;


public class PrestamosListaController implements ActionListener{
    
    private final Libro modelo;
    private final MetodosListaPrestamo consultas;
    private final ListaLibrosPrestados vista;

    public PrestamosListaController(Libro modelo, MetodosListaPrestamo consultas, ListaLibrosPrestados vista) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
    }
    public void iniciar(){
        vista.setTitle("Consulta de libro");
        vista.setLocationRelativeTo(null);
        vista.txtId.setVisible(false);
    }
    
    public void limpiar(){
        vista.txtId.setText("");
        vista.txtEditorial.setText("");
        vista.txtCodigo.setText("");
        vista.txtNombre.setText("");
        vista.txtGenero.setText("");
        
        vista.txtCodigo.requestFocus(); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //btn eliminar
          if (e.getSource()==vista.btnEliminar) {
            modelo.setId(Integer.parseInt(vista.txtId.getText()));
            if (consultas.eliminar(modelo)) {
                JOptionPane.showMessageDialog(null, "se elimino registro");
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "error al eliminar");
                limpiar();
            }
        }
          //btn buscar      
           if (e.getSource()==vista.btnBuscar) {
            modelo.setCodigo((vista.txtCodigo.getText()));
            if (consultas.buscar(modelo)) {
                vista.txtId.setText(String.valueOf(modelo.getId()));
                vista.txtCodigo.setText((modelo.getCodigo()));
                vista.txtNombre.setText(modelo.getNombre());
                vista.txtEditorial.setText(modelo.getEditorial());
                vista.txtGenero.setText((modelo.getGenero()));
                JOptionPane.showMessageDialog(null, "Registro encontrado");
       
            }
            else{
                JOptionPane.showMessageDialog(null, "no se encontro registro");
                limpiar();
            }
        }
           
           if (e.getSource() == vista.btnLimpiar) {
               limpiar(); 
        }
    }
}
    
