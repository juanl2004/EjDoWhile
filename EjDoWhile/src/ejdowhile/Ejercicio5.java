package ejdowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Random rand = new Random();

		int min = 1;

		int max = 101;

		int numMqn;

		String respHm;

		Scanner sc = new Scanner(System.in);

		do {
			numMqn = rand.nextInt(min, max);
			System.out.println("Es este número --> " + numMqn);
			respHm = sc.next();
			
			if (respHm.equals("MAYOR")) {
				min = numMqn + 1;
				
			}else if(respHm.equals("MENOR")) {
				max = numMqn;
			}
			
		} while (!respHm.equals("IGUAL") && min != max);

		if (min == max) {
			System.out.println("¡ERROR! Recuerda tu número");
		} else {
			System.out.println("¡ACERTÉ!");
		}
		sc.close();
	}

}
