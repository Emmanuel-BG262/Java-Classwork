package Module1;
import java.util.*;

	class A{
		int i, j;
		void showij() {
		
		System.out.println("i=" +i +"j+" +j);}
	}
		class B extends A{
			int k;
			void showk() {
			System.out.println("k=" +k);;
	}
}

public class InheritanceDemo{
	public static void main(String args[]) {
		B obj=new B();
		int i=10, j=20, k=30;
		obj.showij();
		obj.showk();
		
		
	}
	

}
