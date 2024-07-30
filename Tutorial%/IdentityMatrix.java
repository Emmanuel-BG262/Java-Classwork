//Qusetion 3 of Tutorial 5

import java.util.*;

public class IdentityMatrix {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the identity matrix (n for nxn): ");
		int n = sc.nextInt();
		int[][] Matrix = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					Matrix[i][j] = 1;
				}else {
					Matrix[i][j] = 0;
				}
			}
		}
		System.out.println("\nThe identity matrix is: ");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(Matrix[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
	
}
