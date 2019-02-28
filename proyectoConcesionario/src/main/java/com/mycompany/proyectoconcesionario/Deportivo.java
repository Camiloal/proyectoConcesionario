/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoconcesionario;


/**
 *clase hija especificar un tipo de carro
 * @author CamiloAlvarez
 * @version  1.0
 */
public class Deportivo extends Carro{
    /**
     * variable que indica el turbo del deportivo
     */
    private String turbo;
    /**
     * variable que indica la seguridad del deportivo
     */
    private String seguridad;

    /** 
     * constructor vacio
     */
    public Deportivo(){
        
    }
    /**
     * constructor que recibe los parametros minimos para ejecutar.......
     * @param turbo indica el turbo del carro
     * @param seguridad indica la seguridad del carro
     * @param placa indica la placa del carro
     * @param marca indica la marca del carro
     * @param color indica el color del carro
     * @param cilindraje indica el cilindraje del carro
     * @param modelo indica el modelo del carro
     * @param combustible indica el combustible del carro
     * @param cantidadLlantas indica la cantidad de llantas
     * @param cantidadPuertas indica la cantidad de puertas del carro
     * @param precio indica el precio del carro
     */
    public Deportivo(String turbo, String seguridad, int placa, String marca, String color, String cilindraje,
            String modelo, String combustible, int cantidadLlantas, int cantidadPuertas, double precio) {
        super(placa, marca, color, cilindraje, modelo, combustible, cantidadLlantas, cantidadPuertas, precio);
        this.turbo = turbo;
        this.seguridad = seguridad;
    }

    

    public String getTurbo() {
        return turbo;
    }

    public void setTurbo(String turbo) {
        this.turbo = turbo;
    }

    public String getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
    }

    

   
    
    
    
}
