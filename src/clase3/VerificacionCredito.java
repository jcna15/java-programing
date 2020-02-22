package clase3;

import java.util.Scanner;

public class VerificacionCredito {
    static int salarioBase = 25000;
    static int scoreBase = 700;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("BIENVENIDO A CREDITO RAPIDO..!!");
        System.out.println(getMensajeEvaluación(getEvaluacionCrediticio(getSalario(),getScore())));
    }

    public static double getSalario(){
        System.out.println("Ingrese su salario actual..");
        return sc.nextDouble();
    }

    public static final int getScore(){
        System.out.println("Ingrese su calificación actual..");
        return sc.nextInt();
    }

    public static boolean getEvaluacionCrediticio(double salario, int score){
        if(salario >= salarioBase && score >= scoreBase){
            return true;
        }
        return false;
    }

    public static String getMensajeEvaluación(boolean evaluación){
        if(evaluación){
            return "Felicidades, su crédito ha sido aprobado";
        }
        return "Lamentablemente su crédito NO ha sido aprobado";
    }
}
