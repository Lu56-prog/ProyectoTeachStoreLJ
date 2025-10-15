
package Clases;

import java.time.LocalDate;

public class Inventario {
    ProductoFisico listaProductos;
    LocalDate fechaActualizacion;

    public Inventario(ProductoFisico listaProductos, LocalDate fechaActualizacion) {
        this.listaProductos = listaProductos;
        this.fechaActualizacion = LocalDate.now();
    }
}
