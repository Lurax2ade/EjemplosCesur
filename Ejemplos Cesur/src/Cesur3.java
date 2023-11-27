import java.util.Scanner;

public class Cesur3 {

	public static void main(String[] args) {
		/*En la siguiente estructura condicional
		 * se valida si el número almacenado en
		 * la variable llamada número, es positivo.
		 * Si se cumple esta condición (true) aparecerá
		 * por consola un mensaje que indica que
		 * el número es positivo, un mensaje que muestra 
		 * el resultado de multiplicar dicho número por 2 
		 * y un último mensaje que nos dará información sobre 
		 * el resultado de efectuar el cuadrado de dicho número.   
		 * Aquí el signo ‘+’ es usado para concatenar el texto
		 * entrecomillado con el resultado producido de las
		 * operaciones aritméticas, es decir, mostrar en 
		 * la misma línea texto y resultado.
		 */
		int numero=10;

		if (numero>0)
		{System.out.println("El número es positivo");
		System.out.println("El número multiplicado por 2 es " + (numero*2));
		System.out.println("El número al cuadrado es " + (numero*numero));
		}
	}


}


