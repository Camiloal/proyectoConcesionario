/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoconcesionario;

/**
 *clase que hereada atributos de la clase persona
 * @author Hernan
 * @version 1.0
 */
public class Empleado extends Persona{
    /**
     *  variable que indica el salario de cada empleado 
     */
    private double salario;
    /**
     * variable que indica la experiencia laboral de cada empleado
     */
    private String experienciaLaboral;
    /**
     *  variable que indica la eps a la que pertenece cada empleado
     */
    private String eps;
/**
 * constructor vacio
 */
    public Empleado() {
    }

    /**
     * Constructor que inicializa las variables 
     * @param salario
     * @param experienciaLaboral
     * @param eps
     * @param nombre
     * @param apellido
     * @param cedula
     * @param direccional 
     */
    public Empleado(double salario, String experienciaLaboral, String eps, String nombre, String apellido, double cedula, String direccional) {
        super(nombre, apellido, cedula, direccional);
        this.salario = salario;
        this.experienciaLaboral = experienciaLaboral;
        this.eps = eps;
    }
     /**
     * metodo para volver la variable publica
     * @return 
     */
    public double getSalario() {
        return salario;
    }
     /**
     * metodo para volver la variable publica
     * @return 
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    /**
     * metodo para volver la variable publica
     * @return 
     */
    public String getExperienciaLaboral() {
        return experienciaLaboral;
    }
     /**
     * metodo para volver la variable publica
     * @return 
     */
    public void setExperienciaLaboral(String experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }
     /**
     * metodo para volver la variable publica
     * @return 
     */
    public String getEps() {
        return eps;
    }
     /**
     * metodo para volver la variable publica
     * @return 
     */
    public void setEps(String eps) {
        this.eps = eps;
    }
    
    
}
