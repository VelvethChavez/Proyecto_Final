package com.mycompany.proyectofinal;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ProyectoFinal {
    
    public static class Nodo{
        int contadorCodigo = 0;
        int codigo;
        String platillo;
        String cliente;
        String mesero;
        String turnoMesero;
        
        Nodo siguiente;
        Nodo frente = null;
        Nodo fin = null;

        void push(String platillo, String cliente, String mesero, String turnoMesero) {
            Nodo nuevo_nodo = new Nodo();
            codigo++; // Para que los pedidos tengan diferente codigo
            nuevo_nodo.codigo = ++contadorCodigo;
            nuevo_nodo.platillo = platillo;
            nuevo_nodo.cliente = cliente;
            nuevo_nodo.mesero = mesero;
            nuevo_nodo.mesero = turnoMesero;
            nuevo_nodo.siguiente = null;

            if (frente == null)
                frente = nuevo_nodo;
            else
                fin.siguiente = nuevo_nodo;

            fin = nuevo_nodo;
        }
        
        void pop(){
            if(frente != null & fin != null){
                Nodo aux = frente;
                if (frente == fin) {
                    frente = null;
                    fin = null;
                } else {
                    frente = aux.siguiente;
                }
                aux = null;
            }
        }
        
        void clear() {
            while (frente != null) {
                pop();
            }
        }
        
        boolean isEmpty() {
            return (frente == null & fin == null);
        }
    }

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
