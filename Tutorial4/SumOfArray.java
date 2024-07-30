import java.util.*;

public class SumOfArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int size = sc.nextInt();
        int[] Arr = new int[size];
        System.out.println("\nEnter the elements to the array:");
        for (int i = 0; i < size; i++) {
            System.out.printf("Arr[%d]:",i);
            Arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += Arr[i];
        }
        System.out.println("Sum of the elements of the array is:"+sum);
    }
}
