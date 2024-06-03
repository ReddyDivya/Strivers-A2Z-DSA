/*
Find the number that appears once, and the other numbers twice


Example 1:
Input Format: arr[] = {2,2,1}
Result: 1
Explanation: In this array, only the element 1 appear once and so it is the answer.

Example 2:
Input Format: arr[] = {4,1,2,1,2}
Result: 4
Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.
*/
public class FindNumberAppearsOnce{
    static int findNumberAppearsOnceBF(int[] arr, int n) {
        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            int num = arr[i]; // Get the current number
            int count = 0;    // Initialize a counter for occurrences of num

            // Count how many times num appears in the array
            for (int j = 0; j < n; j++) {
                if (num == arr[j]) {
                    count++;
                }
            }

            // If num appears exactly once, return it
            if (count == 1) {
                return num;
            }
        }

        // If no such element is found, return -1
        return -1;
    } // end of findNumberAppearsOnceBF

    public static void main(String[] args){
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println("Given Array: " + arr);

        int ansBF = findNumberAppearsOnceBF(arr, arr.length);
        System.out.println("The single element is(Brute Force): " + ansBF);
    }
}