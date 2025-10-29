

package com.mycompany.teachstorelj;

import GUI.MainFrame;
import Clases.*;
import MeException.*;
import java.time.LocalDate;

public class TeachStoreLJ { 
    
    public static Inventario inventario;
    public static CajaUsuarios usuarios;

    public static void main(String[] args) {
        inventario = new Inventario();
        usuarios = new CajaUsuarios();
        
        inventario.listaProductos.add(new ProductoFisico("Laptop ASUS", 2500000, "Computadoras", "Samsung", 3, "Bodega 1", 5));
        inventario.listaProductos.add(new ProductoFisico("Mouse Logitech", 120000, "Accesorios", "Logitech", 30, "Bodega 2", 10));
        inventario.listaProductos.add(new ProductoFisico("Monitor Samsung", 800000, "Pantallas", "Samsung", 15, "Bodega 1", 0));
        inventario.listaProductos.add(new ProductoFisico("Teclado Redragon", 180000, "Accesorios", "Redragon", 25, "Bodega 3", 8));
        inventario.listaProductos.add(new ProductoFisico("Impresora HP", 650000, "Periféricos", "HP",5 , "Bodega 2", 0));
       
        usuarios.listaClientes.add(new Cliente("Juan Pérez", "1023456789", "3004567890", "juanperez@gmail.com", "Calle 45 #23-10"));
        usuarios.listaClientes.add(new Cliente("María Gómez", "9876543210", "3105674321", "mariagomez@hotmail.com", "Carrera 12 #45-67"));
        usuarios.listaClientes.add(new Cliente("Carlos López", "1234567890", "3206549871", "carloslopez@yahoo.com", "Avenida 80 #30-20"));
        
        usuarios.listaEmpleados.add(new Tecnico( "Juan Pérez", "1023456789", "3124567890", "juanperez@techstore.com", "Tecnico", "Ingeniero en Telecomunicaciones", 2800000, LocalDate.of(2021, 5, 10), "Tiempo completo", 3, true));
        usuarios.listaEmpleados.add(new Tecnico("María Gómez", "1019876543", "3109876543", "mariagomez@techstore.com", "Tecnico", "Tecnóloga en Electrónica", 2400000, LocalDate.of(2022, 8, 25), "Medio tiempo", 2, true));

        
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
    }
}
