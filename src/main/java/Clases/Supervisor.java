
package Clases;

import java.time.LocalDate;

public class Supervisor extends Empleado{
    private static int contador = 1;
    protected int descuentoAutorizado;
    protected  int ventaMayoresAutorizadas;

    public Supervisor( String nombre, String cedula, String telefono, String correo, String cargo, String profesion, double salario, String jornadaLaboral) {
        super(nombre, cedula, telefono, correo, cargo, profesion, salario, jornadaLaboral);
        setId();
    }

    public int getDescuentoAutorizado() {
        return descuentoAutorizado;
    }

    public void setDescuentoAutorizado(int descuentoAutorizado) {
        this.descuentoAutorizado = descuentoAutorizado;
    }

    public int getVentaMayoresAutorizadas() {
        return ventaMayoresAutorizadas;
    }

    public void setVentaMayoresAutorizadas(int ventaMayoresAutorizadas) {
        this.ventaMayoresAutorizadas = ventaMayoresAutorizadas;
    }
    
}
