package clase2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoCambioMonedaSol {
    public static void main(String arg[]) {
        float valorBase = 1.00f;
        int nro1cent = 0;
        int nro5cent = 0;
        int nro10cent = 0;
        int nro25cent = 0;
        float total = 0.00f;

        System.out.println("Ingrese la cantidad de monedas de 0.01...");
        Scanner scanner = new Scanner(System.in);
        nro1cent = scanner.nextInt();

        System.out.println("Ingrese la cantidad de monedas de 0.05...");
        nro5cent = scanner.nextInt();

        System.out.println("Ingrese la cantidad de monedas de 0.10...");
        nro10cent = scanner.nextInt();

        System.out.println("Ingrese la cantidad de monedas de 0.25...");
        nro25cent = scanner.nextInt();

        //CALCULANDO EL VALOR TOTAL
        total = (nro1cent*0.01f)+(nro5cent*0.05f)+(nro10cent*0.10f)+(nro25cent*0.25f);
        DecimalFormat formato1 = new DecimalFormat("0.00");

        if(total == valorBase){
            System.out.println("FELICIDADES...!!! Has logrado el valor exacto de S/1");
        }else if(total > valorBase){
            System.out.println("Lamentablemente te has excedido por el valor de " + formato1.format(total-valorBase) + " centavos");
        }else {
            System.out.println("Lamentablemente te ha faltado el valor de " + formato1.format(valorBase-total) + " centavos");
        }
    }
}
