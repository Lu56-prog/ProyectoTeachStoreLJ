
package Clases;

import java.time.LocalDate;
import java.util.*;

public class Inventario {
    public List<ProductoFisico> listaProductos;
    public List<ServicioDigital> listaSDigitales;
    public LocalDate fechaActualizacion;

    public Inventario() {
        this.listaProductos = new ArrayList<>();
        this.listaSDigitales = new ArrayList<>();
        this.fechaActualizacion = LocalDate.now();
    }
}
