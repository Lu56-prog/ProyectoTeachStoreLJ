
package Clases;

import MeException.*;

public abstract class Producto{
    protected  String nombre;
    protected double precio;
    protected  String categoria;

    public Producto(String nombre, double precio, String categoria) throws CampoVacioException{
        setNombre(nombre);
        setPrecio(precio);
        setCategoria(categoria);
    }

    public String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre){
        if(nombre.trim().isEmpty()){
            throw new CampoVacioException("El nombre no puede ser un campo vacio");
        }
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    protected void setPrecio(double precio) {
        if(precio<=0){
            throw new NumeroMenorACero("El precio no puede ser menor a 0");
        }
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    protected void setCategoria(String categoria) {
        if(categoria.trim().isEmpty()){
            throw new CampoVacioException("Categoria no puede ser un campo vacio");
        }
        this.categoria = categoria;
    } 
}
