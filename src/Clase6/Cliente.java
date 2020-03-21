package Clase6;

public class Cliente {
    public static void main(String[] args) {
        Producto libro = new Libro();
        libro.setPrecio(10.99);
        libro.setNombre("El Principito");
        libro.setColor("Azul");

        ((Libro) libro).setAutor("Jorge Ramirez");
        ((Libro) libro).setPaginas(345);
        ((Libro) libro).setIsbn("12345121122121221");
    }
}
