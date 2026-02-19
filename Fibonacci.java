import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, a = 0, b = 1;

        System.out.print("Enter the limit: ");
        n = scan.nextInt();

        System.out.println("Fibonacci series upto " + n + ":");

        while (a < n) {
            System.out.print(a + ", ");
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
        scan.close();
    }
}
