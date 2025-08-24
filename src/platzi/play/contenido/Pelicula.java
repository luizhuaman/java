package platzi.play.contenido;

public class Pelicula {
    public String titulo;
    public String descripcion;
    public int duracion;
    public String genero;
    public int anioEstreno;
    public double calificacion;
    public boolean disponible;

    //metodos son acciones (verbos)
    public void reproducir() {
        System.out.println("Reproduciendo " + titulo);
    }

    public String obtenerFichaTecnica() {
        return titulo + " (" + anioEstreno + ")\n" +
                "Género: " + genero + "\n" +
                "Calificación: " + calificacion + "/5";
    }

    // this.calificacion hace referencia al atributo del objeto y calificacion al valor entrante
    public void calificar(double calificacion) {
        if (calificacion >= 0 && calificacion <= 5) {
            this.calificacion = calificacion;
        }
    }

    public boolean esPopular() {
        return calificacion >= 4;
    }
}
