package ejdowhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int suma = 0;
		int contador = 1;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número -->");
		num = sc.nextInt();
		
		do {
		
		System.out.println("" + suma);
		 suma =+ contador;
		 contador++;
				
		} while (contador<=num);

	}

}
