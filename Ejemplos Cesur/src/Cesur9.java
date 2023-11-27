import java.util.Scanner;

public class Cesur9 {

	public static void main(String[] args) {

		/*Pide un número al usuario para que se muestre por pantalla 
		 *la tabla de multiplicar de dicho número hasta el número 10.  
		 *
		 *Utiliza la estructura while en Java. 
		 */


		Scanner sc = new Scanner(System.in);         
		int numero, contador, resultado;         
		System.out.print("Introduzca un número: ");         
		numero = sc.nextInt();      contador = 1;         
		while (contador<=10) {             
			resultado=contador*numero;             

			System.out.println(numero + " * "  + contador  + " = "                      + resultado);             
			contador = contador+1;         }         
		sc.close();     
	} 
} 


