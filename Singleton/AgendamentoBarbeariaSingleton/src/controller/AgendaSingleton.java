/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Agendamento;

/**
 *
 * @author Gabriel
 */
public class AgendaSingleton {
    
    private static AgendaSingleton instancia = null;
    
    private List<Agendamento> agendamentos;
    
    private AgendaSingleton(){
        agendamentos = new ArrayList<>();
    }
    
    public static AgendaSingleton getInstancia(){
        if(instancia == null){
            instancia = new AgendaSingleton();
        }
        return instancia;
    }
    
    public void agendar(Agendamento agendamento){
        agendamentos.add(agendamento);
    }
    
    public List<Agendamento> getAgendamentos(){
        return agendamentos;
    }
    
    public boolean horarioOcupado(String data, String hora){
        for(Agendamento i : agendamentos){
            if(i.getData().equals(data) && i.getHora().equals(hora)){
                return true;
            }
        }
        return false;
    }
}
