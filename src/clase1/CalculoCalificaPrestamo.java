package clase1;

import java.util.Scanner;

public class CalculoCalificaPrestamo {
    public static void main(String arg[]) {
        int salarioBase = 3000;
        int aniosTrabajoBase = 2;

        System.out.println("Ingrese su salario actual...");
        Scanner scanner = new Scanner(System.in);
        int salario = scanner.nextInt();

        System.out.println("Ingrese sus años de experiencia laboral...");
        int aniosTrabajo = scanner.nextInt();

        if (salario >= salarioBase && aniosTrabajo >= aniosTrabajoBase) {
            System.out.println("Felicidades, su solicitud de crédito ha sido aprobado...!!!");
        } else if(salario < salarioBase && aniosTrabajo >= aniosTrabajoBase){
            System.out.println("Lamentablemente su solicitud ha sido rechazada por no tener el salario mínimo esperado...");
        } else if(salario >= salarioBase && aniosTrabajo < aniosTrabajoBase){
            System.out.println("Lamentablemente su solicitud ha sido rechazada por no tener la experiencia laboral mínima solicitada...");
        } else{
            System.out.println("Lamentablemente su solicitud ha sido rechazada por no cumplir ni con el salario mínimo ni el mínimo de experiencia laboral...");
        }
    }
}
