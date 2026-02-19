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
        System.out.println("Enter 3 subject marks:");
        for (int i = 0; i < 3; i++) {
            total += sc.nextInt();
        }
        avg = total / 3.0;
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