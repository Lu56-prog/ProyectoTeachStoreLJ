
package Clases;
import GUI.*;


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
}
