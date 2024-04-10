public class Pattern{

    /*
    Pattern 1
    ---------
        * * * * * 
        * * * * * 
        * * * * * 
        * * * * *
        * * * * *
    */
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

    /*
    Pattern 2
    ---------
        *
        * *
        * * *
        * * * *
    */
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

    /*
    Pattern 3
    ---------
    1       
    1 2     
    1 2 3   
    1 2 3 4
    */
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

    /*
    Pattern 4
    ---------
    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5
    */
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

    /*
    Pattern 5
    ---------
        * * * * * 
        * * * * 
        * * * 
        * *
        * 
    */
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

    /*
    Pattern 6
    ---------
       1 2 3 4 5
       1 2 3 4
       1 2 3
       1 2
       1
    */
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

    /*
    Pattern 7
    ---------
         *
        ***
       *****
      *******
     *********
    */
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

    /*
    Pattern 8
    ---------
     *********
      *******
       *****
        ***
         *
    */
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

    /*
    Pattern 9
    ---------
         *
        ***
       *****
      *******
     *********
     *********
      *******
       *****
        ***
         *
    */
    static void pattern9(int n)
    {
        pattern7(5);
        pattern8(5);
    }

    /*
    Pattern 10
    ---------
        *
        **
        ****
        *****
        ******
        *****
        ****
        ***
        **
        *
    */
    static void pattern10(int n)
    {
        //case: n=5
        //Outer loop for number of rows.
        for(int i=1; i<=2*n-1; i++ )//9 rows
        {
            //stars would be equal to the row no. uptill first half
            int stars = i;

            // for the second half of the rotated triangle.
            if(i>n)
                stars = 2*n - i;

            //for printing the stars for each row
            for(int j=1; j<=stars; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    Pattern 11
    ---------
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
    */
    static void pattern11(int n)
    {
        // First row starts by printing a single 1.
        int start = 1;

        // Outer loop for the no. of rows
        for(int i=0; i<n; i++ )
        {
            //if the row index is even then 1 is printed first in that row.            
          if(i%2 == 0)
                start = 1;
            else // if odd, then the first 0 will be printed in that row.
                start = 0;

            // We alternatively print 1's and 0's in each row by using the inner for loop.
            for(int j=0; j<=i; j++)
            {
                System.out.print(start+" ");
                start = 1-start;//flipping start values 0->1, 1->0
            }
            System.out.println();
        }
    }

    /*
    Pattern 11
    ---------
        1             1
        1 2         2 1
        1 2 3     3 2 1
        1 2 3 4 4 3 2 1
    */
    static void pattern12(int n)
    {   
        int spaces = 2*(n-1);//initial no. of spaces in row 1.
        
        // Outer loop for the number of rows.
        for(int i=1; i<=n; i++)
        {
            // for printing numbers in each row
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }

            //for printing spaces in each row
            for(int j=1; j<=spaces; j++)
            {
                System.out.print(" ");
            }

            // for printing spaces in each row
            for(int j=i; j>=1; j--)
            {
                System.out.print(j);
            }
            System.out.println();

            //After each iteration nos. increase by 2, thus spaces will decrement by 2.
            spaces = spaces-2;
        }
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
        System.out.println();
        pattern10(5);
        System.out.println();
        pattern11(5);
        System.out.println();
        pattern12(5);
    }
}