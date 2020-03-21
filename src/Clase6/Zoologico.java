package Clase6;

public class Zoologico {
    public static void main(String[] args) {
        Perro rocky = new Perro();
        rocky.buscar();
        rocky.hacerSonido();
        alimentar(rocky);

        Animal princesa = new Perro();
        princesa.hacerSonido();
        alimentar(princesa);

        princesa = new Gato();
        princesa.hacerSonido();
        ((Gato)princesa).rasguñar();
        alimentar(princesa);

        Gato michi = new Gato();
        michi.hacerSonido();
        michi.rasguñar();
    }

    public static void alimentar(Animal obj){
        if(obj instanceof Perro){
            System.out.println("Aqui está tu Ricocan...!!");
        }else if (obj instanceof Gato){
            System.out.println("Aqui está tu comida gato...!!");
        }

    }
}
