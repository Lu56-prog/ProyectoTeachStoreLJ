
package Clases;

public class TarjetaCredito extends MetodoPago {
    protected int numero;
    protected double cuotas;
    protected double totalRecargo;

    public TarjetaCredito(int numero, double cuotas, double totalRecargo, double totalPagar, String metodoPago, boolean estadoPago) {
        super(totalPagar, metodoPago, estadoPago);
        this.numero = numero;
        this.cuotas = cuotas;
        this.totalRecargo = totalRecargo;
    }

   

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getCuotas() {
        return cuotas;
    }

    public void setCuotas(double cuotas) {
        this.cuotas = cuotas;
    }

    public double getTotalRecargo() {
        return totalRecargo;
    }

    public void setTotalRecargo(double totalRecargo) {
        this.totalRecargo = totalRecargo;
    }
    
}
