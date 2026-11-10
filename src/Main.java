import java.util.Locale;
import java.util.Scanner;

import entities.Ninja;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("========= CADASTRO DE NINJA =========");
		System.out.printf("Nome: ");
		String name = scan.nextLine();

		System.out.printf("Vila: ");
		String village = scan.nextLine();

		System.out.printf("Patente: ");
		String rank = scan.nextLine();

		System.out.printf("Idade: ");
		int age = scan.nextInt();

		Ninja ninja = new Ninja(name, village, rank, age);
		
		System.out.println();
		System.out.println("========= STATUS DO NINJA =========");
		System.out.println();
		System.out.println(ninja);
		
		
		

	}
}