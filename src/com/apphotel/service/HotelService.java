package com.apphotel.service;

import java.util.List;
import java.util.ArrayList;

import com.apphotel.model.*;
import com.apphotel.view.*;

public class HotelService {

    List<Pessoa> hospedes;
    List<Quarto> quartos;
    List<Reserva> reservas;
    List<Servico> servicosHotel;

    public HotelService() {
        hospedes = new ArrayList<>();
        quartos = new ArrayList<>();
        reservas = new ArrayList<>();
        servicosHotel = new ArrayList<>();
    }

    public void gerenciarEstoque(int opcaoMenu, Atendente atendente) {

        
        switch (opcaoMenu) {
            
            case 1 -> {

                int escolha = atendente.escolhaCadastro();

                if (escolha < 1 || escolha > 3) {
                    System.out.println(" ");
                    System.out.println("Erro: Digite um número válido.");
                } else {

                    switch (escolha) {

                        case 1 -> {
                            String nomeHospede = atendente.cadastroNome();
                            int idadeHospede = atendente.cadastroIdade();
                            String talefoneHospede = atendente.cadastroTelefone();
                            String documentoHospede = atendente.cadastroDocumento();

                            Pessoa hospede = new Hospede(nomeHospede, idadeHospede, talefoneHospede, documentoHospede);
                            hospedes.add(hospede);
                        }

                        case 2 -> {
                            int numeroQuarto = atendente.cadastroNumQuarto();
                            String tipoQuarto = atendente.cadastroTipo();
                            double valorQuarto = atendente.candastroPreco();

                            Quarto quarto = new Quarto(numeroQuarto, tipoQuarto, valorQuarto);
                            quartos.add(quarto);
                        }

                        case 3 -> {
                            String nomeHospedeReserva = atendente.cadastroHospedeReserva();
                            int numeroQuartoReserva = atendente.cadastroQuartoReserva();
                            String entrada = atendente.cadastroEntrada();
                            String saida = atendente.cadastroSaida();

                            Hospede hospedeReserva = null;
                            for (Pessoa pessoa : hospedes) {
                                if (pessoa instanceof Hospede && pessoa.getNome().equalsIgnoreCase(nomeHospedeReserva)) {
                                    hospedeReserva = (Hospede) pessoa;
                                    break;
                                }
                            }

                            Quarto quartoReserva = null;
                            for (Quarto quarto : quartos) {
                                if (quarto.getNumQuarto() == numeroQuartoReserva) {
                                    quartoReserva = quarto;
                                    break;
                                }
                            }

                            if (hospedeReserva != null && quartoReserva != null) {
                                Reserva reserva = new Reserva(hospedeReserva, quartoReserva, entrada, saida, new ArrayList<>());
                                reservas.add(reserva);
                                System.out.println("A reserva foi cadastrada com sucesso!");
                            } else {
                                System.out.println("A reserva não foi cadastrada!");
                            }
                        }
                    }
                }
            }

            case 2 ->{

            }

        }


    }

}
