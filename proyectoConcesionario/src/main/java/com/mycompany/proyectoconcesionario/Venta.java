/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoconcesionario;

/**
 *
 * @author CamiloAlvarez
 */
public class Venta {
      
    private int codigoVenta;
    private Carro seleccion = new Carro(){};
    public Venta() {
          
    }
    
    public void seleccionarCarro(int placa){
        
        Inventario inv = new Inventario();
       
       for(Carro seleccionD : inv.getListaDeportivo() ){
           
           if(seleccionD.getPlaca()==placa){
               
               seleccion = seleccionD;
           }
           
       }
         for(Carro seleccionE : inv.getListaEstandar()){
           
           if(seleccionE.getPlaca()==placa){
               
               seleccion = seleccionE;
           }
           
       }
           for(Carro seleccionM : inv.getListaMaquinaria()){
           
           if(seleccionM.getPlaca()==placa){
               
               seleccion = seleccionM;
           }
           
       }
             for(Carro seleccionP : inv.getListaPersonalizado()){
           
           if(seleccionP.getPlaca()==placa){
               
               seleccion = seleccionP;
           }
           
       } 
        
    }

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public Carro getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Carro seleccion) {
        this.seleccion = seleccion;
    }
    
    
    
}
