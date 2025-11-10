
package Clases;
import MeException.*;

public class Cliente extends Usuario{
    private static int contador = 1;
    protected  String direccion;
    protected  int puntosAcumulados;
    protected  int comprasAcumuladas;
    protected String historialCompras;

    public Cliente(String nombre, String cedula, String telefono, String correo, String direccion) {
        super(nombre, cedula, telefono, correo);
        setId();
        setDireccion(direccion);
        setPuntosAcumulados(puntosAcumulados);
        setComprasAcumuladas(comprasAcumuladas);
    }

    public String getDireccion() {
        return direccion;
    }

    private void setDireccion(String direccion2) {
        if(direccion2.trim().isEmpty()){
            this.direccion = "No registrada";
        } else{
            this.direccion = direccion2;
        }
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = 13;
    }

    public int getComprasAcumuladas() {
        return comprasAcumuladas;
    }

    public void setComprasAcumuladas(int comprasAcumuladas) {
        this.comprasAcumuladas = 4;
    }

    public String getHistorialCompras() {
        return historialCompras;
    }

    public void setHistorialCompras(String historialCompras) {
        this.historialCompras = historialCompras;
    }
    
    public void mostrarInfo(){
        System.out.println("""      
                === Cliente ===
                Nombre: """ + this.nombre +
                "\nIdentificacion: $" + this.cedula +
                "\nTelefono: " + this.telefono +
                "\nCorreo Electronico: " + this.correo +
                "\nDireccion: " + this.direccion +
                "\nID: " + this.id);
    }
    
    public void modificarCliente(String nombre, String cedula, String telefono, String correo, String direccion){
        modificarUsuario(nombre, cedula, telefono, correo);
        setDireccion(direccion);
    }
    
    
    public String listaCSV (){
        return this.nombre + "," + this.cedula + "," + this.telefono +
                "," + this.correo + "," + this.direccion + "," + this.id;
    }
    
    
    
    
   @Override
    protected void setId(){
        String id = ("CLI-00" + contador);
        contador = contador + 1;
        this.id = id;
    } 
}
