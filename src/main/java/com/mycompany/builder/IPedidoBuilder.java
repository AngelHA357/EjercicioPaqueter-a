/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.builder;

import com.mycompany.Paquete.Paquete;
import com.mycompany.Pedido.Pedido;
import com.mycompany.Servicio.TipoServicio;

/**
 * Interfaz que define los métodos para construir un objeto Pedido de manera flexible y controlada.
 * Utiliza el patrón de diseño Builder.
 * 
 * @author José Ángel Huerta Amparán
 */
public interface IPedidoBuilder {
    
    /**
     * Establece el tipo de paquete para el pedido.
     * 
     * @param paquete El paquete que se va a enviar (ej. Sobre, CajaPequenia, etc.).
     * @return La instancia del IPedidoBuilder para permitir el encadenamiento de métodos.
     */
    IPedidoBuilder setPaquete(Paquete paquete);

    /**
     * Establece la distancia que recorrerá el pedido.
     * 
     * @param distancia La distancia en kilómetros.
     * @return La instancia del IPedidoBuilder para permitir el encadenamiento de métodos.
     */
    IPedidoBuilder setDistancia(double distancia);

    /**
     * Establece el tipo de servicio para el pedido.
     * 
     * @param tipoServicio El tipo de servicio (Estandar o Express).
     * @return La instancia del IPedidoBuilder para permitir el encadenamiento de métodos.
     */
    IPedidoBuilder setServicio(TipoServicio tipoServicio);

    /**
     * Construye y devuelve un objeto Pedido con los parámetros establecidos.
     * 
     * @return El objeto Pedido construido.
     */
    Pedido build();
}
