package clase2;

import java.util.Scanner;

public class CalculoIngresoNumerosDoWhile {
    public static void main(String arg[]) {
        int total = 0,num = 0, i=0, resp = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Ingrese el número deseado...");
            num = scanner.nextInt();
            total = total +num;

            System.out.println("¿Desea seguir agregando numeros? (YES = 1/ NO = 0)");
            resp = scanner.nextInt();

        } while (resp == 1);
        System.out.println("Su resultado total es: " + total);

    }
}
