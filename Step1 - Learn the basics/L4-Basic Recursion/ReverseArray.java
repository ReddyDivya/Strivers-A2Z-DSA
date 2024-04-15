public class ReverseArray{

    static void reverseArray(int arr[], int n)
    {
        int[] ans = new int[n];

        for(int i=n-1; i >= 0; i--)
        {
            ans[n-i-1] = arr[i];
        }

        //print an array
        System.out.print("Reversed array is:- \n");
        for(int i=0; i<n; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }

    public static void main(String[] arg)
    {
        int n = 5;
        int arr[] = {5, 4, 3, 2, 1};
        reverseArray(arr, n);
    }
}