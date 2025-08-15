package com.apphotel.model;

public class Quarto {

    private int numQuarto;
    private String tipo;
    private double preco;

    public Quarto() {
        this.numQuarto = 0;
        this.tipo = null;
        this.preco = 0.0;
    }

    public Quarto(int numQuarto, String tipo, double preco) {
        this.numQuarto = numQuarto;
        this.tipo = tipo;
        this.preco = preco;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        System.out.println(" ");
        return "Quarto | Número do Quarto: " + numQuarto + " | Tipo: " + tipo + " | Preço: " + preco + " |";
    }
}
