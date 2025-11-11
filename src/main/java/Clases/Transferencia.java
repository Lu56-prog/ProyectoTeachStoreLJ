
package Clases;
import MeException.*;

public class Transferencia extends MetodoPago {
    protected long numeroReferencia;

    public Transferencia(long numeroReferencia, double totalPagar, String metodoPago, String estadoPago) {
        super(totalPagar, metodoPago, estadoPago);
        setNumeroReferencia(numeroReferencia);
    }

    
    public long getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(long numeroReferencia) {
        if(String.valueOf(numeroReferencia).length() != 12){
            throw new TransferenciaRechazadaException("La transferencia no cumple con el número de caracteres");
        }  
        this.numeroReferencia = numeroReferencia;
    }


    
}
