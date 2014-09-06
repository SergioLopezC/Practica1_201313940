
package miPractica;

//programa que simula el juego de cartas love letter

import java.util.Random;//el programa utiliza la clase Random
import java.util.Scanner;//el programa utiliza la clase Scanner

public class ConsolaJuego {
	

	

	//el metodo main empieza la ejecucion de la aplicacion
	public static void main(String[] args) {
		boolean turnoJugador=false;
		boolean turnoMaquina=false;
		Mazo mas=new Mazo();
		boolean escapeTurno=false;//variable que controla en que turno salir
		int opcion;
		
			do{		
				System.out.println("========================================================");
				System.out.println("|$|       BIENVENIDO A LOVE LETTER       |$|");
			
				System.out.println("========================================================");
		
				System.out.println(" (1) Jugar una partida");
				System.out.println(" (2) Seleccionar el numero de tokens a jugar");
				System.out.println(" (3) Mostrar las reglas del juego");
				System.out.println(" (4) Salir");
				System.out.println("========================================================");
				System.out.println("ingrese el numero de la opcion a elegir : ");
		
				Scanner ingreso=new Scanner(System.in);
				opcion=ingreso.nextInt();
				System.out.println("========================================================");
		
					switch(opcion){//condicional para seleccionar una opcion del menu a realizar
							case 1://caso 1, inicia con una partida del juego
									
								
									int opcion1;
									mas.j1.NombreJugador();//metodo que imprime el nombre del jugador
									mas.m1.nombreMaquina();//metodo que imprime el nombre del oponente 		
									Random rnd=new Random();// condicion para saber quien comienza el juego
									System.out.println("		TURNO PARTIDA			");
									System.out.println("========================================================");
									int empezar=rnd.nextInt(8);
				
										if(empezar%2==0){
											turnoJugador=true;
											System.out.println("------------Es tu turno------------\n");
											System.out.println("========================================================");
										}else{
											turnoMaquina=true;
											System.out.println("------------Es turno PC-------------\n");
											System.out.println("========================================================");
										}
										mas.mostrar();
										mas.barajearCartas();//llamada al metodo para barajear las cartas del maso
										mas.mostrar();
										mas.removerCartaMazo();//llamada al metodo para remover cartas del mazo
										mas.mostrar();
										mas.asignarCartaPorDefecto();//metodo que asigna por defecto una carta a cada jugador al iniciar la partida
										mas.mostrar();
										mas.repartirCartas(turnoJugador);//llamada al metodo para repartir una carta al que le toque el turno
										mas.mostrar();
										
										while(escapeTurno != true){
											
										if(turnoJugador == true){
			
											mas.j1.debugJugador();
											System.out.println(" \t\t(1) Jugar Carta 1");
											System.out.println(" \t\t(2) Jugar Carta 2");
											System.out.println(" \t\t(3) Salir");
											System.out.println("ingrese el numero de la opcion a elegir : ");
											Scanner ingreso1=new Scanner(System.in);
											opcion1=ingreso.nextInt();
				
											if(opcion1==1){
												mas.j1.jugarCarta1();
												mas.efectosJugador();
												if(mas.j1.carta1_Jugador==8 || mas.j1.carta2_Jugador==8){
													break;
													}
												
												
											}else if(opcion1==2){
												mas.j1.jugarCarta2();
												mas.efectosJugador();
												if(mas.j1.carta1_Jugador==8 || mas.j1.carta2_Jugador==8){
													break;
												}
												
												
											}else if(opcion1==3){
					
												break;
											}
											turnoJugador=false;
											turnoMaquina=true;
											mas.repartirCartas(turnoJugador);
										
										}
										 if(turnoMaquina==true){ 

											mas.m1.debugMaquina();
											mas.m1.ataqueMaquina();
											mas.efectosMaquina();
											if(mas.m1.valorCarta==8){
												break;
											}
											turnoMaquina=false;
											turnoJugador=true;
											mas.repartirCartas(turnoJugador);
										}
										mas.debugMazo();
										
										if(mas.temporal==1){
											escapeTurno=true;
										}
									}
										
										
								
										break;
			
							case 2:
								System.out.println("TOKENS PARA EL JUEGO");
								System.out.println("(1.) jugar a 1 Tokens");
								System.out.println("(2.) jugar a 3 Tokens");
								System.out.println("Ingrese la cantidad de tokens para el juego");
						         int ingresarToken = ingreso.nextInt();
						        switch(ingresarToken){
						        case 1: 
						        	break;
						        case 2: 
						        	break;
						        }
						break;
		
							case 3:			
								Reglas reglas=new Reglas();
								reglas.ReglasDelJuego();
					}
			}while(opcion != 4);
	
	

		}//fin del metodo main
	
	}//fin de la clase ConsolaJuego
	
	
	


