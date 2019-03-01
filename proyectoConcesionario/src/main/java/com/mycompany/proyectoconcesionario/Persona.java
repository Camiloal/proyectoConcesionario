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
     *  variable que indica el telefono de la persona
     */
    private double telefono;
    /**
     *  variable que indica la direccion de la persona
     */
    private String direccional;

    /**
     * Contructor de la clase padre 
     * @param nombre
     * @param apellido
     * @param telefono
     * @param direccional 
     */
    public Persona(String nombre, String apellido, double telefono, String direccional) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccional = direccional;
        
        
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
    public double getTelefono() {
        return telefono;
    }
    /**
     * metodo para volver la variable publica
     * @return 
     */
    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }
    /**
     * metodo para volver la variable publica
     * @return 
     */
    public String getDireccional() {
        return direccional;
    }
    /**
     * metodo para volver la variable publica
     * @return 
     */
    public void setDireccional(String direccional) {
        this.direccional = direccional;
    }
    
    
    
   
    
    
}





