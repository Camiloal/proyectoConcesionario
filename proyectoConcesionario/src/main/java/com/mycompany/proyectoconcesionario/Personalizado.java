/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoconcesionario;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Personalizado extends Carro{
    /**
     *  variable que indica el tipo de rin que desea
     */
    private String tipoRin;
    
    /**
     *  variable que indica el tipo de luces que desea 
     */
    private String tipoLuz;
    
    /**
     * variable que indica el tipo de sonido que desea 
     */
    private String sonido;
    Personalizado[]  nuevo;
    
    
    
    public Personalizado(){
    nuevo = new Personalizado[20];
    }

    /**
     * Constructor que inicializa las variables 
     * @param tipoRin
     * @param tipoLuz
     * @param sonido
     * @param placa
     * @param marca
     * @param color
     * @param cilindraje
     * @param modelo
     * @param combustible
     * @param cantidadLlantas
     * @param cantidadPuertas
     * @param precio 
     */
    public Personalizado(String tipoRin, String tipoLuz, String sonido, int placa, String marca, String color, String cilindraje, String modelo, String combustible, int cantidadLlantas, int cantidadPuertas, double precio) {
        super(placa, marca, color, cilindraje, modelo, combustible, cantidadLlantas, cantidadPuertas, precio);
        this.tipoRin = tipoRin;
        this.tipoLuz = tipoLuz;
        this.sonido = sonido;
       }


  
    
    
}
