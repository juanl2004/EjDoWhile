package ejdowhile;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		String jugador1, jugador2, continuar;

		Scanner sc = new Scanner(System.in);

		System.out.println("Juguemos a piedra papel o tijera ¡VAMOS ALLÁ!");
		do {
			
			do {
				System.out.print("Jugador 1, elija (PIEDRA), (PAPEL) o (TIJERA): ");
				jugador1 = sc.nextLine();

			} while (!(jugador1.equals("PIEDRA") || jugador1.equals("PAPEL") || jugador1.equals("TIJERA")));

			
			do {
				System.out.print("Jugador 2, elija (PIEDRA), (PAPEL) o (TIJERA): ");
				jugador2 = sc.nextLine();

			} while (!(jugador2.equals("PIEDRA") || jugador2.equals("PAPEL") || jugador2.equals("TIJERA")));

			
			if (jugador1.equals(jugador2)) {
				System.out.println("Empate. Ambos jugadores eligieron lo mismo");
			} else if ((jugador1.equals("PIEDRA") && jugador2.equals("TIJERA"))
					|| (jugador1.equals("PAPEL") && jugador2.equals("PIEDRA"))
					|| (jugador1.equals("TIJERA") && jugador2.equals("PAPEL"))) {
				System.out.println("Gana el jugador 1");

			} else {
				System.out.println("Gana el jugador 2");
			}
			
			System.out.println("¿Quieres seguir jugando? Si es así pulsa (S): ");
			continuar = sc.nextLine();
		} while (continuar.equalsIgnoreCase("S"));

	}
}
