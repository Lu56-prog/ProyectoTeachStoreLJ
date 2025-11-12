
package Clases;

import MeException.*;
import javax.swing.JOptionPane;

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

    public void setStock(int stock) {
        if(stock < 0){
            throw new NumeroFueraDeLimitesException("El Stock no puede ser menor a 0");
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
            throw new NumeroFueraDeLimitesException("El descuento no puede ser menor a 0");
        }
        this.descuento = descuento;
    }
    
     public String listaCSV (){
        return this.nombre + "," + this.precio + "," + this.categoria +
                "," + this.marca + "," + this.stock + "," + this.codigoBarras + "," +   this.ubicacion + "," + this.descuento + "," + this.cantidadVenta;
    }
     
     
    public void modificarProducto(String nombre, double precio, String categoria, String marca, int stock, String ubicacion, int descuento){
        setNombre(nombre);
        setPrecio(precio);
        setCategoria(categoria);
        setMarca(marca);
        setStock(stock);
        setUbicacion(ubicacion);
        setDescuento(descuento);
    }

    
    public double getTotalProducto(int cantidad){
        //Primero multiplicamos por cantidad
        double precio = this.precio * cantidad;
        //Al precio se le saca el iva y se realiza el descuento
        double descuento =  (precio/1.19) * ((double)this.descuento/100);
        double nuevoTotal =  precio - descuento;
        return nuevoTotal;
    }
    
    @Override
    public String toString() {
        return this.nombre + " -> " + this.codigoBarras;
    }
}
