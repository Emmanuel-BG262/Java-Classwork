import java.util.*;

public class MinMax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();
        int[] Arr = new int[size];
        System.out.println("\nEnter the elements to the array:");
        for (int i = 0; i < size; i++) {
            System.out.printf("Arr[%d]:",i);
            Arr[i] = sc.nextInt();
        }
        int max = Arr[0],min = Arr[0];
        for (int i = 1; i < size; i++) {
            if(Arr[i]>max){
                max = Arr[i];
            }
            if(Arr[i]<min){
                min = Arr[i];
            }
        }
        System.out.println("Maximum element of array is:"+max);
        System.out.println("Minimum element of array is:"+min);
    }
}
