package Clase6;

import java.util.*;

public class Colecciones {
    public static void main(String[] args) {
        //Set frutas = new HashSet();
        Set frutas = new LinkedHashSet();
        frutas.add("Manzana");
        frutas.add("Limon");
        frutas.add("Platano");
        frutas.add("Naranja");
        frutas.add("Limon");

        System.out.println(frutas.size());
        System.out.println(frutas);
        System.out.println("");

        List frutas2 = new ArrayList();
        frutas2.add("Manzana");
        frutas2.add("Limon");
        frutas2.add("Platano");
        frutas2.add("Naranja");
        frutas2.add("Limon");

        System.out.println(frutas2.size());
        System.out.println(frutas2);
        System.out.println(frutas2.get(2));
        System.out.println();

        Queue frutas3 = new LinkedList();
        frutas3.add("Manzana");
        frutas3.add("Limon");
        frutas3.add("Platano");
        frutas3.add("Naranja");
        frutas3.add("Limon");

        System.out.println(frutas3.size());
        System.out.println(frutas3);
        frutas3.remove();
        System.out.println(frutas3);
        System.out.println(frutas3.peek());
        System.out.println();

        Map frutaCalorias = new HashMap();
        frutaCalorias.put("Manzana",95);
        frutaCalorias.put("Limon",20);
        frutaCalorias.put("Platano",105);
        frutaCalorias.put("Naranja",45);
        frutaCalorias.put("Limon",17);

        System.out.println(frutaCalorias.size());
        System.out.println(frutaCalorias);
        System.out.println(frutaCalorias.get("Limon"));
        System.out.println(frutaCalorias.entrySet());


    }

}
