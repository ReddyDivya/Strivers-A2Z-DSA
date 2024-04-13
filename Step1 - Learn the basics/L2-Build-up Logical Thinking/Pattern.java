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
    static void pattern1(int n) {
        // This is the outer loop which will loop for the rows.
        for(int i = 0; i < n; i++) {
            /*
            This is the inner loop which loops for the columns
            as we have to print a rectangular pattern.
            */
            for(int j = 0; j < n; j++) {
                System.out.print("* "); // Print a star followed by a space
            }
            /*
            As soon as N stars are printed, we move to the
            next row and give a line break otherwise all stars
            would get printed in 1 line.
            */
            System.out.println(); // Move to the next line after printing stars for each row
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
    static void pattern2(int n) {
        // This is the outer loop which will loop for the rows.
        for(int i = 0; i < n; i++) {
            /*
            This is the inner loop which loops for the columns.
            The number of columns equals the row number for each line here.
            */
            for(int j = 0; j <= i; j++) {
                System.out.print("* "); // Print a star followed by a space
            }
            System.out.println(); // Move to the next line after printing stars for each row
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
    static void pattern3(int n) {
        // This is the outer loop which will loop for the rows.
        for(int i = 0; i < n; i++) {
            // This inner loop prints the numbers for each row.
            // The number of columns equals the row number.
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " "); // Print the current number followed by a space
            }
            System.out.println(); // Move to the next line after printing numbers for each row
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
    static void pattern4(int n) {
        // This is the outer loop which will loop for the rows.
        for(int i = 0; i < n; i++) {
            /*
            This is the inner loop which loops for the columns.
            The number of columns equals the row number for each line here.
            Here, we print numbers equal to the row number instead of stars in each row.
            */
            for(int j = 0; j <= i; j++) {
                System.out.print(i + 1 + " "); // Print the current row number followed by a space
            }
            System.out.println(); // Move to the next line after printing numbers for each row
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
    static void pattern5(int n) {
        // This is the outer loop which will loop for the rows.
        for(int i = 0; i < n; i++) {
            /*
            This is the inner loop which loops for the columns.
            The number of columns equals (N - row index) for each line here.
            */
            for(int j = n; j > i; j--) {
                System.out.print("* "); // Print a star followed by a space
            }
            System.out.println(); // Move to the next line after printing stars for each row
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
    static void pattern6(int n) {
        // This is the outer loop which will loop for the rows.
        for(int i = 0; i < n; i++) {
            /*
            This is the inner loop which loops for the columns.
            The number of columns equals (N - row index) for each line here,
            as we have to print an inverted pyramid.
            (N-j+1) will give us the numbers in a row starting from 1 to N-i.
            */
            for(int j = n; j > i; j--) {
                System.out.print(n - j + 1 + " "); // Print the numbers in each row
            }
            System.out.println(); // Move to the next line after printing numbers for each row
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
    static void pattern7(int n) {
        // This is the outer loop which will loop for the rows.
        for(int i = 0; i < n; i++) {
            // For printing the spaces before stars in each row
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print(" "); // Print spaces to align stars to the center
            }

            // For printing the stars in each row
            for(int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*"); // Print stars
            }

            // For printing the spaces after the stars in each row
            for(int j = 0; j > n - i - 1; j++) {
                System.out.print(" "); // Print spaces after the stars
            }
            System.out.println(); // Move to the next line after printing stars for each row
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
    static void pattern8(int n) {
        // This is the outer loop which will loop for the rows.
        for(int i = 0; i < n; i++) {
            // For printing the spaces before stars in each row
            for(int j = 0; j < i; j++) {
                System.out.print(" "); // Print spaces to align stars to the center
            }

            // For printing the stars in each row
            for(int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*"); // Print stars
            }

            // For printing the spaces after the stars in each row
            for(int j = 0; j < i; j++) {
                System.out.print(" "); // Print spaces after the stars
            }
            System.out.println(); // Move to the next line after printing stars for each row
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
    Pattern 12
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

    /*
    Pattern 13
    ---------
        1
        2  3
        4  5  6
        7  8  9  10
        11 12 13 14 15
    */
    static void pattern13(int n)
    {   
        int count = 1;
        
        // Outer loop for the number of rows.
        for(int i=1; i<=n; i++)
        {
            // for printing numbers in each row
            for(int j=1; j<=i; j++)
            {
                System.out.print(count+" ");
                count++;
            }

            System.out.println();
        }
    }

    /*
    Pattern 14 
    ---------
        A
        A B
        A B C
        A B C D
        A B C D E
    */
    static void pattern14(int n)
    {   
        // Outer loop for the number of rows.
        for(int i=0; i<n; i++)
        {
            //Inner loop will loop for i times and print alphabets from A to A + i.
            for(char character='A'; character<='A'+i; character++)
            {
                System.out.print(character+" ");
            }

            System.out.println();
        }
    }

    /*
    Pattern 15
    ---------
        A B C D E
        A B C D
        A B C
        A B
        A
    */
    static void pattern15(int n)
    {   
        // Outer loop for the number of rows.
        for(int i=n; i>0; i--)
        {
            //Inner loop will loop for i times and print alphabets from A to A + (N-i-1).
            for(char character='A'; character<'A'+i; character++)
            {
                System.out.print(character+" ");
            }

            System.out.println();
        }
    }

    /*
    Pattern 16
    ---------
        A 
        B B
        C C C
        D D D D
        E E E E E
    */
    static void pattern16(int n)
    {   
        // Outer loop for the number of rows.
        for(int i=0; i<n; i++)
        {
            //same char which is defined is to be printed i times in that row.
            for(int j=0; j<=i; j++)
            {
                System.out.print((char)(int)('A'+i)+ " ");
            }

            System.out.println();
        }
    }

    /*
    Pattern 17
    ---------
            A 
           ABA
          ABCBA
         ABCDCBA
        ABCDEDCBA
    */
    static void pattern17(int n)
    {   
        // Outer loop for the number of rows.
        for(int i=0; i<n; i++)
        {
            //  for printing the spaces.
            for(int j=0; j<=n-i-1; j++)
            {
                System.out.print(" ");
            }

            // for printing the characters.
            char ch='A';
            int breakpoint = (2*i+1)/2;
            for(int j=1; j<=2*i+1; j++)
            {
                System.out.print(ch);
                if(j <= breakpoint)
                    ch++;
                else
                    ch--;
            }


            // for printing the spaces again
            for(int j=0; j<n-i-1; j++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    /*
    Pattern 18
    ---------
        E
        D E
        C D E
        B C D E
        A B C D E
    */
    static void pattern18(int n)
    {   
        // Outer loop for the number of rows.
        for(int i=0; i<n; i++)
        {
            /* 
            Inner loop for printing the alphabets from A + N -1 -i (i is row no.) to A + N -1 ( E in this case).
            */
            for(char ch=(char)(int)('A'+n-1-i); ch <= (char)(int)('A'+n-1); ch++)
            {
                System.out.print(ch+" ");
            }

            System.out.println();
        }
    }

    /*
    Pattern 19: Symmetric-Void Pattern
    ---------
       **********
       ****  ****
       ***    ***
       **      **
       *        *
       **      **
       ***    ***
       ****  ****
       **********
    */
    static void pattern19(int n)
    {   
        // for the upper half of the pattern.

        // initial spaces.
        int iniS = 0;
        for(int i=0;i< n;i++){
            
            //for printing the stars in the row.
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            
            //for printing the spaces in the row.
            for(int j=0; j<iniS; j++){
                System.out.print(" ");
            }
            
            //for printing the stars in the row.
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            
            // The spaces increase by 2 every time we hit a new row.
            iniS+=2;
            
            // As soon as the letters for each iteration are printed, we move to the
            // next row and give a line break otherwise all letters
            // would get printed in 1 line.
            System.out.println();
        }

        // for lower half of the pattern

        // initial spaces.
        iniS = 2*n -2;

        for(int i=1; i<=n; i++){
          
          //for printing the stars in the row.
          for(int j=1; j<=i; j++){
              System.out.print("*");
          }
          
          //for printing the spaces in the row.
          for(int j=0;j<iniS;j++){
              System.out.print(" ");
          }
          
          //for printing the stars in the row.
          for(int j=1; j<=i; j++){
              System.out.print("*");
          }
          
          // The spaces decrease by 2 every time we hit a new row.
          iniS-=2;
          
          // As soon as the letters for each iteration are printed, we move to the
          // next row and give a line break otherwise all letters
          // would get printed in 1 line.
          System.out.println();
      }
    }

    /*
    Pattern 20: Symmetric-Butterfly Pattern
    ---------
        *          *
        **        **
        ***      ***
        ****    ****
        *****  *****
        ************
        *****  *****
        ****    ****
        ***      ***
        **        **
        *          *
    */
    static void pattern20(int n)
    {   
        // initialising the spaces.
      int spaces = 2*n-2;
      
      // Outer loop for printing row.
      for(int i = 1;i<=2*n-1;i++){
          
          // stars for first half
          int stars = i;
          
          // stars for the second half.
          if(i>n) stars = 2*n - i;
          
          //for printing the stars
          for(int j=1;j<=stars;j++){
              System.out.print("*");
          }
          
          //for printing the spaces
          for(int j = 1;j<=spaces;j++){
              System.out.print(" ");
          }
          
          //for printing the stars
          for(int j = 1;j<=stars;j++){
              System.out.print("*");
          }
          
          // As soon as the stars for each iteration are printed, we move to the
          // next row and give a line break otherwise all stars
          // would get printed in 1 line.
          System.out.println();
          if(i<n) spaces -=2;
          else spaces +=2;
      }
    }  

    /*
    Pattern 21: Hollow Rectangle Pattern
    ---------
        ******
        *    *
        *    *
        *    *
        *    *
        ******
    */
    static void pattern21(int n)
    {
        // outer loop for no. of rows.
        for(int i=0; i<n; i++){
            
            // inner loop for printing the stars at borders only.
            for(int j=0; j<n; j++){
                
                if(i==0 || j==0 || i==n-1 || j==n-1)
                    System.out.print("*");
                    
                // if not border index, print space.
                else System.out.print(" ");
            }
            
            // As soon as the stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }
    }

    /*
    Pattern 22: The Number Pattern
    ---------
        5 5 5 5 5 5 5 5 5 
        5 4 4 4 4 4 4 4 5 
        5 4 3 3 3 3 3 4 5 
        5 4 3 2 2 2 3 4 5 
        5 4 3 2 1 2 3 4 5 
        5 4 3 2 2 2 3 4 5 
        5 4 3 3 3 3 3 4 5 
        5 4 4 4 4 4 4 4 5 
        5 5 5 5 5 5 5 5 5
    */
    static void pattern22(int n)
    {
        // Outer loop for no. of rows
        for(int i=0; i<2*n-1; i++)
        {
            // inner loop for no. of columns.
            for(int j=0; j<2*n-1; j++){
                
                // Initialising the top, down, left and right indices of a cell.
                int top = i;
                int bottom = j;
                int right = (2*n - 2) - j;
                int left = (2*n - 2) - i;
                
                // Min of 4 directions and then we subtract from n
                // because previously we would get a pattern whose border
                // has 0's, but we want with border N's and then decrease inside.
                System.out.print(n- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
            }
            
            // As soon as the numbers for each iteration are printed, we move to the
            // next row and give a line break otherwise all numbers
            // would get printed in 1 line.
            System.out.println();
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
        System.out.println();
        pattern13(5);
        System.out.println();
        pattern14(5);
        System.out.println();
        pattern15(5);
        System.out.println();
        pattern16(5);
        System.out.println();
        pattern17(5);
        System.out.println();
        pattern18(6);
        System.out.println();
        pattern19(6);
        System.out.println();
        pattern20(6);
        System.out.println();
        pattern21(6);
        System.out.println();
        pattern22(6);
    }
}