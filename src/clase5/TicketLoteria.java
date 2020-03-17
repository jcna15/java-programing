package clase5;

import java.util.Arrays;
import java.util.Random;

public class TicketLoteria {
    private static final int LONGITUD = 6;
    private static final int MAXIMO_NUMERO_TICKET = 69;

    public static void main(String[] args) {
        imprimirTickets(generarNumeros());
    }

    public static int[] generarNumeros(){
        int[] ticketLoteria = new int[6];
        Random random = new Random();
        for(int i = 0; i < LONGITUD; i++){
            int numeroRamdom;
            do{
                numeroRamdom = random.nextInt(MAXIMO_NUMERO_TICKET+1);
            //}while(buscar(ticketLoteria, numeroRamdom));
            }while(busquedaBinaria(ticketLoteria, numeroRamdom));
            ticketLoteria[i] = numeroRamdom;
        }
        Arrays.sort(ticketLoteria);
        return ticketLoteria;
    }
    public static boolean busquedaBinaria(int[] ticketLoteria, int numeroRamdom) {
        //El Array debe de estar ordenado
        Arrays.sort(ticketLoteria);
        int index = Arrays.binarySearch(ticketLoteria,numeroRamdom);
        if(index==-1){
            return false;
        }
        return true;
    }

    public static boolean buscar(int[] ticketLoteria, int numeroRamdom) {
        for (int valor : ticketLoteria) {
            if(valor == numeroRamdom){
                return true;
            }
        }
        return false;
    }

    public static void imprimirTickets(int ticket[]){
        System.out.println("Su ticket generado es el siguiente: ");
        for(int i = 0; i < LONGITUD; i++){
            System.out.print("|"+ticket[i]+"");
            if(i==(LONGITUD-1)){
                System.out.println("|");
            }
        }
    }
}
