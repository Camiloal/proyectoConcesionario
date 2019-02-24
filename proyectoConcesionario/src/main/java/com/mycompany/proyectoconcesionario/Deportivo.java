/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoconcesionario;

import java.util.Scanner;
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

    Deportivo[] nuevo ;
    public Deportivo(){
        nuevo = new Deportivo[20];
    }
    public Deportivo(String turbo, String seguridad, int placa, String marca, String color, String cilindraje,
            String modelo, String combustible, int cantidadLlantas, int cantidadPuertas, double precio) {
        super(placa, marca, color, cilindraje, modelo, combustible, cantidadLlantas, cantidadPuertas, precio);
        this.turbo = turbo;
        this.seguridad = seguridad;
    }

 
    @Override
    public void agregarCarro() {
        
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
        System.out.println("ingresar turbo:");
        turbo = S.next();
        System.out.println("ingresar seguridad:");
        seguridad = S.next();
        Deportivo deportivo1 = new Deportivo(turbo,seguridad,getPlaca(),getMarca(),getColor(),getCilindraje(),
        getModelo(),getCombustible(),getCantidadLlantas(),getCantidadPuertas(),getPrecio());
        
         
         
        
        
   
        
    }

    

   
    
    
    
}
