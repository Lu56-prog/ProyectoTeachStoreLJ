
package Clases;

import java.time.LocalDate;

public class Tecnico extends Empleado{
    private static int contador = 1;
    private int serviciosDelDia;
    private boolean disponibilidad;

    public Tecnico(String nombre, String cedula, String telefono, String correo, String cargo, String profesion, double salario, String jornadaLaboral) {
        super(nombre, cedula, telefono, correo, cargo, profesion, salario, jornadaLaboral);
        setId();
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
