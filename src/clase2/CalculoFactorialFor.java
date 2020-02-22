package clase2;

import java.util.Scanner;

public class CalculoFactorialFor {
    public static void main(String arg[]) {
        int total = 1;
        int factorial = 1;

        System.out.println("Ingrese el factorial que desea calcular...");
        Scanner scanner = new Scanner(System.in);
        factorial = scanner.nextInt();

        for(int i=0;factorial>i;i++){
            total = total*(factorial - i);
        }
        System.out.println("El calculo del factorial " + factorial + " es: " + total);
    }
}
