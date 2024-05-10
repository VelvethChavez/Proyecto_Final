package com.mycompany.proyectofinal;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ProyectoFinal {

    public static void main(String[] args) {
        Principal principal = new Principal();
        
        //Calculos para centrar la ventana en la pantalla
        Dimension tamanioPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tamanioPantalla.width - principal.getWidth()) / 2;
        int y = (tamanioPantalla.height - principal.getHeight()) / 2;
        
        //Mostrar la ventana centrada
        principal.setVisible(true);
        principal.setLocation(x,y);
    }
}
