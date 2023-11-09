package starPatterns;

import java.util.Scanner;

public class downwardTriangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();

        for (int i= row-1; i>=0 ; i--)
        {
        //outer loop
            for (int j=0; j<=i; j++)
            {
            //prints star and space
                System.out.print("*" + " ");
            }
            //throws the cursor in the next line after printing each line
            System.out.println();
        }
    }
}
