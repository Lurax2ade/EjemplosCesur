import java.util.Scanner;

public class Ejercicio2
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número positivo: ");
            numero = scanner.nextInt();
        } while (numero <= 0);

        System.out.println("Los primeros 20 números sucesivos son:");

        for (int i = 1; i <= 20; i++) {
            System.out.println(numero + i);
        }

        scanner.close();
    }
}