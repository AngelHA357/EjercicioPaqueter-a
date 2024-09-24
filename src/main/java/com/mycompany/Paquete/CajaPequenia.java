/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Paquete;

/**
 * Clase que representa un paquete pequeño.
 * Este paquete tiene un costo adicional de 10 unidades.
 * 
 * @author José Ángel Huerta Amparán
 */
public class CajaPequenia extends Paquete{

    /**
     * Devuelve el costo adicional específico para un paquete pequeño.
     * @return 10, el costo adicional para una caja pequeña.
     */
    @Override
    public double getCostoAdicional() {
        return 10;
    }
    
}
