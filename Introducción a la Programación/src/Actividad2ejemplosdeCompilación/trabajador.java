package Actividad2ejemplosdeCompilación;

import java.util.Scanner;
public class trabajador {
public static void main(String[]args){
	Scanner teclado= new Scanner(System.in);
	System.out.println(" introduce las horas");
	double horas=teclado.nextDouble();
	System.out.println(" resultado "+ horas*15);
	teclado.close();
}
}
