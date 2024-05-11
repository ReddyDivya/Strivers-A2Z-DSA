import java.util.*;

public class CountFreq{

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
        
        countFreq(arr, n);
    }

    static void countFreq(int arr[], int n)
    {
        Map<Integer, Integer> hMap = new HashMap<>();

        for(int i=0; i<n; i++){
            if(hMap.containsKey(arr[i])){
                hMap.put(arr[i], hMap.get(arr[i]) + 1);
            }
            else{
                hMap.put(arr[i], 1);
            } 
        }

        // Traverse through map and print frequencies
        for(HashMap.Entry<Integer, Integer> hMapEntry : hMap.entrySet()){
            System.out.println("Frequency of " + hMapEntry.getKey() + " is "+ hMapEntry.getValue());
        }
    }
}
/*
Output:

Frequency of 5 is 2
Frequency of 10 is 3
Frequency of 15 is 1
*/