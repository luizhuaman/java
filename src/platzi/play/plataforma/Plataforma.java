package platzi.play.plataforma;

import platzi.play.contenido.Pelicula;

import java.util.ArrayList;
import java.util.List;

//Clase Plataforma
public class Plataforma {
    private String nombre;
    //inicialiamos nuestra lista<attrPeliculaClas> llamada "contenido"
    private List<Pelicula> contenido;

    //dentro del constructor inicializamos el nombre de la plataforma y el arrayList
    public Plataforma(String nombre) {
        this.nombre = nombre;
        this.contenido = new ArrayList<>();
    }

    // metodo para agregar elementos a la lista es el add -
    public void agregar(Pelicula elemento) {
        this.contenido.add(elemento);
    }

    public void mostrarTitulos() {
        //para recorrer la lista contenido
        for (Pelicula pelicula : contenido) {
            System.out.println(pelicula.getTitulo());
            System.out.println(pelicula.getCalificacion());
        }
    }

    public void eliminar(Pelicula elemento) {
        this.contenido.remove(elemento);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Pelicula> getContenido() {
        return contenido;
    }
}
