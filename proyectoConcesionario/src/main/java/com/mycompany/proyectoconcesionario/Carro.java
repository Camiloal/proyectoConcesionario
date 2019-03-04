/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoconcesionario;

/**
 *Clase paredre que hereda a sus hijas variables y funciones en comun
 * @author CamiloAlvarez
 * @version 1.0
 */
public  abstract class Carro {
    /**
     * variable que indica la placa del carro
     */
    private int placa;
    /**
     * variable que indica la marca del carro
     */
    private String marca;
    /**
     * variable que indica el color del carro
     */
    private String color;
    /**
     * variable que indica el cilindraje del carro
     */
    private String cilindraje;
    /**
     * variable que indica el modelo del carro
     */
    private String modelo;
    /**
     * variable que indica el combustible del carro
     */
    private String combustible;
    /**
     * variable que indica la cantidad de llantas del carro
     */
    private int cantidadLlantas;
    /**
     * variable que indica la cantidad de puertas del carro
     */
    private int cantidadPuertas;
    /**
     * variable que indica ele precio del carro
     */
    private double precio;

    /**
     * constructor vacio 
     */
    public Carro() {
    }
    

    /**
     * Constructor que recibe todos los parametros  para ejecutar.
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
    public Carro(int placa, String marca, String color, String cilindraje,String modelo,
            String combustible, int cantidadLlantas, int cantidadPuertas, double precio) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.cilindraje = cilindraje;
        this.modelo = modelo;
        this.combustible = combustible;
        this.cantidadLlantas = cantidadLlantas;
        this.cantidadPuertas = cantidadPuertas;
        this.precio = precio;
    }
    
   /**
    * trae  el dato de placa
    * @return 
    */
    public int getPlaca() {
        return placa;
    }
    /**
    * guarda el dato de placa
    * @return 
    */
    public void setPlaca(int placa) {
        this.placa = placa;
    }
    /**
    * trae el dato de marca
    * @return 
    */
    public String getMarca() {
        return marca;
    }
     /**
    * guarda el dato de marca
    * @return 
    */
    public void setMarca(String marca) {
        this.marca = marca;
    }
     /**
    * trae el dato de color
    * @return 
    */
    public String getColor() {
        return color;
    }
     /**
    * guarda el dato de color
    * @return 
    */
    public void setColor(String color) {
        this.color = color;
    }

     /**
    * trae el dato de cilinfraje
    * @return 
    */
    public String getCilindraje() {
        return cilindraje;
    }
    /**
    * guarda el dato de cilinfraje
    * @return 
    */
    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getCantidadLlantas() {
        return cantidadLlantas;
    }

    public void setCantidadLlantas(int cantidadLlantas) {
        this.cantidadLlantas = cantidadLlantas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
