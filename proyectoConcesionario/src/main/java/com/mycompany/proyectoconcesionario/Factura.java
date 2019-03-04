/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoconcesionario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *clase que obtendra los datos de cada factura
 * 
 * @author CamiloAlvarez
 * @version 1.0
 */
public class Factura {
    /**
     * varible que indica la serie de cada factura
     */
    private int codigoFactura;

    /**
     * varible que indica el valor total de laventa
     */
    private double valorTotal;
    /**
     * variable que indica la fecha de la venta 
     * 
     */
    private Date fecha = new Date();
    
    /**
     * objeto que indica las ventas 
     *
     */
     private Venta agrega = new Venta();
    /**
     * objeto persona
     */
     private Persona personaV = new Persona();
    /**
     * objeto carro
     */
     Carro selec = new Deportivo();
     /**
      * sirve para capturar datos de consola
      */
      Scanner S = new Scanner(System.in);
      /**
       * lista que contiene todas las facturas
       */
   List<Factura> listaF = new ArrayList<>();
   /**
    * constructor que indica todos los datos
    * @param codigo
    * @param fecha
    * @param persona
    * @param carro 
    */
    public Factura(int codigo,Date fecha,Persona persona,Carro carro) {
        
    }

    public Factura() {
    }
      
      /**
       * funcion que agrega una venta y recibe dos parametros
       * @param listaCarro
       * @param listaPersona 
       */
     public void agregarVenta(List<Carro> listaCarro,List<Cliente> listaPersona){
    
              codigoFactura = (int) (Math.random() * 100) + 1;
              PersonalTotal select = new PersonalTotal();
              Inventario ver = new Inventario();
              System.out.println("Usuario: ");
              String usuario = S.next();
              System.out.println("clave: ");
              String clave = S.next();
                
           try{   
             for(Cliente seleccionC : listaPersona){
             if(seleccionC.getUsuario().equals(usuario)&&seleccionC.getClave().equals(clave)){
                 personaV=seleccionC;
                 
             }else{
                 System.out.println("usuario o cantraseña incorrectos");
             }
         }
         
         
            
               
               
         for(Carro lista : listaCarro){
             
         System.out.println("PLACA: "+lista.getPlaca()+"  MARCA: "+lista.getMarca()+"  MODELO: "+lista.getModelo()+"  COLOR:  "+lista.getColor()
         +"  PRECIO: "+lista.getPrecio()+"  CILINDRAJE: "+lista.getCilindraje()+"  Tipo: "+" Deportivo");
         }
         System.out.println("Ingrese la placa del carro a comprar: ");
         int placa = S.nextInt();
         
         selec = agrega.seleccionarCarro(placa,listaCarro);
         
               System.out.println("Quien te atendio:");
                System.out.println("");
               
               
         
        }catch(Exception e){
            
        }
              Factura nueva = new  Factura(codigoFactura,fecha,personaV,selec);
              
            
              listaF.add(nueva);
           } 
         
     /**
      * funcion que muestra la factura
      */
     public void verFactura(){
         
         for(Factura lista: listaF){
         System.out.println("Codigo Factura.  "+lista.codigoFactura);
             System.out.println("Fecha.  "+lista.fecha);
             System.out.println("");
             System.out.println("Nombre:  "+lista.personaV.getNombre()+"  Apellido:  "+lista.personaV.getApellido()
             +"  Direccion:  "+lista.personaV.getDireccion());
             System.out.println("");
             System.out.println("Compraste---Carro---------");
             System.out.println("Marca:  "+lista.selec.getMarca()+"  Color:  "+lista.selec.getColor()+"  Modelo:  "+lista.selec.getModelo());
             System.out.println("Con un total de:  "+lista.selec.getPrecio());
             System.out.println("");
         }
     }
         
        /**
     * metodo para volver la variable publica
     * @return 
     */
    public int getCodigoFactura() {
        return codigoFactura;
    }
     /**
     * metodo para volver la variable publica
     * @return 
     */
    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }
   /**
     * metodo para volver la variable publica
     * @return 
     */

   /**
     * metodo para volver la variable publica
     * @return 
     */
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

   

    public Venta getAgrega() {
        return agrega;
    }

    /**
     * metodo para volver la variable publica
     * @return 
     */
    public void setAgrega(Venta agrega) {   
        this.agrega = agrega;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Persona getPersonaV() {
        return personaV;
    }

    public void setPersonaV(Persona personaV) {
        this.personaV = personaV;
    }
     
     
}
