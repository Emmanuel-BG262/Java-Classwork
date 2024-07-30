import java.util.*;

public class Fibonacci{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int limit,first=0,second=1,third;
        System.out.print("Enter the limit:");
        limit =sc.nextInt();
        while(first<=limit){
            System.out.println(first);
            third=first+second;
            first=second;
            second = third;  
        }
    }   
}
