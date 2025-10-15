
package Clases;

import MeException.*;

public abstract class Producto{
    private String nombre;
    private double precio;
    private String categoria;

    public Producto(String nombre, double precio, String categoria) throws CampoVacioException{
        setNombre(nombre);
        setPrecio(precio);
        setCategoria(categoria);
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) throws CampoVacioException{
        if(nombre.trim().isEmpty()){
            throw new CampoVacioException("¡El nombre no puede ser un campo vacio!");
        }
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    private void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        this.categoria = categoria;
    } 
}
