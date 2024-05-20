public class RecursiveBubbleSort {
    static void bubbleSort(int[] arr, int n) {
        // Base case: if the range to be sorted is 1, return (array is already sorted)
        if (n == 1) return;

        // Perform one pass of the bubble sort
        for (int j = 0; j <= n - 2; j++) {
            // Swap if the current element is greater than the next element
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        // Recursively call bubbleSort with the range reduced by one
        // This ensures that the next largest element will be placed in its correct position
        bubbleSort(arr, n - 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Before the Recursive Bubble Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // Call the bubbleSort method to sort the array
        bubbleSort(arr, n);
        
        System.out.println("After the Recursive Bubble Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}

/*
Output:

Enter the size of the array: 
6
Enter the elements of the array: 
78
3
22
1
222
6
Before the Recursive Bubble Sort: 
78 3 22 1 222 6
After the Recursive Bubble Sort:
1 3 6 22 78 222
*/