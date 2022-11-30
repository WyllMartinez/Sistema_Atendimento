/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controlaratendimento.models;

import java.util.ArrayList;

/**
 *
 * @author wyllm
 */
public class Medico {
    
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private String especializacao;
    private String cep;
    private int cidade;
    private String endereco;
    private String bairro;
    private String complemento;
    private String crm;
    
    private ArrayList<Medico> listagemMedico = new ArrayList<>();
    
    
    
    
    public Medico(){
        
    }
    
    
     public ArrayList<Medico> getListagemMedico() {
        return listagemMedico;
    }

    public void setListagemMedico(ArrayList<Medico> listagemMedico) {
        this.listagemMedico = listagemMedico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String espelizacao) {
        this.especializacao = espelizacao;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getCidade() {
        return cidade;
    }

    public void setCidade(int cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    
    
}
