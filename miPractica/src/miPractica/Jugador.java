package miPractica;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jugador {
	
	String nombreJugador;
	int carta1_Jugador;
	int carta2_Jugador;
	int numTokenJugador;
	int valorCartaJ;
	ArrayList<Integer> manoJugador;
	
	Jugador(){
		manoJugador=new ArrayList<Integer>();	
		
	}
	public void tokensTotales(int tokenTotal){
		this.numTokenJugador=tokenTotal;
	}
	public void NombreJugador(){
		System.out.println();
		System.out.print("\tnombre del jugador:   ");
		Scanner ingreso=new Scanner(System.in);
		this.nombreJugador=ingreso.nextLine();
	}
	public void jugarCarta1(){
		carta1_Jugador=manoJugador.remove(0);
		System.out.println("-------has jugado la carta   :"+carta1_Jugador);
		debugJugador();
	}
	public void jugarCarta2(){
		carta2_Jugador=manoJugador.remove(1);
		System.out.println("-------has jugado la carta  : "+carta2_Jugador);
		debugJugador();
	}
	public void debugJugador(){
		System.out.println("Estado mano jugador : "+manoJugador);
	}
	
	
	
}
