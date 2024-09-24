/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Pedido;

import com.mycompany.Paquete.Paquete;
import com.mycompany.Servicio.TipoServicio;
import com.mycompany.Transporte.Transporte;

/**
 * Clase que representa un pedido en el sistema de envíos.
 * Un pedido contiene un tipo de paquete, distancia a recorrer, tipo de servicio y el transporte utilizado.
 * 
 * @author José Ángel Huerta Amparán
 */
public class Pedido {
    
    private Transporte transporte;  
    private Paquete paquete;        
    private double distancia;       
    private TipoServicio tipoServicio;  

    /**
     * Constructor para crear un Pedido con el paquete, distancia y tipo de servicio especificados.
     * 
     * @param paquete El paquete a enviar.
     * @param distancia La distancia en kilómetros del recorrido.
     * @param tipoServicio El tipo de servicio seleccionado (Estandar o Express).
     */
    public Pedido(Paquete paquete, double distancia, TipoServicio tipoServicio) {
        this.paquete = paquete;
        this.distancia = distancia;
        this.tipoServicio = tipoServicio;
    }

    /**
     * Establece el transporte para el pedido.
     * 
     * @param transporte El transporte que se utilizará para entregar el pedido.
     */
    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }
    
    /**
     * Calcula el costo total del pedido basado en el tipo de servicio, distancia y el costo adicional del paquete.
     * También incluye el costo del transporte seleccionado.
     * 
     * @return El costo total del pedido.
     */
    public double calcularCostoTotal(){
        double costoServicio;

        // Determina el costo base del servicio según el tipo.
        if (tipoServicio == TipoServicio.ESTANDAR){
            costoServicio = 30;
        } else {
            costoServicio = 50;
        }

        // Si la distancia es mayor a 10 km, añade un costo adicional por kilómetro extra.
        if (distancia > 10){
            costoServicio += (distancia - 10) * 5;
        }
        
        // Retorna el costo total sumando el costo del transporte, el costo adicional del paquete y el costo del servicio.
        return transporte.getCosto() + paquete.getCostoAdicional() + costoServicio;
    }
    
    /**
     * Calcula el tiempo de entrega basado en la distancia y el transporte seleccionado.
     * 
     * @return El tiempo estimado de entrega en minutos.
     */
    public double calcularTiempoEntrega(){
        return transporte.calcularTiempo(distancia);
    }

    /**
     * Obtiene el transporte asignado al pedido.
     * 
     * @return El transporte utilizado.
     */
    public Transporte getTransporte() {
        return transporte;
    }

    /**
     * Obtiene el paquete asignado al pedido.
     * 
     * @return El paquete que se envía.
     */
    public Paquete getPaquete() {
        return paquete;
    }

    /**
     * Obtiene la distancia total del recorrido del pedido.
     * 
     * @return La distancia en kilómetros.
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * Obtiene el tipo de servicio seleccionado para el pedido.
     * 
     * @return El tipo de servicio (Estandar o Express).
     */
    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }
}
