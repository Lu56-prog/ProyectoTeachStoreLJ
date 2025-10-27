
package Clases;

public abstract class Usuario {
    String id;
    String nombre;
    int cedula;
    String telefono;
    String correo;

    public Usuario(String id, String nombre, int cedula, String telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
    }
}
