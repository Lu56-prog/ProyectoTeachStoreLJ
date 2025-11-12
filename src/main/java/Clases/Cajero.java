
package Clases;

import java.util.ArrayList;
import java.util.List;

public class Cajero extends Empleado{
    protected  int ventaDelDia;
    protected double totalVendidoDia;
    private List<Factura> historialVentas;

    public Cajero(String nombre, String cedula, String telefono, String correo, String cargo, String profesion, double salario, String jornadaLaboral) {
        super(nombre, cedula, telefono, correo, cargo, profesion, salario, jornadaLaboral);
        this.historialVentas = new ArrayList<>();
    }

    public int getVentaDelDia() {
        return ventaDelDia;
    }

    public void setVentaDelDia() {
        this.ventaDelDia = this.historialVentas.size();
    }

    public double getTotalVendidoDia() {
        return totalVendidoDia;
    }

    public void setTotalVendidoDia() {
        double totalVendidoDia = 0;
        for(Factura factura: this.historialVentas){
            totalVendidoDia = totalVendidoDia + factura.getOrdenCompra().getTotal();
        }
        this.totalVendidoDia = totalVendidoDia;
    }

    public List<Factura> getHistorialVentas() {
        return historialVentas;
    }

    public void setHistorialVentas(List<Factura> historialVentas) {
        this.historialVentas = historialVentas;
    }


    
    
}
