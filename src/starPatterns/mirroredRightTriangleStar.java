package starPatterns;

import java.util.Scanner;

public class mirroredRightTriangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();

        for (int i= 0; i<= row; i++)
        {
        //outer loop
            for (int j=1; j<=row-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
