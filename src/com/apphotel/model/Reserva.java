package com.apphotel.model;

import java.util.List;

public class Reserva {

    private Hospede hospede;
    private Quarto numQuarto;
    private String dataEntrada;
    private String dataSaida;
    private List<Servico> servicos;

    public Reserva() {
        this.hospede = null;
        this.numQuarto = null;
        this.dataEntrada = null;
        this.dataSaida = null;
        this.servicos = null;
    }

    public Reserva(Hospede hospede, Quarto numQuarto, String dataEntrada, String dataSaida, List<Servico> servicos) {
        this.hospede = hospede;
        this.numQuarto = numQuarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.servicos = servicos;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Quarto getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(Quarto numQuarto) {
        this.numQuarto = numQuarto;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    @Override
    public String toString() {
        System.out.println(" ");
        return  "Reserva | Hóspede: " + hospede.getNome() +
                " | Número do Quarto:  " + numQuarto.getNumQuarto() + 
                " | Entrada: " + dataEntrada + 
                " | Saída: " + dataSaida +
                " | Serviços: " + servicos + 
                " |"; 
    }
    
}
