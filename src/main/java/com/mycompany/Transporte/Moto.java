/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Transporte;

/**
 * Clase que representa una motocicleta como medio de transporte.
 * Este transporte tiene un costo fijo de 15 unidades y una velocidad de 45 km/h.
 * 
 * @author José Ángel Huerta Amparán
 */
public class Moto implements Transporte{

    /**
     * Calcula el tiempo de entrega según la distancia a recorrer.
     * La velocidad de la moto es de 45 km/h.
     * 
     * @param distancia La distancia en kilómetros que debe recorrer la moto.
     * @return El tiempo de entrega en minutos.
     */
    @Override
    public double calcularTiempo(double distancia) {
        return (distancia / 45) * 60;
    }

    /**
     * Devuelve el costo del transporte en motocicleta.
     * @return El costo fijo de 15 unidades.
     */
    @Override
    public double getCosto() {
        return 15;
    }

    /**
     * Devuelve el nombre del medio de transporte.
     * @return "moto"
     */
    @Override
    public String getNombre() {
        return "moto";
    }
}
