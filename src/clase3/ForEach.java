package clase3;

public class ForEach {
    public static void main(String arg[]) {
        String[] nombres = new String[3];
        nombres[0] = "José";
        nombres[1] = "Aitana";
        nombres[2] = "Massiel";
        for(String nombre: nombres){
            System.out.println(nombre + ", ");
        }

        String[] nombres2 = new String[]{"nombre 1","nombre 2","nombre 3"};
        for(String nombre: nombres2){
            System.out.println(nombre + ", ");
        }

        int[] valores = new int[3];
        valores[0] = 10;
        valores[1] = new Integer(5);
        valores[2] = 15;
        for(int i = 1; i<valores.length;i++){
            System.out.println((valores[i] - valores[i-1]) + ", ");
        }
    }
}
