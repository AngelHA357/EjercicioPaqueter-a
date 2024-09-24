/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Transporte;

/**
 * Clase que representa el contexto para crear un transporte específico.
 * 
 * @author José Ángel Huerta Amparán
 */
public class ContextTransportStrategy {
    private Transporte transporte;

    /**
     * Establece el transporte
     * @param transporte Transporte específico
     */
    public void setStrategy(Transporte transporte) {
        this.transporte = transporte;
    }
    
    /**
     * Crea el transporte devolviendo el objeto una vez se ha
     * determinado uno específico
     * @return Transporte específico
     */
    public Transporte crearTransporte(){
        return transporte;
    }
}
