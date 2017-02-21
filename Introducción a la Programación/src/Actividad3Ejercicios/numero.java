package Actividad3Ejercicios;
import java.util.Scanner;
public class numero {
	public static void main(String[]args){
		 Scanner teclado= new Scanner (System.in);
		 System.out.println("introduce numero 1");
		 int  n1=teclado.nextInt();
		 System.out.println("introduce numero 2");
		 int n2=teclado.nextInt();
		 System.out.println("introduce operación a realizar "
		 		+ "\n1.Suma"
		 		+ "\n2.Resta "
		 		+ "\n3.Multiplicación"
		 		+ "\n4.Divición ");
		   int operacion=teclado.nextInt();
		     if (operacion==1)
			 System.out.print(n1+n2);
			 if (operacion==2)
				 System.out.print(n1-n2);
		     if (operacion==3)
				 System.out.print(n1*n2);	
			 if (operacion==4)
				System.out.print(n1/n2);
			 teclado.close();
		      }
	
}

