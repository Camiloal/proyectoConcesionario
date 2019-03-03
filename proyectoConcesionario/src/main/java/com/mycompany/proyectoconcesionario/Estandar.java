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
public class Estandar extends Carro{

    private int tipo;

    public Estandar() {
    }

    public Estandar(int tipo) {
        this.tipo = tipo;
    }

    public Estandar(int tipo, int placa, String marca, String color, String cilindraje, String modelo, String combustible, int cantidadLlantas, int cantidadPuertas, double precio) {
        super(placa, marca, color, cilindraje, modelo, combustible, cantidadLlantas, cantidadPuertas, precio);
        this.tipo = tipo;
    }

    

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
