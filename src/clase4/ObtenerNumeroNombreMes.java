package clase4;

import java.util.Scanner;

public class ObtenerNumeroNombreMes {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese el numero del mes a obtener...");
        int nMes = in.nextInt();
        System.out.println("El nombre de su mes es: " + Mes.getMes(nMes));

        System.out.println("Ingrese el nombre del mes a obtener...");
        String cMes = in.next();
        System.out.println("El numero de su mes es: " + Mes.getMes(cMes));
    }
}
