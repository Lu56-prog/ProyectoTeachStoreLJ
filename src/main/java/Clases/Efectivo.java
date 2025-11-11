
package Clases;

import MeException.*;

public class Efectivo extends MetodoPago {
    protected double totalRecibido;
    protected double totalDevuelto;

    public Efectivo(double totalPagar, String metodoPago, String estadoPago) {
        super(totalPagar, metodoPago, estadoPago);
    }


    public double getTotalRecibido() {
        return totalRecibido;
    }

    public void setTotalRecibido(double totalRecibido) {
        
        if (totalRecibido < totalPagar){
            throw new PagoEfectivoRechazadoException ("Pago rechazado, Efectivo menor a total a pagar");
        }
        this.totalRecibido = totalRecibido;
    }

    public double getTotalDevuelto() {
        return totalDevuelto;
    }

    public void setTotalDevuelto(double totalDevuelto) {
        this.totalDevuelto = totalDevuelto;
    }
    
}
