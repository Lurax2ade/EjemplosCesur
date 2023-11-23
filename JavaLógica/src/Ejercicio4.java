import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario ingresar 3 números
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();

        // Pedir al usuario elegir el orden de ordenamiento
        System.out.print("Selecciona el orden de ordenamiento (ascendente/descendente): ");
        String orden = scanner.next();

        // Realizar el ordenamiento según la opción seleccionada
        if (orden.equalsIgnoreCase("ascendente")) {
            ordenarAscendente(num1, num2, num3);
        } else if (orden.equalsIgnoreCase("descendente")) {
            ordenarDescendente(num1, num2, num3);
        } else {
            System.out.println("Opción de orden no válida. Debe ser 'ascendente' o 'descendente'.");
        }

        scanner.close();
    }

    // Método para ordenar en forma ascendente
    private static void ordenarAscendente(int a, int b, int c) {
        int temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Números en orden ascendente: " + a + ", " + b + ", " + c);
    }

    // Método para ordenar en forma descendente
    private static void ordenarDescendente(int a, int b, int c) {
        int temp;

        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }

        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Números en orden descendente: " + a + ", " + b + ", " + c);
    }
}
