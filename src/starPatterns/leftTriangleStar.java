package starPatterns;

import java.util.Scanner;

public class leftTriangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();

        for (int i=0; i<row; i++)
        {
            //inner loop work for space
            for (int j=2*(row-i); j>=0; j--)
            {
            //prints space between two stars
                System.out.print(" ");
            }
            //inner loop for columns
            for (int j=0; j<=i; j++ )
            {
            //prints star
                System.out.print("* ");
            }
            //throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}
