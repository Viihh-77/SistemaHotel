package com.apphotel;


import com.apphotel.view.Atendente;
import com.apphotel.service.HotelService;


public class Main {

	public static void main(String[] args) {

		Atendente atendente = new Atendente();
		HotelService gerenciarHotel = new HotelService();
		int opcaoMenu = 0;

		atendente.IniciarApp();

		do{
			opcaoMenu = atendente.menuPrincipal();
			gerenciarHotel.gerenciarEstoque(opcaoMenu, atendente);

		}while(opcaoMenu != 0);

		atendente.finalizarApp();

	}

}
