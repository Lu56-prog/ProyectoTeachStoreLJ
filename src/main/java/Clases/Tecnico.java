
package Clases;

import java.time.LocalDate;

public class Tecnico extends Empleado{
    int serviciosDelDia;
    boolean disponibilidad;

    public Tecnico(String id, String nombre, int cedula, String telefono, String correo, String cargo, String profesion, double salario, LocalDate fechaIngreso, String jornadaLaboral, int serviciosDelDia, boolean disponibilidad) {
        super(id, nombre, cedula, telefono, correo, cargo, profesion, salario, fechaIngreso, jornadaLaboral);
        this.serviciosDelDia = serviciosDelDia;
        this.disponibilidad = disponibilidad;
    }
    
    
}
