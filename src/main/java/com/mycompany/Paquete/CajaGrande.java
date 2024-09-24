/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Paquete;

/**
 * Clase que representa un paquete grande.
 * Este paquete tiene un costo adicional de 50 unidades.
 * 
 * @author José Ángel Huerta Amparán
 */
public class CajaGrande extends Paquete{

    /**
     * Devuelve el costo adicional específico para un paquete grande.
     * @return 50, el costo adicional para una caja grande.
     */
    @Override
    public double getCostoAdicional() {
        return 50;
    }
    
}
