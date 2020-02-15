package clase1;

import java.util.Scanner;

public class CalculoGradoSwitch {
    public static void main(String arg[]) {
        String msg = "";
        System.out.println("Ingresar el grado del alumno..");
        Scanner scanner = new Scanner(System.in);
        String puntaje = scanner.next();

        switch(puntaje){
            case "A":
                msg = "Su puntaje es de 90 - 100";
                break;
            case "B":
                msg = "Su puntaje es de 80 - 90";
                break;
            case "C":
                msg = "Su puntaje es de 70 - 80";
                break;
            case "D":
                msg = "Su puntaje es de 60 - 70";
                break;
            case "E":
                msg = "Su puntaje es menor 60";
                break;
            default:
                msg = "Calificación fuera de rango";
            }
        System.out.println(msg);
        }
    }
