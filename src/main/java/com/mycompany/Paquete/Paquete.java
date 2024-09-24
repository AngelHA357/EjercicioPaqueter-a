/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.Paquete;

/**
 * Clase abstracta que define el concepto de un paquete.
 * Esta clase establece la estructura base para diferentes tipos de paquetes, 
 * donde cada paquete tiene un costo adicional específico.
 * 
 * @author José Ángel Huerta Amparán
 */
public abstract class Paquete {

    /**
     * Método abstracto para obtener el costo adicional del paquete.
     * Las subclases deben implementar este método para devolver el costo
     * específico del paquete que representan.
     * @return el costo adicional del paquete.
     */
    public abstract double getCostoAdicional();
}

