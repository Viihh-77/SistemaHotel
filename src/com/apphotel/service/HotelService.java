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
                            

                        }
                    }
                }
            }
        }
    }

}
