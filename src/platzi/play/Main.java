package platzi.play;

import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Usuario;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("PLATZI PLAY 🍿");

        Pelicula pelicula = new Pelicula();
        pelicula.titulo = "El señor de los anillos";
        pelicula.fechaEstreno = LocalDate.of(2018,10, 15);
        pelicula.genero = "Fantasía";
        pelicula.calificar(4.7);
        pelicula.duracion = 120;

        //casteo implicito: "long" es un "int" mas grande
        long duracionLong = pelicula.duracion;
        //casteo explicito: el tipo de variable origen (double) no cabe por default en el destino (int)
        int calificacionInt = (int) pelicula.calificacion;
        //casteo explicito de Long a int <-> pdtt: Long.parseLong transf de String a tipo long
        //el int tiene un rango definido
        int numeroDePremios = (int) Long.parseLong("25000000000");

        System.out.println("Duracion Long: " + duracionLong);
        System.out.println("Calificacion Int: " + calificacionInt);
        System.out.println("Numero de premios: " + numeroDePremios);

        Usuario usuario = new Usuario();
        usuario.nombre = "Juan";
        usuario.fechaRegistro = LocalDateTime.of(2025, 12, 24, 17, 15, 14);

        System.out.println(usuario.fechaRegistro);

        usuario.ver(pelicula);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Cual es tu nombre?");
//        String nombre = scanner.nextLine();
//
//        System.out.println("Hola " + nombre + ", esto es Platzi Play!");
//
//        System.out.println(nombre + " cuantos años tienes?");
//        int edad = scanner.nextInt();
//
//        System.out.println(nombre + " puedes ver contenido +" + edad);
    }
}
