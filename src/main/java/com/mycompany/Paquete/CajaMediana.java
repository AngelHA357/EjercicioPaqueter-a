/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Paquete;

/**
 * Clase que representa un paquete mediano.
 * Este paquete tiene un costo adicional de 20 unidades.
 * 
 * @author José Ángel Huerta Amparán
 */
public class CajaMediana extends Paquete{

    /**
     * Devuelve el costo adicional específico para un paquete mediano.
     * @return 20, el costo adicional para una caja mediana.
     */
    @Override
    public double getCostoAdicional() {
        return 20;
    }
    
}
