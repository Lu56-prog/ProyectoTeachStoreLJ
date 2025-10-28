
package Clases;

import java.time.LocalDate;

public class Tecnico extends Empleado{
    private static int contador = 1;
    private int serviciosDelDia;
    private boolean disponibilidad;

    public Tecnico(String nombre, int cedula, String telefono, String correo, String cargo, String profesion, double salario, LocalDate fechaIngreso, String jornadaLaboral, int serviciosDelDia, boolean disponibilidad) {
        super(nombre, cedula, telefono, correo, cargo, profesion, salario, fechaIngreso, jornadaLaboral);
        setId();
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
    
    @Override
    public void setId(){
        String id = ("EM-TECNICO-00" + contador);
        contador = contador + 1;
        this.id = id;
    }
    
    
}
