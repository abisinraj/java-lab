
//program10
//write a java program to remove the vowels from a string
import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        String str1, str2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str1 = scan.nextLine();

        str2 = str1.replaceAll("[aeiouAEIOU]", "");

        System.out.println(str2);

        scan.close();
    }
}