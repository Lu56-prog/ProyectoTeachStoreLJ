
package Clases;
public class MetodoPago {
    private double totalPagar;
    private  String metodoPago;
    private  boolean estadoPago;

    public MetodoPago(double totalPagar, String metodoPago, boolean estadoPago) {
        this.totalPagar = totalPagar;
        this.metodoPago = metodoPago;
        this.estadoPago = estadoPago;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public boolean isEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(boolean estadoPago) {
        this.estadoPago = estadoPago;
    }
    
    
}
