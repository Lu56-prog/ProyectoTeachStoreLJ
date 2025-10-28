
package Clases;

import java.time.LocalDate;

public class Cajero extends Empleado{
    private static int contador = 1;
    protected  int ventaDelDia;
    protected double totalVendidoDia;

    public Cajero(String nombre, int cedula, String telefono, String correo, String cargo, String profesion, double salario, LocalDate fechaIngreso, String jornadaLaboral, int ventaDelDia, double totalVendidoDia) {
        super(nombre, cedula, telefono, correo, cargo, profesion, salario, fechaIngreso, jornadaLaboral);
        setId();
        this.ventaDelDia = ventaDelDia;
        this.totalVendidoDia = totalVendidoDia;
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
    
    @Override
    public void setId(){
        String id = ("EM-CAJERO-00" + contador);
        contador = contador + 1;
        this.id = id;
    }
}
