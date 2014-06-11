

package beans;

import java.util.ArrayList;


public class Categoria {
    private int id;
    private String descripcion;
    private String nombre;
    private ArrayList<Producto> listaProductos;
    
    public Categoria(){
        listaProductos= new ArrayList<Producto>();
        
    }

    public Categoria(int id, String descripcion, String nombre) {
        this.id = id;
        this.descripcion = descripcion;
        this.nombre = nombre;
        listaProductos= new ArrayList<Producto>();
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
            
    @Override
    public String toString(){
        return "id: "+ id + "<br/>"+
               "nombre: "+ nombre + "<br/>"+ 
                "descripcion: "+ descripcion + "<br/>"+ 
                "lista de productos: "+ listaProductos + "<br/>";
        
    }
    
    
    
}
