/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import com.mycompany.teachstorelj.TeachStoreLJ;
import java.io.*;
import java.nio.file.WatchEvent;
import java.util.List;

/**
 *
 * @author 90W
 */
public class CSV2000  {

    public CSV2000() {
    }
    
    public void guardarCSVClientes (){
        String Client = "cliente.csv";
        
        try {
            FileWriter csv = new FileWriter (Client);
            BufferedWriter writeCSV = new BufferedWriter(csv);
            
                //encabezados
                String encabezado = "NOMBRE,IDENTIFICAION,CONTACTO,CORREO ELECTRONICO,DIRECCION,ID";
                writeCSV.write(encabezado);
                List<Cliente> clientes = TeachStoreLJ.usuarios.listaClientes;
                
                for (Cliente cliente: clientes) {
                    writeCSV.newLine();
                    String datosCliente = cliente.listaCSV();
                    writeCSV.write(datosCliente);
                    
                    //CERRAR EL CSV
                    writeCSV.flush();
                }   
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    
}
