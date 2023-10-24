package ejdowhile;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		double num1;
		double num2;
		char respuesta;
		double resultado;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Escribe un numero -->");
			num1 = sc.nextDouble();

			System.out.println("Escribe otro numero -->");
			num2 = sc.nextDouble();

			System.out.println("Elija una de estas opciones (Marcando el número correspondiente) -->");
			System.out.println("A. SUMAR LOS NÚMEROS");
			System.out.println("B. RESTAR LOS NÚMEROS");
			System.out.println("C. MULTIPLICAR LOS NÚMEROS");
			System.out.println("D. DIVIDIR LOS NÚMEROS");
			System.out.println("E. DIVIDIR LOS NÚMEROS");
			respuesta = sc.next().charAt(0);

			switch (respuesta) {
			case 'A':
				resultado = num1 + num2;
				System.out.println("La suma es " + resultado);
				break;

			case 'B':
				resultado = num1 - num2;
				System.out.println("La resta es " + resultado);
				break;

			case 'C':
				resultado = num1 * num2;
				System.out.println("La multiplicación es " + resultado);
				break;

			case 'D':
				if (num2 != 0) {
					resultado = num1 / num2;
					System.out.println("La división es " + resultado);
				} else {
					System.out.println("No se puede dividir entre 0");
				}
				break;
			default:
				System.out.println("La opción seleccionada no es válida");
			}
		} while (respuesta != 'E');
		
		System.out.println("¡HASTA PRONTO!");
		
		sc.close();
	}

}
