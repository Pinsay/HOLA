package Actividad3Ejercicios;
import java.util.Scanner;
public class año {
public static void main (String[]args){
Scanner teclado= new Scanner (System.in);
	System.out.println("introduce el año de nacimiento");
	double añon=teclado.nextInt();
	System.out.println("introduce el año actual");
	double añoa=teclado.nextInt();
	System.out.println(añoa-añon +"años");
	teclado.close();	
	
}

}

	
	