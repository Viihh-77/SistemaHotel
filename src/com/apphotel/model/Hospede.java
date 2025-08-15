package com.apphotel.model;

public class Hospede extends Pessoa {

    private String documento;

    public Hospede() {
        super();
        this.documento = null;
    }

    public Hospede(String nome, int idade, String telefone, String documento) {
        super(nome, idade, telefone);
        this.documento = documento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        System.out.println(" ");
        return "Hospede | Nome: " + nome + " | Idade: " + idade + " | Telefone: " + telefone + " | Documento: " + documento + " |";
    }
}
