
package Clases;

import java.time.*;



//Falta heredar de orden de compra
public class Factura {
    private static int cont = 1;
    private  String idFactura;
    private  LocalDateTime horaRegistro;
    private String cliente;
    private  String cajeroVenta;
    private OrdenCompra ordenCompra;
    private  MetodoPago metodoPago;

    public Factura(String cliente, String cajeroVenta, OrdenCompra ordenCompra, MetodoPago metodoPago) {
        setIdFactura();
        setHoraRegistro();
        this.cliente = cliente;
        this.cajeroVenta = cajeroVenta;
        this.ordenCompra = ordenCompra;
        this.metodoPago = metodoPago;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura() {
        idFactura = "FACTURA - 00" + cont;
        cont = cont + 1;
        this.idFactura = idFactura;
    }

    public LocalDateTime getHoraRegistro() {
        return horaRegistro;
    }

    public void setHoraRegistro() {
        this.horaRegistro = LocalDateTime.now();
    }

    public String getCajeroVenta() {
        return cajeroVenta;
    }

    public void setCajeroVenta(String cajeroVenta) {
        this.cajeroVenta = cajeroVenta;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public OrdenCompra getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(OrdenCompra ordenCompra) {
        this.ordenCompra = ordenCompra;
    }
    
    
    
    
}
