
package Clases;

import MeException.CampoVacioException;

public class ProductoFisico  extends Producto{
    private String marca;
    private int stock;
    private String codigoBarras;
    private String ubicacion;
    private int descuento;
// nombre de la fruta 
    public ProductoFisico(String nombre, double precio, String categoria, String marca, int stock, String codigoBarras, String ubicacion, int descuento) throws CampoVacioException {
        super(nombre, precio, categoria);
        this.marca = marca;
        this.stock = stock;
        this.codigoBarras = codigoBarras;
        this.ubicacion = ubicacion;
        this.descuento = descuento;
    }
}
