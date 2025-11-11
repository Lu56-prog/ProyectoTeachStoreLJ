
package Clases;

import MeException.*;

public class TarjetaCredito extends MetodoPago {
    protected long numero;
    protected int cuotas;
    protected double totalRecargo;

    public TarjetaCredito(long numero, int cuotas, double totalPagar, String metodoPago, String estadoPago) {
        super(totalPagar, metodoPago, estadoPago);
        setNumero(numero);
        this.cuotas = cuotas;
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

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public double getTotalRecargo() {
        
        
        
        return totalRecargo;
    }

    public void setTotalRecargo() {
        System.out.println(this.totalPagar);
        System.out.println(this.cuotas);
        totalRecargo = this.totalPagar * Math.pow((1 + 0.05), this.cuotas);
        
        this.totalRecargo = totalRecargo;
    }
    
}
