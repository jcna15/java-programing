package clase5;

public class RevertirString {
    public static void main(String[] args) {
        revertirString("quiero una manzana");
        agregarEspacios("Hola!EstamosAutomatizandoElMundo");
    }

    private static void agregarEspacios(String text) {
        StringBuilder textoModificado = new StringBuilder(text);
        for (int i = 0; i < textoModificado.length(); i++) {
            if (i!=0 && Character.isUpperCase(textoModificado.charAt(i))){
                textoModificado.insert(i," ");
                i++;
            }
        }
        System.out.println("");
        System.out.println(textoModificado);
    }

    private static void revertirString(String text) {
        for (int i = text.length(); i > 0; i--) {
            System.out.print(text.charAt(i-1));
        }
    }
}
