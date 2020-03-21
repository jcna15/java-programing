package Clase6;

public interface Producto {
    double getPrecio();
    void setPrecio(double precio);

    String getNombre();
    void setNombre(String nombre);

    String getColor();
    void setColor(String color);

    default String obtenerCodigoBarra(){
        return "No tiene codigo de barras";
    }
}
