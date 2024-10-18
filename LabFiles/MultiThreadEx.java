package Labwork;
import java.util.*;

class RandomNum extends Thread {
	int rno;
	public void run() {
			Random rob=new Random();
			for(int i=0;i<=10;i++) {
				int rno=rob.nextInt(100);
			
			try{
				
				if(rno%2==0) {
			
				SquareThread t=new SquareThread(rno);
				t.start();
				t.sleep(300);
			}
			else {
				CubeThread t=new CubeThread(rno);
				t.start();
				
			
			}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}	
	}			
}

class SquareThread extends Thread{
	int num;
	public SquareThread(int num) {
		this.num=num;
	}
	public void run() {
	
			System.out.println("The square of the random no."+ num+" is :" +(num*num));
		}
	
}
class CubeThread extends Thread{
	int num;
	public CubeThread(int num) {
		this.num=num;
	}
	public void run() {

			System.out.println("The cube of the random no."+ num+" is :" +(num*num*num));
		}
		
	}
	





public class MultiThreadEx {

	public static void main(String[] args) {
		RandomNum t=new RandomNum();
		t.start();


	}

}
