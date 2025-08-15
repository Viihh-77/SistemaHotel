package com.apphotel.model;

public class Pessoa {
    
    protected String nome;
    protected int idade;
    protected String telefone;

    public Pessoa() {
        this.nome = null;
        this.idade = 0;
        this.telefone = null;
    }

    public Pessoa(String nome, int idade, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    @Override
    public String toString() {
        System.out.println(" ");
        return "Pessoa | Nome: " + nome + " | Idade: " + idade + " | Telefone: " + telefone + " |";
    }
}
