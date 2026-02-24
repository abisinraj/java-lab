
//program11
//write a java program to calculate the sum of digits and reverse a number
import java.util.Scanner;

class Student {
    String name;
    int roll;

    void read(Scanner sc) {
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Roll No.: ");
        roll = sc.nextInt();
    }

    void display() {
        System.out.println("Name: " + name + "\nRoll No.: " + roll);
    }
}

class Mark extends Student {
    int total = 0;
    double avg;

    void readMarks(Scanner sc) {
        System.out.println("Enter 5 subject marks:");
        for (int i = 0; i < 5; i++) {
            total += sc.nextInt();
        }
        avg = total / 5.0;
    }

    void show() {
        display();
        System.out.println("Total = " + total + "\nAverage = " + avg);
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mark m = new Mark();

        m.read(sc);
        m.readMarks(sc);
        m.show();

        sc.close();
    }
}
/* Sample Output:
