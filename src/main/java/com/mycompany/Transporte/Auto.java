/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Transporte;

/**
 * Clase que representa un automóvil como medio de transporte.
 * Este transporte tiene un costo fijo de 30 unidades y una velocidad de 40 km/h.
 * 
 * @author José Ángel Huerta Amparán
 */
public class Auto implements Transporte{

    /**
     * Calcula el tiempo de entrega según la distancia a recorrer.
     * La velocidad del automóvil es de 40 km/h.
     * 
     * @param distancia La distancia en kilómetros que debe recorrer el auto.
     * @return El tiempo de entrega en minutos.
     */
    @Override
    public double calcularTiempo(double distancia) {
        return (distancia / 40) * 60;
    }

    /**
     * Devuelve el costo del transporte en automóvil.
     * @return El costo fijo de 30 unidades.
     */
    @Override
    public double getCosto() {
        return 30;
    }

    /**
     * Devuelve el nombre del medio de transporte.
     * @return "auto"
     */
    @Override
    public String getNombre() {
        return "auto";
    }
}
