/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder;

import com.mycompany.Paquete.Paquete;
import com.mycompany.Pedido.Pedido;
import com.mycompany.Servicio.TipoServicio;

/**
 * Director que guía la construcción de un objeto Pedido utilizando un IPedidoBuilder.
 * Facilita la creación de pedidos complejos al encapsular el proceso de construcción.
 * 
 * @author José Ángel Huerta Amparán
 */
public class PedidoDirector {
    private IPedidoBuilder builder;

    /**
     * Constructor que inicializa el director con un IPedidoBuilder.
     * 
     * @param builder El constructor (builder) que se utilizará para construir el Pedido.
     */
    public PedidoDirector(IPedidoBuilder builder) {
        this.builder = builder;
    }

    /**
     * Construye un pedido completo utilizando el builder proporcionado.
     * Este método dirige la creación del pedido estableciendo el paquete, distancia y servicio.
     * 
     * @param paquete El paquete a enviar.
     * @param distancia La distancia del recorrido.
     * @param tipoServicio El tipo de servicio (Estandar o Express).
     * @return El objeto Pedido completamente construido.
     */
    public Pedido construirPedido(Paquete paquete, double distancia, TipoServicio tipoServicio) {
        // Se encadenan las llamadas al builder para construir el pedido completo.
        return builder.setPaquete(paquete)
                      .setDistancia(distancia)
                      .setServicio(tipoServicio)
                      .build();
    }
}
