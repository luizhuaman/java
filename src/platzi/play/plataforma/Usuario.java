package platzi.play.plataforma;

import platzi.play.contenido.Pelicula;

public class Usuario {
    public String nombre;
    public String email;

    // Podemos reutilizar esa clase/objeto pelicula como parametro de entrada
    public void ver(Pelicula pelicula) {
        System.out.println(nombre + " está viendo...");
        pelicula.reproducir(); //reutilizamos reproducir() para ver el titulo de la pelicula
    }
}
