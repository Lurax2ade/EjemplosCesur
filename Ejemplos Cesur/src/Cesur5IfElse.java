import java.util.Scanner;

public class Cesur5IfElse {

	public static void main(String[] args) {
		/*Al ejemplo visto anteriormente de uso 
		 *de if, se le ha añadido un else, 
		 *para que imprima ‘Es menor de edad’ 
		 *y establezca el valor de la variable 
		 *booleana mayorEdad a false cuando la edad 
		 *sea menor de 18 años.  Ahora la edad se pide 
		 *al usuario desde teclado.   
		 */
		Scanner sc=new Scanner (System.in);

		System.out.println("Introduzca su edad");
		int edad=sc.nextInt();
		boolean mayorEdad;

		if (edad>=18)
		{System.out.println("Es mayor de edad");
		mayorEdad=true;

		}else{ 
			System.out.println("Es menor de edad");
			mayorEdad=false;
			sc.close();

		}
	}
}







