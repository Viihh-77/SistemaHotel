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

    public int escolhaListar(){

        System.out.println("⌈‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾⌉");
        System.out.println("|   O QUE DESEJA LISTAR ?   |");
        System.out.println("|—————————————–—————————————|");
        System.out.println("|  1· Hóspede | 2· Quarto   |");
        System.out.println("|———————————————————————————|");
        System.out.println("|  3· Reserva | 4· Tudo     |");
        System.out.println("|———————————————————————————|");
        System.out.println("|  5· Voltar ao Início      |");
        System.out.println("⌊___________________________⌋.");

        int escolhaListar = Validacao.validarInt(null, 0);
        return escolhaListar;
    }


    // PESQUISA

    public String pesquisarNomeHospede(){
        System.out.println("⌈· DIGITE O NOME DO HÓSPEDE  ");
        System.out.print  ("⌊–→ ");
        System.out.println("null");
        return leia.nextLine();

    }

    public String pesquisarTipoQuarto(){
        System.out.println("⌈· DIGITE O TIPO DO QUARTO  ");
        System.out.print  ("⌊–→ ");
        System.out.println("null");
        return leia.nextLine();
    }

    public String pesquisarNomeReserva(){
        System.out.println("⌈· DIGITE O NOME DO HÓSPEDE  ");
        System.out.print  ("⌊–→ ");
        System.out.println("null");
        return leia.nextLine();
    }

    // EDIÇÃO

    public String editarDadosHospede(){
        System.out.println("⌈· DIGITE O NOME DO HÓSPEDE  ");
        System.out.print  ("⌊–→ ");
        System.out.println("null");
        return leia.nextLine();
    }

    // CANCELAR RESERVA

    public int cancelarReserva(){
        System.out.println("⌈· DIGITE O QUARTO RESERVADO  ");
        System.out.print  ("⌊–→ ");
        System.out.println("null");
        return leia.nextInt();
    }

    // ABERTURA E FECHAMENTO DO APP!

    public void finalizarApp(){
        System.out.println("⌈· OBRIGADO POR UTILIZAR O APP!       ⌉");
        System.out.print  ("⌊–→ GANHE DESCONTO NA PRÓXIMA VISITA! ⌋");
    }

    public void IniciarApp(){
        System.out.println("⌈· BEM VINDO! 🏨     ⌉");
        System.out.print  ("⌊–→ AO GAMEL HOTEL    ⌋");
    }
}
