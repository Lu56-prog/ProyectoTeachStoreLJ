

package com.mycompany.teachstorelj;

import GUI.MainFrame;
import Clases.*;
import MeException.*;

public class TeachStoreLJ { 
    
    public static Inventario inventario;

    public static void main(String[] args) {
        inventario = new Inventario();
        
       inventario.listaProductos.add(new ProductoFisico("Laptop ASUS", 2500000, "Computadoras", "Samsung", 3, "Bodega 1", 5));
       inventario.listaProductos.add(new ProductoFisico("Mouse Logitech", 120000, "Accesorios", "Logitech", 30, "Bodega 2", 10));
       inventario.listaProductos.add(new ProductoFisico("Monitor Samsung", 800000, "Pantallas", "Samsung", 15, "Bodega 1", 0));
       inventario.listaProductos.add(new ProductoFisico("Teclado Redragon", 180000, "Accesorios", "Redragon", 25, "Bodega 3", 8));
       inventario.listaProductos.add(new ProductoFisico("Impresora HP", 650000, "Periféricos", "HP",5 , "Bodega 2", 0));
        
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
    }
}
