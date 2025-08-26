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
            System.out.println("_____________________________");
            System.out.println("|       MENU PRINCIPAL      |");
            System.out.println("|___________________________|");
            System.out.println("|  1· Cadastrar | 2· Listar |");
            System.out.println("|---------------------------|");
            System.out.println("|  3· Cancelar  | 4· Editar |");
            System.out.println("|---------------------------|");
            System.out.println("|  5· Encerrar Aplicativo   |");
            System.out.println("|___________________________|");
            System.out.println(" ");

            opcaoMenu = Validacao.validarMenu(null, 0);
            return opcaoMenu;
        }
    }

    public int escolhaCadastro() {
        System.out.println(" ");
        System.out.println("_____________________________");
        System.out.println("|      ESCOLHA CADASTRO     |");
        System.out.println("|___________________________|");
        System.out.println("|  1· Hóspede | 2· Quarto   |");
        System.out.println("|---------------------------|");
        System.out.println("|  3· Reserva  | 4· Voltar  |");
        System.out.println("|___________________________|");
        System.out.println(" ");

        int escolhaCadastro = Validacao.validarInt(null, 0);
        leia.nextLine();
        return escolhaCadastro;
    }

    /* Cadastro Hóspede */
    public String cadastroNome() {
        System.out.println("|· DIGITE O NOME");
        System.out.print  ("| ");
        System.out.println(" ");
        String nome = leia.nextLine();
        return nome;
    }

    public String cadastroDocumento() {
        System.out.println("|· DIGITE O DOCUMENTO");
        System.out.print  ("| ");
        System.out.println(" ");
        String documento = leia.nextLine();
        return documento;
    }

    public String cadastroTelefone() {
        System.out.println("|· DIGITE O TELEFONE  ");
        System.out.print  ("|–→ ");
        System.out.println(" ");
        String telefone = leia.nextLine();
        return telefone;
    }

    public int cadastroIdade() {
        System.out.println("|· DIGITE A IDADE ");
        System.out.print  ("|–→ ");
        System.out.println(" ");
        int idade = Validacao.validarInt(null, 0);
        return idade;
    }

    /* Cadastro Quarto */
    public int cadastroNumQuarto() {
        System.out.println("|· DIGITE O NÚMERO DO QUARTO ");
        System.out.print  ("| ");
        System.out.println(" ");
        int numQuarto = Validacao.validarInt(null, 0);
        return numQuarto;
    }

    public String cadastroTipo() {
        System.out.println("|· DIGITE O TIPO");
        System.out.print  ("| ");
        System.out.println(" ");
        String tipo = leia.nextLine();
        return tipo;
    }

    public double candastroPreco() {
        System.out.println("|· DIGITE O PREÇO  ");
        System.out.print  ("| ");
        System.out.println(" ");
        double preco = Validacao.validarDouble(null, 0);
        return preco;
    }

    /* Cadastro Reserva */
    public String cadastroHospedeReserva() {
        System.out.println("|· DIGITE O NOME DO HÓSPEDE  ");
        System.out.print  ("| ");
        System.out.println(" ");
        return leia.nextLine();
    }

    public int cadastroQuartoReserva() {
        System.out.println("|· DIGITE O NÚMERO DO QUARTO");
        System.out.print  ("| ");
        System.out.println(" ");
        int numQuarto = Validacao.validarInt(null, 0);
        return numQuarto;
    }

    public String cadastroEntrada() {
        System.out.println("|· DIGITE A DATA DE ENTRADA  ");
        System.out.print  ("| ");
        System.out.println(" ");
        return leia.nextLine();
    }

    public String cadastroSaida() {
        System.out.println("|· DIGITE A DATA DE SAÍDA");
        System.out.print  ("| ");
        System.out.println(" ");
        return leia.nextLine();
    }

    public int escolhaListar(){
        System.out.println("____________________________");
        System.out.println("|   O QUE DESEJA LISTAR ?   |");
        System.out.println("|___________________________|");
        System.out.println("|  1· Hóspede | 2· Quarto   |");
        System.out.println("|-------------|-------------|");
        System.out.println("|  3· Reserva | 4· Tudo     |");
        System.out.println("|---------------------------|");
        System.out.println("|  5· Voltar ao Início      |");
        System.out.println("|___________________________|.");

        int escolhaListar = Validacao.validarInt(null, 0);
        return escolhaListar;
    }

    // PESQUISA

    public String pesquisarNomeHospede(){
        System.out.println("|· DIGITE O NOME DO HÓSPEDE  ");
        System.out.print  ("| ");
        System.out.println("null");
        return leia.nextLine();

    }

    public String pesquisarTipoQuarto(){
        System.out.println("|· DIGITE O TIPO DO QUARTO  ");
        System.out.print  ("| ");
        System.out.println("null");
        return leia.nextLine();
    }

    public String pesquisarNomeReserva(){
        System.out.println("|· DIGITE O NOME DO HÓSPEDE  ");
        System.out.print  ("| ");
        System.out.println("null");
        return leia.nextLine();
    }

    // EDIÇÃO

    public String editarDadosHospede(){
        System.out.println("|· DIGITE O NOME DO HÓSPEDE  ");
        System.out.print  ("| ");
        System.out.println("null");
        return leia.nextLine();
    }

    // CANCELAR RESERVA

    public int cancelarReserva(){
        System.out.println("|· DIGITE O QUARTO RESERVADO  ");
        System.out.print  ("| ");
        System.out.println("null");
        return leia.nextInt();
    }

    // ABERTURA E FECHAMENTO DO APP!

    public void finalizarApp(){
        System.out.println("|· OBRIGADO POR UTILIZAR O APP!       ");
        System.out.print  ("|  GANHE DESCONTO NA PRÓXIMA VISITA! ");
    }

    public void IniciarApp(){
        System.out.println("|· BEM VINDO!   ");
        System.out.print  ("|  AO GAMEL HOTEL  ");
    }
}
