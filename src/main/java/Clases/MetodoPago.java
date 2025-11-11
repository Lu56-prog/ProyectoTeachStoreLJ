


package Clases;

import MeException.*;
        
public abstract class MetodoPago {
    protected double totalPagar;
    protected String metodoPago;
    protected String estadoPago;

    public MetodoPago(double totalPagar, String metodoPago, String estadoPago) {
        setTotalPagar(totalPagar);
        this.metodoPago = metodoPago;
        this.estadoPago = estadoPago;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        
        if (totalPagar < 10000){
            throw new PagoRechazadoException( "Pago recharzado, monto no permitido" );
        }
        
        this.totalPagar = totalPagar;
        
        
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String isEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }
    
    
}
