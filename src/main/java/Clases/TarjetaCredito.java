
package Clases;

public class TarjetaCredito extends MetodoPago {
    protected int numero;
    protected double cuotas;
    protected double totalRecargo;

    public TarjetaCredito(int numero, double cuotas, double totalPagar, String metodoPago, boolean estadoPago) {
        super(totalPagar, metodoPago, estadoPago);
        this.numero = numero;
        this.cuotas = cuotas;
        setTotalRecargo();
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

    public void setTotalRecargo() {
        
        totalRecargo = totalPagar * Math.pow((1 + 0.05), cuotas);
        
        this.totalRecargo = totalRecargo;
    }
    
}
