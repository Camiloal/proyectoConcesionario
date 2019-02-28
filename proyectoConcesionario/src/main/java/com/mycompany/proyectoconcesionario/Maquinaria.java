/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoconcesionario;

import java.util.Scanner;

/**
 * Clase hija maquinaria que hereda de la clase Carro 
 * @version 1.0
 * @author Hernan
 */
public class Maquinaria extends Carro {
    /**
     *   Variable que indica la capacidad que sopota la maquinaria
     */
    private String capacidad;
    
    /**
     *  variable que indica el tipo de llanta que debe utilizar la maquinaria 
     */
    private String tipoLlanta;
    
    /**
     *  variable que guarda el arreglo
     */
    Maquinaria[] nuevo;
    
    public Maquinaria(){
    nuevo = new Maquinaria[20];
    }

    /**
     * Constructor de la clase hija Maquinaria 
     * @param capacidad
     * @param tipoLlanta
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
    public Maquinaria(String capacidad, String tipoLlanta, int placa, String marca, String color, String cilindraje, String modelo, String combustible, int cantidadLlantas, int cantidadPuertas, double precio) {
        super(placa, marca, color, cilindraje, modelo, combustible, cantidadLlantas, cantidadPuertas, precio);
        this.capacidad = capacidad;
        this.tipoLlanta = tipoLlanta;
       
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipoLlanta() {
        return tipoLlanta;
    }

    public void setTipoLlanta(String tipoLlanta) {
        this.tipoLlanta = tipoLlanta;
    }

    public Maquinaria[] getNuevo() {
        return nuevo;
    }

    public void setNuevo(Maquinaria[] nuevo) {
        this.nuevo = nuevo;
    }
    
   
    }
