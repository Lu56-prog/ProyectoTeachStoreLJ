

package com.mycompany.teachstorelj;

import GUI.MainFrame;
import Clases.*;
import MeException.*;
import java.time.Duration;
import java.time.LocalDate;

public class TeachStoreLJ { 
    
    public static Inventario inventario;
    public static CajaUsuarios usuarios;
    public static CSV2000 csv;

    public static void main(String[] args) {
        inventario = new Inventario(); 
        usuarios = new CajaUsuarios();
        csv = new CSV2000();
        
        
        //Recargamos la caja de usuarios
        csv.cargarCSVEmpleados();
        csv.cargarCSVClientes();
        
        //Recargamos el inventario
        csv.cargarCSVProductoFisico();
        csv.cargarCSVServicioDigital();

        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
    }
}
