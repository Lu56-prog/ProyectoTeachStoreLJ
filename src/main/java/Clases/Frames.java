
package Clases;


import GUI.MainFrame;
import GUI.Productos.*;
import GUI.Clientes.*;
import GUI.Empleados.*;
import javax.swing.JOptionPane;



public class Frames {

    public Frames() {
    }
    
    
    //Creamos metodos para abrir cada pagina web
    public void recargarMainFrame(){
        MainFrame mf = new MainFrame();
        
        mf.setVisible(true);
        mf.setLocationRelativeTo(null);
    }
    
    public void recargarInventario(){
        InventarioFrame inf = new InventarioFrame();
        
        inf.setVisible(true);
        inf.setLocationRelativeTo(null);
    }
    
    public void recargarAgregarProducto(){
        AgregarProductoFisicoFrame apf = new AgregarProductoFisicoFrame();
        
        apf.setVisible(true);
        apf.setLocationRelativeTo(null);
    }
    
    public void recargarModificarProducto(){
        ModificarProductoFrame mpf = new ModificarProductoFrame();
        
        mpf.setVisible(true);
        mpf.setLocationRelativeTo(null);
    }
    
    public void recargarEliminarProducto(){
        EliminarProductoFrame epf = new EliminarProductoFrame();
        
        epf.setVisible(true);
        epf.setLocationRelativeTo(null);
    }
    
    public void recagargarVerProductos(){
        VerProductosFrame vpf = new VerProductosFrame();
        
        vpf.setVisible(true);
        vpf.setLocationRelativeTo(null);
    }
    
    public void recargarSDigital(){
        ServicioDigitalFrame sdf = new ServicioDigitalFrame();
        
        sdf.setVisible(true);
        sdf.setLocationRelativeTo(null);
    }
    
    public void recargarAgregarSDigital(){
        AgregarSDigitalesFrame asdf = new AgregarSDigitalesFrame();
        
        asdf.setVisible(true);
        asdf.setLocationRelativeTo(null);
    }
    
    public void recargarModificarSDigital(){
        ModificarSDigitalesFrame msdf = new ModificarSDigitalesFrame();
        
        msdf.setVisible(true);
        msdf.setLocationRelativeTo(null);
    }
    
    public void recargarEliminarSDigital(){
        EliminarSDigitalFrame esdf = new EliminarSDigitalFrame();
        
        esdf.setVisible(true);
        esdf.setLocationRelativeTo(null);
    }
    
    public void recargarVerSDigitales(){
        VerSDigitalesFrame vsdf = new VerSDigitalesFrame();
        
        vsdf.setVisible(true);
        vsdf.setLocationRelativeTo(null);
    }
    
    //Clientes
    public void recargarClientes(){
        ClientesFrame cf = new ClientesFrame();
        
        cf.setVisible(true);
        cf.setLocationRelativeTo(null);
    }
    
    public void recargarAgregarCliente(){
        AgregarClienteFrame acf = new AgregarClienteFrame();
        
        acf.setVisible(true);
        acf.setLocationRelativeTo(null);
    }
    
    public void recargarModificarCliente(){
        ModificarClienteFrame mcf = new ModificarClienteFrame();
        
        mcf.setVisible(true);
        mcf.setLocationRelativeTo(null);
    }
    
    public void recargarEliminarCliente(){
        EliminarClienteFrame ecf = new EliminarClienteFrame();
        
        ecf.setVisible(true);
        ecf.setLocationRelativeTo(null);
    }
    
    public void recargarVerClientes(){
        VerClientesFrame vcf = new VerClientesFrame();
        
        vcf.setVisible(true);
        vcf.setLocationRelativeTo(null);
    }
    
    //Empleados
        public void recargarEmpleados(){
        EmpleadoFrame ef = new EmpleadoFrame();
        
        ef.setVisible(true);
        ef.setLocationRelativeTo(null);
    }
    
    public void recargarAgregarEmpleado(){
        AgregarEmpleadoFrame aef = new AgregarEmpleadoFrame();
        
        aef.setVisible(true);
        aef.setLocationRelativeTo(null);
    }
    
    public void recargarModificarEmpleado(){
        ModificarEmpleadoFrame mef = new ModificarEmpleadoFrame();
        
        mef.setVisible(true);
        mef.setLocationRelativeTo(null);
    }
    
    public void recargarEliminarEmpleado(){
        EliminarEmpleadoFrame eef = new EliminarEmpleadoFrame();
        
        eef.setVisible(true);
        eef.setLocationRelativeTo(null);
    }
    
    public void recargarVerEmpleados(){
        VerEmpleadosFrame vef = new VerEmpleadosFrame();
        
        vef.setVisible(true);
        vef.setLocationRelativeTo(null);
    }
    
      //Como el txt nos devuleve un String tenemos que pasar los datos a números
    //Y eso nos puede lanzar la excepcion NumberFormatException
    public double convertirPrecio(String precioTexto){
        precioTexto = precioTexto.replace(".", "");
        precioTexto = precioTexto.replace(",", "");
        double precioConvertido = 0;
        //Nos aseguramos de que el precio sea un número
        try {
            precioConvertido = Double.parseDouble(precioTexto); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Verifica que precio sea un número", "ERROR PRECIO", JOptionPane.ERROR_MESSAGE);
        }
        return precioConvertido;
    }
    
    public int convertirEntero(String numero, String mensaje){
        int numeroConvertido = -1;
        try {
            numeroConvertido = Integer.parseInt(numero);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Verifica que " + mensaje + " sea un número", "ERROR PRECIO", JOptionPane.ERROR_MESSAGE);
        }
        
        return numeroConvertido;
    }
    
    //Para validar los minutos ingresados
    public long convertirLong(String numero, String mensaje){
        long numeroConvertido = -1;
        try {
            numeroConvertido = Integer.parseInt(numero);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Verifica que " + mensaje + " sea un número", "ERROR PRECIO", JOptionPane.ERROR_MESSAGE);
        }
        
        return numeroConvertido;
    }
}
