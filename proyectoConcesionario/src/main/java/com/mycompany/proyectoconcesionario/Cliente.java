/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoconcesionario;

/**
 *clase que hereda atributos de la clase persona
 * @version 1.0
 * @author Hernan
 */
public class Cliente extends Persona {
   /**
    *   Variable que indica la cantidad de dinero del cliente
    */ 
   private int dineroDisponible;
   
   /**
    *   variable que indica el usuario del cliente
    */
   private String usuario;
   
   /**
    *   varibe que indica la contrasena del cliente 
    */
   private String clave;

   /**
    * Constructor para inicializar las variables 
    * @param dineroDisponible
    * @param usuario
    * @param clave
    * @param nombre
    * @param apellido
    * @param cedula
    * @param direccional 
    */
    public Cliente(int dineroDisponible, String usuario, String clave, String nombre, String apellido, double cedula, String direccional) {
        super(nombre, apellido, cedula, direccional);
        this.dineroDisponible = dineroDisponible;
        this.usuario = usuario;
        this.clave = clave;
    }
     /**
     * metodo para volver la variable publica
     * @return 
     */
    public int getDineroDisponible() {
        return dineroDisponible;
    }
     /**
     * metodo para volver la variable publica
     * @return 
     */
    public void setDineroDisponible(int dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }
     /**
     * metodo para volver la variable publica
     * @return 
     */
    public String getUsuario() {
        return usuario;
    }
     /**
     * metodo para volver la variable publica
     * @return 
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
     /**
     * metodo para volver la variable publica
     * @return 
     */
    public String getClave() {
        return clave;
    }
     /**
     * metodo para volver la variable publica
     * @return 
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
   
    
    
    
}
