package clase1;

import java.util.Scanner;

public class CalculoGradoElse {
    public static void main(String arg[]) {
        System.out.println("Ingresar el puntaje del alumno..");
        Scanner scanner = new Scanner(System.in);
        int puntaje = scanner.nextInt();

        if (puntaje < 60) {
            System.out.println("Usted obtuvo como calificación: F");
        } else if (puntaje < 70) {
            System.out.println("Usted obtuvo como calificación: D");
        } else if (puntaje < 80) {
            System.out.println("Usted obtuvo como calificación: C");
        } else if (puntaje < 90) {
            System.out.println("Usted obtuvo como calificación: B");
        } else {
            System.out.println("Usted obtuvo como calificación: A");
        }
    }
}
