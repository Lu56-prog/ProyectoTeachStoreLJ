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
    
    public void guardarCSVEmpleados (){
        String Employee = "empleado.csv";
        
        try {
            FileWriter csv = new FileWriter (Employee);
            BufferedWriter writeCSV = new BufferedWriter(csv);
            
                //encabezados
                String encabezado = "NOMBRE,IDENTIFICAION,CONTACTO,CORREO ELECTRONICO,CARGO,SALARIO,PROFESION,JORNADA LABORAL,ID";
                writeCSV.write(encabezado);
                List<Empleado>empleados = TeachStoreLJ.usuarios.listaEmpleados;
                
                 for (Empleado empleado: empleados) {
                    writeCSV.newLine();
                    String datosEmpleado = empleado.listaCSV();
                    writeCSV.write(datosEmpleado);
                    
                    //CERRAR EL CSV
                    writeCSV.flush();
                }   
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

}

    public void guardarCSVServicioDigital(){
            
        String servclient = "serviciosdigitales.csv";
        
        try {
            FileWriter csv = new FileWriter (servclient);
            BufferedWriter writeCSV = new BufferedWriter(csv);
            
                //encabezados
                String encabezado = "NOMBRE,PRECIO,CATEGORIA,DURACION,DESCRIPCION,TECNICO RESPONSABLE,CODIGO";
                writeCSV.write(encabezado);
                List<ServicioDigital>serviciosDigitales = TeachStoreLJ.inventario.listaSDigitales;
                
                for ( ServicioDigital servicio: serviciosDigitales) {
                    writeCSV.newLine();
                    String serviciosdigitales = servicio.listaCSV();
                    writeCSV.write(serviciosdigitales);
                    
                    //CERRAR EL CSV
                    writeCSV.flush();
                }   
        } catch (IOException e) {
            System.out.println(e.getMessage());
            
        }
    } 
    
    

    public void guardarCSVProdutodigital(){
            
        String Product = "productodigital.csv";
        
        try {
            FileWriter csv = new FileWriter (Product);
            BufferedWriter writeCSV = new BufferedWriter(csv);
            
                //encabezados
                String encabezado = "NOMBRE,PRECIO,CATEGORIA,DURACION,DESCRIPCION,TECNICO RESPONSABLE,CODIGO";
                writeCSV.write(encabezado);
                List<ServicioDigital>serviciosDigitales = TeachStoreLJ.inventario.listaSDigitales;
                
                for ( ServicioDigital servicio: serviciosDigitales) {
                    writeCSV.newLine();
                    String serviciosdigitales = servicio.listaCSV();
                    writeCSV.write(serviciosdigitales);
                    
                    //CERRAR EL CSV
                    writeCSV.flush();
                }   
        } catch (IOException e) {
            System.out.println(e.getMessage());
            
        }
    } 
}