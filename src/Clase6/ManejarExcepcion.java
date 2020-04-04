package Clase6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ManejarExcepcion {
    public static void main(String[] args) {
        //crearNuevoArchivo();
        try {
            crearNuevoArchivoReintentar();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void crearNuevoArchivo() {
        File file = new File("Resources/noesiste");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("El directorio no existe...!!");
            e.printStackTrace();
        }
    }

    public static void numerosManejarExcepciones(){
        File file = new File("Resources/numeros.txt");
        try {
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void crearNuevoArchivoReintentar() throws IOException {
        File file = new File("nuevoarchivo");
        file.createNewFile();
    }
}
