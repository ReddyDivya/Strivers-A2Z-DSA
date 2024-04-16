public class Recursion{

    static int count = 0;
    static void print()
    {
        if(count == 4)//base condition
            return;
        
        System.out.println(count);
        count++;// count is incremented.
        print();//recursion
    }

    public static void main(String[] arg)
    {
        print();//0, 1, 2, 3
    }
}