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
		System.out.println();
		System.out.println("Quanto chakra deseja utilizar?");
		int amount = scan.nextInt();
		ninja.useChakra(amount);
		System.out.println();
		System.out.println("Chakra restante: " + ninja.getChakra());
		System.out.println();

		System.out.println("========= STATUS ATUALIZADO =========");
		System.out.println(ninja);
		System.out.println();
		System.out.println("Quanto chakra deseja recuperar?");
		amount = scan.nextInt();
		ninja.train(amount);
		System.out.println();

		System.out.println("Chakra atual: " + ninja.getChakra());
		System.out.println();

		System.out.println("========= MISSÃO =========");
		System.out.println();
		System.out.println("Missão concluída com sucesso!");
		ninja.completeMission();
		System.out.println();
		System.out.println("========= STATUS FINAL =========");
		System.out.println();
		System.out.println(ninja);

		
		scan.close();
//
	}
}