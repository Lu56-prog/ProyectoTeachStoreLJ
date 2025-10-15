
package Clases;

import java.time.LocalDate;

public class Tecnico extends Empleado{
    int serviciosDelDia;
    boolean disponibilidad;

    public Tecnico(int serviciosDelDia, boolean disponibilidad, String id, String nombre, int cedula, String telefono, String cargo, String profesion, double salario, LocalDate fechaIngreso, String jornadaLaboral) {
        super(id, nombre, cedula, telefono, cargo, profesion, salario, fechaIngreso, jornadaLaboral);
        this.serviciosDelDia = serviciosDelDia;
        this.disponibilidad = disponibilidad;
    }
    
    
}
