/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoconcesionario;

import java.util.Scanner;
/**
 *
 * @author CamiloAlvarez
 */
public class Principal {
    
    public static void main(String[] args) {
     Deportivo uno = new Deportivo();
      
     Scanner op = new Scanner (System.in);
     int opcion;
     
     do{
         System.out.println("Menu Principal");
         System.out.println("1.Administrador");
         System.out.println("2.Cliente");
         System.out.println("3.Empleado");
         System.out.println("4.Salir");
         System.out.println("ingrese una opcion");
         opcion = op.nextInt();
         
         switch(opcion){
             case 1:
                 do{
                     System.out.println("Menu Administrador");
                     System.out.println("1.agregar carro");
                     System.out.println("2.modificar carro");
                     System.out.println("3.ver carros");
                     System.out.println("4.eliminar carro");
                     System.out.println("5.agregar persona");
                     System.out.println("6.modificar persona");
                     System.out.println("7.eliminar persona");
                     System.out.println("8.ver carro mas caro");
                     System.out.println("9.ver carro menos caro");
                     System.out.println("10.ver carro mas vendido");
                     System.out.println("11.ver carro menos vendido");
                     System.out.println("12.salir");
                     System.out.println("ingrese opcion:");
                     opcion = op.nextInt();
                     
                     switch(opcion){
                         case 1:
                             uno.agregarCarro();
                     }
                     
                 }while (opcion!=12);
             
                 break;
         }
         
         
     }while (opcion!=4);
     
    }
}
