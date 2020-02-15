package clase1;

import java.util.Scanner;

public class CalcularSalario {
/*
* - obtener las horas trabajadas
*- obtener el costo de horas por hombre.
*- multiplicar el monto las horas trabajadas por el costohorasH
*- MOstrar el resultado
* */
    public static void main(String arg[]){
        System.out.println("Ingresar cantidad de horas trabajadas");
        Scanner scanner = new Scanner(System.in);
        int horasTrabajadas = scanner.nextInt();

        System.out.println("Ingresar la tarifa de pagos por hora");
        double pagoxHora = scanner.nextDouble();

        System.out.println("Calculando el Salario...");
        double salario = horasTrabajadas*pagoxHora;

        System.out.println("Su salario es: " + salario);


    }


}
