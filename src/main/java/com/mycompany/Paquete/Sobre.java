/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Paquete;

/**
 * Clase que representa un sobre como tipo de paquete.
 * Este sobre tiene un costo adicional de 5 unidades.
 * 
 * @author José Ángel Huerta Amparán
 */
public class Sobre extends Paquete{

    /**
     * Devuelve el costo adicional específico para un sobre.
     * @return 5, el costo adicional para un sobre.
     */
    @Override
    public double getCostoAdicional() {
        return 5;
    }
    
}
