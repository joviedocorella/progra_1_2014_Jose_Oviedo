/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atributes;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Atributes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int opt;
        char continuar;
        boolean validar = true;
        double monto;

        //instancia
        Account Ac2 = new Account();
        Scanner teclado = new Scanner(System.in);
//ciclo while
        while (validar) {
            System.out.println("Digite 1 si quiere realizar un deposito y 2 si quiere realizar un retiro");
            opt = Integer.parseInt(teclado.nextLine());

            if (opt == 1) {
                System.out.println("Digite el monto a depositar");
                monto = Double.parseDouble(teclado.nextLine());
                Ac2.Deposito(monto);

            }




            if (opt == 2) {
                System.out.println("Digite el monto a retirar");
                monto = Double.parseDouble(teclado.nextLine());
               
                Ac2.Retiro(monto);
                if (Ac2.isHayError()) {
                    System.out.println("El monto que usted va a retirar no puede ser retirado");
                }

            }
            System.out.println("El saldo final es de:" + Ac2.getSaldoInicial());
            System.out.println(" ¿Desea continuar co otra transacción? S/N ");
            continuar = (teclado.nextLine()).charAt(0);
            if ((continuar == 'S') || (continuar == 's')) {
                validar = true;

            }
            if ((continuar == 'N') || (continuar == 'n')) {
            }
        }
    }
}
