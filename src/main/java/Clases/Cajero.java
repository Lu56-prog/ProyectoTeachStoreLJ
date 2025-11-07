
package Clases;

import java.time.LocalDate;

public class Cajero extends Empleado{
    protected  int ventaDelDia;
    protected double totalVendidoDia;

    public Cajero(String nombre, String cedula, String telefono, String correo, String cargo, String profesion, double salario, String jornadaLaboral) {
        super(nombre, cedula, telefono, correo, cargo, profesion, salario, jornadaLaboral);
    }

    public int getVentaDelDia() {
        return ventaDelDia;
    }

    public void setVentaDelDia(int ventaDelDia) {
        this.ventaDelDia = ventaDelDia;
    }

    public double getTotalVendidoDia() {
        return totalVendidoDia;
    }

    public void setTotalVendidoDia(double totalVendidoDia) {
        this.totalVendidoDia = totalVendidoDia;
    }
    
}
