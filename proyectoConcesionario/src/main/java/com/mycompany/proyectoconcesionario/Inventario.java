/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoconcesionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * clase inventario donde se realizan todas las funcones del inventario
 * @author CamiloAlvarez
 * @version 1.0
 */
public class Inventario {

    /**
     * lista creada para guardar los datos de la clase Deportivo
     */
    private List<Deportivo> listaDeportivo = new ArrayList<>();
    /**
     * lista creada para guardar los datos de la clase Maquinaria
     */
    private List<Maquinaria> listaMaquinaria = new ArrayList<>();
    /**
     * lista creada para guardar los datos de la clase Personalizado
     */
    private List<Personalizado> listaPersonalizado = new ArrayList<>();
 
    public Inventario() {
    
    }
    
    
    
    /**
    * variable scanner que captura los datos que se ingresan por consola
     */
    Scanner S = new Scanner(System.in);
      /**
     * funcion que agrega un carro especifico
     * @author CamiloAlvarez
     * @version 1.0
     * @param id indica que tipo de carro se va agregar
     */
    
    String Turbo;
    String Seguridad;
     public void agregarCarro(int id) {
         
         
         String continuar = null;
       
       
          try{
              
        System.out.println("ingrese placa:");
        int Placa=S.nextInt();
        System.out.println("ingrese marca:");
        String Marca=S.next();
        System.out.println("ingrese color:");
        String Color=S.next();
        System.out.println("ingresar cilindraje:");
        String Cilindraje=S.next();
        System.out.println("ingresar modelo:");
        String Modelo =S.next();
        System.out.println("ingresar combustible:");
        String Combustible=S.next();
        System.out.println("ingresar cantidad de llantas:");
        int CantidadLlantas=S.nextInt();
        System.out.println("ingresar cantidad de puertas:");
        int CantidadPuertas=S.nextInt();
        System.out.println("ingresar precio:");
        double Precio=S.nextDouble();
        if (id == 1){
        System.out.println("ingresar turbo:");
        Turbo=S.next();
        System.out.println("ingresar seguridad:");
        Seguridad=S.next();
        
        Deportivo nuevo = new Deportivo(Turbo,Seguridad,Placa,Marca,Color,Cilindraje,
        Modelo,Combustible,CantidadLlantas,CantidadPuertas,Precio);
        
        listaDeportivo.add(nuevo);
        
        System.out.println("Agregar otro s/n:");
        continuar=S.next();
        }
        
        
            if("s".equals(continuar)){
                     
        
        System.out.println("ingrese placa:");
        Placa=S.nextInt();
        System.out.println("ingrese marca:");
        Marca=S.next();
        System.out.println("ingrese color:");
        Color=S.next();
        System.out.println("ingresar cilindraje:");
        Cilindraje=S.next();
        System.out.println("ingresar modelo:");
        Modelo =S.next();
        System.out.println("ingresar combustible:");
        Combustible=S.next();
        System.out.println("ingresar cantidad de llantas:");
        CantidadLlantas=S.nextInt();
        System.out.println("ingresar cantidad de puertas:");
        CantidadPuertas=S.nextInt();
        System.out.println("ingresar precio:");
        Precio=S.nextDouble();
        if (id == 1){
        System.out.println("ingresar turbo:");
        Turbo=S.next();
        System.out.println("ingresar seguridad:");
        Seguridad=S.next();
        
        Deportivo nuevo1 = new Deportivo(Turbo,Seguridad,Placa,Marca,Color,Cilindraje,
        Modelo,Combustible,CantidadLlantas,CantidadPuertas,Precio);
         listaDeportivo.add(nuevo1);
        System.out.println("Agregar otro s/n:");
        continuar = S.next();
         
        
            }
        
        
         }
            
        }  catch(Exception e){
             
           System.out.println("Dato incorrecto");
         }
    }

       
     
      /**
     * funcion que muestra los carros registrados
     * @author CamiloAlvarez
     * @version 1.0
     */
    public void verCarros(){
         
        
        try{
         for(Deportivo lista : listaDeportivo){
             
         System.out.println("PLACA: "+lista.getPlaca()+" "+"MARCA: "+lista.getMarca()+" "+"COLOR: "+lista.getModelo()+" "+lista.getColor()
         +" "+"PRECIO: "+lista.getPrecio()+" "+"CILINDRAJE: "+lista.getCilindraje());
      
         }
        }catch(Exception e){
            
        }
     }

}
