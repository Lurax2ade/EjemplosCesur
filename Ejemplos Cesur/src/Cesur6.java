import java.util.Scanner;

public class Cesur6 {

	public static void main(String[] args) {
		/*Al ejecutar el siguiente código se pedirá al usuario que 
		 *active o desactive un interruptor. Si el usuario escribe 
		 *true se activará y en caso contrario si escribe false se 
		 *desactivará. Como se ha visto anteriormente este tipo de 
		 *variable booleana usada dentro de una condición, se suele 
		 *denominar interruptor o bandera (flag en inglés) porque nos 
		 *ayuda a controlar el flujo de ejecución de un programa y 
		 *para activar/desactivar ciertas funcionalidades o partes de 
		 *un código.  Dicha variable se puede cambiar en determinados 
		 *puntos del programa para modificar el comportamiento según convenga. 
		 */
		boolean interruptor;
		Scanner sc=new Scanner (System.in);
		System.out.println("Escriba true "+ " o false");
		interruptor =sc.nextBoolean();

		if (interruptor)
		{System.out.println("Es verdadero");
		}else {
			System.out.println("Es falso");
		}
	}


}


