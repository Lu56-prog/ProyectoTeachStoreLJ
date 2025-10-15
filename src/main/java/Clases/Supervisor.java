
package Clases;

import java.time.LocalDate;

public class Supervisor extends Empleado{
    int descuentoAutorizado;
    int ventaMayoresAutorizadas;

    public Supervisor(String id, String nombre, int cedula, String telefono, String cargo, String profesion, double salario, LocalDate fechaIngreso, String jornadaLaboral, int descuentoAutorizado, int ventaMayoresAutorizadas) {
        super(id, nombre, cedula, telefono, cargo, profesion, salario, fechaIngreso, jornadaLaboral);
        this.descuentoAutorizado = descuentoAutorizado;
        this.ventaMayoresAutorizadas = ventaMayoresAutorizadas;
    }
    
    
}
