package clase3;

import java.util.Scanner;

public class ProcesarSaludo {
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre...");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.next();
        scanner.close();
        SaludarUsuario(nombre);
        System.out.println(getMensaje(nombre));
    }

    public static void SaludarUsuario(String nombre){
        System.out.println("Bienvenido "+ nombre+"...!!!");
    }

    public static String getMensaje(String nombre){
        return "Bienvenido nuevamente "+ nombre+"...!!!";
    }
}
