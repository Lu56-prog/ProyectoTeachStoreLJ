
package Clases;

import MeException.TarjetaRechazadaException;


public class TarjetaDebito extends MetodoPago {
    protected long numero;

    public TarjetaDebito(long numero, double totalPagar, String metodoPago, String estadoPago) {
        super(totalPagar, metodoPago, estadoPago);
        setNumero(numero);
    }



    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        if(String.valueOf(numero).length() != 16){
            throw new TarjetaRechazadaException("La tarjeta no cumple con el número de caracteres");
        }  
        this.numero = numero;
    }
    
    
}
