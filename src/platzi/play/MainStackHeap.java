package platzi.play;

import platzi.play.contenido.Pelicula;

public class MainStackHeap {
    public static void main(String[] args) {
        Pelicula reyLeon = new Pelicula("El Rey León", 135, "Animada");
        Pelicula harryPotter = new Pelicula("Harry Potter", 200, "Fantasía");

        //el rey leon toma la referencia de harry potter y el puntero cambia (heap)
        //los valores de reyLeon son inaccesibles y pueden ser borrados por el garbage collector
        //el garbage collector es un proceso automatico que libera memoria
        reyLeon = harryPotter;

        reyLeon.titulo = "El Hobbit";

        System.out.println("reyLeon: " + reyLeon.titulo);
        System.out.println("harryPotter: " + harryPotter.titulo);
    }
}
