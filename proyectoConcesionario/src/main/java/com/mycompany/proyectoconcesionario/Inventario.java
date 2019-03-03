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
 * clase inventario donde se realizan todas las funcones del inventario
 * @author CamiloAlvarez
 * @version 1.0
 */
public class Inventario {

    /**
     * lista creada para guardar los datos de la clase Deportivo
     */
    private List<Deportivo> listaDeportivo = new ArrayList<>();
    /**
     * lista creada para guardar los datos de la clase Maquinaria
     */
    private List<Maquinaria> listaMaquinaria = new ArrayList<>();
    /**
     * lista creada para guardar los datos de la clase Personalizado
     */
    private List<Personalizado> listaPersonalizado = new ArrayList<>();
    /**
     * lista creada para guardar los datos de la clase Estandar
     */
    private List<Estandar> listaEstandar = new ArrayList<>();
    
    /**
     * constructor vacio
     */
    public Inventario() {
    
    }
    
    
    
    /**
    * variable scanner que captura los datos que se ingresan por consola
     */
    Scanner S = new Scanner(System.in);
      /**
     * funcion que agrega un carro especifico
     * @author CamiloAlvarez
     * @version 1.0
     * @param id indica que tipo de carro se va agregar
     */
    
    
     public void agregarCarro(int id) {
         String Turbo = null;
         String Seguridad = null; 
         String capacidad;
         String tipoLlanta;
         String tipoRin;
         String tipoLuces;
         String sonido;
         
         String continuar = null;
       
       
          try{
            
        if(id<5){
        System.out.println("ingrese placa:");
        int Placa=S.nextInt();
        System.out.println("ingrese marca:");
        String Marca=S.next();
        System.out.println("ingrese color:");
        String Color=S.next();
        System.out.println("ingresar cilindraje:");
        String Cilindraje=S.next();
        System.out.println("ingresar modelo:");
        String Modelo =S.next();
        System.out.println("ingresar combustible:");
        String Combustible=S.next();
        System.out.println("ingresar cantidad de llantas:");
        int CantidadLlantas=S.nextInt();
        System.out.println("ingresar cantidad de puertas:");
        int CantidadPuertas=S.nextInt();
        System.out.println("ingresar precio:");
        double Precio=S.nextDouble();
     
        if (id == 1){
            System.out.println("ingresar turbo:");
            Turbo=S.next();
            System.out.println("ingresar seguridad:");
            Seguridad=S.next();
        
            Deportivo nuevo = new Deportivo(Turbo,Seguridad,Placa,Marca,Color,Cilindraje,
            Modelo,Combustible,CantidadLlantas,CantidadPuertas,Precio);
        
            listaDeportivo.add(nuevo);
        }else{
            if(id == 2){
                System.out.println("ingrese tipon de rines:");
                tipoRin = S.next();
                System.out.println("ingrese tipo de luces:");
                tipoLuces = S.next();
                System.out.println("ingrese sonido: ");
                sonido = S.next();
                
                Personalizado nuevoP = new Personalizado(tipoRin,tipoLuces,sonido,Placa,Marca,Color,Cilindraje,
                Modelo,Combustible,CantidadLlantas,CantidadPuertas,Precio);
                
                listaPersonalizado.add(nuevoP);
                
            }else{
            if(id==3){
                System.out.println("ingrese tipo de llantas: ");
                tipoLlanta = S.next();
                System.out.println("ingrese capasidad: : ");
                capacidad = S.next();
                
                Maquinaria nuevoM = new Maquinaria(capacidad,tipoLlanta,Placa,Marca,Color,Cilindraje,
                Modelo,Combustible,CantidadLlantas,CantidadPuertas,Precio);
                
                listaMaquinaria.add(nuevoM);
            }else{
                if(id==4){
                    System.out.println("ingrese es QP 1.si / 2.no");
                    int tipo = S.nextInt();
                    
                    Estandar nuevoE = new Estandar(tipo,Placa,Marca,Color,Cilindraje,
                    Modelo,Combustible,CantidadLlantas,CantidadPuertas,Precio);
                    
                    listaEstandar.add(nuevoE); 
                }
            
            }
            }
        }
        
        
        System.out.println("Agregar otro s/n:");
        continuar=S.next();
        
        
        
            if("s".equals(continuar)){
                     
                
        System.out.println("ingrese placa:");
        Placa=S.nextInt();
        System.out.println("ingrese marca:");
        Marca=S.next();
        System.out.println("ingrese color:");
        Color=S.next();
        System.out.println("ingresar cilindraje:");
        Cilindraje=S.next();
        System.out.println("ingresar modelo:");
        Modelo =S.next();
        System.out.println("ingresar combustible:");
        Combustible=S.next();
        System.out.println("ingresar cantidad de llantas:");
        CantidadLlantas=S.nextInt();
        System.out.println("ingresar cantidad de puertas:");
        CantidadPuertas=S.nextInt();
        System.out.println("ingresar precio:");
        Precio=S.nextDouble();
        if (id == 1){
            System.out.println("ingresar turbo:");
            Turbo=S.next();
            System.out.println("ingresar seguridad:");
            Seguridad=S.next();
        
            Deportivo nuevo = new Deportivo(Turbo,Seguridad,Placa,Marca,Color,Cilindraje,
            Modelo,Combustible,CantidadLlantas,CantidadPuertas,Precio);
        
            listaDeportivo.add(nuevo);
        }else{
            if(id == 2){
                System.out.println("ingrese tipon de rines:");
                tipoRin = S.next();
                System.out.println("ingrese tipo de luces:");
                tipoLuces = S.next();
                System.out.println("ingrese sonido: ");
                sonido = S.next();
                
                Personalizado nuevoP = new Personalizado(tipoRin,tipoLuces,sonido,Placa,Marca,Color,Cilindraje,
                Modelo,Combustible,CantidadLlantas,CantidadPuertas,Precio);
                
                listaPersonalizado.add(nuevoP);
                
            }else{
            if(id==3){
                System.out.println("ingrese tipo de llantas: ");
                tipoLlanta = S.next();
                System.out.println("ingrese capasidad: : ");
                capacidad = S.next();
                
                Maquinaria nuevoM = new Maquinaria(capacidad,tipoLlanta,Placa,Marca,Color,Cilindraje,
                Modelo,Combustible,CantidadLlantas,CantidadPuertas,Precio);
                
                listaMaquinaria.add(nuevoM);
            }else{
                if(id==4){
                    System.out.println("ingrese es QP 1.si / 2.no");
                    int tipo = S.nextInt();
                    
                    Estandar nuevoE = new Estandar(tipo,Placa,Marca,Color,Cilindraje,
                    Modelo,Combustible,CantidadLlantas,CantidadPuertas,Precio);
                    
                    listaEstandar.add(nuevoE); 
                }
                
            }
           
            
            }
        }
         
        
            
          System.out.println("Agregar otro s/n:");
          continuar=S.next();
        
         }
            
            
        }
             
           
         

          
    }catch(Exception e){
             System.out.println("Dato incorrecto");
     }
          }
     /**
      * Funcion que sirve para modificar los atributos de cualquier carro
      * @param placaM variabe por la que se identifica el carro 
      */  
     public void modificarCarros(int placaM){
        String marcaN;
        String colorN;
        String cilindrajeN;
        String modeloN;
        String combustibleN;
        int cantidadLlantasN;
        int cantidadPuertasN;
        double precioN;
        for(Deportivo listadeportivo : listaDeportivo){
            if (listadeportivo.getPlaca()== placaM){
   
                        System.out.println("ingrese marca:");
                        marcaN=S.next();
                        System.out.println("ingrese color:");
                        colorN=S.next();
                        System.out.println("ingresar cilindraje:");
                        cilindrajeN=S.next();
                        System.out.println("ingresar modelo:");
                        modeloN =S.next();
                        System.out.println("ingresar combustible:");
                        combustibleN=S.next();
                        System.out.println("ingresar cantidad de llantas:");
                        cantidadLlantasN=S.nextInt();
                        System.out.println("ingresar cantidad de puertas:");
                        cantidadPuertasN=S.nextInt();
                        System.out.println("ingresar precio:");
                        precioN=S.nextDouble(); 
                        System.out.println("ingresar turbo:");
                        String  turboN=S.next();
                        System.out.println("ingresar seguridad:");
                        String seguridadN=S.next();
                        
                        //Deportivo modificar = new Deportivo(turboN,seguridadN,placaM,marcaN,colorN,cilindrajeN,modeloN,combustibleN,cantidadLlantasN,cantidadPuertasN,precioN);
                        
                         
                       listadeportivo.setMarca(marcaN);
                       listadeportivo.setColor(colorN);
                       listadeportivo.setCilindraje(cilindrajeN);
                       listadeportivo.setModelo(modeloN);
                       listadeportivo.setCombustible(combustibleN);
                       listadeportivo.setCantidadLlantas(cantidadLlantasN);
                       listadeportivo.setCantidadPuertas(cantidadPuertasN);
                       listadeportivo.setPrecio(precioN);
                       listadeportivo.setTurbo(turboN);
                       listadeportivo.setSeguridad(seguridadN);
                       //listaDeportivo.add(listadeportivo);
                       
                       
            }
        }
            
            for(Maquinaria listamaquina : listaMaquinaria){
                if (listamaquina.getPlaca()== placaM){
                    
                        System.out.println("ingrese marca:");
                        marcaN=S.next();
                        System.out.println("ingrese color:");
                        colorN=S.next();
                        System.out.println("ingresar cilindraje:");
                        cilindrajeN=S.next();
                        System.out.println("ingresar modelo:");
                        modeloN =S.next();
                        System.out.println("ingresar combustible:");
                        combustibleN=S.next();
                        System.out.println("ingresar cantidad de llantas:");
                        cantidadLlantasN=S.nextInt();
                        System.out.println("ingresar cantidad de puertas:");
                        cantidadPuertasN=S.nextInt();
                        System.out.println("ingresar precio:");
                        precioN=S.nextDouble(); 
                        System.out.println("ingresar capacidad:");
                        String  capacidadN=S.next();
                        System.out.println("ingresar tipo de llantas:");
                        String tipoLlantaN=S.next();
                        
                        listamaquina.setMarca(marcaN);
                        listamaquina.setColor(colorN);
                        listamaquina.setCilindraje(cilindrajeN);
                        listamaquina.setModelo(modeloN);
                        listamaquina.setCombustible(combustibleN);
                        listamaquina.setCantidadLlantas(cantidadLlantasN);
                        listamaquina.setCantidadPuertas(cantidadPuertasN);
                        listamaquina.setCapacidad(capacidadN);
                        listamaquina.setTipoLlanta(tipoLlantaN);
                        
                        
                }
            }
                
                    for(Personalizado listaPersonalizado:listaPersonalizado){
                    if (listaPersonalizado.getPlaca()== placaM){
                        
                        System.out.println("ingrese marca:");
                        marcaN=S.next();
                        System.out.println("ingrese color:");
                        colorN=S.next();
                        System.out.println("ingresar cilindraje:");
                        cilindrajeN=S.next();
                        System.out.println("ingresar modelo:");
                        modeloN =S.next();
                        System.out.println("ingresar combustible:");
                        combustibleN=S.next();
                        System.out.println("ingresar cantidad de llantas:");
                        cantidadLlantasN=S.nextInt();
                        System.out.println("ingresar cantidad de puertas:");
                        cantidadPuertasN=S.nextInt();
                        System.out.println("ingresar precio:");
                        precioN=S.nextDouble(); 
                        System.out.println("ingresar tipo de rin:");
                        String  tipoRinN=S.next();
                        System.out.println("ingresar tipo de luz:");
                        String tipoLuzN=S.next();
                        System.out.println("ingresar tipo de sonido:");
                        String sonidoN=S.next();
                        
                        
                        listaPersonalizado.setMarca(marcaN);
                        listaPersonalizado.setColor(colorN);
                        listaPersonalizado.setCilindraje(cilindrajeN);
                        listaPersonalizado.setModelo(modeloN);
                        listaPersonalizado.setCombustible(combustibleN);
                        listaPersonalizado.setCantidadLlantas(cantidadLlantasN);
                        listaPersonalizado.setCantidadPuertas(cantidadPuertasN);
                        listaPersonalizado.setPrecio(precioN);
                        listaPersonalizado.setTipoRin(tipoRinN);
                        listaPersonalizado.setTipoLuz(tipoLuzN);
                        listaPersonalizado.setSonido(sonidoN);
                        
                        
                        
                     
                    } 
                    }
     }
                       
        
           
            
     
      /**
     * funcion que muestra los carros registrados
     * @author CamiloAlvarez
     * @version 1.0
     */
    public void verCarros(){
         
        

        try{
         for(Deportivo lista : listaDeportivo){
             
         System.out.println("PLACA: "+lista.getPlaca()+"  MARCA: "+lista.getMarca()+"  MODELO: "+lista.getModelo()+"  COLOR:  "+lista.getColor()
         +"  PRECIO: "+lista.getPrecio()+"  CILINDRAJE: "+lista.getCilindraje()+"  Tipo: "+" Deportivo");
         }
           for(Maquinaria listaM :listaMaquinaria){
             System.out.println("PLACA: "+listaM.getPlaca()+"  MARCA: "+listaM.getMarca()+"  MODELO: "+listaM.getModelo()+"  COLOR:  "+listaM.getColor()
         +"  PRECIO: "+listaM.getPrecio()+"  CILINDRAJE: "+listaM.getCilindraje()+"  Tipo: "+" Maquinarioa");
           }
             for(Personalizado listaP : listaPersonalizado){
                 System.out.println("PLACA: "+listaP.getPlaca()+"  MARCA: "+listaP.getMarca()+"  MODELO: "+listaP.getModelo()+"  COLOR:  "+listaP.getColor()
         +"  PRECIO: "+listaP.getPrecio()+"  CILINDRAJE: "+listaP.getCilindraje()+"  Tipo: "+" Personalizado");
             }
             for(Estandar listaE : listaEstandar){
              System.out.println("PLACA: "+listaE.getPlaca()+"  MARCA: "+listaE.getMarca()+"  MODELO: "+listaE.getModelo()+"  COLOR:  "+listaE.getColor()
         +"  PRECIO: "+listaE.getPrecio()+"  CILINDRAJE: "+listaE.getCilindraje()+"  Tipo: "+" Estandar");
             }    
                 
                 
             
         
         
         
         
        }catch(Exception e){
            
        }
     }
    
    
    
         /**
     * funcion que elimina por medio de la placa
     * @author CamiloAlvarez
     * @version 1.0
     */
    public void eliminarCarro(int placa){
        
        try{
            for (Deportivo deportivo : listaDeportivo) {
                
                if(deportivo.getPlaca()==placa){
                    listaDeportivo.remove(deportivo);
                    System.err.println("Deportivo Eliminado");
                }else{
                                    break;
                                }
            }
                    
                    for(Maquinaria maquinaria : listaMaquinaria){
                        
                        if(maquinaria.getPlaca()==placa){
                        listaMaquinaria.remove(maquinaria);
                        System.err.println("Maquina Eliminada");

                    }else{
                                    break;
                                }
                    }
                            for(Personalizado personalizado: listaPersonalizado){
                                if(personalizado.getPlaca()==placa){
                                    listaPersonalizado.remove(personalizado);
                                    System.err.println("Personalizado1 Eliminado");

                                }else{
                                    break;
                                }
                            
                }
            }catch(Exception e){
    }
    }
    
   
    
    public void carroMasyMenosCaro(int opcion){
         double mas=0;
         double menos=10;
        Carro remplazo = new Deportivo(); 
              remplazo = new Personalizado();
              remplazo = new Maquinaria();
              remplazo= new Estandar();
              
        try{
            
            if(opcion==9){
                for (Deportivo deportivo : listaDeportivo) {
                
                    if(deportivo.getPrecio()>= mas){
                       mas=deportivo.getPrecio();
                       remplazo=deportivo;
                    }
                }
                    
                for(Maquinaria maquinaria : listaMaquinaria){
                        
                    if(maquinaria.getPrecio()>= mas){
                       mas=maquinaria.getPrecio();
                       remplazo=maquinaria;
                    }

                }
                for(Personalizado personalizado: listaPersonalizado){
                    if(personalizado.getPrecio()>= mas){
                       mas=personalizado.getPrecio();
                       remplazo=personalizado;
                    }
                    
                }
                for(Estandar estandar: listaEstandar){
                    if(estandar.getPrecio()>=mas){
                       mas=estandar.getPrecio();
                        remplazo =estandar;
                    }
                                  
                }
                                
                System.out.println("El carro mas caro es:  Marca: "+remplazo.getMarca()+" Color: "+remplazo.getColor()+" Tipo:  Deportivo  Precio: "+remplazo.getPrecio());
            }else{
                for (Deportivo deportivo : listaDeportivo) {
                    if(deportivo.getPrecio()<= menos){
                        menos=deportivo.getPrecio();
                        remplazo=deportivo;
                    }
                }
                    
                for(Maquinaria maquinaria : listaMaquinaria){
                    if(maquinaria.getPrecio()<= menos){
                        remplazo=maquinaria;
                        menos=maquinaria.getPrecio();
                    }
                }
                
                for(Personalizado personalizado: listaPersonalizado){
 
                    if(personalizado.getPrecio()<= menos){                      
                        menos=personalizado.getPrecio();
                        remplazo=personalizado;
                    }           
                }
                for(Estandar estandar: listaEstandar){
                    if(estandar.getPrecio()<=menos){
                       menos=estandar.getPrecio();
                       remplazo =estandar;
                    }
                }
                                
                System.out.println("El carro mas barato es:  Marca: "+remplazo.getMarca()+" Color: "+remplazo.getColor()+" Tipo:  Deportivo  Precio: "+remplazo.getPrecio());
                                   
                                }
                            }catch(Exception e){
            }
    }
    

    public List<Deportivo> getListaDeportivo() {
        return listaDeportivo;
    }

    public void setListaDeportivo(List<Deportivo> listaDeportivo) {
        this.listaDeportivo = listaDeportivo;
    }

    public List<Maquinaria> getListaMaquinaria() {
        return listaMaquinaria;
    }

    public void setListaMaquinaria(List<Maquinaria> listaMaquinaria) {
        this.listaMaquinaria = listaMaquinaria;
    }

    public List<Personalizado> getListaPersonalizado() {
        return listaPersonalizado;
    }

    public void setListaPersonalizado(List<Personalizado> listaPersonalizado) {
        this.listaPersonalizado = listaPersonalizado;
    }

    public List<Estandar> getListaEstandar() {
        return listaEstandar;
    }

    public void setListaEstandar(List<Estandar> listaEstandar) {
        this.listaEstandar = listaEstandar;
    }

    public Scanner getS() {
        return S;
    }

    public void setS(Scanner S) {
        this.S = S;
    }
     
    
}

    
       
        
    


