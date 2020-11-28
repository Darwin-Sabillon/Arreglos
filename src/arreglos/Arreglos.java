package arreglos;

import java.util.Scanner;

public class Arreglos {
    
    private static final int TOTALP = 6;

    public static void main(String[] args) {
        
        int repetir = 1;
        Scanner r = new Scanner(System.in);
        String nombres[] = new String[TOTALP];
        int edad[] = new int[TOTALP];
        
        while(repetir != 2) {

            for (int i = 0; i < TOTALP; i++) {
                System.out.println("Ingrese nombre: ");
                nombres[i] = r.next();
                System.out.println("Ingrese edad: ");
                edad[i] = r.nextInt();
            }
            
            System.out.println("\n");
            
            for (int j = 0; j < TOTALP; j++) {
                System.out.println(nombres[j] + " con edad de: " + edad[j] + " anios");
            }
            
            System.out.println("\nRepetir ingresos de datos?");
            System.out.println("1 - Si");
            System.out.println("2 - No");
            repetir = r.nextInt();
            
        }
    }
}
