package com.apphotel.model;

public class Reserva {

    private String hospede;
    private int quartoReserva;
    private String dataEntrada;
    private String dataSaida;

    public Reserva() {
        this.hospede = null;
        this.quartoReserva = 0;
        this.dataEntrada = null;
        this.dataSaida = null;
    }

    public Reserva(String hospede, int quartoReserva, String dataEntrada, String dataSaida) {
        this.hospede = hospede;
        this.quartoReserva = quartoReserva;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public String getHospede() {
        return hospede;
    }

    public void setHospede(String hospede) {
        this.hospede = hospede;
    }

    public int getQuartoReserva() {
        return quartoReserva;
    }

    public void setQuartoReserva(int quartoReserva) {
        this.quartoReserva = quartoReserva;
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

    @Override
    public String toString() {
        System.out.println(" ");
        return "Reserva | Hóspede: " + hospede + " | Número do quarto da reserva:  " + quartoReserva + " | Data de entrada: " + dataEntrada + " | Data saída: " + dataSaida + " |"; 
    }
    
}
