package Module1;
import java.util.*;
public class Reverse {
	    public static int reverse(int num) {
	        int reversedNum = 0;
	        while (num != 0) {
	            int digit = num % 10;
	            reversedNum = reversedNum * 10 + digit;
	            num /= 10;
	        }
	        return reversedNum;
	    }
	    
	    public static void main(String[] args) {
	    	System.out.println("Enter the number");
	    	Scanner sc = new Scanner(System.in);
	        int number = sc.nextInt();
	        int reversed = reverse(number);
	        
	        System.out.println("Original number: " + number);
	        System.out.println("Reversed number: " + reversed);
	    }
	}
