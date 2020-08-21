package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		List<OutsourcedEmployee> employee = new ArrayList<OutsourcedEmployee>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Employee #"+i+" data:");
			System.out.print("Outsourced (y/n)?");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (type == 'y') {
				
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				employee.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
				
			} else {
				
				employee.add((OutsourcedEmployee) new Employee(name, hours, valuePerHour));
				
			}
			
			
		}
		*/
		
		System.out.print("Outsourced (y/n)?");
		char type = sc.next().charAt(0);
		System.out.print("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Hours: ");
		int hours = sc.nextInt();
		System.out.print("Value per hour: ");
		double valuePerHour = sc.nextDouble();
		
		if (type == 'y') {
			
			System.out.print("Additional charge: ");
			double additionalCharge = sc.nextDouble();
			OutsourcedEmployee employee1 = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
			
			System.out.println();
			System.out.println("PAYMENTS:");
			System.out.println(employee1.getName()+" - $ "+employee1.payment());
			
			
		} else {
			
			OutsourcedEmployee employee2 = new OutsourcedEmployee(name, hours, valuePerHour, 0.0);
			System.out.println();
			System.out.println("PAYMENTS:");
			System.out.println(employee2.getName()+" - $ "+employee2.payment());
			
		}

		sc.close();

	}

}
