/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder;

import com.mycompany.Paquete.Paquete;
import com.mycompany.Pedido.Pedido;
import com.mycompany.Servicio.TipoServicio;

/**
 * Implementación del IPedidoBuilder para construir un objeto Pedido.
 * Proporciona métodos para establecer cada parámetro de un Pedido y lo construye con el método build.
 * 
 * @author José Ángel Huerta Amparán
 */
public class PedidoBuilder implements IPedidoBuilder {
    private Paquete paquete;
    private double distancia;
    private TipoServicio tipoServicio;
    
    /**
     * Establece el tipo de servicio para el pedido.
     * 
     * @param tipoServicio El tipo de servicio (Estandar o Express).
     * @return La instancia de PedidoBuilder para permitir el encadenamiento de métodos.
     */
    @Override
    public PedidoBuilder setServicio(TipoServicio tipoServicio){
        this.tipoServicio = tipoServicio;
        return this;
    }
    
    /**
     * Establece el tipo de paquete para el pedido.
     * 
     * @param paquete El paquete que se va a enviar.
     * @return La instancia de PedidoBuilder para permitir el encadenamiento de métodos.
     */
    @Override
    public PedidoBuilder setPaquete(Paquete paquete){
        this.paquete = paquete;
        return this;
    }
    
    /**
     * Establece la distancia del pedido.
     * 
     * @param distancia La distancia en kilómetros que recorrerá el pedido.
     * @return La instancia de PedidoBuilder para permitir el encadenamiento de métodos.
     */
    @Override
    public PedidoBuilder setDistancia(double distancia){
        this.distancia = distancia;
        return this;
    }
    
    /**
     * Construye y devuelve el objeto Pedido con los parámetros previamente establecidos.
     * 
     * @return El objeto Pedido construido.
     */
    @Override
    public Pedido build(){
        // Construye un nuevo Pedido con los atributos establecidos.
        return new Pedido(paquete, distancia, tipoServicio);
    }
}