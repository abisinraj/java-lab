import java.util.Scanner;

class Complex {
    double real, img;

    Complex(double r, double i) {
        real = r;
        img = i;
    }

    Complex addComp(Complex c1, Complex c2) {
        Complex sum = new Complex(0, 0);
        sum.real = c1.real + c2.real;
        sum.img = c1.img + c2.img;
        return sum;
    }
}

public class ComplexSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of 1st complex number: ");
        double r1 = sc.nextDouble();

        System.out.print("Enter imaginary part of 1st complex number: ");
        double i1 = sc.nextDouble();

        System.out.print("Enter real part of second complex number: ");
        double r2 = sc.nextDouble();

        System.out.print("Enter imaginary part of 2nd complex number: ");
        double i2 = sc.nextDouble();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);
        Complex c3 = new Complex(0, 0);

        System.out.println("Complex number 1: " + c1.real + " + " + c1.img + "i");
        System.out.println("Complex number 2: " + c2.real + " + " + c2.img + "i");

        c3 = c3.addComp(c1, c2);

        System.out.println("Sum of complex numbers: " + c3.real + " + " + c3.img + "i");

        sc.close();
    }
}