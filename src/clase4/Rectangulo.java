package clase4;

public class Rectangulo {
    private double largo;
    private double ancho;

    public Rectangulo() {
        this.largo = 0;
        this.ancho = 0;
    }

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularArea(double largo, double ancho){
        return (largo * ancho);
    }

    public double calcularArea(){
        return (getLargo() * getAncho());
    }

    public double calcularPerimetro(double largo, double ancho){
        return (largo + ancho) * 2;
    }

    public double calcularPerimetro(){
        return (getLargo() + getAncho()) * 2;
    }

}
