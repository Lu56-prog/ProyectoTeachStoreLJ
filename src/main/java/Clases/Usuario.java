
package Clases;

import MeException.*;

public abstract class Usuario {
    protected  String id;
    protected  String nombre;
    protected  String cedula;
    protected  String telefono;
    protected String correo;

    public Usuario(String nombre, String cedula, String telefono, String correo) {
        setNombre(nombre);
        setCedula(cedula);
        setTelefono(telefono);
        setCorreo(correo);
    }

    public String getId() {
        return id;
    }

    protected abstract void setId();

    public String getNombre() {
        return nombre;
    }

    private  void setNombre(String nombre) {
        if(nombre.trim().isEmpty()){
            throw new CampoVacioException("El nombre no puede ser un campo vacio");
        }
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    private  void setCedula(String cedula) {
        if(cedula.trim().length() > 10){
            throw new IdentificacionNoValidaException("Su identificación a sido rechazada, número de caracteres permitido 10 o 8");
        }
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    private  void setTelefono(String telefono) {
        if(telefono.trim().length() != 10){
            throw new TelefonoNoValidoException("Telefono rechazado, número de caracteres permitidos 10");
        }
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    private void setCorreo(String correo) {
        if (correo.toLowerCase().contains("@") == false){
            throw new CorreoNoValidoException("Correo rechazado, recuerda el '@'");
        } 
        this.correo = correo;
    }
    
    public void modificarUsuario(String nombre, String cedula, String telefono, String correo){
        setNombre(nombre);
        setCedula(cedula);
        setTelefono(telefono);
        setCorreo(correo);
    }
    
    @Override
    public String toString(){
        return this.id + " -> " + this.nombre;
    }
}
