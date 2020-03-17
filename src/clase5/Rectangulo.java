package clase5;

public class Rectangulo {
    protected double largo;
    protected double ancho;
    protected double lados = 4;

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

    public double getLados() {
        return lados;
    }

    public void setLados(double lados) {
        this.lados = lados;
    }

    public void imprimir(){
        System.out.println("Yo soy un rectangulo");
    }
}
