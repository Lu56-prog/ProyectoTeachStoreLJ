
package Clases;

import GUI.ProcesoCompra.RegistroCajeroFrame;
import java.util.*;

public class OrdenCompra {
    private String estado;
    private Empleado cajero;
    private Cliente cliente;
    private  HashMap<ProductoFisico, Integer> dicProductosFisicos;
    private  ArrayList<ServicioDigital> listaProductosDigitales;
    private  double subtotal;
    private  double descuentoPorLotes;
    private  double descuentoPorFidelidad;
    private  double descuentoPuntos;
    private  double iva;
    private double total;

    private static final double PORCENTAJE_IVA = 0.19;
    
    public OrdenCompra() {
        this.estado = "GENERANDO";
        dicProductosFisicos = new HashMap<>();
        listaProductosDigitales =  new ArrayList<>();
    }

    public HashMap<ProductoFisico, Integer> getDicProductosFisicos() {
        return dicProductosFisicos;
    }

    public void setDicProductosFisicos(HashMap<ProductoFisico, Integer> dicProductosFisicos) {
        this.dicProductosFisicos = dicProductosFisicos;
    }

    public ArrayList<ServicioDigital> getListaProductosDigitales() {
        return listaProductosDigitales;
    }

    public void setListaProductosDigitales(ArrayList<ServicioDigital> listaProductosDigitales) {
        this.listaProductosDigitales = listaProductosDigitales;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal() {
        double subtotal = 0;
        for(Map.Entry<ProductoFisico, Integer> par : this.dicProductosFisicos.entrySet()){
            double precio = par.getKey().getPrecio();
            double descuento =  precio * ((double)par.getKey().getDescuento()/100);
            double precioDescuento =  precio - descuento;
            int cantidad = par.getValue();
            subtotal = subtotal + (precioDescuento * cantidad);
        }
        this.subtotal = subtotal;
    }

    public double getDescuentoPorLotes() {
        return descuentoPorLotes;
    }

    public void setDescuentoPorLotes() {
        double descuentoPorLotes = 0;
        for(Map.Entry<ProductoFisico, Integer> par : this.dicProductosFisicos.entrySet()){
            double precio = par.getKey().getPrecio();
            double descuento =  precio * ((double)par.getKey().getDescuento()/100);
            int cantidad = par.getValue();
            descuentoPorLotes = descuentoPorLotes + (descuento * cantidad);
        }
        this.descuentoPorLotes = descuentoPorLotes;
    }

    public double getDescuentoPorFidelidad() {
        return descuentoPorFidelidad;
    }

    public void setDescuentoPorFidelidad(double descuentoPorFidelidad) {
        this.descuentoPorFidelidad = descuentoPorFidelidad;
    }

    public double getDescuentoPuntos() {
        return descuentoPuntos;
    }

    public void setDescuentoPuntos(double descuentoPuntos) {
        this.descuentoPuntos = descuentoPuntos;
    }

    public double getIva() {
        return iva;
    }

    public void setIva() {
        double iva = 0;
        for(Map.Entry<ProductoFisico, Integer> par : this.dicProductosFisicos.entrySet()){
            double precio = par.getKey().getPrecio();
            int cantidad = par.getValue();
            double impuestoU = precio * 0.19;
            double impuestoTotal = impuestoU * cantidad;
            iva = iva + impuestoTotal;
        }
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal() {
        double total = this.subtotal;
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
    
    
    
}
