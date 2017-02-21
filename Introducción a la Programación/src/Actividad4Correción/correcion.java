package Actividad4Correción;
import java.util.Scanner; 
public class correcion {
public static void main (String[]args){
	// quite el out que es salida y puse in que es entrada.
	
	Scanner teclado=new Scanner(System.in);
	System.out.print("indique la edad: ");
	// añadí el int 
	int edad=teclado.nextInt();
	// inverti el signo
	if (edad >=18){
		System.out.println("Es mayor de edad ");
		
	}  else  {
		System.out.println("Es menor de edad");
		
	}
	teclado.close(); 
	}
}
