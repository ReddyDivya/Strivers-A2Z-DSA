/*
Intersection Of Sorted Arrays

    # Approach 1: Brute Force
    * 1. Create an empty list to store the intersection.
    * 2. Iterate through each element in the first array.
    * 3. For each element in the first array, iterate through each element in the second array.
    * 4. If a common element is found, check if it is already in the intersection list.
    * 5. If not, add the common element to the intersection list.
    * 6. Return the intersection list.
     
    # Approach 2: Optimal Two-Pointer Approach
    * 1. Initialize two pointers, one for each array.
    * 2. Create an empty list to store the intersection.
    * 3. Traverse both arrays using the pointers.
    * 4. If the elements at both pointers are equal, add the element to the intersection list (if it's not a duplicate).
    * 5. Move both pointers forward.
    * 6. If the element in the first array is smaller, move the pointer in the first array forward.
    * 7. If the element in the second array is smaller, move the pointer in the second array forward.
    * 8. Continue until one of the pointers reaches the end of its array.
    * 9. Return the intersection list.

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