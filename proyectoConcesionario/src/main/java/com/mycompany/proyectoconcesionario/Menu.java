/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoconcesionario;

import java.util.Scanner;

/**
 *clase que sirve como menu de la aplicacion
 * @author CamiloAlvarez
 * @version 1.0
 * 
 */
public class Menu {

    public Menu() {
    }
    
    
    public void mostrarMenu(){
       
     PersonalTotal gente = new PersonalTotal(){};
     /**
     * objeto que trae los metodos de inventario
     */
        Inventario uno = new Inventario() {};
      
     /**
      * variable scanner que captura los datos que se ingresan por consola
      */   
          Scanner op = new Scanner (System.in);
          /**
           * variabl que indica la opcion que va a ser tomas 
           */
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
                     System.out.println("--------------------------");
                     System.out.println("5.agregar persona");
                     System.out.println("6.modificar persona");
                     System.out.println("7.ver persona");
                     System.out.println("8.eliminar persona");
                     System.out.println("---------------------------");
                     System.out.println("9.ver carro mas caro");
                     System.out.println("10.ver carro menos caro");
                     System.out.println("---------------------------");
                     System.out.println("11.ver carro mas vendido");
                     System.out.println("12.ver carro menos vendido");
                     System.out.println("---------------------------");
                     System.out.println("13.salir");
                     System.out.println("ingrese opcion:");
                     opcion = op.nextInt();
                     
                     switch(opcion){
                         case 1:
                             do{
                                 System.out.println("Que Tipo de Carro Quieres Agregar..");
                                 System.out.println("1.Deportivo");
                                 System.out.println("2.Perzanalizado");
                                 System.out.println("3.Maquinaria");
                                 System.out.println("4.Estandar");
                                 System.out.println("5.Salir");
                                 System.out.println("ingrese opcion:");
                                 opcion = op.nextInt();
                                uno.agregarCarro(opcion); 
                             }while(opcion<5);
                             
                             
                         
                             break;
                         case 2:
                             int placaModificar = 0;
                             System.out.println("ingrese la placa del carro que va modificar");
                             placaModificar = op.nextInt();
                             uno.modificarCarros(placaModificar);
                         case 3:
                           uno.verCarros();
                            break;
                         case 4:
                             int placaEliminar;
                             System.out.println("Ingrese la placa del carro a eliminar: ");
                             placaEliminar = op.nextInt();
                             uno.eliminarCarro(placaEliminar);
                            break;
                         case 5:
                                do {
                                 System.out.println("Que Tipo de persona Quieres Agregar..");
                                 System.out.println("1.Cliente");
                                 System.out.println("2.Empleado");
                                 System.out.println("3.salir");
                                 System.out.println("ingrese opcion");
                                 opcion = op.nextInt();
                                 gente.agregarPersona(opcion);
                                }while (opcion != 3);
                                break;
                                
                         case 6:
                             int cedulaModificar = 0;
                             System.out.println("ingrese la cedula de la persona que va modificar");
                             cedulaModificar = op.nextInt();
                             gente.modificarPersona(cedulaModificar);
                         case 7:
                             gente.mostrarPersonas();
                             break;
                         case 8:
                             int cedulaEliminar;
                             System.out.println("Ingrese la cedula de la persona a  eliminar: ");
                             cedulaEliminar = op.nextInt();
                             gente.eliminarPersona(cedulaEliminar);
                            break;
                            
                         case 9:
                             uno.carroMasyMenosCaro(opcion);
                             
                             break;
                         case 10:
                             uno.carroMasyMenosCaro(opcion);
                             
                     }
                     
                 }while (opcion!=13);
             
                 break;
         }
         
         
     }while (opcion!=4);
     
    
        
    }
    
}
