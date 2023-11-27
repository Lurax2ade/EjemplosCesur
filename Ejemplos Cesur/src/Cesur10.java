import java.util.Scanner;

public class Cesur10 {

	public static void main(String[] args) {

		/*Realiza el ejemplo anterior, pero utilizando una estructura for 
		 *en Java para realizar la tabla de multiplicar de un número 
		 *introducido por teclado hasta el 10.  
		 */
		int numero, resultado;

		Scanner sc=new Scanner(System.in);

		System.out.println("Introduzca un número: ");
		numero=sc.nextInt();

		for (int contador=0; contador<=10; contador ++) {
			resultado=contador*numero;
			System.out.println(numero +"*"+ contador + "=" + resultado);	

		}
		sc.close();
	}

} 


