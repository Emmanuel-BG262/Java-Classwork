package Module1;
import java.util.*;


class Employee{
	String name=new String();
	int age, salary, phoneNumber;
	String adr=new String();

	void print_employee() {
		System.out.println("Name: " +name);
		System.out.println("Address: " +adr);
		System.out.println("Age: " +age);
		System.out.println("Phone Number: " +phoneNumber);
		System.out.println("Salary of the employee is: " +salary);
	}
}
class Officer extends Employee{
	String spec=new String();
	void print_specialisation() {
		System.out.println("Specialisation: " +spec);
	}
	
}
class Manager extends Employee{
	String dpt=new String();
	void print_department() {
		System.out.println("Dpartment: " +dpt);
		
		
	}
}

public class Inheritance {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		Officer off=new Officer();
		Manager mng=new Manager();
		System.out.println("\n Details of the Officer:\n");
		System.out.println("Enter the name of the officer: ");
		off.name = sc.nextLine();
		System.out.println("Enter the salary of the officer: ");
		off.salary=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the address of the officer: ");
		off.adr=sc.nextLine();
		System.out.println("Enter the age of the officer: ");
		off.age=sc.nextInt();
		System.out.println("Enter the phone number of the officer: ");
		off.phoneNumber=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the specialisation of the officer: ");
		off.spec=sc.nextLine();
		
		System.out.println("\n Details of the Manager:\n");
		System.out.println("Enter the name of the manager: ");
		mng.name = sc.nextLine();
		System.out.println("Enter the salary of the manager: ");
		mng.salary=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the address of the manager: ");
		mng.adr=sc.nextLine();
		System.out.println("Enter the age of the manager: ");
		mng.age=sc.nextInt();
		System.out.println("Enter the phone number of the manager: ");
		mng.phoneNumber=sc.nextInt();
		sc.nextLine();  
		System.out.println("Enter the department of the manager: ");
		mng.dpt=sc.nextLine();

		System.out.println("\n Details of the Officer:\n");
		off.print_employee();
		off.print_specialisation();
		
		System.out.println("\n Details of the Manager:\n");
		mng.print_employee();
		mng.print_department();
		
		
		
		sc.close();	
	}
}
