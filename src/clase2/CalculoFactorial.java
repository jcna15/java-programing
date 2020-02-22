package clase2;

import java.util.Scanner;

public class CalculoFactorial {
    public static void main(String arg[]) {
        int total = 1;
        int factorial = 1;
        int i = 0;

        System.out.println("Ingrese el factorial que desea calcular...");
        Scanner scanner = new Scanner(System.in);
        factorial = scanner.nextInt();

        if(factorial != 0){
            while(factorial>i){
                total = total*(factorial - i);
                i = i+1;
            }
            System.out.println("El calculo del factorial " + factorial + " es: " + total);
        }else{
            System.out.println("El calculo del factorial " + factorial + " es: 1");
        }

    }
}
