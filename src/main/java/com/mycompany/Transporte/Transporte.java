/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.Transporte;

/**
 * Interfaz que define el comportamiento de los diferentes tipos de transporte.
 * Todos los transportes deben poder calcular el tiempo de entrega, devolver su costo
 * y su nombre.
 * 
 * @author José Ángel Huerta Amparán
 */
public interface Transporte {

    /**
     * Calcula el tiempo de entrega basado en la distancia.
     * 
     * @param distancia La distancia en kilómetros que debe recorrer el transporte.
     * @return El tiempo de entrega en minutos.
     */
    public double calcularTiempo(double distancia);

    /**
     * Devuelve el costo fijo asociado con el transporte.
     * 
     * @return El costo del transporte.
     */
    public double getCosto();

    /**
     * Devuelve el nombre del transporte.
     * 
     * @return El nombre del transporte (por ejemplo, "auto", "bicicleta", etc.).
     */
    public String getNombre();
}
