
package Clases;

import java.time.LocalDate;

public class Cajero extends Empleado{
    int ventaDelDia;
    double totalVendidoDia;

    public Cajero(String id, String nombre, int cedula, String telefono, String correo, String cargo, String profesion, double salario, LocalDate fechaIngreso, String jornadaLaboral, int ventaDelDia, double totalVendidoDia) {
        super(id, nombre, cedula, telefono, correo, cargo, profesion, salario, fechaIngreso, jornadaLaboral);
        this.ventaDelDia = ventaDelDia;
        this.totalVendidoDia = totalVendidoDia;
    }
    
    
}
