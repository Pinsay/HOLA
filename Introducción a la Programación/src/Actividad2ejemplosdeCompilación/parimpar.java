package Actividad2ejemplosdeCompilación;

import java.util.Scanner;
public class parimpar {
	public static void main(String[]args){
		Scanner teclado= new Scanner(System.in);
		System.out.println("introduce numero");
		double numero=teclado.nextDouble();
		if (numero%2==0){
			System.out.print(numero+" es par");
		}else{
			System.out.print(numero+ " es impar");
		}teclado.close();
	}
}
