
//program4
//write a java program to find armstrong numbers in a given range
import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

        for (int num = start; num <= end; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }

        sc.close();
    }

    public static boolean isArmstrong(int num) {
        int sum = 0;
        int temp = num;
        int digit = String.valueOf(num).length();

        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, digit);
            temp /= 10;
        }

        return sum == num;
    }
}
/*
 * Sample Output:
 * Enter the starting number: 1
 * Enter the ending number: 500
 * Armstrong numbers between 1 and 500 are:
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 153
 * 370
 * 371
 * 407
 */
