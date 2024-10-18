package Labwork;
import java.util.*;

class ThreadEx extends Thread{
	int num;
	
	public ThreadEx(int num){
		this.num=num;
	}

	public void run() {
		for (int i=0;i<6;i++){
			synchronized(ThreadEx.class){
				System.out.println(num+"*"+i+"="+(num*i));
			}
		}
			
	}
}	


public class SynchroEx {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of table 1:");
		int num1=sc.nextInt();
		System.out.println("Enter the no. of table 2:");
		int num2=sc.nextInt();
		System.out.println("Enter the no. of table 3:");
		int num3=sc.nextInt();
		
		ThreadEx t1=new ThreadEx(num1);
		ThreadEx t2=new ThreadEx(num2);
		ThreadEx t3=new ThreadEx(num3);
		
		t1.start();
		t2.start();
		t3.start();
		
		sc.close();
	}

}
