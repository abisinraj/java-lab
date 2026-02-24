
//program7
//write a java program to find the trace and transpose of a matrix
import java.util.Scanner;

public class MatrixTraceTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r, c, trace = 0;

        System.out.print("Enter number of rows: ");
        r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] transpose = new int[c][r];

        System.out.println("Enter matrix elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Calculate transpose
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                transpose[j][i] = a[i][j];
                if (i == j) {
                    trace += a[i][j];
                }
            }
        }

        // Display original matrix
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Display transpose
        System.out.println("\nTranspose of Matrix:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        // Display trace
        if (r == c) {
            System.out.println("\nTrace of Matrix = " + trace);
        } else {
            System.out.println("\nTrace not possible");
        }

        sc.close();
    }
}
/* Sample Output:
