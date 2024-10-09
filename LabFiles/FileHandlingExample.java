import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        try {
            File file1 = new File("sample.txt");
            if (!file1.exists()) {
                file1.createNewFile();
                System.out.println("sample.txt created");
            } else {
                System.out.println("sample.txt exists");
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the String:");
            String input = br.readLine();

            FileWriter fw1 = new FileWriter(file1);
            fw1.write(input);
            fw1.close();
            System.out.println("Content written to sample.txt");

            File file2 = new File("new-sample.txt");
            if (!file2.exists()) {
                file2.createNewFile();
                System.out.println("new-sample.txt created");
            } else {
                System.out.println("new-sample.txt exists");
            }

            BufferedReader fr1 = new BufferedReader(new FileReader(file1));
            BufferedWriter fw2 = new BufferedWriter(new FileWriter(file2));

            String line;
            System.out.println("--------Contents of sample.txt--------:");
            while ((line = fr1.readLine()) != null) {
                System.out.println(line);
                fw2.write(line);
                fw2.newLine();
            }

            fr1.close();
            fw2.close();
            System.out.println("Contents copied from sample.txt to new-sample.txt");

            System.out.println("--------Contents of new-sample.txt--------:");
            BufferedReader fr2 = new BufferedReader(new FileReader(file2));
            while ((line = fr2.readLine()) != null) {
                System.out.println(line);
            }
            fr2.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
