package vetores;

import java.util.Locale;
import java.util.Scanner;
import entities.ProductEx2;

public class ProblemaExemplo2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.printf("How many products going be counted? ");
		int n = scan.nextInt();
		ProductEx2[] vect = new ProductEx2[n];

		for (int i = 0; i < vect.length; i++) {
			scan.nextLine();

			System.out.println("product name: ");
			String name = scan.nextLine();

			System.out.println("product price: ");
			double price = scan.nextDouble();
			vect[i] = new ProductEx2(name, price);
		}

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;

		System.out.printf("AVERAGE PRICE = %.2f%n", avg);

	}

}
