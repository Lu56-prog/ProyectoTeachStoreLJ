
package Clases;

import MeException.CampoVacioException;
import java.time.LocalTime;

public class ServicioDigital extends Producto{
    LocalTime minutos;
    String descripcion;
    Tecnico tecnicoResponsable;

    public ServicioDigital(String nombre, double precio, String categoria, LocalTime minutos, String descripcion, Tecnico tecnicoResponsable) throws CampoVacioException {
        super(nombre, precio, categoria);
        this.minutos = minutos;
        this.descripcion = descripcion;
        this.tecnicoResponsable = tecnicoResponsable;
    }
}
