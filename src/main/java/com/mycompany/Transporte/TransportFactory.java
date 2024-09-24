/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Transporte;

import com.mycompany.Paquete.CajaGrande;
import com.mycompany.Paquete.CajaMediana;
import com.mycompany.Paquete.CajaPequenia;
import com.mycompany.Paquete.Paquete;
import com.mycompany.Paquete.Sobre;
import com.mycompany.Servicio.TipoServicio;

/**
 * Fábrica que determina el tipo de transporte adecuado según el tipo de paquete,
 * la distancia y el servicio seleccionado (estándar o exprés).
 * 
 * @author José Ángel Huerta Amparán
 */
public class TransportFactory {

    ContextTransportStrategy contexto;
    
    public TransportFactory(){
        contexto = new ContextTransportStrategy();
    }
    
    /**
     * Determina el tipo de transporte que se usará en función del paquete, servicio y distancia.
     * 
     * @param paquete El tipo de paquete (ej. Sobre, CajaPequenia, CajaMediana, etc.).
     * @param servicio El tipo de servicio (Estandar o Express).
     * @param distancia La distancia en kilómetros del envío.
     * @return Un objeto que implementa la interfaz Transporte, como Dron, Bicicleta, Moto o Auto.
     */
    public Transporte getStrategy(Paquete paquete, TipoServicio servicio, double distancia) {
        if ((paquete instanceof Sobre || paquete instanceof CajaPequenia) && distancia <= 1 && servicio == TipoServicio.EXPRESS){
            contexto.setStrategy(new Dron());
        } else if ((paquete instanceof Sobre || paquete instanceof CajaPequenia) && distancia <= 1 && servicio == TipoServicio.ESTANDAR) {
            contexto.setStrategy(new Bicicleta());
        } else if ((paquete instanceof Sobre || paquete instanceof CajaPequenia) && distancia > 1 && servicio == TipoServicio.ESTANDAR){
            contexto.setStrategy(new Bicicleta());
        } else if ((paquete instanceof Sobre || paquete instanceof CajaPequenia) && distancia > 1 && servicio == TipoServicio.EXPRESS){
            contexto.setStrategy(new Moto());
        } else if (paquete instanceof CajaMediana && distancia <= 5 && servicio == TipoServicio.ESTANDAR){
            contexto.setStrategy(new Bicicleta());
        } else if (paquete instanceof CajaMediana && (servicio == TipoServicio.EXPRESS || distancia > 5)){
            contexto.setStrategy(new Moto());
        } else if(paquete instanceof CajaGrande){
            contexto.setStrategy(new Auto());
        }
        
        return contexto.crearTransporte();
    }
}
