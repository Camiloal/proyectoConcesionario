/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoconcesionario;

import java.util.Scanner;

/**
 * clase inventario donde se realizan todas las funcones del inventario
 * @author CamiloAlvarez
 * @version 1.0
 */
public class Inventario {

    /**
     * arreglo que contiene un odjeto de la clase Deportivo
     */
    Deportivo[] lista = new Deportivo[20];
    /**
     * constructos vacio
     */
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
     public void agregarCarro(int id) {
         
         
         String continuar = null;
         int pocicion=0;
         try{
         for(pocicion=0;pocicion<lista.length;pocicion++){             
           lista[pocicion].getColor();
           
         }
         }catch(Exception e){
             
         }
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
        String Turbo=S.next();
        System.out.println("ingresar seguridad:");
        String Seguridad=S.next();
        
        lista[pocicion] = new Deportivo(Turbo,Seguridad,Placa,Marca,Color,Cilindraje,
        Modelo,Combustible,CantidadLlantas,CantidadPuertas,Precio);
        
        System.out.println("Agregar otro s/n:");
        continuar=S.next();
        
         
        
        
        
        for(int i=1;i<lista.length;i++){
        
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
        
        lista[i] = new Deportivo(Turbo,Seguridad,Placa,Marca,Color,Cilindraje,
        Modelo,Combustible,CantidadLlantas,CantidadPuertas,Precio);
        System.out.println("Quieres ingresar otro Carro S/N::");
        continuar = S.next();
         
        
            }
        
        
         }else{
                
                    break;
                
            
        }
            }
        }  
         }catch(Exception e){
             
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
         for(int i=0;i<lista.length;i++){
             
         System.out.println("PLACA: "+lista[i].getPlaca()+" "+"MARCA: "+lista[i].getMarca()+" "+"COLOR: "+lista[i].getModelo()+" "+lista[i].getColor()
         +" "+"PRECIO: "+lista[i].getPrecio()+" "+"CILINDRAJE: "+lista[i].getCilindraje());
      
         }
        }catch(Exception e){
            
        }
     }
    
    public void eliminarCarros(){
        
        int eliminarPlaca;
        
        System.out.println("ingresa la placa del carro que vas a eliminar");
        eliminarPlaca = S.nextInt();
        
        try{
           for(int i=0;i<lista.length;i++){
           if(lista[i].getPlaca()==eliminarPlaca){
               lista[i]=null;
               System.out.println("Carro Eliminado");
               i=21;
           }
           
           }
        }catch(Exception e){
            
        }
    }
}
