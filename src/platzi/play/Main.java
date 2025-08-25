package platzi.play;

import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Plataforma;
import platzi.play.plataforma.Usuario;
import platzi.play.util.ScannerUtils;

public class Main {
    public static final String NOMBRE_PLATAFORMA = "PLATZI PLAY 🍿";
    public static final String VERSION = "1.0.0";

    public static void main(String[] args) {
        // instanciamos nuestra clase/objeto plataforma
        Plataforma plataforma = new Plataforma(NOMBRE_PLATAFORMA);
        System.out.println(NOMBRE_PLATAFORMA + " v" + VERSION);

        String nombre = ScannerUtils.capturarTexto("Nombre del contenido");
        String genero = ScannerUtils.capturarTexto("Genero del contenido");
        int duracion = ScannerUtils.capturarNumero("Duracion del contenido");
        double calificacion = ScannerUtils.capturarDecimal("Calificacion del contenido");

        // recordar que tenemos dos objetos llamado Pelicula
        Pelicula pelicula = new Pelicula(nombre, duracion, genero, calificacion);
        Pelicula pelicula2 = new Pelicula("F1 The Movie", 220, "Acción");

        plataforma.agregar(pelicula);
        plataforma.agregar(pelicula2);
        System.out.println("Numero de elementos en la plataforma " + plataforma.getContenido().size());
        //plataforma.eliminar(pelicula2);

        //En este metodo imprimimos los datos de la lista ingresada a plataforma
        plataforma.mostrarTitulos();

        Usuario usuario = new Usuario("Juan", "juan@platzi.com");
        usuario.ver(pelicula);
    }
}
