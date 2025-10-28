
package Clases;

import java.time.LocalDate;

public class Supervisor extends Empleado{
    private static int contador = 1;
    protected int descuentoAutorizado;
    protected  int ventaMayoresAutorizadas;

    public Supervisor( String nombre, int cedula, String telefono, String correo, String cargo, String profesion, double salario, LocalDate fechaIngreso, String jornadaLaboral, int descuentoAutorizado, int ventaMayoresAutorizadas) {
        super(nombre, cedula, telefono, correo, cargo, profesion, salario, fechaIngreso, jornadaLaboral);
        setId();
        this.descuentoAutorizado = descuentoAutorizado;
        this.ventaMayoresAutorizadas = ventaMayoresAutorizadas;
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
    
    @Override
    public void setId(){
        String id = ("EM-SUPERVISOR-00" + contador);
        contador = contador + 1;
        this.id = id;
    }
}
