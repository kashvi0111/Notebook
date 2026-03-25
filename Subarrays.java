
import java.util.Scanner;

public class Subarrays {

    static void printSubarrays(int[] arr) {
        int n = arr.length;

        // Loop 1: starting point of subarray
        for (int i = 0; i < n; i++) {

            // Loop 2: ending point of subarray
            for (int j = i; j < n; j++) {

                // Loop 3: print elements from i to j
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    if (k == j)
                        System.out.print(arr[k]);
                    else
                        System.out.print(arr[k] + ", ");
                }
                System.out.println("]");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size as input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Take array elements as input
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print all subarrays
        System.out.println("\nAll Subarrays:");
        printSubarrays(arr);

        sc.close();
    }
}
