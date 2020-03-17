package clase5;

public class ProcesadorDeTexto {
    public static void main(String[] args) {
        //A mi me gusta la automatización de pruebas
        contarPalabras("A mi me gusta la automatización de pruebas");
    }

    private static void contarPalabras(String text) {
        char serialize[];
        String numPalabras[];
        numPalabras = text.split(" ");
        System.out.println("El número de palabras es: " + numPalabras.length);

        //serialize = text.toCharArray();
        for (String letter : numPalabras) {
            System.out.println(letter);
        }
    }
}
