package Actividad2ejemplosdeCompilación;
import java.util.Scanner;
public class MEDIA {
	  public static void main (String[]args){
		  Scanner teclado= new Scanner (System.in);
		 System.out.println("introduce nota1");
		 double nota1=teclado.nextInt();
		 System.out.println("introduce nota2");
		 double nota2=teclado.nextInt();
		 System.out.println("introduce nota3");
		 double nota3=teclado.nextInt();
		 double media=(nota1+nota2+nota3)/3;
		    System.out.println("resultado"+media);
		    
		    teclado.close();
	  }
}
