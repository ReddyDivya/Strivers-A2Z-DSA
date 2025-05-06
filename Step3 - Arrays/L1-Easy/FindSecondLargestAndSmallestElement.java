import java.util.*;

public class FindSecondLargestAndSmallestElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        fnBruteApproach(arr.clone(), arr.length); // use clone to preserve original array
        fnOptimalApproach(arr, arr.length);
    }

    static private void fnBruteApproach(int[] arr, int n) {
        System.out.println("Brute Force Approach:");
        Arrays.sort(arr);
        if (n < 2) {
            System.out.println("Array too small to find second smallest.");
            return;
        }
        int smallest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] != smallest) {
                System.out.println("Second Smallest element: " + arr[i]);
                return;
            }
        }
        System.out.println("No second smallest element found.");
    }

    static private void fnOptimalApproach(int[] arr, int n) {
        System.out.println("Optimal Approach:");
        if (n < 2) {
            System.out.println("Array too small to find second smallest.");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found.");
        } else {
            System.out.println("Second Smallest element: " + secondSmallest);
        }
    }
}
