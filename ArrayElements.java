
//program6
//write a java program to find the smallest, largest and second largest element of an array
import java.util.Scanner;

public class ArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, temp, n = 10;
        int arr[] = new int[10];

        System.out.print("Enter 10 elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting the array using bubble sort
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Smallest element = " + arr[0]);
        System.out.println("Largest element = " + arr[n - 1]);
        System.out.println("Second largest element = " + arr[n - 2]);

        sc.close();
    }
}
/* Sample Output:
