
package Clases;


public class TarjetaDebito extends MetodoPago {
    protected int numero;

    public TarjetaDebito(int numero, double totalPagar, String metodoPago, boolean estadoPago) {
        super(totalPagar, metodoPago, estadoPago);
        this.numero = numero;
    }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
