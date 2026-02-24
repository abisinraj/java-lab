//program2
//write a java program to perform basic arithmetic operations on two integers
//

public class Calculator {
    public static void main(String[] args) {
        int a, b, sum, diff, prod, quo = 0, rem = 0;

        if (args.length < 2) {
            System.out.println("Please provide two integers");
            return;
        }

        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        sum = a + b;
        diff = a - b;
        prod = a * b;

        if (b != 0) {
            quo = a / b;
            rem = a % b;
        } else {
            System.out.println("Division by zero is not allowed");
        }

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + prod);

        if (b != 0) {
            System.out.println("Quotient = " + quo);
            System.out.println("Remainder = " + rem);
        }
    }
}

/* Sample Output:
