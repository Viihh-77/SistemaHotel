package com.apphotel.view;

import java.util.Scanner;

public class Validacao{

    Scanner input = new Scanner(System.in);


    public static int validarMenu(Atendente Atendente, int opcaoMenu){

        boolean naoValidado = true;
        Scanner input = new Scanner(System.in);


        while(naoValidado){


            System.out.print("[ DIGITE A OPÇÃO ] --> ");
            String texto = input.nextLine();
            System.out.println(" ");


            try{
                opcaoMenu = Integer.parseInt(texto);

                if(opcaoMenu <= 8 && opcaoMenu >= 0){

                    naoValidado = false;
                    System.out.println("[ O NÚMERO INSERIDO É ]: " + opcaoMenu);

                }else{

                    throw new IllegalArgumentException("[ O NÚMERO INSERIDO É INVÁLIDO ]");
                }

            }catch(IllegalArgumentException erro){
                System.out.println("[ ERRO ]: " + erro.getMessage());
            }
        }

        return opcaoMenu;   
    }


    public static int validarInt(Atendente atendente, int opcaoInt){

        boolean naoValidado = true;
        Scanner input = new Scanner(System.in);
        
        while(naoValidado){

            System.out.print("[ DIGITE A OPÇÃO ] --> ");
            String texto = input.nextLine();
            System.out.println(" ");

            try{
                opcaoInt = Integer.parseInt(texto);
                System.out.println("[ O NÚMERO INSERIDO É ]: " + opcaoInt);

            }catch(NumberFormatException erro){
                System.out.println("[ ERRO ]: " + erro.getMessage());
            }
        }
        return opcaoInt;
    }


    public static double validarDouble(Atendente atendente, double opcaoDouble){

        boolean naoValidado = true;
        Scanner input = new Scanner(System.in);
        
        while(naoValidado){

            System.out.print("[ DIGITE A OPÇÃO ] --> ");
            String texto = input.nextLine();
            System.out.println(" ");

            try{
                opcaoDouble = Double.parseDouble(texto);
                System.out.println("[ O NÚMERO INSERIDO É ]: " + opcaoDouble);

            }catch(IllegalArgumentException erro){

                System.out.println("[ ERRO ]: " + erro.getMessage());
            }
        }
        return opcaoDouble;
    }
}