/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import com.mycompany.teachstorelj.TeachStoreLJ;
import java.io.*;
import java.nio.file.WatchEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 90W
 */
public class CSV2000  {
    String archProFisico = "Productos Fisicos.csv";
    String archSDigital = "Servicios Digitales.csv";
    String archEmpleados = "Empleados.csv";
    String archCliente = "Clientes.csv";

    public CSV2000() {
    }
    
    public void guardarCSVClientes (){
        
        try {
            FileWriter csv = new FileWriter (archCliente);
            BufferedWriter writeCSV = new BufferedWriter(csv);
            
                //encabezados
                String encabezado = "NOMBRE,IDENTIFICAION,CONTACTO,CORREO ELECTRONICO,DIRECCION,ID,PUNTOS,COMPRAS";
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
    
    public void cargarCSVClientes(){
        try{
            FileReader rFile = new FileReader(archCliente);
            BufferedReader reader = new BufferedReader(rFile);
            
            String line  = reader.readLine(); //Encabezado
            
            while (line != null){
                line = reader.readLine();
                String[] datos = line.split(",");
                //Ya que tenemos los datos en la lista, empezamos a crear cada cliente
                //Para agregarlos a la caja usuarios
                String nombre = datos[0];
                String cedula = datos[1];
                String telefono = datos[2];
                String correo = datos[3];
                String direccion = datos[4];
                
                Cliente cliente = new Cliente(nombre, cedula, telefono, correo, direccion);
                cliente.setPuntosAcumulados2(Integer.parseInt(datos[6]));
                cliente.setComprasAcumuladas(Integer.parseInt(datos[7]));
                
                TeachStoreLJ.usuarios.listaClientes.add(cliente);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            
        } catch(NullPointerException e){
        }

    }
    
    public void guardarCSVEmpleados (){
        try {
            FileWriter csv = new FileWriter (archEmpleados);
            BufferedWriter writeCSV = new BufferedWriter(csv);
            
                //encabezados
                String encabezado = "NOMBRE,IDENTIFICAION,CONTACTO,CORREO ELECTRONICO,CARGO,PROFESION,SALARIO,JORNADA LABORAL,ID";
                writeCSV.write(encabezado);
                List<Empleado>empleados = TeachStoreLJ.usuarios.listaEmpleados;
                
                 for (Empleado empleado: empleados) {
                    writeCSV.newLine();
                    if(empleado.cargo.equals("Cajero")){
                        Cajero cajero = (Cajero) empleado;
                        String datosEmpleado = cajero.listaCSVCajero();
                        writeCSV.write(datosEmpleado);
                    } else{
                        String datosEmpleado = empleado.listaCSV();
                        writeCSV.write(datosEmpleado);
                    }
                    
                    //CERRAR EL CSV
                    writeCSV.flush();
                }   
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cargarCSVEmpleados(){
        try{
            FileReader rFile = new FileReader(archEmpleados);
            BufferedReader reader = new BufferedReader(rFile);
            
            String line  = reader.readLine(); //Encabezado
            
            while (line != null){
                line = reader.readLine();
                String[] datos = line.split(",");
                //Ya que tenemos los datos en la lista, empezamos a crear cada producto
                //Para agregarlos al inventario
                String nombre = datos[0];
                String cedula = datos[1];
                String telefono = datos[2];
                String correo = datos[3];
                String cargo = datos[4];
                String profesion = datos[5];
                double salario = Double.parseDouble(datos[6]);
                String jornadaLaboral = datos[7];
                
                //Segun el cargo creamos tecnico, cajero o supervisor
                if(cargo.equals("Tecnico")){
                    Tecnico tecnico = new Tecnico(nombre, cedula, telefono, correo, cargo, profesion, salario, jornadaLaboral);
                    TeachStoreLJ.usuarios.listaEmpleados.add(tecnico);
                } else if(cargo.equals("Cajero")){
                    Cajero cajero = new Cajero(nombre, cedula, telefono, correo, cargo, profesion, salario, jornadaLaboral);
                    cajero.setVentaDelDia(Integer.parseInt(datos[9]));
                    cajero.setTotalVendidoDia(Double.parseDouble(datos[10]));
                    TeachStoreLJ.usuarios.listaEmpleados.add(cajero);
                } else{
                    Supervisor supervisor = new Supervisor(nombre, cedula, telefono, correo, cargo, profesion, salario, jornadaLaboral);
                    TeachStoreLJ.usuarios.listaEmpleados.add(supervisor);
                }
                
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            
        } catch(NullPointerException e){
        }

    }
    

    public void guardarCSVServicioDigital(){
        try {
            //Escribimos en el CSV, con lo de inventario
            FileWriter csv = new FileWriter (archSDigital);
            BufferedWriter writeCSV = new BufferedWriter(csv);
            
                //encabezados
                String encabezado = "NOMBRE,PRECIO,CATEGORIA,ID,DURACION,DESCRIPCION,TECNICO RESPONSABLE";
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
    
    public void cargarCSVServicioDigital(){
        try{
            FileReader rFile = new FileReader(archSDigital);
            BufferedReader reader = new BufferedReader(rFile);
            
            String line  = reader.readLine(); //Encabezado
            
            while (line != null){
                line = reader.readLine();
                String[] datos = line.split(",");
                //Ya que tenemos los datos en la lista, empezamos a crear cada producto
                //Para agregarlos al inventario
                String nombre = datos[0];
                double precio = Double.parseDouble(datos[1]);
                String categoria = datos[2];
                String id = datos[3];
                Duration duracion = Duration.parse(datos[4]);
                String descripcion = datos[5];
                String tecnicoBuscar = datos[6];
                Tecnico tecnicoResponsable = new Tecnico("0","0000000000","0000000000","0@","0","0",2000000,"0");
                //Buscamos el tecnico responsable
                List<Empleado> empleados = TeachStoreLJ.usuarios.listaEmpleados;
                for(Empleado tecnico:empleados){
                    if(tecnico.getId().equals(tecnicoBuscar)){
                        tecnicoResponsable = (Tecnico)tecnico;
                    }
                }
                
                //Ahora con los datos se crea el producto y lo agregamos al inventario
                ServicioDigital sDigital = new ServicioDigital(nombre, precio, categoria, duracion, descripcion, tecnicoResponsable);
                TeachStoreLJ.inventario.listaSDigitales.add(sDigital);
                
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            
        } catch(NullPointerException e){
        }

    }
    
    public void guardarCSVProdutoFisico(){
        
        try {
            //Escribimos productos fisicos con lo que se tenga en el inventario
            FileWriter csv = new FileWriter (archProFisico);
            BufferedWriter writeCSV = new BufferedWriter(csv);
            
                //encabezados
                String encabezado = "NOMBRE,PRECIO,CATEGORIA,MARCA, STOCK, CODIGO BARRAS, UBICACION, DESCUENTO";
                writeCSV.write(encabezado);
                List<ProductoFisico>productos = TeachStoreLJ.inventario.listaProductos;
                
                for ( ProductoFisico producto : productos ) {
                    writeCSV.newLine();
                    String datosProducto = producto.listaCSV();
                    writeCSV.write(datosProducto);
                    
                    //CERRAR EL CSV
                    writeCSV.flush();
                }   
        } catch (IOException e) {
            System.out.println(e.getMessage());
            
        }
    } 
    
    public void cargarCSVProductoFisico(){
        try{
            FileReader rFile = new FileReader(archProFisico);
            BufferedReader reader = new BufferedReader(rFile);
            
            String line  = reader.readLine(); //Encabezado
            
            while (line != null){
                line = reader.readLine();
                String[] datos = line.split(",");
                //Ya que tenemos los datos en la lista, empezamos a crear cada producto
                //Para agregarlos al inventario
                String nombre = datos[0];
                double precio = Double.parseDouble(datos[1]);
                String categoria = datos[2];
                String marca = datos[3];
                int stock = Integer.parseInt(datos[4]);
                String ubicacion = datos[6];
                int descuento = Integer.parseInt(datos[7]);
                
                //Ahora con los datos se crea el producto y lo agregamos al inventario
                ProductoFisico productoFis = new ProductoFisico(nombre, precio, categoria, marca, stock, ubicacion, descuento);
                TeachStoreLJ.inventario.listaProductos.add(productoFis);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            
        } catch(NullPointerException e){
        }
    }

}