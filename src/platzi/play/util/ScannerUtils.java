package platzi.play.util;

import java.util.Scanner;

public class ScannerUtils {
    //Un atributo estático pertenece directamente a la clase y no a un objeto individual,
    //por lo que su valor es compartido entre todas las instancias.
    //muy utiles para hacer conteos, validaciones o clases utilitarias
    public static Scanner scanner = new Scanner(System.in);

    //metodos estaticos para que se puedan mostrar en el main
    public static String capturarTexto(String mensaje) {
        System.out.println(mensaje + ": ");
        return scanner.nextLine();
    }

    public static int capturarNumero(String mensaje) {
        System.out.println(mensaje + ": ");

        int dato = scanner.nextInt();
        scanner.nextLine(); //cuando el usuario da enter lo obviamos con esta linea
        return dato;
    }

    public static double capturarDecimal(String mensaje) {
        System.out.println(mensaje + ": ");

        double dato = scanner.nextDouble();
        scanner.nextLine();
        return dato;
    }
}
