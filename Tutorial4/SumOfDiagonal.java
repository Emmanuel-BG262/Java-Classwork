import java.util.*;

public class SumOfDiagonal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order of square matrix(n for nxn):");
        int size = sc.nextInt();
        int[][] Matrix = new int[size][size];
        System.out.println("\nEnter elements to the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Matrix[%d][%d]:",i,j);
                Mat[i][j] = obj.nextInt();   
            }
        }
        System.out.println("\nThe Matrix is:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(Matrix[i][j]+"\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i==j||(i+j==size-1)) {
                    sum += Matrix[i][j];
                }
            }
        }

        System.out.println("Sum of diagonal elements of matrix is:"+sum);
    }
}
