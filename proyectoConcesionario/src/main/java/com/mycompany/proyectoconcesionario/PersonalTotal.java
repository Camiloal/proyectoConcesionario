/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoconcesionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *Clase donde se llevara el control del personal 
 * @version 1.0
 * @author Hernan
 */
public class PersonalTotal {
    
     /**
     * lista creada para guardar los datos de la clase empleado
     */
    private List<Empleado> listaEmpleado = new ArrayList<>();
    /**
     * lista creada para guardar los datos de la cliente
     */
    private List<Cliente> listacCliente = new ArrayList<>();
    
   
    
    /**
    * variable scanner que captura los datos que se ingresan por consola
    */
    Scanner S = new Scanner(System.in);
    
    /**
     * funcion que permite agregar nuevas personas 
     * @param id variable que sirve para identificar que tipo de persona agregar
     */    
     public void agregarPersona (int id) {
         Double salario;
         String experienciaLaboral; 
         String eps;
         int dineroDisponible;
         String usuario;
         String clave;
         
         
         String continuar = null;
         
         
         try{
         
        if(id<3){
            
        System.out.println("ingrese nombre:");
        String Nombre=S.next();
        System.out.println("ingrese apellido:");
        String Apellido=S.next();
        System.out.println("ingrese cedula:");
        Double Cedula=S.nextDouble();
        System.out.println("ingresar direccion:");
        String Direccion=S.next();
       
        
        if (id == 1){
        System.out.println("ingresar dinero disponible:");
        dineroDisponible=S.nextInt();
        System.out.println("ingresar usuario:");
        usuario=S.next();
        System.out.println("ingresar cleve:");
        clave=S.next();

        Cliente nuevo = new Cliente(dineroDisponible,usuario,clave,Nombre,Apellido,Cedula,
        Direccion);

        listacCliente.add(nuevo);
        }else{
            if(id == 2){
                System.out.println("ingrese salario:");
                salario = S.nextDouble();
                System.out.println("ingrese experiencia laboral:");
                experienciaLaboral = S.next();
                System.out.println("ingrese eps del empleado:");
                eps = S.next();
               
                
                Empleado nuevoE = new Empleado(salario,experienciaLaboral,Nombre,Apellido,eps,Cedula,
                Direccion);
                
                listaEmpleado.add(nuevoE);
                }
            } 
        
        
        System.out.println("Agregar otro s/n:");
        continuar=S.next();
        
         if("s".equals(continuar)){
        
        if (id == 1){
        System.out.println("ingresar dinero disponible:");
        dineroDisponible=S.nextInt();
        System.out.println("ingresar usuario:");
        usuario=S.next();
        System.out.println("ingresar cleve:");
        clave=S.next();
        }
         System.out.println("ingrese nombre:");
        Nombre=S.next();
        System.out.println("ingrese apellido:");
        Apellido=S.next();
        System.out.println("ingrese telefono:");
        Cedula=S.nextDouble();
        System.out.println("ingresar direccion:");
        Direccion=S.next();
        
        if (id == 1){
        System.out.println("ingresar dinero disponible:");
        dineroDisponible=S.nextInt();
        System.out.println("ingresar usuario:");
        usuario=S.next();
        System.out.println("ingresar cleve:");
        clave=S.next();

        Cliente nuevo = new Cliente(dineroDisponible,usuario,clave,Nombre,Apellido,Cedula,
        Direccion);

        listacCliente.add(nuevo);
        }else{
           if(id == 2){
                System.out.println("ingrese salario:");
                salario = S.nextDouble();
                System.out.println("ingrese experiencia laboral:");
                experienciaLaboral = S.next();
                System.out.println("ingrese eps del empleado:");
                eps = S.next();
               
                
                Empleado nuevoE = new Empleado(salario,experienciaLaboral,Nombre,Apellido,eps,Cedula,
                Direccion);
                
                listaEmpleado.add(nuevoE);
                }
        
            }
        }
         System.out.println("Agregar otro s/n:");
         continuar=S.next();
        }
        }catch(Exception e){
             System.out.println("Dato incorrecto");
        }       
    }
     
     
     /**
      * Funcion que permite modificar los atributos de las personas 
      * @param cedulaM variable por la que se identifica la persona a  modificar
      * 
      */
       public void modificarPersona(int cedulaM){ 
       
           for(Cliente listaclientes : listacCliente)
            if (listaclientes.getCedula()== cedulaM){

                System.out.println("ingresar dinero disponible:");
                int dineroDisponibleN=S.nextInt();
                System.out.println("ingresar usuario:");
                String usuarioN=S.next();
                System.out.println("ingresar cleve:");
                String claveN=S.next();
                System.out.println("ingrese nombre:");
                String NombreN=S.next();
                System.out.println("ingrese apellido:");
                String ApellidoN=S.next();
                System.out.println("ingrese cedula:");
                Double CedulaN=S.nextDouble();
                System.out.println("ingresar direccion:");
                String DireccionN=S.next();
           
                listaclientes.setDineroDisponible(dineroDisponibleN);
                listaclientes.setUsuario(usuarioN);
                listaclientes.setClave(claveN);
                listaclientes.setNombre(NombreN);
                listaclientes.setApellido(ApellidoN);
                listaclientes.setDireccion(DireccionN);
                
                
                
            
            }else{
             for(Empleado listaempleado : listaEmpleado)
            if (listaempleado.getCedula()== cedulaM){
                System.out.println("ingrese salario:");
                Double salarioN = S.nextDouble();
                System.out.println("ingrese experiencia laboral:");
                String experienciaLaboralN = S.next();
                System.out.println("ingrese eps del empleado:");
                String epsN = S.next();
                System.out.println("ingrese nombre del empleado:");
                String NombreN=S.next();
                System.out.println("ingrese apellido:");
                String ApellidoN=S.next();
                System.out.println("ingrese cedula:");
                Double CedulaN=S.nextDouble();
                System.out.println("ingresar direccion:");
                String DireccionN=S.next();
                
                listaempleado.setSalario(salarioN);
                listaempleado.setExperienciaLaboral(experienciaLaboralN);
                listaempleado.setEps(epsN);
                listaempleado.setNombre(NombreN);
                listaempleado.setApellido(ApellidoN);
                listaempleado.setDireccion(DireccionN);
                
            }
             
            }
               
       }
       
       /**
        * Funcion que muestra todas las personas agregadas 
        */
       public void mostrarPersonas (){
       try{
         for(Cliente lista : listacCliente){
             
         System.out.println("Nombre: "+lista.getNombre()+"  Apellido: "+lista.getApellido()+"  Cedula: "+lista.getCedula()+"  Direccion:  "+lista.getDireccion()
         +"  DineroDisponible: "+lista.getDineroDisponible()+"  Usuario: "+lista.getUsuario()+"  Clave: "+lista.getClave()+"  Tipo: "+" Cliente");
         }
       
         for(Empleado listaE : listaEmpleado){
             
        System.out.println("Nombre: "+listaE.getNombre()+"  Apellido: "+listaE.getApellido()+"  Cedula: "+listaE.getCedula()+"  Direccion:  "+listaE.getDireccion()
         +"  Experienca Laboral: "+listaE.getExperienciaLaboral()+"  Salario: "+listaE.getSalario()+"  EPS: "+listaE.getEps()+"  Tipo: "+" Empleado");
         
         
         }
       
           }catch(Exception e){
            
        }
       
       
       }
       
        public void eliminarPersona(int cedula){
        try{
           for (Cliente cliente : listacCliente) {
                
                if(cliente.getCedula()== cedula){
                    listacCliente.remove(cliente);
                    System.err.println("Cliente Eliminado");
                }else{
                                    break;
                                }
            }
           
                    for (Empleado empleado : listaEmpleado) {
                
                        if(empleado.getCedula()== cedula){
                            listaEmpleado.remove(empleado);
                            System.err.println("Empleado Eliminado");
                        }else{
                                            break;
                                        }
                    }
        
        }catch(Exception e){
        }
        
        }
       
       
     
     
}

