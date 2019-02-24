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


    @Override
    public void agregarCarro(){
     Scanner S = new Scanner(System.in);
        System.out.println("ingrese placa:");
        setPlaca(S.nextInt());
        System.out.println("ingrese marca:");
        setMarca(S.next());
        System.out.println("ingrese color:");
        setColor(S.next());
        System.out.println("ingresar cilindraje:");
        setCilindraje(S.next());
        System.out.println("ingresar modelo:");
        setModelo(S.next());
        System.out.println("ingresar combustible:");
        setCombustible(S.next());
        System.out.println("ingresar cantidad de llantas:");
        setCantidadLlantas(S.nextInt());
        System.out.println("ingresar cantidad de puertas:");
        setCantidadPuertas(S.nextInt());
        System.out.println("ingresar precio:");
        setPrecio(S.nextDouble());
        System.out.println("ingresar el tipo de  sonido :");
        sonido = S.next();
        System.out.println("ingresar el tipo de luz:");
        tipoLuz = S.next();
        System.out.println("ingresar el tipo de rin :");
        tipoRin = S.next();
        
        nuevo[0]= new Personalizado (sonido,tipoLuz,tipoRin,getPlaca(),getMarca(),getColor(),getCilindraje(),
        getModelo(),getCombustible(),getCantidadLlantas(),getCantidadPuertas(),getPrecio());
        
    }
    
    
}
