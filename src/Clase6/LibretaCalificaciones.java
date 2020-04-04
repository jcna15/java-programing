package Clase6;

import java.util.Map;

public class LibretaCalificaciones {
    public static void main(String[] args) {
        Map<String,Integer> libretaCalificaciones = ResultadoPrueba.getCalificacionesOriginales();
        Map<String,Integer> calificacionesRecuperacion = ResultadoPrueba.getCalificacionesRecuperacion();

        for(Map.Entry<String,Integer> estudiante : calificacionesRecuperacion.entrySet()){
            Integer primeraCalificacion = libretaCalificaciones.get(estudiante.getKey());
            Integer segundaCalificacion = calificacionesRecuperacion.get(estudiante.getKey());

            if(segundaCalificacion>primeraCalificacion){
                libretaCalificaciones.put(estudiante.getKey(),segundaCalificacion);
            }

        }
        System.out.println("Calificaciones Finales");
        libretaCalificaciones.forEach(
                (k,v) -> System.out.println("Estudiante "+k+" calificaciones: "+ v)
        );

    }
}
