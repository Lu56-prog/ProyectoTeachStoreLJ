
package Clases;

import java.time.LocalDate;

public class Tecnico extends Empleado{
    private int serviciosDelDia;
    private boolean disponibilidad;

    public Tecnico(String id, String nombre, int cedula, String telefono, String correo, String cargo, String profesion, double salario, LocalDate fechaIngreso, String jornadaLaboral, int serviciosDelDia, boolean disponibilidad) {
        super(id, nombre, cedula, telefono, correo, cargo, profesion, salario, fechaIngreso, jornadaLaboral);
        this.serviciosDelDia = serviciosDelDia;
        this.disponibilidad = disponibilidad;
    }

    public int getServiciosDelDia() {
        return serviciosDelDia;
    }

    public void setServiciosDelDia(int serviciosDelDia) {
        this.serviciosDelDia = serviciosDelDia;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
}
