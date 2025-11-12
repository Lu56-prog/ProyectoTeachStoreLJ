
package Clases;

import java.time.LocalDate;

public class Supervisor extends Empleado{
    protected  int ventaMayoresAutorizadas;

    public Supervisor( String nombre, String cedula, String telefono, String correo, String cargo, String profesion, double salario, String jornadaLaboral) {
        super(nombre, cedula, telefono, correo, cargo, profesion, salario, jornadaLaboral);
    }

    public int getVentaMayoresAutorizadas() {
        return ventaMayoresAutorizadas;
    }

    public void setVentaMayoresAutorizadas(int ventaMayoresAutorizadas) {
        this.ventaMayoresAutorizadas = this.ventaMayoresAutorizadas + ventaMayoresAutorizadas;
    }
    
}
