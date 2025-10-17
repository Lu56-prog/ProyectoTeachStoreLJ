
package Clases;

import MeException.*;

public class ProductoFisico  extends Producto{
    private  static int contador = 1;
    private  String marca;
    private  int stock;
    private  String codigoBarras;
    private  String ubicacion;
    private int descuento;
// nombre de la fruta 
    public ProductoFisico(String nombre, double precio, String categoria, String marca, int stock, String ubicacion, int descuento) throws CampoVacioException {
        super(nombre, precio, categoria);
        setMarca(marca);
        setStock(stock);
        setCodigoBarras();
        setUbicacion(ubicacion);
        setDescuento(descuento);
    }
    
    public void mostrarInfo(){
        System.out.println("\nNombre: " + this.nombre +
                "\nPrecio: " + this.precio +
                "\nCategoria: " + this.categoria +
                "\nMarca: " + this.getMarca() +
                "\nStock: " + this.getStock() +
                "\nCodigoBarras: " + this.getCodigoBarras() +
                "\nUbicacion: " + this.getUbicacion() +
                "\nDescuento: " + this.getDescuento());
    }

    public String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {
        if(marca.trim().isEmpty()){
            throw new CampoVacioException("Marca no puede ser un campo vacio");
        }
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    private void setStock(int stock) {
        if(stock < 0){
            throw new NumeroMenorACero("El Stock no puede ser menor a 0");
        }
        this.stock = stock;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    private void setCodigoBarras() {
        String codigoBarras = ("PR-FISICO-00" + contador);
        contador = contador + 1;
        this.codigoBarras = codigoBarras;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    private void setUbicacion(String ubicacion) {
        if(ubicacion.trim().isEmpty()){
            throw new CampoVacioException("Ubicacion no puede ser un campo vacio");
        }
        this.ubicacion = ubicacion;
    }

    public int getDescuento() {
        return descuento;
    }

    private void setDescuento(int descuento) {
        if(descuento < 0){
            throw new NumeroMenorACero("El descuento no puede ser menor a 0");
        }
        this.descuento = descuento;
    }
    
    
}
