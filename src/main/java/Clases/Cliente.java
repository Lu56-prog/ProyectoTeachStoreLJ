
package Clases;

public class Cliente extends Usuario{
    private static int contador = 1;
    protected  String direccion;
    protected  int puntosAcumulados;
    protected  int comprasAcumuladas;
    protected String historialCompras;

    public Cliente(String nombre, int cedula, String telefono, String correo, String direccion, int puntosAcumulados, int comprasAcumuladas, String historialCompras) {
        super(nombre, cedula, telefono, correo);
        setId();
        this.direccion = direccion;
        this.puntosAcumulados = puntosAcumulados;
        this.comprasAcumuladas = comprasAcumuladas;
        this.historialCompras = historialCompras;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    public int getComprasAcumuladas() {
        return comprasAcumuladas;
    }

    public void setComprasAcumuladas(int comprasAcumuladas) {
        this.comprasAcumuladas = comprasAcumuladas;
    }

    public String getHistorialCompras() {
        return historialCompras;
    }

    public void setHistorialCompras(String historialCompras) {
        this.historialCompras = historialCompras;
    }
    
   @Override
    public void setId(){
        String id = ("CLI-00" + contador);
        contador = contador + 1;
        this.id = id;
    } 
}
