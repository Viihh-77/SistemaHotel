package com.apphotel.view;

import java.util.Scanner;
import com.apphotel.model.*;

public class Atendente {

    Scanner leia;

    public Atendente() {
        leia = new Scanner(System.in);
    }

    public int menuPrincipal() {

        int opcaoMenu;

        while (true) {

            System.out.println(" ");
            System.out.println("|-----------------------------|");
            System.out.println("|        MENU PRINCIPAL       |");
            System.out.println("|                             |");
            System.out.println("| 1 - Cadastrar Hóspede       |");
            System.out.println("| 2 - Listar hóspedes         |");
            System.out.println("| 3 - Pesquisar Hóspede       |");
            System.out.println("| 4 - Editar Hóspede          |");
            System.out.println("| 5 - Cancelar Reserva        |");
            System.out.println("|                             |");
            System.out.println("| 0 - Sair                    |");
            System.out.println("|-----------------------------|");

            try {
                opcaoMenu = Integer.parseInt(leia.nextLine());
                return opcaoMenu;
            } catch (NumberFormatException erro) {
                System.out.println("Erro: Digite um número.");
            }
        }
    }

    public int escolhaCadastro() {

        System.out.println("|------------------------|");
        System.out.println("|       CADASTRO         |");
        System.out.println("|                        |");
        System.out.println("| 1 - Cadastrar hospede  |");
        System.out.println("| 2 - Cadastrar Quarto   |");
        System.out.println("| 3 - Cadastrar reserva  |");
        System.out.println("|------------------------|");

        int escolhaCadastro = leia.nextInt();
        leia.nextLine();
        return escolhaCadastro;

        /* Colocar tratamento de exceç */
    }

    /* Cadastro Hóspede */
    public String cadastroNome() {
        System.out.println(" ");
        System.out.println("-- Nome: ");
        String nome = leia.nextLine();
        return nome;
    }

    public String cadastroDocumento() {
        System.out.println(" ");
        System.out.println("-- Documento: ");
        String documento = leia.nextLine();
        return documento;
    }

    public String cadastroTelefone() {
        System.out.println(" ");
        System.out.println("-- Telefone: ");
        String telefone = leia.nextLine();
        return telefone;
    }

    public int cadastroIdade() {
        System.out.println(" ");
        System.out.println("-- Idade: ");
        int idade = leia.nextInt();
        return idade;

        /* Colocar tratamento de exceção */
    }

    /* Cadastro Quarto */
    public int cadastroNumQuarto() {
        System.out.println(" ");
        System.out.println("-- Número do quarto: ");
        int numQuarto = leia.nextInt();
        return numQuarto;

        /* Colocar tratamento de exceção */
    }

    public String cadastroTipo() {
        System.out.println(" ");
        System.out.println("-- Tipo: ");
        String tipo = leia.nextLine();
        return tipo;
    }

    public double candastroPreco() {
        System.out.println(" ");
        System.out.println("-- Preço: ");
        double preco = leia.nextDouble();
        return preco;

        /* Colocar tratamento de exceção */
    }

    /* Cadastro Reserva */
    public String cadastroHospedeReserva() {
        System.out.println(" ");
        System.out.println("-- Nome do hóspede: ");
        return leia.nextLine();
    }

    public int cadastroQuartoReserva() {
        System.out.println(" ");
        System.out.println("-- Número do quarto: ");
        int numQuarto = leia.nextInt();
        return numQuarto;

        /* Colocar tratamento de exceção */
    }

    public String cadastroEntrada() {
        System.out.println(" ");
        System.out.println("-- Data de entrada: ");
        return leia.nextLine();
    }

    public String cadastroSaida() {
        System.out.println(" ");
        System.out.println("-- Data de saída: ");
        return leia.nextLine();
    }

}
