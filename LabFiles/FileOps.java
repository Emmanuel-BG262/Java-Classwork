package Labwork;
import java.io.*;
import java.util.*;

public class FileOps {
    public static void main(String[] args) {
        try {
            File numFile = new File("number.txt");
            if (!numFile.exists()) {
                numFile.createNewFile();
                System.out.println("number.txt created");
            }

            File evenFile = new File("even.txt");
            if (!evenFile.exists()) {
                evenFile.createNewFile();
                System.out.println("even.txt created");
            }

            File oddFile = new File("odd.txt");
            if (!oddFile.exists()) {
                oddFile.createNewFile();
                System.out.println("odd.txt created");
            }

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements you want to store: ");
            int n = sc.nextInt();

            int[] nums = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            FileOutputStream fosNum = new FileOutputStream(numFile);
            for (int num : nums) {
                String numStr = num + "\n";
                fosNum.write(numStr.getBytes());
            }
            fosNum.close();
            System.out.println("Data added");

            FileOutputStream fosEven = new FileOutputStream(evenFile);
            FileOutputStream fosOdd = new FileOutputStream(oddFile);

            for (int num : nums) {
                String numStr = num + "\n";
                if (num % 2 == 0) {
                    fosEven.write(numStr.getBytes());
                } else {
                    fosOdd.write(numStr.getBytes());
                }
            }
            fosEven.close();
            fosOdd.close();

            System.out.println("\nContent of number.txt is:");
            FileInputStream fisNum = new FileInputStream(numFile);
            int content;
            while ((content = fisNum.read()) != -1) {
                System.out.print((char) content);
            }
            fisNum.close();
            
            System.out.println("\nEven and odd numbers have been separated into even.txt and odd.txt");

            System.out.println("\nContent of even.txt:");
            FileInputStream fisEven = new FileInputStream(evenFile);
            while ((content = fisEven.read()) != -1) {
                System.out.print((char) content);
            }
            fisEven.close();

            System.out.println("\nContent of odd.txt:");
            FileInputStream fisOdd = new FileInputStream(oddFile);
            while ((content = fisOdd.read()) != -1) {
                System.out.print((char) content);
            }
            fisOdd.close();



        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
