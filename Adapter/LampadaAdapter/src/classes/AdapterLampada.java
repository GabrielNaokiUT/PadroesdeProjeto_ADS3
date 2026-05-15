/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.ILampada;

/**
 *
 * @author Gabriel
 */
public class AdapterLampada implements ILampada {
    
    private Lampada lampada;
    
    public AdapterLampada(){
        this.lampada = new Lampada();
    }
    
    @Override
    public String controlar(String comodo, boolean ligar){
        if(ligar){
            return lampada.acender(comodo);
        } 
        else{
            return lampada.apagar(comodo);
        }
    }   
}
    