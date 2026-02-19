
//program5
//write a java program to check whether the given triangle is equilateral, isosceles or scalene
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        double p, area;

        System.out.print("Enter 3 sides: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ((c < a + b) && (b < a + c) && (a < b + c)) {
            if ((a == b) && (b == c)) {
                System.out.println("Equilateral triangle");
            } else if ((a == b) || (b == c) || (c == a)) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene triangle");
                p = (a + b + c) / 2.0;
                area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println("Area of triangle is = " + area);
            }
        } else {
            System.out.println("Cannot form a triangle");
        }

        sc.close();
    }
}