package clase1;

import java.util.Scanner;

public class CalculoVentas {
    public static void main(String arg[]) {
        System.out.println("Ingresar el Nro de ventas..");
        Scanner scanner = new Scanner(System.in);
        int ventas = scanner.nextInt();
        int ventasBase = 10;

        if (ventas >= ventasBase) {
            System.out.println("Felicidades, objetivo cumplido...!!!");
        } else {
            System.out.println("Lamentablemente le ha faltado " + (ventasBase - ventas) + " ventas por realizar...");
        }
    }
}
