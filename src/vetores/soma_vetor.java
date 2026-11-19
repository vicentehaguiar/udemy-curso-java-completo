package vetores;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.printf("How many numbers gonna be typed? ");
		int n = scan.nextInt();
		double vect[] = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Type a number: ");
			vect[i] = scan.nextDouble();
		}
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		System.out.print("Values = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.2f ", vect[i]);
		}
		System.out.println();
		System.out.printf("Sum = %.2f%n", sum);
		System.out.printf("Average = %.2f%n", avg);

	}
}
