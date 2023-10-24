package ejdowhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int suma = 0;
		int contador = 1;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("El ejercicio consiste en intoducir un número y sumar los anteriores incluido el introducido por el usuario");
		System.out.println("Introduce un número -->");
		num = sc.nextInt();
		
		do {
		
			suma += contador;
			contador++;
				
		} while (contador<=num);

		System.out.println("El resultado de la suma es: " + suma);
	}
	
}
