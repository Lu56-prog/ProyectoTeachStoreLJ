
package Clases;

import java.time.*;



//Falta heredar de orden de compra
public class Factura {
    private static int cont = 1;
    private  String idFactura;
    private OrdenCompra ordenCompra;
    private  MetodoPago metodoPago;

    public Factura(OrdenCompra ordenCompra, MetodoPago metodoPago) {
        setIdFactura();
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


    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    

    public OrdenCompra getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(OrdenCompra ordenCompra) {
        this.ordenCompra = ordenCompra;
    }
    
    public String listaCSVFactura(){
        return this.ordenCompra.listaCSVOrdenCompra() + "," + this.metodoPago.listaCSVMetodoPago() + "," + this.idFactura;
    }
    
    
}
