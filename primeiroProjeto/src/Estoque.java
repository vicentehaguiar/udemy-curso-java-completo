import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Estoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = scan.nextLine();
		
		System.out.print("Value: ");
		product.price = scan.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = scan.nextInt();
		
		product.toString();
		
		System.out.println("Product data: "+product);
		System.out.println("Enter the numer of products to be added in stock: ");
		int quantity = scan.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Product data: "+product);
		
		System.out.println("Enter the numer of products to be removed from stock: ");
		quantity = scan.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Product data: "+product);
		
		scan.close();
		
	}

}
