import java.util.*;
public class RemoveChar {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.printf("Enter the string:");
        String str = obj.nextLine();
        System.out.print("Enter the char:");
        char chr =  obj.next().charAt(0);
        String removedStr = str.replace(Character.toString(chr), "");
        System.out.println("Removed string:"+removedStr);
        obj.close();
    }
}
