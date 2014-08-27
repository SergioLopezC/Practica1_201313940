import java.util.Scanner;


public class PruebaJuego {

	public static void main(String[] args) {
	int opcion;
	do{	
	
	System.out.println(	" - = Bienvenido a Love Letter = -");
		System.out.println(" (1) Jugar una partida");
		System.out.println(" (2) Seleccionar el numero de tokens a jugar");
		System.out.println(" (3) Mostrar las reglas del juego");
		System.out.println(" (4) Salir");
		System.out.println("ingrese el numero de la opcion a elegir : ");
		Scanner ingreso=new Scanner(System.in);
		opcion=ingreso.nextInt();
		
		switch(opcion){
		case 1:
			//comenzar una partida
		case 2:
			//seleccionar numero de tokens
		case 3:			
			//mostrar las relas del juego
			ReglasJuego r1=new ReglasJuego();
			r1.ReglasDelJuego();
		break;
		}
	}while(opcion != 4);//si opcion es igual a 4 fin del programa
	}

}
