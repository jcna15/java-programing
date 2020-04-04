package Clase6;

import java.util.HashMap;
import java.util.Map;

public class ResultadoPrueba {
    public static Map getCalificacionesOriginales(){
        Map<String, Integer> grades = new HashMap();
        grades.put("Ramiro", 24);
        grades.put("Jordan", 32);
        grades.put("Julio", 80);
        grades.put("Frank", 50);
        grades.put("ALex", 79);
        grades.put("Nelson", 40);
        grades.put("Jhampier", 59);
        grades.put("Michael", 55);
        grades.put("Sonia", 95);
        grades.put("Karina", 63);
        grades.put("Christian", 32);

        return grades;
    }

    public static Map getCalificacionesRecuperacion(){
        Map<String, Integer> grades = new HashMap();
        grades.put("Ramiro", 97);
        grades.put("Jordan", 82);
        grades.put("Julio", 76);
        grades.put("Frank", 89);
        grades.put("ALex", 79);
        grades.put("Nelson", 98);
        grades.put("Jhampier", 80);
        grades.put("Michael", 95);
        grades.put("Sonia", 90);
        grades.put("Karina", 62);
        grades.put("Christian", 79);

        return grades;
    }
}
