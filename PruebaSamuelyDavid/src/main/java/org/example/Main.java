package org.example;

import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        controlCliente ControlCliente = new controlCliente();


        while (opcion != 4) {
            System.out.println("//===//===//===//=== menu ===//===//===//===//");
            System.out.println("1. Agregar Cliente Normal");
            System.out.println("2. Agregar Cliente VIP");
            System.out.println("3. Atender siguiente Cliente");
            System.out.println("4. Salir");
            System.out.println("//===//===//===//===//===//===//===//===//===//");



                if (sc.hasNextInt()) {
                    opcion = sc.nextInt();
                    sc.nextLine();
                    switch (opcion) {
                        case 1:
                            System.out.println("Ingrese nombre del cliente normal: ");
                            String nombreNomal = sc.nextLine();
                            ControlCliente.agregarClienteNormal(nombreNomal);
                            break;
                        case 2:
                            System.out.println("Ingrese el nombre del cliente VIP");
                            String nombreVIP = sc.nextLine();
                            ControlCliente.agregarClienteVIP(nombreVIP);
                            break;
                        case 3:
                            ControlCliente.atendersiguienteCliente();
                            break;
                        case 4:
                            System.out.println("Saliendo del sistema");
                            break;
                        default:
                            System.out.println("Opcion no valida. \n");

                    }
                } else {
                    System.out.println("Error: Ingrese un numero valido");
                    sc.next();
                }
            }
            sc.close();
        }
    }




