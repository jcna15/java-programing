package Clase6;

public class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("!miau miau...");
    }

    public void rasguñar(){
        System.out.println("Yo soy un gato, y voy arañando cosas");
    }
}
