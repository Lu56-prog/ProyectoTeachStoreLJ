
package Clases;

import GUI.ProcesoCompra.RegistroCajeroFrame;
import java.time.*;
import java.util.*;

public class OrdenCompra {
    private String estado;
    private Empleado cajero;
    private Cliente cliente;
    private  HashMap<ProductoFisico, Integer> dicProductosFisicos;
    private  HashMap<ServicioDigital, LocalDateTime> dicServiciosDigitales;
    private  double subtotal;
    private  double descuentoPorLotes;
    private  double descuentoPorFidelidad;
    private  double descuentoPuntos;
    private  double descuentoTotal;
    private  double iva;
    private double total;

    private static final double PORCENTAJE_IVA = 0.19;
    
    public OrdenCompra() {
        this.estado = "GENERANDO";
        dicProductosFisicos = new HashMap<>();
        dicServiciosDigitales =  new HashMap<>();
    }

    public HashMap<ProductoFisico, Integer> getDicProductosFisicos() {
        return dicProductosFisicos;
    }

    public void setDicProductosFisicos(HashMap<ProductoFisico, Integer> dicProductosFisicos) {
        this.dicProductosFisicos = dicProductosFisicos;
    }

    public HashMap<ServicioDigital, LocalDateTime> getDicServiciosDigitales() {
        return this.dicServiciosDigitales;
    }

     public void setDicServiciosDigitales(HashMap<ServicioDigital, LocalDateTime> dicServiciosDigitales) {
        this.dicServiciosDigitales = dicServiciosDigitales;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal() {
        double subtotal = 0;
        //Se debe sumar productos fisicos
        for(Map.Entry<ProductoFisico, Integer> par : this.dicProductosFisicos.entrySet()){
            double precio = par.getKey().getPrecio();
            int cantidad = par.getValue();
            double precioSinIva = precio / 1.19;
            subtotal = subtotal + ((precioSinIva) * cantidad);
        }
        //Y servicios digitales
        for(Map.Entry<ServicioDigital, LocalDateTime> par : this.dicServiciosDigitales.entrySet()){
            ServicioDigital servicio = par.getKey();
            double precio = servicio.getPrecio();
            subtotal = subtotal + (precio / 1.19);
        }
        this.subtotal = subtotal;
    }

    public double getDescuentoPorLotes() {
        return descuentoPorLotes;
    }

    public void setDescuentoPorLotes() {
        double descuentoPorLotes = 0;
        //Solo el producto fisico es validado para descuento
        for(Map.Entry<ProductoFisico, Integer> par : this.dicProductosFisicos.entrySet()){
            double precio = par.getKey().getPrecio();
            double precioSinIva = precio/1.19; 
            double descuento =  precioSinIva * ((double)par.getKey().getDescuento()/100);
            int cantidad = par.getValue();
            descuentoPorLotes = descuentoPorLotes + (descuento * cantidad);
        }
        this.descuentoPorLotes = descuentoPorLotes;
    }

    public double getDescuentoPorFidelidad() {
        return descuentoPorFidelidad;
    }

    public void setDescuentoPorFidelidad() {
       double descuentoPorFidelidad = 0;
        if(this.cliente != null){
            int comprasAcomuladas = this.cliente.getComprasAcumuladas();
            double descuento = 0;
            if(comprasAcomuladas >= 3 && comprasAcomuladas <= 5){
               descuento = 5;
            } else if (comprasAcomuladas >= 6){
                descuento = 10;
            }
            descuentoPorFidelidad = this.subtotal * (descuento/100);
        }
        this.descuentoPorFidelidad = descuentoPorFidelidad;
    }

    public double getDescuentoPuntos() {
        return descuentoPuntos;
    }

    public void setDescuentoPuntos() {
        double descuentoPuntos = 0;
        if(this.cliente != null){
            int puntosCliente =  this.cliente.getPuntosAcumulados();
            double puntosParaCompra = puntosCliente / 10;
            descuentoPuntos = 100000 * puntosParaCompra;
            int puntosTotal = puntosCliente - (int)(puntosParaCompra * 10);
            this.cliente.setPuntosAcumulados();
        } 
        this.descuentoPuntos = descuentoPuntos;
    }

    public double getIva() {
        return iva;
    }

    public void setIva() {
        double iva = 0;
        //Se saca el iva a cada producto fisico
        for(Map.Entry<ProductoFisico, Integer> par : this.dicProductosFisicos.entrySet()){
            double precio = par.getKey().getPrecio();
            int cantidad = par.getValue();
            double impuestoU = (precio/1.19)*0.19;
            double impuestoTotal = impuestoU * cantidad;
            iva = iva + impuestoTotal;
        }
        //Y a cada servicio digital
        for(Map.Entry<ServicioDigital, LocalDateTime> par : this.dicServiciosDigitales.entrySet()){
            ServicioDigital servicio = par.getKey();
            double precio = servicio.getPrecio();
            double impuesto = (precio/1.19) * 0.19;
            iva = iva + impuesto;
        }
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal() {
        double total = (this.subtotal + this.iva) - descuentoTotal;
        this.total = total;
    }

    public Empleado getCajero() {
        return cajero;
    }

    public void setCajero(Empleado cajero) {
        this.cajero = cajero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getDescuentoTotal() {
        return descuentoTotal;
    }

    public void setDescuentoTotal() {
        this.descuentoTotal = descuentoPorFidelidad + descuentoPuntos + descuentoPorLotes;
    }
    
    
    
}
