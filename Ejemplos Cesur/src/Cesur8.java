
public class Cesur8 {

	public static void main(String[] args) {
		/*Aparte de los if-else hay otra estructura muy conocida y usada, 
		 *se denomina switch. Hay que seguir un cierto patrón a la hora de 
		 *emplearla. 
		 *
		 *Practica con esta estructura para que, según una variable 
		 *llamada número cuyo valor es 1 se almacene en otra variable de nombre 
		 *cadena un texto que indique si es cero, uno, dos, o distinto de todos 
		 *ellos. Al final se mostrará el valor de la variable cadena.   
		 *
		 *Te habrás fijado que en la solución que se ha propuesto, 
		 *siempre se visualizará en pantalla el mismo mensaje. 
		 *Reflexiona sobre… cómo hacer para que aparezcan distintos 
		 *mensajes (la variable número deberá entonces almacenar un 
		 *valor que sea introducido por el usuario).  La estructura 
		 *switch se corresponde con la estructura Segun…Hacer...FinSegun 
		 *de pseudocódigo vista en la unidad anterior.  
		 *
		 *La salida por pantalla será: Es uno   
		 */

		int numero=1;

		String cadena;

		switch (numero) {

		case 0: cadena="es cero";
		break;

		case 1: cadena= "es uno";
		break;

		case 2: cadena="es dos";
		break;

		default: cadena="es distinto de todos ellos";
		}
		System.out.println(cadena);





	}


}



