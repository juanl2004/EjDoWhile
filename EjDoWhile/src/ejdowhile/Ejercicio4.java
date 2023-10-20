package ejdowhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		 int numIntr;
		 int contador = 1;
		 int rest;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Introduce un numero y te mostrare su tabla de multiplicación -->");
		 numIntr = sc.nextInt();

		 do {
			
		rest = numIntr*contador;
		System.out.println( numIntr + " x " + contador + " = " + rest);
		contador++; 
		
		 } while (contador<=10);
	}

}
