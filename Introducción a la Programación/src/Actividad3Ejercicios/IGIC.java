package Actividad3Ejercicios;
import java.util.Scanner;
public class IGIC {
	public static void main(String[]args){
		Scanner teclado= new Scanner(System.in);
		 System.out.println("Introduce el importe del producto");
		 double in1=teclado.nextDouble();
		 double oper= (in1*7/100);
		 double resultado = (oper+in1);
		 System.out.println("Su importe con el igic incluido es de "+ resultado );
		 teclado.close();   
	}
}