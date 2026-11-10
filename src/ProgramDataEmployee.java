import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramDataEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		Employee emp = new Employee();
		
		System.out.println("Name: ");
		emp.name = scan.nextLine();
		System.out.println("Gross salary: ");
		emp.grossSalary = scan.nextDouble();
		System.out.println("Tax: ");
		emp.tax = scan.nextDouble();
		
		System.out.println();
		System.out.println("Employee: "+emp);
		System.out.println();
		System.out.printf("Which percentage to increase salary? ");
		double percentage = scan.nextDouble();
		emp.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: "+emp);
		scan.close();
	}

}
