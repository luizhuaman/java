package platzi.play.plataforma;

import platzi.play.contenido.Pelicula;

import java.util.ArrayList;
import java.util.Comparator;
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

    public List<String> getTitulos() {
        return contenido.stream()
                //el mapa me permite transformar en otro elemento distinto del objeto
                //es una funcion que pemite cambiar la referencia
                .map(Pelicula::getTitulo)
                .toList();
    }

    public void eliminar(Pelicula elemento) {
        this.contenido.remove(elemento);
    }

    public Pelicula buscarPorTitulo(String titulo) {
        return contenido.stream()
                .filter(contenido -> contenido.getTitulo().equalsIgnoreCase(titulo))
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

    public List<Pelicula> getPopulares(int cantidad) {
        return contenido.stream()
                .sorted(Comparator.comparingDouble(Pelicula::getCalificacion).reversed())
                .limit(cantidad)
                .toList();
    }

    public int getDuracionTotal() {
        return contenido.stream()
                // mapToInt es para obtener un entero
                .mapToInt(Pelicula::getDuracion)
                .sum();
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
