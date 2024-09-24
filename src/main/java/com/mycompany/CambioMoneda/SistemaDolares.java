    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.CambioMoneda;

/**
 * Interfaz que define el comportamiento para sistemas que operan en dólares.
 * Se espera que implemente un método para calcular el valor en dólares de una cantidad dada.
 * 
 * @author José Ángel Huerta Amparán
 */
public interface SistemaDolares {
    /**
     * Calcula el valor en dólares de una cantidad dada.
     * 
     * @param cantidad La cantidad en pesos a convertir.
     * @return El valor en dólares.
     */
    double calcularValorEnDolares(double cantidad);
}

