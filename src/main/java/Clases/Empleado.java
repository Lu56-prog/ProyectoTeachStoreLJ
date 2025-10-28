
package Clases;

import java.time.LocalDate;

public abstract class Empleado extends Usuario{
    protected String cargo;
    protected  String profesion;
    protected  double salario;
    protected  LocalDate fechaIngreso;
    protected  String jornadaLaboral;

    public Empleado( String nombre, int cedula, String telefono,String correo, String cargo, String profesion, double salario, LocalDate fechaIngreso, String jornadaLaboral) {
        super(nombre, cedula, telefono, correo);
        this.cargo = cargo;
        this.profesion = profesion;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
        this.jornadaLaboral = jornadaLaboral;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getJornadaLaboral() {
        return jornadaLaboral;
    }

    public void setJornadaLaboral(String jornadaLaboral) {
        this.jornadaLaboral = jornadaLaboral;
    }
    
    //Sobreescribimos el metodo toString() para los comoBox
    @Override
    public String toString(){
        return (this.getId() + " -> " + this.getNombre());
    }
    
    
}
