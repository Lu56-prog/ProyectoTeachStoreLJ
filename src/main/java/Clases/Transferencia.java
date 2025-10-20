
package Clases;

public class Transferencia extends MetodoPago {
    protected int numeroReferencia;
    protected  boolean confirmacion;

    public Transferencia(int numeroReferencia, boolean confirmacion, double totalPagar, String metodoPago, boolean estadoPago) {
        super(totalPagar, metodoPago, estadoPago);
        this.numeroReferencia = numeroReferencia;
        this.confirmacion = confirmacion;
    }

    
    public int getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(int numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }

    public boolean isConfirmacion() {
        return confirmacion;
    }

    public void setConfirmacion(boolean confirmacion) {
        this.confirmacion = confirmacion;
    }
    
    
}
