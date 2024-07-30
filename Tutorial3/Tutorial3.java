import java.util.*;

public class Factorial{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int no,i=1,f=1;
        System.out.print("Enter a no:");
        no = sc.nextInt();
        while(i<no+1){
            f *= i;
            i++;
        }
        System.out.println(no+"! = "+f);
    }
}