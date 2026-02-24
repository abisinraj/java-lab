
//program9
//write a java program to check whether the given strings are anagram or not
import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
        } else {
            char[] a1 = s1.toCharArray();
            char[] a2 = s2.toCharArray();

            Arrays.sort(a1);
            Arrays.sort(a2);

            if (Arrays.equals(a1, a2)) {
                System.out.println("String are Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }

        sc.close();
    }
}
/* Sample Output:
