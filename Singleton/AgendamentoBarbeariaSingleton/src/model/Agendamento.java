/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gabriel
 */
public class Agendamento {
    
    private String nomeCliente;
    private String servico;
    private String data;
    private String hora;
    
    public Agendamento(String nomeCliente, String servico, String data, String hora){
        this.nomeCliente = nomeCliente;
        this.servico = servico;
        this.data = data;
        this.hora = hora;
    }
    
    public String getnomeCliente(){
        return nomeCliente;
    }
    public String getServico(){
        return servico;
    }
    public String getData(){
        return data;
    }
    public String getHora(){
        return hora;
    }

    @Override
    public String toString() {
        return nomeCliente + " - " + data + " | " + hora + " | " + servico;
    }  
}
