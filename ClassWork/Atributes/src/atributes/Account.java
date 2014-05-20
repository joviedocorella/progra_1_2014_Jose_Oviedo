/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atributes;

/**
 *
 * @author jose
 */
public class Account {
    

    private double saldoInicial;
    private boolean hayError;

    //metodo constructor
    public Account() {
        saldoInicial = 0;
        hayError = false;
    }
// metodo para recibir el nuevo monto (Deposito)

    public void Deposito(double monto) {
        setSaldoInicial(getSaldoInicial() + monto);
    }
//metodo para hacer un retiro

    public void Retiro(double monto) {
        if (getSaldoInicial() >= monto) {
            setSaldoInicial(getSaldoInicial() - monto);
        }
        else {
            hayError=true;
        }
    }

    /**
     * @return the saldoInicial
     */
    public double getSaldoInicial() {
        return saldoInicial;
    }

    /**
     * @param saldoInicial the saldoInicial to set
     */
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    /**
     * @return the hayError
     */
    public boolean isHayError() {
        return hayError;
    }

    /**
     * @param hayError the hayError to set
     */
    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }
}
