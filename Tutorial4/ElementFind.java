import java.util.*;

public class ElementFind {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns for the matrix(rows, columns):");
        int row = sc.nextInt();
        int clmn= sc.nextInt();
        int[][] Matrix = new int[row][clmn];
        System.out.println("\nEnter the elements to the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                System.out.printf("Matrix[%d][%d]:",i,j);
                Matrix[i][j] = sc.nextInt();   
            }
        }
        System.out.println("\nThe matrix is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                System.out.print(Matrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.print("Enter the element to search:");
        int ele = obj.nextInt();
        boolean found = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                if (Matrix[i][j]==ele) {
                    System.out.printf("Element %d found at position Matrix[%d][%d]\n",ele,i,j);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.printf("Element %d not found in the matrix\n",ele);
        }
    }
}
