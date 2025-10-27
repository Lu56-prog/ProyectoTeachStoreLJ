
package Clases;

import java.util.ArrayList;

public class OrdenCompra extends Venta{
    private  ArrayList<ProductoFisico> listaProductosFisicos;
    private  ArrayList<ServicioDigital> listaProductosDigitales;
    private  double subtotal;
    private  double descuentoPorLotes;
    private  double descuentoPorFidelidad;
    private  double descuentoPuntos;
    private  double iva;
    private double total;

    private static final double PORCENTAJE_IVA = 0.19;
    
    public OrdenCompra( String estado, ArrayList<ProductoFisico> listaProductosFisicos, ArrayList<ServicioDigital> listaProductosDigitales, double subtotal, double descuentoPorLotes, double descuentoPorFidelidad, double descuentoPuntos, double iva, double total) {
        super(estado);
        this.listaProductosFisicos = listaProductosFisicos;
        this.listaProductosDigitales = listaProductosDigitales;
        this.subtotal = subtotal;
        this.descuentoPorLotes = descuentoPorLotes;
        this.descuentoPorFidelidad = descuentoPorFidelidad;
        this.descuentoPuntos = descuentoPuntos;
        this.iva = iva;
        this.total = total; 
    }

    public ArrayList<ProductoFisico> getListaProductosFisicos() {
        return listaProductosFisicos;
    }

    public void setListaProductosFisicos(ArrayList<ProductoFisico> listaProductosFisicos) {
        this.listaProductosFisicos = listaProductosFisicos;
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

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuentoPorLotes() {
        return descuentoPorLotes;
    }

    public void setDescuentoPorLotes(double descuentoPorLotes) {
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

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
