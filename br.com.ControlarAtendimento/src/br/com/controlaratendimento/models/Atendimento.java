/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controlaratendimento.models;

/**
 *
 * @author bruno
 */
public class Atendimento {
    private Paciente paciente;
    private Medico medico;

    public Atendimento(Paciente paciente, Medico medico) {
        this.paciente = paciente;
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "Atendimento{" + "paciente=" + paciente + ", medico=" + medico + '}';
    }
    
}
