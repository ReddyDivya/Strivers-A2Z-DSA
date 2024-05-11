import java.util.*;

public class HighestLowestFrequencyElementFinder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Input size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Create an array of size n to store user input elements
        int[] arr = new int[n];
        
        // Input elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Frequency(arr, n);
    }

    static void Frequency(int arr[], int n){
        Map<Integer, Integer> hMap = new HashMap<>();

        for(int i=0; i<n; i++){
            // Increment the frequency count for each element
            if(hMap.containsKey(arr[i])){
                hMap.put(arr[i], hMap.get(arr[i]) + 1);
            }
            else{
                hMap.put(arr[i], 1);
            }
        }

        int maxKey = 0, maxFreq = Integer.MIN_VALUE; // Initialize maxFreq to smallest possible value
        int minKey = 0, minFreq = Integer.MAX_VALUE; // Initialize minFreq to largest possible value

        //Traverse
        for(Map.Entry<Integer, Integer> hMapEntry : hMap.entrySet()){
            int element = hMapEntry.getKey();
            int count = hMapEntry.getValue();
            
            // Update min element if current count is less than current minFreq
            if(count < minFreq){
                minKey = element;
                minFreq = count;
            }

            // Update max element if current count is greater than current maxFreq
            if(count > maxFreq){
                maxKey = element;
                maxFreq = count;
            }
        }

        System.out.println("Highest Frequency is " + maxKey + " and Lowest Frequency is "+ minKey);
    }
}

/*
Output:
Enter the size of the array: 6
Enter the elements of the array:
2
3
3
4
5
3
Highest Frequency is 3 and Lowest Frequency is 2
*/
