public class Hashing1{

    static int hashing1(int arr[], int number){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(number == arr[i]){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 1, 3, 2};
        System.out.println("1 is "+ hashing1(arr, 1) + " in the given array");
        System.out.println("2 is "+ hashing1(arr, 2) + " in the given array");
        System.out.println("3 is "+ hashing1(arr, 3) + " in the given array");
        System.out.println("4 is "+ hashing1(arr, 4) + " in the given array");
    }
}