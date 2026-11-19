package vetores;

import java.util.Locale;
import java.util.Scanner;

//FOI FEITO SEM OBJETOS E OUTRA CLASSE//

public class Negativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.printf("How many numbers gonna be typed? ");
		int n = scan.nextInt();
		int vect[] = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Type a number: ");
			vect[i] = scan.nextInt();
		}
		System.out.println("NEGATIVE NUMBERS:");
			for (int i = 0; i < n; i++) {
				if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}

	}
}