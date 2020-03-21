package clase5;

public class TestearHerencia {
    public static void main(String[] args) {
        //Empleado employee = new Empleado();
        //employee.setIdEmpleado("jcna");
        //employee.setCargo("Analista");
        //employee.setEdad(33);
        //employee.setGenero("Masculino");

        Madre madre = new Madre();
        madre.setNombre("Lidia");
        System.out.println(madre.getNombre() + " es una " + madre.getGenero());
    }

    public static void testCuadradoOverride(){
        Rectangulo objRectanguo = new Rectangulo();
        objRectanguo.setAncho(3);
        objRectanguo.setLargo(8);
        System.out.println(objRectanguo.calcularPerimetro());

        Cuadrado objCuadrado = new Cuadrado();
        objCuadrado.setAncho(3);
        objCuadrado.setLargo(8);
        System.out.println(objCuadrado.calcularPerimetro());
    }

    public static void testOverload(){
        Rectangulo objRectangulo = new Rectangulo();
        objRectangulo.imprimir();

        Cuadrado objCuadrado = new Cuadrado();
        objCuadrado.imprimir("cuadrado");
    }
}
