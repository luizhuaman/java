package platzi.play.plataforma;

import platzi.play.contenido.Pelicula;

import java.util.ArrayList;
import java.util.List;
import java.text.Normalizer;


public class Plataforma {
    private String nombre;
    private List<Pelicula> contenido; // Agregación

    public Plataforma(String nombre) {
        this.nombre = nombre;
        this.contenido = new ArrayList<>();
    }

    public void agregar(Pelicula elemento) {
        this.contenido.add(elemento);
    }

    public void mostrarTitulos() {
        // Un LAMBDA es una forma corta de escribir un metodo: Programacion Funcional
        contenido.forEach(contenido -> System.out.println(contenido.getTitulo()));
    }

    public void eliminar(Pelicula elemento) {
        this.contenido.remove(elemento);
    }

    public Pelicula buscarPorTitulo(String titulo) {
        // stream: una cinta transportadora que recorre una lista y nos permite realizar acciones
        return contenido.stream()
                //filer es un metodo de stream que se aplica a la lista contenido
                .filter(contenido -> contenido.getTitulo().equalsIgnoreCase(titulo))
                //.toList().get(0);
                .findFirst()
                .orElse(null);
    }

    public List<Pelicula> buscarPorGenero(String genero) {
        String generoBuscado = normalizarTexto(genero);

        return contenido.stream()
                .filter(contenido -> normalizarTexto(contenido.getGenero())
                        .equalsIgnoreCase(generoBuscado))
                .toList();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Pelicula> getContenido() {
        return contenido;
    }

    //Se agrego el metodo para obviar las tildes cuando realiza búsqueda
    private String normalizarTexto(String texto) {
        return Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "")  // Remueve tildes/acentos
                .toLowerCase()             // Convierte a minúsculas
                .trim();                   // Remueve espacios
    }
}
