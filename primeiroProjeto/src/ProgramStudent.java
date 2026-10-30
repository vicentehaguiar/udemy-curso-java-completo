import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		Student data = new Student();
		
		System.out.println("Enter student name: ");
		data.name = scan.nextLine();
		System.out.println("Enter the grade for the first quarter (max = 30): ");
		data.n1 = scan.nextDouble();
		System.out.println("Enter the grade for the second quarter (max = 35): ");
		data.n2 = scan.nextDouble();
		System.out.println("Enter the grade for the third quarter (max = 35): ");
		data.n3 = scan.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n ",data.finalGrade());
		
		if (data.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n",data.missingPoints());
	}	
		else {
			System.out.println("PASS");
		}
			scan.close();
	}
/* teste */

}
