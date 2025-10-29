
package Clases;

import java.time.LocalDate;
import MeException.*;

public abstract class Empleado extends Usuario{
    private static int contador = 1;
    protected String cargo;
    protected  String profesion;
    protected  double salario;
    protected  LocalDate fechaIngreso;
    protected  String jornadaLaboral;

    public Empleado( String nombre, String cedula, String telefono,String correo, String cargo, String profesion, double salario, String jornadaLaboral) {
        super(nombre, cedula, telefono, correo);
        setId();
        this.cargo = cargo;
        setProfesion(profesion);
        setSalario(salario);
        setFechaIngreso();
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

    private  void setProfesion(String profesion) {
        if(profesion.trim().isEmpty()){
            throw new CampoVacioException("Profesion no puede ser un campo vacio");
        }
        this.profesion = profesion;
    }

    public double getSalario() {
        return salario;
    }

    private  void setSalario(double salario) {
        double sMin = 1623500;
        if(salario < (sMin/2)){
            throw new SalarioNoValidoException("El salario fue rechazado, es minimo a lo aceptado");
        }
        this.salario = salario;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    private  void setFechaIngreso() {
        this.fechaIngreso = LocalDate.now();
    }

    public String getJornadaLaboral() {
        return jornadaLaboral;
    }

    public void setJornadaLaboral(String jornadaLaboral) {
        this.jornadaLaboral = jornadaLaboral;
    }
    
    public void modificarEmpleado(String nombre, String cedula, String telefono, String correo, String cargo, String profesion, double salario, String jornadaLaboral){
        modificarUsuario(nombre, cedula, telefono, correo);
        setCargo(cargo);
        setProfesion(profesion);
        setSalario(salario);
        setJornadaLaboral(jornadaLaboral);
    }
    
    //Sobreescribimos el metodo toString() para los comoBox
    @Override
    public String toString(){
        return (this.getId() + " -> " + this.getNombre());
    }
    
    @Override
    protected void setId(){
        String id = ("EMP-00" + contador);
        contador = contador + 1;
        this.id = id;
    } 
}
