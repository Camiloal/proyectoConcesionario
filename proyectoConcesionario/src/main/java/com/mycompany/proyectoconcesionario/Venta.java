/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoconcesionario;

import java.util.List;

/**
 *
 * @author CamiloAlvarez
 */
public class Venta {
      
    private int codigoVenta;
    private Carro seleccion = new Carro(){};
    public Venta() {
          
    }
    
    public Carro seleccionarCarro(int placa,List<Carro> listaCarro){
        Inventario selecc = new Inventario();
   
        for(Carro seleccionD : listaCarro ){
           
           if(seleccionD.getPlaca()==placa){
               
               seleccion = seleccionD;
           }
           
       }
             return seleccion;
        
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
