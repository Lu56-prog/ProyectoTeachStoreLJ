
package Clases;
import GUI.Productos.EliminarProductoFrame;
import GUI.Productos.InventarioFrame;
import GUI.Productos.AgregarSDigitalesFrame;
import GUI.Productos.EliminarSDigitalFrame;
import GUI.Productos.AgregarProductoFisicoFrame;
import GUI.Productos.ModificarProdutoFrame;
import GUI.Productos.VerProductosFrame;
import GUI.Productos.VerSDigitalesFrame;
import GUI.Productos.ServicioDigitalFrame;
import GUI.Productos.ModificarSDigitalesFrame;
import GUI.*;
import GUI.Clientes.AgregarClienteFrame;
import GUI.Clientes.ClientesFrame;
import GUI.Clientes.EliminarClienteFrame;
import GUI.Clientes.ModificarClienteFrame;
import GUI.Clientes.VerClientesFrame;


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
        ModificarProdutoFrame mpf = new ModificarProdutoFrame();
        
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
}
