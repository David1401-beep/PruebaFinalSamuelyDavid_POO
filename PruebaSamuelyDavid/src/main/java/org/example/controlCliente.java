package org.example;

import java.util.Deque;
import java.util.LinkedList;

public class controlCliente {
private LinkedList <String> control;
    public controlCliente() {
        this.control = new LinkedList<>();
    }

    public void agregarClienteNormal(String nombre){
        control.addLast(nombre);
        System.out.println("Cliente normal registrado: " + nombre);
    }

    public void agregarClienteVIP(String nombre){
        control.addFirst(nombre);
        System.out.println("Cliente VIP registrado en primero de la fila: " + nombre);
    }

    public void atendersiguienteCliente(){
        if (control.isEmpty()){
            System.out.println("La fila esta vacia,no hay clientes");
        }else {
            String clienteAtendido = control.removeFirst();
            System.out.println("Atendido : " + clienteAtendido);
        }
    }
}
