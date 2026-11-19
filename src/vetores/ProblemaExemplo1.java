package vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("how many people going be count? ");
		int n = scan.nextInt();
		double vect[] = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("type the height: ");
			vect[i] = scan.nextDouble();
		}
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

		scan.close();

	}

}
