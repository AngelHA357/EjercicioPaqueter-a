/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Transporte;

/**
 * Clase que representa una bicicleta como medio de transporte.
 * Este transporte tiene un costo fijo de 5 unidades y una velocidad de 20 km/h.
 * 
 * @author José Ángel Huerta Amparán
 */
public class Bicicleta implements Transporte{

    /**
     * Calcula el tiempo de entrega según la distancia a recorrer.
     * La velocidad de la bicicleta es de 20 km/h.
     * 
     * @param distancia La distancia en kilómetros que debe recorrer la bicicleta.
     * @return El tiempo de entrega en minutos.
     */
    @Override
    public double calcularTiempo(double distancia) {
        return (distancia / 20) * 60;
    }

    /**
     * Devuelve el costo del transporte en bicicleta.
     * @return El costo fijo de 5 unidades.
     */
    @Override
    public double getCosto() {
        return 5;
    }

    /**
     * Devuelve el nombre del medio de transporte.
     * @return "bicicleta"
     */
    @Override
    public String getNombre() {
        return "bicicleta";
    }
    
}
