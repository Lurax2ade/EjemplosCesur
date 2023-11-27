import java.util.Scanner;

public class Cesur1 {

	public static void main(String[] args) {

		//Introduce un número entero: 5 
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número entero");
		int numero= sc.nextInt();

		//Introduce un valor booleano: true
		System.out.println("Introduce true"
				+ " o false");
		boolean b= sc.nextBoolean();

		//Introduce un valor con decimales (tipo dato con precisión simple): 5,66666987
		System.out.println("Introduce un número con decimales simple");
		float f=sc.nextFloat();

		//Introduce un valor con decimales (tipo dato con precisión doble): 5,66666987
		System.out.println("Introduce un número decimal de dato doble");
		double d= sc.nextDouble();

		//Introduce una cadena de texto:Hola
		System.out.println("Introduce una cadena de texto: Hola");
		String str= sc.nextLine();
		
		sc.close();
		

System.out.println("El número entero introducido es: "+numero);
System.out.println("El número decimal simple introducido es: "+f);
System.out.println("El número decimal doble introducido es: "+d);
System.out.println("El dato booleano introducido es: "+b);
System.out.println("La cadena de texto introducida es: "+str);



	}

}
