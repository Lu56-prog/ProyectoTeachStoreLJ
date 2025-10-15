
package Clases;

public abstract class Usuario {
    String id;
    String nombre;
    int cedula;
    String telefono;

    public Usuario(String id, String nombre, int cedula, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }
}
