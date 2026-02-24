
//program8
//write a java program to calculate the sum of digits and reverse a number
import java.util.Scanner;

class SumRev {
    int a, num = 0, sum = 0;

    void sum(int num) {
        do {
            a = num % 10;
            sum = sum + a;
            num = num / 10;
        } while (num > 0);

        System.out.println("Sum of digits = " + sum);
    }

    void reverse(int num) {
        do {
            a = num % 10;
            this.num = this.num * 10 + a;
            num = num / 10;
        } while (num > 0);

        System.out.println("Reverse: " + this.num);
    }
}

public class SumRevMain {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        n = sc.nextInt();

        SumRev obj = new SumRev();
        obj.sum(n);
        obj.reverse(n);

        sc.close();
    }
}
/* Sample Output:
