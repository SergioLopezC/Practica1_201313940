package miPractica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Mazo {
	Jugador j1;
	Maquina m1;
	int temporal=0;//variables que controla la salida de una partida de juego
	
	ArrayList<Integer> mazoCartas;
	
	public Mazo(){
		j1=new Jugador();
		m1=new Maquina();
		
		mazoCartas=new ArrayList<Integer>();
		mazoCartas.add(1);
		mazoCartas.add(2);
		mazoCartas.add(1);
		mazoCartas.add(3);
		mazoCartas.add(1);
		mazoCartas.add(4);
		mazoCartas.add(1);
		mazoCartas.add(5);
		mazoCartas.add(1);
		mazoCartas.add(2);
		mazoCartas.add(6);
		mazoCartas.add(7);
		mazoCartas.add(8);
		mazoCartas.add(3);
		mazoCartas.add(4);
		mazoCartas.add(5);
		
	}
	public void barajearCartas(){
		System.out.println("========================================================");
		System.out.println("********BARAJEAR EL MAZO*********");
		System.out.println("========================================================");
		Collections.shuffle(mazoCartas);
		System.out.println("Sea a barajeado el mazo\n");

	}
	public void removerCartaMazo(){

		System.out.println("========================================================");
		System.out.println("********QUITANDO LAS PRIMERAS CARTAS DEL MAZO********");
		System.out.println("========================================================");
		
	System.out.println("--------Sean quitado las primeras 4 cartas del mazo \n");
	for(int i=0; i<=3; i++){
		mazoCartas.remove(i);
			}	
	}
	public void asignarCartaPorDefecto(){
		j1.manoJugador.add(mazoCartas.remove(0));
		m1.manoMaquina.add(mazoCartas.remove(1));
		System.out.println("========================================================");
		System.out.println("------------Sea a repartido una carta a cada jugador por defecto---------------");
	}
	
	public void mostrar(){
		System.out.println("Estado del mazo: "+mazoCartas+"\n");
	
	}
	public void repartirCartas(boolean turnoJugador ){
		if (turnoJugador==true){
			j1.manoJugador.add(mazoCartas.remove(0));
			System.out.println("tienes es tu mano la carta "+j1.manoJugador);
				}else{
					
			m1.manoMaquina.add(mazoCartas.remove(0));
			System.out.println("la maquino tiene en su mano "+m1.manoMaquina);
			
		}
	
	}
	public void debugMazo(){
		System.out.println("Cartas en el mazo: "+mazoCartas);
	}
	
	public void efectosMaquina(){
		Random ran=new Random();
		if(m1.valorCarta==1){
			System.out.println("el PC intenta averiguar tu carta");
			int seleccion=ran.nextInt();
			if(seleccion==j1.manoJugador.get(0)){
				System.out.println("Acerto");
				System.out.println("Haz perdido la partida");	
				m1.numTokenMaquina-=1;
				temporal+=1;
			}else{
				System.out.println("A fallado");
			}
			
		}else if(m1.valorCarta==2){
			System.out.println("la mano del jugador es "+j1.manoJugador);
			
		}else if(m1.valorCarta==3){
		
				if(m1.valorCarta>j1.manoJugador.get(0)){
					System.out.println("carta PC: "+m1.valorCarta);
					System.out.println("tu carta: "+j1.manoJugador.get(0));
					System.out.println("la carta de del PC es mayor tu carta");
					System.out.println("el PC gana la partida");
					m1.numTokenMaquina-=1;
					temporal+=1;
				}
			
			
		}else if(m1.valorCarta==4){
			System.out.println("El PC es inmune por 1 turno");
			
			
		}else if(m1.valorCarta==5){
			System.out.println("tienes que votar tu mano");
			j1.manoJugador.clear();
			System.out.println("Mano jugador "+j1.manoJugador);
			
		}else if(m1.valorCarta==6){
			
				System.out.println("se tienen que intercambiar manos");
				
				
			
			
		}else if(m1.valorCarta==8){
			System.out.println("el PC a jugado la carta numero 8");
			System.out.println("haz ganado la partida");
			temporal+=1;
			j1.numTokenJugador-=1;
			
			
			
		}
	}
	public void efectosJugador(){
	Scanner ingreso=new Scanner(System.in);
	if(j1.carta1_Jugador==1 || j1.carta2_Jugador==1){
		System.out.println("ADIVINA LA CARTA DE TU RIVAL");
		System.out.println("elige la carta que tienen tu rival: ");
		int seleccion=ingreso.nextInt();
		if(seleccion==m1.manoMaquina.get(0)){
			System.out.println("has Acertado");
			System.out.println("Felicidades, has ganado la partida");	
			j1.numTokenJugador-=1;
			temporal+=1;
		}else{
			System.out.println("Haz fallado");
		}
		
	}else if(j1.carta1_Jugador==2 || j1.carta2_Jugador==2){
		System.out.println("Las cartas que tiene tu oponente en la mano son: "+m1.manoMaquina);
		
	}else if(j1.carta1_Jugador==3 || j1.carta2_Jugador==3){
	
			if((j1.carta1_Jugador>m1.manoMaquina.get(0)) || (j1.carta2_Jugador>m1.manoMaquina.get(0))){
				
				if(j1.carta1_Jugador>m1.manoMaquina.get(0)){
					System.out.println("carta PC: "+m1.manoMaquina.get(0));
					System.out.println("tu carta: "+j1.carta1_Jugador);
					System.out.println("tu carta es mayor, has ganado la partida");
					j1.numTokenJugador-=1;
					temporal+=1;
				}else{
					System.out.println("la carta del PC es mayor, el PC a ganado la partida");
					m1.numTokenMaquina-=1;
					temporal+=1;
				}
				if(j1.carta2_Jugador>m1.manoMaquina.get(0)){
					System.out.println("carta PC: "+m1.manoMaquina.get(0));
					System.out.println("tu carta: "+j1.carta2_Jugador);
					System.out.println("tu carta es mayor, has ganado la partida");
					temporal+=1;
				}else{
					System.out.println("la carta del PC es mayor, el PC a ganado la partida");
					m1.numTokenMaquina-=1;
					temporal+=1;
				}
				
		}
	}else if(j1.carta1_Jugador==4 || j1.carta2_Jugador==4){
		System.out.println("Eres inmune por 1 turno");
		
		
	}else if(j1.carta1_Jugador==5 || j1.carta2_Jugador==5){
		System.out.println("Que mano de carta se debe de botar?");
		System.out.println("(1.) Tu mano");
		System.out.println("(2.) La mano del PC");
		System.out.println("ingrese la opcion :");
		int opcion=ingreso.nextInt();
		if (opcion==1){
			System.out.println("has botado tu mano");
			j1.manoJugador.clear();
			j1.manoJugador.add(mazoCartas.remove(0));
			
		}else if(opcion==2){
			System.out.println("se a botado la mano del PC");
			m1.manoMaquina.clear();
			m1.manoMaquina.add(mazoCartas.remove(0));
		}
		
		
	}else if(j1.carta1_Jugador==6 || j1.carta2_Jugador==6){
		
			System.out.println("se tienen que intercambiar manos");
		
		
	}else if(j1.carta1_Jugador==8 || j1.carta2_Jugador==8){
		System.out.println("haz jugado la carta 8");
		System.out.println("el PC ganado la partida");
		m1.numTokenMaquina-=1;
		temporal+=1;
		
		
	}
	
}
	}