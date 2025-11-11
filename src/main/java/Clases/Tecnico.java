
package Clases;


import java.time.*;
import java.util.*;
import javax.swing.*;


public class Tecnico extends Empleado{
    private int serviciosDelDia;
    private String disponibilidad;

    public Tecnico(String nombre, String cedula, String telefono, String correo, String cargo, String profesion, double salario, String jornadaLaboral) {
        super(nombre, cedula, telefono, correo, cargo, profesion, salario, jornadaLaboral);
        setDisponibilidad("disponible");
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

    private void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    public void agendarServicio(LocalDateTime horaFin){
        //El tecnico por el tiempo del servicio esta en estado de no disponible
        setDisponibilidad("no disponible");
        LocalDateTime horaActual = LocalDateTime.now();
        
        if (horaActual.isAfter(horaFin)) {
            setDisponibilidad("disponible");
        } 
        
    }
    

    
    
}
