
import java.util.*;

public class StringInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word1 = sc.next();
        System.out.println("Enter the second word : ");
        String word2 = sc.next();
        System.out.println("Enter the first line : ");
        String line = sc.nextLine();
        System.out.println("Enter the line : ");
        String line2 = sc.nextLine();

        System.out.print("word1: " + word1 + ",");
        System.out.print("word2: " + word2 + ",");
        System.out.print("line: " + line + "*");
        System.out.print("line2: " + line2 + "*");
        sc.close();
    }
}
