package com.mycompany.proyectofinal;
//Hola muchachos
import java.awt.Dimension;
import java.awt.Toolkit;

public class ProyectoFinal {
    /// CREACIÓN DE LA CLASE NODO (USADA PARA LAS COLAS) ///
    public static class Nodo{
        int contadorCodigo = 0; // Sirve para darle un código único a las ordenes
        
        // Campos de las ordenes
        int codigo;
        String platillo;
        String cliente;
        String mesero;
        String turnoMesero;
        
        // Punteros de la COLA
        Nodo siguiente;
        Nodo frente = null;
        Nodo fin = null;

        void push(String platillo, String cliente, String mesero, String turnoMesero) {
            // Crear un nuevo nodo y asignar los datos pasados como parámetros
            Nodo nuevo_nodo = new Nodo();
            nuevo_nodo.codigo = ++contadorCodigo;  // Incrementa el contador global de códigos antes de asignarlo
            nuevo_nodo.platillo = platillo;
            nuevo_nodo.cliente = cliente;
            nuevo_nodo.mesero = mesero;
            nuevo_nodo.turnoMesero = turnoMesero;
            nuevo_nodo.siguiente = null;  // El nuevo nodo es el último, por lo que su siguiente es null

            // Si la cola está vacía, establecer este nuevo nodo como el frente y el fin de la cola
            if (frente == null) {
                frente = nuevo_nodo;
            } else {
                fin.siguiente = nuevo_nodo;  // De lo contrario, enlazar el nuevo nodo al final de la cola
            }
           fin = nuevo_nodo;  // Actualizar el fin para que apunte al nuevo nodo
        }

        void pop() {
            // Solo proceder si la cola no está vacía
            if (frente != null & fin != null) {
                Nodo aux = frente;  // Tomar el nodo del frente para eliminarlo
                if (frente == fin) {
                    // Si el frente y el fin son el mismo, la cola quedará vacía después de esta operación
                    frente = null;
                    fin = null;
                } else {
                    // Mover el frente al siguiente nodo en la cola
                    frente = aux.siguiente;
                }
                // Preparar el nodo eliminado para ser recolectado por el recolector de basura
                aux = null;
            }
        }

        void clear() {
            // Elimina todos los elementos de la cola
            while (frente != null) {
                pop();  // Utiliza la función pop para eliminar cada nodo empezando desde el frente
            }
        }

        boolean isEmpty() {
            // Comprobar si la cola está vacía
            return (frente == null & fin == null);  // Retorna true si no hay nodos en la cola
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
