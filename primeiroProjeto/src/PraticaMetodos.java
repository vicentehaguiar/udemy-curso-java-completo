import java.util.Locale;
import java.util.Scanner;

import entities.MetodosExercicios;

public class PraticaMetodos {
	public static void main (String args[]) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		MetodosExercicios metodos = new MetodosExercicios();
		
		System.out.println(metodos.saudar());
		
		
		
	}
	
	
}
