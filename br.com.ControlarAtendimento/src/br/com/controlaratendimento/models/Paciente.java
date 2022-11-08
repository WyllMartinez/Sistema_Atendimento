package br.com.controlaratendimento.models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author wyllm
 */
public class Paciente {
    
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private int idade;
    private String telefone;
    private String cep;
    private String complemento;
    private String endereco;
    private String bairro;
    private int cidade;
    
    private ArrayList<Paciente> listagemPaciente = new ArrayList<>();
    

    public Paciente(int id, String nome, String cpf, String rg, int idade, String telefone, String cep, String complemento, String endereco, String bairro, int cidade) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
        this.telefone = telefone;
        this.cep = cep;
        this.complemento = complemento;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public Paciente() {
    }

    public ArrayList<Paciente> getListagemPaciente() {
        return listagemPaciente;
    }

    public void setListagemPaciente(ArrayList<Paciente> listagemPaciente) {
        this.listagemPaciente = listagemPaciente;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
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

    public int getCidade() {
        return cidade;
    }

    public void setCidade(int cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", idade=" + idade + ", telefone=" + telefone + ", cep=" + cep + ", complemento=" + complemento + ", endereco=" + endereco + ", bairro=" + bairro + ", cidade=" + cidade + '}';
    }
    
    
    
}
