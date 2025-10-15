

package com.mycompany.teachstorelj;

import Clases.*;
import MeException.*;

public class TeachStoreLJ {

    public static void main(String[] args) {
        try{
            ProductoFisico producto1 = new ProductoFisico("  ", 0, "PC", "Apple", 0, "PF", "Hola", 0);
            System.out.println(producto1);
        } catch (CampoVacioException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
