/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ciclo fro
        int cantidad, suma = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Digite el # de impresiones que desea ver");
        cantidad = Integer.parseInt(teclado.nextLine());

        System.out.println(" \n");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(i);
        }
        System.out.print(" \n");
        System.out.println("Inverso");
        System.out.print(" \n");

        for (int i = cantidad - 1; i > -1; i--) {
            System.out.println(i);
        }
       
        
        //while
     
        while (suma <= cantidad)
        {
            System.out.print(suma);
            System.out.print(" - ");
            suma = suma + 1;
        }

        System.out.print("\n");
        suma = cantidad;
        while (suma > 0)
        {
            System.out.print(suma);
            System.out.print(" - ");
            suma = suma - 1;

        }
       
        
        //do while
       suma= 0;
         System.out.print(" \n ");
       do {
            System.out.println(suma);
            System.out.print(" - ");
            suma = suma + 1;

        } while (suma < cantidad);
        suma= cantidad;
        do {
            System.out.print(suma);
            System.out.print(" - ");
            suma = suma - 1;

        } while (suma > 0);
    
    
    }
}
