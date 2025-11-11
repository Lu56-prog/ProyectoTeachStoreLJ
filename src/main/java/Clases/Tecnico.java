
package Clases;

import java.time.LocalDate;

public class Tecnico extends Empleado{
    private int serviciosDelDia;
    private String disponibilidad;

    public Tecnico(String nombre, String cedula, String telefono, String correo, String cargo, String profesion, double salario, String jornadaLaboral) {
        super(nombre, cedula, telefono, correo, cargo, profesion, salario, jornadaLaboral);
        setDisponibilidad(disponibilidad);
    }

    public int getServiciosDelDia() {
        return serviciosDelDia;
    }

    public void setServiciosDelDia(int serviciosDelDia) {
        this.serviciosDelDia = serviciosDelDia;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = "Disponible";
    }
    

    
    
}
