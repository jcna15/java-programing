package clase4;

import java.util.Scanner;

public class CalcularAreaNueva {
    private Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        CalcularAreaNueva calcularAreaNueva = new CalcularAreaNueva();

        Rectangulo cocina = calcularAreaNueva.getRectangulo();
        Rectangulo banio = calcularAreaNueva.getRectangulo();
        double area = calcularAreaNueva.calcularAreaTotal(cocina,banio);
        System.out.println("El area total es: "+area);
        calcularAreaNueva.in.close();

    }

    public Rectangulo getRectangulo(){
        System.out.println("Ingrese el ancho del rectangulo");
        double ancho = in.nextDouble();

        System.out.println("Ingrese el largo del rectangulo");
        double largo = in.nextDouble();
        return new Rectangulo(ancho,largo);
    }
    public double calcularAreaTotal(Rectangulo obj1, Rectangulo obj2){
        return obj1.calcularArea() + obj2.calcularArea();
    }

}
