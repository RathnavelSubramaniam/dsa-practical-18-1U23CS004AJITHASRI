import java.util.Scanner;

public class LinearSearch {

    // Linear search method
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index if target is found
            }
        }
        return -1; // Return -1 if target is not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the number of elements as input
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Handle edge case of empty array
        if (n <= 0) {
            System.out.println("Array size must be greater than zero.");
            scanner.close();
            return; // Exit if the array is empty or invalid size
        }

        // Array initialization
        int[] arr = new int[n];

        // Taking elements of the array as input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Taking the target element to search for
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Performing linear search
        int result = linearSearch(arr, target);
        
        // Output result of the search
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        // Close scanner
        scanner.close();
    }
}
