

package Clases;

import MeException.*;
import java.time.LocalTime;

public class ServicioDigital extends Producto {
    private LocalTime duracionEstimada;  
    private String descripcion;         
    private Tecnico tecnicoResponsable;  
    // Constructor
    public ServicioDigital(String nombre, double precio, String categoria,
        LocalTime duracionEstimada, String descripcion,
        Tecnico tecnicoResponsable) throws CampoVacioException {
        super(nombre, precio, categoria);
        setDuracionEstimada(duracionEstimada);
        setDescripcion(descripcion);
        setTecnicoResponsable(tecnicoResponsable);
    }

    

    public LocalTime getDuracionEstimada() {
        return duracionEstimada;
    }

    private void setDuracionEstimada(LocalTime duracionEstimada) {
        if (duracionEstimada == null) {
            throw new CampoVacioException("La duración estimada no puede ser nula.");
        }
        this.duracionEstimada = duracionEstimada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    private void setDescripcion(String descripcion) {
        if (descripcion == null || descripcion.trim().isEmpty()) {
            throw new CampoVacioException("La descripción del servicio no puede estar vacía.");
        }
        this.descripcion = descripcion;
    }

    public Tecnico getTecnicoResponsable() {
        return tecnicoResponsable;
    }

    private void setTecnicoResponsable(Tecnico tecnicoResponsable) {
        if (tecnicoResponsable == null) {
            throw new CampoVacioException("Debe asignarse un técnico responsable al servicio.");
        }
        this.tecnicoResponsable = tecnicoResponsable;
    }

 

    public void mostrarInfo() {
        System.out.println("""
                           
                           === Servicio Digital ===
                           Nombre: """ + this.nombre +
                "\nPrecio: $" + this.precio +
                "\nCategoría: " + this.categoria +
                "\nDuración Estimada: " + this.duracionEstimada +
                "\nDescripción: " + this.descripcion +
                "\nTécnico Responsable: " + this.tecnicoResponsable.getNombre());
    }

    public void modificarServicio(String nombre, double precio, String categoria,
                                  LocalTime duracionEstimada, String descripcion,
                                  Tecnico tecnicoResponsable) {
        setNombre(nombre);
        setPrecio(precio);
        setCategoria(categoria);
        setDuracionEstimada(duracionEstimada);
        setDescripcion(descripcion);
        setTecnicoResponsable(tecnicoResponsable);
    }

    @Override
    public String toString() {
        return "Servicio: " + this.nombre + " (" + this.duracionEstimada + ")";
}