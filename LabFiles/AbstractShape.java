package JavaClasswork;
import java.util.*;

abstract class Shape{
	abstract void numberOfSides();
}

class Rectangle extends Shape{
	int side;
	Rectangle(int side){
		this.side=side;
	}
	void numberOfSides(){
		System.out.println("Shape with 4 sides:"+"\n"+"I am a Rectangle. I have 4 Sides."+"\n"+"Sum of angles = 360");
	}	
}

class Triangle extends Shape{
	int side;
	Triangle(int side){
		this.side=side;
	}
	void numberOfSides(){
		System.out.println("Shape with 3 sides:"+"\n"+"I am a Triangle. I have 3 Sides."+"\n"+"Sum of angles = 180");
	}
}

class Hexagon extends Shape{
	int side;
	Hexagon(int side){
		this.side=side;
	}
	void numberOfSides(){
		System.out.println("Shape with 6 sides:"+"\n"+"I am a Hexagon. I have 6 Sides."+"\n"+"Sum of angles = 720");
	}
}

public class AbstractShape {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int side;
		String s1 = "y";
		String s2= null;
		do {
			
			System.out.println("Enter the no. of sides:");
			side=sc.nextInt();
		
		
			if(side==3) {
				Triangle t=new Triangle(side);
				t.numberOfSides();
			}
			else if(side==4) {
				Rectangle r= new Rectangle(side);
				r.numberOfSides();
	
			}
			else if(side==6) {
				Hexagon h=new Hexagon(side);
				h.numberOfSides();
			}
			else {
				System.out.println("The entered value is invalid");
			}
			
			System.out.println("Do you want to Continue? (y / n):");
			s2=sc.next();
		}
		while(s1.equals(s2));
		System.out.println("Exiting program! Have Fun!");

		
	}

}
