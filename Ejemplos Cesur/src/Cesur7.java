import java.util.Scanner;

public class Cesur7 {

	public static void main(String[] args) {
		/*Necesitas conocer la puntuación de una serie de estudiantes en 
		 *base a una tabla de baremación de 0 a 10. El usuario debe introducir 
		 *la puntuación en forma de número entero o decimal y la ejecución 
		 *mostrará en pantalla un mensaje textual que indica la calificación 
		 *obtenida que aparece entre comillas en el siguiente listado.  
		 * 
		 *• Igual o mayor a 9 le corresponde “Excelente”. 
		 *• Igual o mayor a 8 y menor que 9 le corresponde “Muy Bueno”. 
		 *• Igual o mayor a 7 y menor que 8 le corresponde “Bueno”. 
		 *• Igual o mayor a 5 y menor que 7 le corresponde “Suficiente”. 
		 *• Si no está comprendida entre ninguna de las citadas, entonces 
		 *es porque es menor de 5 y le corresponde “Insuficiente”.  
		 */

		double calificacion;
		Scanner sc=new Scanner (System.in);

		System.out.println("Introduzca su nota");

		calificacion= sc.nextDouble();

		if (calificacion>=9)
		{System.out.println("Excelente");

		}else if (calificacion >=8)
		{System.out.println("Muy bueno");

		}else if (calificacion>=7)
		{System.out.println("Bueno");

		}else if (calificacion>=5)
		{System.out.println("Suficiente");
		}else if (calificacion<5)
		{System.out.println("Insuficiente");

		sc.close();
		}
	}


}



