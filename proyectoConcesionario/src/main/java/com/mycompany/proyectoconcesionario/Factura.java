/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoconcesionario;

import java.util.ArrayList;
import java.util.List;

/**
 *clase que obtendra los datos de cada factura
 * 
 * @author CamiloAlvarez
 * @version 1.0
 */
public class Factura {
    /**
     * varible que indica la serie de cada factura
     */
    private int codigoFactura;
    /**
     * varible que suma el iva a cada producto
     */
    private int iva;
    /**
     * varible que indica el valor total de laventa
     */
    private double valorTotal;
    /**
     * variable que indica la fecha de la venta 
     * 
     */
    private String fechaVenta;
    
    /**
     * lista que indica las ventas 
     *
     */
     private List<Factura> listaVentas = new ArrayList<>();

     
     
     
     
     
     
        /**
     * metodo para volver la variable publica
     * @return 
     */
    public int getCodigoFactura() {
        return codigoFactura;
    }
     /**
     * metodo para volver la variable publica
     * @return 
     */
    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }
   /**
     * metodo para volver la variable publica
     * @return 
     */
    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }
   /**
     * metodo para volver la variable publica
     * @return 
     */
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
   /**
     * metodo para volver la variable publica
     * @return 
     */
    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
   /**
     * metodo para volver la variable publica
     * @return 
     */
    public List<Factura> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(List<Factura> listaVentas) {
        this.listaVentas = listaVentas;
    }
     
     
}
