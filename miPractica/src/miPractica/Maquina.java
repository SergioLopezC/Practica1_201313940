package miPractica;

import java.util.ArrayList;

public class Maquina {
	String nombreMaquina="PC";
	int carta1_Maquina;
	int carta2_Maquina;
	int numTokenMaquina;
	int valorCarta;
	
	ArrayList<Integer> manoMaquina;
	
	public Maquina(){
		manoMaquina=new ArrayList<Integer>();
		
	}
	public void tokensTotales(int tokenTotal){
		this.numTokenMaquina=tokenTotal;
	}
	
	public void nombreMaquina(){
		System.out.print("\t oponente:  "+nombreMaquina+"\n\n");
		System.out.println("========================================================");
		
	}
	public void debugMaquina(){
		System.out.println("Estado mano PC  : "+manoMaquina);
		System.out.println("========================================================");
	}
	public void ataqueMaquina(){
		//Si tiene un 8, juega su otra carta.
		if(manoMaquina.size()==2){
			if(manoMaquina.get(1)==8 || manoMaquina.get(0)==8){
				if(manoMaquina.get(1)==8){
					valorCarta=manoMaquina.get(1);
					System.out.println("el PC a jugado la carta "+manoMaquina.remove(1));
					debugMaquina();
				}else{
					valorCarta=manoMaquina.get(0);
					System.out.println("el PC a jugado la carta "+manoMaquina.remove(0));
					debugMaquina();
				}
				//Si tiene un 7 y un 6 o 5, juega el 7.
			}else if((manoMaquina.get(0)==7 &&(manoMaquina.get(1)==6 || manoMaquina.get(1)==5))||((manoMaquina.get(0)==7 &&(manoMaquina.get(1)==6 || manoMaquina.get(1)==5)))){
				valorCarta=7;
				System.out.println("el pc a jugado la carta 7");
				if(manoMaquina.get(0)==7){
					manoMaquina.remove(0);
					debugMaquina();
				
				}else{
					manoMaquina.remove(1);
					debugMaquina();
				}
				//Si tiene un 6 y un 5, juega el 5.
			}else if((manoMaquina.get(0)==6 && manoMaquina.get(1)==5)||(manoMaquina.get(1)==6 && manoMaquina.get(0)==5)){
				valorCarta=5;
				System.out.println("el pc a jugado la carta 5");
				if(manoMaquina.get(0)==5){
					manoMaquina.remove(0);
					debugMaquina();
				}else{
					manoMaquina.remove(1);
					debugMaquina();
				}
				//Si tiene un 3 y una carta menor a 3. Juega su otra carta.
			}else if((manoMaquina.get(0)==3 && manoMaquina.get(1)<3)||(manoMaquina.get(1)==3 && manoMaquina.get(0)<3)){
				
				if(manoMaquina.get(0)<3){
					valorCarta=manoMaquina.get(0);
					System.out.println("el pc a jugado la carta "+manoMaquina.remove(0));
					debugMaquina();
				}else if(manoMaquina.get(1)<3){
					valorCarta=manoMaquina.get(1);
					System.out.println("el pc a jugado la carta "+manoMaquina.remove(1));
					debugMaquina();
				}
				//Si tiene un 4 y una carta menor a 4, juega su otra carta.
			}else if((manoMaquina.get(0)==4 && manoMaquina.get(1)<4)||(manoMaquina.get(1)==4 && manoMaquina.get(0)<4)){
				
				if(manoMaquina.get(0)<4){
					valorCarta=manoMaquina.get(0);
					System.out.println("el pc a jugado la carta "+manoMaquina.remove(0));
					debugMaquina();
				}else if(manoMaquina.get(1)<4){
					valorCarta=manoMaquina.get(1);
					System.out.println("el pc a jugado la carta "+manoMaquina.remove(1));
					debugMaquina();
				}
				//Si tiene un 7 y una carta distinta a 6 o 5, juega la otra carta
			}else if((manoMaquina.get(0)==7 && (manoMaquina.get(1)!=6 || manoMaquina.get(1)!=5))||((manoMaquina.get(1)==7 && (manoMaquina.get(0)!=6 || manoMaquina.get(0)!=5)))){
				
				if((manoMaquina.get(0)==7 && (manoMaquina.get(1)!=6 || manoMaquina.get(1)!=5))){
					valorCarta=manoMaquina.get(1);
					System.out.println("el pc a jugado la carta "+manoMaquina.remove(1));
					debugMaquina();
				}else if((manoMaquina.get(1)==7 && (manoMaquina.get(0)!=6 || manoMaquina.get(0)!=5))){
					valorCarta=manoMaquina.get(0);
					System.out.println("el pc a jugado la carta "+manoMaquina.remove(0));
					debugMaquina();
				}
				//Si tiene un 6 y otra carta, juega el 6.
			}else if((manoMaquina.get(0)==6 && manoMaquina.get(1)!=6)||(manoMaquina.get(1)==6 && manoMaquina.get(0)!=6)){
				
				if(manoMaquina.get(0)!=6){
					valorCarta=manoMaquina.get(0);
					System.out.println("el pc a jugado la carta "+manoMaquina.remove(0));
					debugMaquina();
				}else if(manoMaquina.get(1)!=6){
					valorCarta=manoMaquina.get(1);
					System.out.println("el pc a jugado la carta "+manoMaquina.remove(1));
					debugMaquina();
				}
				//Si tiene un 5 y un 4, juega el 4.
			}else if((manoMaquina.get(0)==5 && manoMaquina.get(1)==4)||(manoMaquina.get(1)==5 && manoMaquina.get(0)==4)){
				valorCarta=4;
				System.out.println("el pc a jugado la carta 4");
				if(manoMaquina.get(0)==4){
					manoMaquina.remove(0);
					debugMaquina();
				}else{
					manoMaquina.remove(1);
					debugMaquina();
				}
				//Si tiene un 2 y una carta menor a 2. Juega su otra carta.
			}else if((manoMaquina.get(0)==2 && manoMaquina.get(1)==1)||(manoMaquina.get(1)==2 && manoMaquina.get(0)==1)){
				valorCarta=1;
			    System.out.println("el pc a jugado la carta 1");
				if(manoMaquina.get(0)==1){
					manoMaquina.remove(0);
					debugMaquina();
				}else{
					manoMaquina.remove(1);
					debugMaquina();
				}
				//Si tiene un 5 y un 1, usa el 1.
			}else if((manoMaquina.get(0)==5 && manoMaquina.get(1)==1)||(manoMaquina.get(1)==5 && manoMaquina.get(0)==1)){
				valorCarta=1;
				System.out.println("el pc a jugado la carta 1");
				if(manoMaquina.get(0)==1){
					manoMaquina.remove(0);
					debugMaquina();
				}else{
					manoMaquina.remove(1);
					debugMaquina();
				}
				//Si tiene un 4 y un 4, juega un 4.
			}else if(manoMaquina.get(0)==4 && manoMaquina.get(1)==4){
				valorCarta=4;
				System.out.println("el pc a jugado la carta 4");
				manoMaquina.remove(0);
				debugMaquina();
				//Si tiene un 3 y un 3, juega un 3.
			}else if(manoMaquina.get(0)==3 && manoMaquina.get(1)==3){
				valorCarta=3;
				System.out.println("el pc a jugado la carta 3");
				manoMaquina.remove(0);
				debugMaquina();
				//Si tiene un 2 y un 2, juega un 2.
			}else if(manoMaquina.get(0)==2 && manoMaquina.get(1)==2){
				valorCarta=2;
				System.out.println("el pc a jugado la carta 2");
				manoMaquina.remove(0);
				debugMaquina();
				//Si tiene un 1 y un 1, juega un 1.
			}else if(manoMaquina.get(0)==1 && manoMaquina.get(1)==1){
				valorCarta=1;
				System.out.println("el pc a jugado la carta 1");
				manoMaquina.remove(0);
				debugMaquina();
				
			}
			
		}
			
		
		
	}
	
	
}
