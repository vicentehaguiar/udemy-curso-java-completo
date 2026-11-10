import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Estoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = scan.nextLine();

		System.out.print("Value: ");
		double price = scan.nextDouble();

		System.out.print("Quantity in stock: ");
		int quantity = scan.nextInt();
		Product product = new Product(name, price, quantity);

		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Update price: "+ product.getPrice());
		
		System.out.println("Product data: " + product);
		System.out.println("Enter the numer of products to be added in stock: ");
		quantity = scan.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println("Enter the numer of products to be removed from stock: ");
		quantity = scan.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		scan.close();

	}

}
