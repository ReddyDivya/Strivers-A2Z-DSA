/*
Intersection Of Sorted Arrays

*/
import java.util.ArrayList;

public class IntersectionOfSortedArrays {

    // Approach 1: Brute Force
    public static ArrayList<Integer> intersectBF(int[] arr1, int[] arr2) {
        ArrayList<Integer> intersection = new ArrayList<>();
        
        // Iterate through each element in the first array
        for (int i = 0; i < arr1.length; i++) {
            // Compare with each element in the second array
            for (int j = 0; j < arr2.length; j++) {
                // If a common element is found
                if (arr1[i] == arr2[j]) {
                    // Avoid adding duplicates
                    if (!intersection.contains(arr1[i])) {
                        intersection.add(arr1[i]);
                    }
                }
            }
        }

        return intersection;
    } // intersectBF

    // Approach 2: Optimal Two-Pointer Approach
    public static ArrayList<Integer> intersectOptimal(int[] arr1, int[] arr2) {
        int i = 0, j = 0; // Initialize two pointers
        ArrayList<Integer> intersection = new ArrayList<>();

        // Traverse both arrays simultaneously
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                // Avoid adding duplicates
                if (intersection.isEmpty() || intersection.get(intersection.size() - 1) != arr1[i]) {
                    intersection.add(arr1[i]);
                }
                // Move both pointers forward
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                // Move pointer i forward if arr1[i] is smaller
                i++;
            } else {
                // Move pointer j forward if arr2[j] is smaller
                j++;
            }
        }

        return intersection;
    } // intersectOptimal

    public static void main(String[] args) {
        // Example arrays
        int[] arr1 = {1, 2, 2, 4, 5, 6};
        int[] arr2 = {2, 2, 4, 6, 8};
        
        // Display initial arrays
        System.out.println("Before the Intersection of sorted arrays: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        // Compute intersections using both approaches
        ArrayList<Integer> resultBF = intersectBF(arr1, arr2);
        ArrayList<Integer> resultOptimal = intersectOptimal(arr1, arr2);

        // Display results
        System.out.println("After the Intersection of sorted arrays (Brute Force): " + resultBF);
        System.out.println("After the Intersection of sorted arrays (Optimal): " + resultOptimal);
    } // main
}


/*
Output:

Before the Intersection of sorted arrays: 
1 2 2 4 5 6
2 2 4 6 8
After the Intersection of sorted arrays (Brute Force): [2, 4, 6]
After the Intersection of sorted arrays (Optimal): [2, 4, 6] 
*/