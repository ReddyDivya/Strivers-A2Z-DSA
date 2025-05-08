/*
5. Left Rotate the Array by One

# Approach 1: Brute Force
- We can take another dummy array of the same length and then shift all elements in the array toward the left and then at the last element store the index of 0th index of the array and print it

------------------------------------------------
# Approach 2: Optimal
Step1: We have to shift the array towards the left so, we store the value of the first index in a variable (let it be x).
Step2: Then we iterate the array from the 0th index to the n-1th index(why n-1 i will explain it below)
Step3: Then, store the value present in the next index to the current index like this. arr[i] = arr[i+1]
Step4: To prevent its segmentation fault we will iterate it till n-1.
Step5: At last, put the value of variable x in the last index of the array.
*/

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class LeftRotateByOnePlace {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0;
        int[] arr = null;

        try {
            System.out.println("Enter the number of elements:");
            n = scn.nextInt();

            if (n < 2) {
                System.out.println("There is no second smallest element in the array.");
                return;
            }

            arr = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
            return;
        } finally {
            scn.close();
        }

        System.out.print("Original array: ");
        printArray(arr);

        // Make copies so both functions operate independently
        int[] bruteArr = Arrays.copyOf(arr, n);
        int[] optimalArr = Arrays.copyOf(arr, n);

        fnBruteForce(bruteArr, n);
        System.out.print("After Left Rotate (Brute Force): ");
        printArray(bruteArr);

        fnOptimal(optimalArr, n);
        System.out.print("After Left Rotate (Optimal): ");
        printArray(optimalArr);
    }

    static void fnBruteForce(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    static void fnOptimal(int[] arr, int n) {
        int x = arr[0]; // Step1
        for (int i = 0; i < n - 1; i++) { // Step2-4
            arr[i] = arr[i + 1]; // Step3
        }
        arr[n - 1] = x; // Step5
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

/*
Output:

Enter the number of elements:
5
Enter the elements:
44
33
22
21
1
Original array: 44 33 22 21 1 
After Left Rotate (Brute Force): 33 22 21 1 44
After Left Rotate (Optimal): 33 22 21 1 44
*/