
public class Cesur11 {


	public static void main(String[] args) {

		/*Anidar estructuras for en Java es muy común cuando 
		 *se trabaja con arrays bidimensionales, te proponemos 
		 *un ejemplo sencillo para imprimir los números en un 
		 *patrón triangular.   Cada fila tiene una secuencia de 
		 *números que comienza en 1 y aumenta en uno hasta el número 
		 *de la fila correspondiente. Esto crea un patrón triangular 
		 *que se va formando a medida que aumenta el número de filas. 
		 *El número de filas dependerá de la condición de salida del 
		 *bucle más externo, en este caso será cuando i sea mayor a 5 
		 *(mientras i sea menor o igual a 5 el bucle seguirá ejecutándose). 

		 */

		for (int i = 1; i <= 9; i++) {             
			for (int j = 1; j <= i; j++) {                 
				System.out.print(j + " ");             
			}             System.out.println();         
		}     
	} 
}


