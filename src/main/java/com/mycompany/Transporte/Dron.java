/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Transporte;

/**
 * Clase que representa un dron como medio de transporte.
 * Este transporte tiene un costo fijo de 20 unidades y una velocidad de 60 km/h.
 * 
 * @author José Ángel Huerta Amparán
 */
public class Dron implements Transporte{

    /**
     * Calcula el tiempo de entrega según la distancia a recorrer.
     * La velocidad del dron es de 60 km/h.
     * 
     * @param distancia La distancia en kilómetros que debe recorrer el dron.
     * @return El tiempo de entrega en minutos.
     */
    @Override
    public double calcularTiempo(double distancia) {
        return (distancia / 60) * 60;
    }

    /**
     * Devuelve el costo del transporte en dron.
     * @return El costo fijo de 20 unidades.
     */
    @Override
    public double getCosto() {
        return 20;
    }

    /**
     * Devuelve el nombre del medio de transporte.
     * @return "dron"
     */
    @Override
    public String getNombre() {
        return "dron";
    }
    
}
