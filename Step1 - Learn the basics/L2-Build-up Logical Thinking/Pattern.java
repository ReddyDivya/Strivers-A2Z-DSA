public class Pattern{

    //Pattern 1
    static void pattern1(int n)
    {
        // This is the outer loop which will loop for the rows.
        for(int i=0; i<n; i++)
        {
            /*
             This is the inner loop which here, loops for the columns
             as we have to print a rectangular pattern.
            */
            for(int j=0; j<n; j++)
            {
                System.out.print("* ");
            }
            /*
            / As soon as N stars are printed, we move to the
              next row and give a line break otherwise all stars
              would get printed in 1 line.
            */
            System.out.println();
        }
    }

    //Pattern 2
    static void pattern2(int n){
        for(int i=0; i<n; i++)
        {
            /*
             This is the inner loop which loops for the columns
             no. of columns = row number for each line here.
            */
            for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n)
    {
        for(int i=0; i<n; i++)
        {
            /*
            This is the inner loop which loops for the columns
            no. of columns = row number for each line here.
            Here, we print numbers equal to the row number instead of stars in each row.
            */
            for(int j=0; j<=i; j++)
            {
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n)
    {
        for(int i=0; i<n; i++)
        {
            /*
            This is the inner loop which loops for the columns
            no. of columns = (N - row index) for each line here.
            */
            for(int j=n; j>i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n)
    {
        for(int i=0; i<n; i++)
        {
            /*
            This is the inner loop which loops for the columns
            no. of columns = (N - row index) for each line here
            as we have to print an inverted pyramid.
            (N-j) will give us the numbers in a row starting from 1 to N-i.
            */
            for(int j=n; j>i; j--)
            {
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n)
    {
        // This is the outer loop which will loop for the rows.
        for(int i=0; i<n; i++)
        {
            // For printing the spaces before stars in each row
            for(int j=0; j<n-i-1; j++)
            {
                System.out.print(" ");
            }

            // For printing the stars in each row
            for(int j=0; j<2*i+1; j++ )
            {
                System.out.print("*");
            }

            // For printing the spaces after the stars in each row
            for(int j=0; j>n-i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n)
    {
        // This is the outer loop which will loop for the rows.
        for(int i=0; i<n; i++)
        {
            // For printing the spaces before stars in each row
            for(int j=0; j<i; j++)
            {
                System.out.print(" ");
            }

            // For printing the stars in each row
            for(int j=0; j<2*n-(2*i+1); j++ )
            {
                System.out.print("*");
            }

            // For printing the spaces after the stars in each row
            for(int j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n)
    {
        pattern7(5);
        pattern8(5);
    }

    public static void main(String[] args)
    {
        pattern1(5);
        System.out.println();
        pattern2(4);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(5);
    }
}