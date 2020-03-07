package clase4;

public class CalcularAreaRectangulo {
    public static void main(String arg[]) {
        /****************
         * RECTANGULO 1 *
         * **************
         */
        Rectangulo obj = new Rectangulo();
        obj.setAncho(25);
        obj.setLargo(50);

        double areaObj = obj.calcularArea();
        double perimetroObj = obj.calcularPerimetro();

        /****************
         * RECTANGULO 2 *
         * **************
         */
        Rectangulo obj1 = new Rectangulo(30,75);
        double areaObj1 = obj1.calcularArea();
        double perimetroObj1 = obj1.calcularPerimetro();

        /*********************
         * CALCULANDO EL AREA
         ********************/
        double areaTotal = areaObj + areaObj1;

        System.out.println("El área total de los 2 rectangulos es: " + areaTotal);

        /***************************
         * CALCULANDO EL PERIMETRO
         ***************************/
        double perimetroTotal = perimetroObj + perimetroObj1;
        System.out.println("El perimetro total de los 2 rectangulos es: " + perimetroTotal);
    }
}
