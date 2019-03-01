/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoconcesionario;

/**
 *
 * @author Hernan clase que heredara atributos para las clases cliente y vendedor
 * @version 1.0
 */
public class Persona {
    /**
     *  variable que indica el nombre de la persona
     */
    private String nombre;
    /**
     *  variable que indica el apellido de la persona
     */
    private String apellido;
    /**
     *  variable que indica la cedula de la persona
     */
    private double cedula;
    /**
     *  variable que indica la direccion de la persona
     */
    private String direccion;

    /**
     * Contructor de la clase padre 
     * @param nombre
     * @param apellido
     * @param cedula
     * @param direccion
     */
    public Persona(String nombre, String apellido, double cedula, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        
        
    }

    /**
     * metodo para volver la variable publica
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * metodo para volver la variable publica
     * @return 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * metodo para volver la variable publica
     * @return 
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * metodo para volver la variable publica
     * @return 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * metodo para volver la variable publica
     * @return 
     */
    public double getCedula() {
        return cedula;
    }
    /**
     * metodo para volver la variable publica
     * @return 
     */
    public void setCedula(double cedula) {
        this.cedula = cedula;
    }
    /**
     * metodo para volver la variable publica
     * @return 
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * metodo para volver la variable publica
     * @return 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
   
    
    
}





