package clase5;

public class Persona {
    private String nombre;
    private int edad;
    private String genero;

//    public Persona(String nombre) {
//        System.out.println("Se está estableciendo el nombre en el constructor de la clase PERSONA");
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
