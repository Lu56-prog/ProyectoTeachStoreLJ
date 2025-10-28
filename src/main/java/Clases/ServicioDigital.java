

package Clases;

import MeException.*;
import java.time.Duration;

public class ServicioDigital extends Producto {
    private Duration duracionEstimada;  
    private String descripcion;         
    private Tecnico tecnicoResponsable;  
    // Constructor
    public ServicioDigital(String nombre, double precio, String categoria, Duration duracionEstimada, String descripcion,Tecnico tecnicoResponsable) throws CampoVacioException, TiempoNoPermitidoException{
        super(nombre, precio, categoria);
        setDuracionEstimada(duracionEstimada);
        setDescripcion(descripcion);
        setTecnicoResponsable(tecnicoResponsable);
    }

    
    public Duration getDuracionEstimada() {
        return duracionEstimada;
    }

    private void setDuracionEstimada(Duration duracionEstimada) {
        if(duracionEstimada.toMinutes() < 30){
            throw new TiempoNoPermitidoException("El tiempo minimo es de 30 minutos");
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
                "\nTécnico Responsable: " + this.tecnicoResponsable);
    }

    public void modificarServicio(String nombre, double precio, String categoria, Duration duracionEstimada, String descripcion, Tecnico tecnicoResponsable) {
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

}