package clase1;

import java.util.Scanner;

public class CalculoSalarioVariable {
    public static void main(String arg[]){
        int salarioBase = 1000;

        System.out.println("Ingresar la cantidad de ventas..");
        Scanner scanner = new Scanner(System.in);
        int nroVentas = scanner.nextInt();

        if(nroVentas>10){
            int salario = salarioBase + 250;
            System.out.println("Usted ha sobrepasado el limite, su nuevo salario es:" + salario);
        }else{
            System.out.println("Usted no ha sobrepasado el limite, salario es:" + salarioBase);
        }
    }
}
