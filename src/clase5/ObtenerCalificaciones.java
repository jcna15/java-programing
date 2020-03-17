package clase5;

import java.util.Scanner;

public class ObtenerCalificaciones {

    private static int calificaciones[];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el numero de calificaciones a ingresar:");
        calificaciones = new int[sc.nextInt()];

        getCalificaciones();

        System.out.println("El promedio de sus notas es: " + getPromedio(calificaciones));
        System.out.println("Su nota mas alta es: " + getNotaAlta(calificaciones));
        System.out.println("Su nota mas baja es: " + getNotaBaja(calificaciones));
    }

    private static int getNotaBaja(int[] calificaciones) {
        int menor = calificaciones[0];

        for (int nota: calificaciones) {
            if(nota < menor){
                menor = nota;
            }
        }
        return menor;
    }

    private static int getNotaAlta(int[] calificaciones) {
        int mayor = 0;
        for (int nota: calificaciones) {
            if(nota > mayor){
                mayor = nota;
            }
        }
        return mayor;
    }

    public static double getPromedio(int[] calificaciones) {
        int sum = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            sum = sum +calificaciones[i];
        }
        return sum/calificaciones.length;
    }

    private static void getCalificaciones() {
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Ingrese su nota " + (i+1));
            calificaciones[i] = sc.nextInt();
        }
    }
}
