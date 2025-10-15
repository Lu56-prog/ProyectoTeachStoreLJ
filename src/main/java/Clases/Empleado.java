
package Clases;

import java.time.LocalDate;

public class Empleado extends Usuario{
    String cargo;
    String profesion;
    double salario;
    LocalDate fechaIngreso;
    String jornadaLaboral;

    public Empleado(String id, String nombre, int cedula, String telefono,String cargo, String profesion, double salario, LocalDate fechaIngreso, String jornadaLaboral) {
        super(id, nombre, cedula, telefono);
        this.cargo = cargo;
        this.profesion = profesion;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
        this.jornadaLaboral = jornadaLaboral;
    }
}
