import java.util.Scanner;

public class ProblemaExemploSintaxe {
	public static void main (String []args ) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		
		int higher = max(n1,n2,n3);
		showResult(higher);
		
		
		
		scan.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		
		if (x > y && x > z) {
		aux = x;
	} else if (y > z) {
		aux = y;
	
	}else {
		aux = z;
	}
	 return aux;
	
	}
	public static void showResult(int value) {
		System.out.println("Higher = "+value);
	}
	
}
