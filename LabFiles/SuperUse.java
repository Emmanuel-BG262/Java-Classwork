package JavaClasswork;
import java.util.*;

class Employee{
	float slr;
	float bs, da, hra;
	Employee(float bs, float hra, float da){
		this.bs=bs;
		this.da=da;
		this.hra=hra;
		
	}
	void display() {
		System.out.println("....Employee....\n");
	}
	void calcsalary() {
		slr=(bs+((bs/100)*da)+((bs/100)*hra));
		System.out.println("The gross salary of the employee: " +slr +"\n");
	}
}

class Engineer extends Employee{
	float slr2 ;
	Engineer(float bs, float da, float hra){
		super(bs, da, hra);
		super.display();
		super.calcsalary();
	}

	void display() {
		System.out.println("....Engineer....\n");
	}

	void calcsalary() {
		slr2=(slr*2);

		System.out.println("The gross salary of the Engineer: " +slr2);
	}
}

public class SuperUse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float bs, da, hra;

		
		System.out.println("Enter the basic salary: ");
		bs=sc.nextInt();
		System.out.println("Enter the HRA% of the employee:");
		hra=sc.nextInt();
		System.out.println("Enter the DA% of the employee:");
		da=sc.nextInt();
		
		Engineer en=new Engineer(bs, da, hra);
		
		en.display();
		en.calcsalary();
		
	}

}
