
package Clases;

public class Cliente extends Usuario{
    String direccion;
    int puntosAcumulados;
    int comprasAcumuladas;
    String historialCompras;

    public Cliente(String id, String nombre, int cedula, String telefono, String direccion, int puntosAcumulados, int comprasAcumuladas, String historialCompras) {
        super(id, nombre, cedula, telefono);
        this.direccion = direccion;
        this.puntosAcumulados = puntosAcumulados;
        this.comprasAcumuladas = comprasAcumuladas;
        this.historialCompras = historialCompras;
    }
    
    
}
