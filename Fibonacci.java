
//program3
//write a java program to generate fibonacci series upto a given number
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, a = 0, b = 1, c = 0;

        System.out.print("Enter the limit: ");
        n = scan.nextInt();

        System.out.println("Fibonacci series upto " + n + ":");

        while (a < n) {
            System.out.print(a + ", ");
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println();
        scan.close();
    }
}
