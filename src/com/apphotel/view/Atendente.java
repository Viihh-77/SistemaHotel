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
            System.out.println("| 2 - Cadastrar Quarto        |");
            System.out.println("| 3 - Cadastrar Reserva       |");
            System.out.println("| 4 - Listar hóspedes         |");
            System.out.println("| 5 - Listar Quartos          |");
            System.out.println("| 6 - Listar Reservas         |");
            System.out.println("| 7 - Pesquisar Hóspede       |");
            System.out.println("| 8 - Pesquisar Quarto        |");
            System.out.println("| 9 - Pesquisar Reserva       |");
            System.out.println("| 10 - Editar Hóspede         |");
            System.out.println("| 11 - Cancelar Reserva       |");
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
}
