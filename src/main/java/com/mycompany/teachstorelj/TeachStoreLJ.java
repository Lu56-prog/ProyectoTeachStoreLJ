

package com.mycompany.teachstorelj;

import Clases.*;
import MeException.*;
import GUI.*;

public class TeachStoreLJ {
    
    public static Inventario inventario;

    public static void main(String[] args) {
        inventario = new Inventario();
        
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
    }
}
