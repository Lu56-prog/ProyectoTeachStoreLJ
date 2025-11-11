
package Clases;

import java.util.ArrayList;
import java.util.Date;

//Falta heredar de orden de compra
public class Factura {
    private  String idFactura;
    private  String codigoLicencia;
    private  Date fechaRegistro;
    private  Date horaRegistro;
    private  String cajeroVenta;
    private OrdenCompra ordenCompra;
    private  MetodoPago metodoPago;



    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public String getCodigoLicencia() {
        return codigoLicencia;
    }

    public void setCodigoLicencia(String codigoLicencia) {
        this.codigoLicencia = codigoLicencia;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getHoraRegistro() {
        return horaRegistro;
    }

    public void setHoraRegistro(Date horaRegistro) {
        this.horaRegistro = horaRegistro;
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
    
    
}
