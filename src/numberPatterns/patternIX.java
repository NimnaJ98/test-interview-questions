package numberPatterns;

import java.util.Scanner;

public class patternIX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++)
        {
            //Prints first half of the row
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            //Prints second half of the row
            for (int j = i-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
