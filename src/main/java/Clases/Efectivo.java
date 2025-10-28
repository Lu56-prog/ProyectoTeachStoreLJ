
package Clases;
import MeException.*;
public class Efectivo extends MetodoPago {
    protected double totalRecibido;
    protected double totalDevuelto;

    public Efectivo(double totalRecibido, double totalDevuelto, double totalPagar, String metodoPago, boolean estadoPago) {
        super(totalPagar, metodoPago, estadoPago);
        this.totalRecibido = totalRecibido;
        this.totalDevuelto = totalDevuelto;
    }


    public double getTotalRecibido() {
        return totalRecibido;
    }

    public void setTotalRecibido(double totalRecibido) {
        
        if (totalRecibido < totalPagar){
            throw new PagoEfectivoRechazadoException ("pago rechazado, Efectivo menor a total a pagar");
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
