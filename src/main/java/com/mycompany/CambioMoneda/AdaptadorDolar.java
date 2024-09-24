/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.CambioMoneda;

/**
 * Clase AdaptadorDolar que adapta un sistema que opera en pesos mexicanos 
 * para realizar conversiones a dólares. Implementa la interfaz SistemaDolares.
 * 
 * @author José Ángel Huerta Amparán
 */
public class AdaptadorDolar implements SistemaDolares {
    private SistemaPesos peso; 

    /**
     * Constructor que inicializa el adaptador con un sistema de pesos.
     * 
     * @param peso Sistema que opera en pesos mexicanos.
     */
    public AdaptadorDolar(SistemaPesos peso){
        this.peso = peso;
    }

    /**
     * Convierte una cantidad en pesos mexicanos a dólares.
     * 
     * @param cantidadPesos La cantidad en pesos que se desea convertir.
     * @return El valor convertido a dólares.
     */
    @Override
    public double calcularValorEnDolares(double cantidadPesos) {
        double totalEnPesos = peso.getValor(cantidadPesos);
        return totalEnPesos / 20; 
    }
}
