package Actividad2ejemplosdeCompilación;

import java.util.Scanner;
public class menormayor {
	public static void main(String[]args){
		Scanner teclado= new Scanner(System.in);
		System.out.println("introduce numero 1");
		double numero1=teclado.nextDouble();
		System.out.println("introduce numero2");
		double numero2=teclado.nextDouble();
		if (numero1==numero2){
			System.out.println(numero1 + "igual");
		}
		if (numero1>numero2){
			System.out.println(numero1 + "mayor");
		}else{
			System.out.println(numero1 + " menor");
			
	      
		 
    	}teclado.close();
	}
}
