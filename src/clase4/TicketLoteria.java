package clase4;

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
            ticketLoteria[i] = random.nextInt(MAXIMO_NUMERO_TICKET+1);
        }
        return ticketLoteria;
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
