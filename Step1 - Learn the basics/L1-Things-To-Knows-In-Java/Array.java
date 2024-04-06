public class Array{
    public static void main(String[] args)
    {
        // int[] numbers = {1, 3, 4, 5, 7};//array of integers
        int[] numbers = {1, 3, 4, 5, 7};//array of integers

        System.out.println("Elements of the array: ");

        //accessing elements from the array
        for(int i=0; i<numbers.length; i++)
        {
            System.out.println("Element at index "+ i + ": "+ numbers[i]);
        }

        //modifying an element of the array
        numbers[2] = 100;

        //accessing the modified element from the array
        System.out.println("Modified Element: ");
        System.out.println("Element at index 2: "+ numbers[2]);

        //Calculating the sum of elements in an array
        int sum =0;
        for(int num : numbers)
        {
            sum+= num;
        }

        //displaying the sum of elements in an array
        System.out.println("Sum of elements in an array: "+ sum);
    }
}