package numberPatterns;

import java.util.Scanner;

public class patternII {
    public static void main(String[] args) {
        int k = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();

        //inner loop
        for (int i = 1; i <= row; i++)
        {
            //outer loop
            for (int j = 1; j< i + 1; j++)
            {
                //prints the value of k
                System.out.print(k++ + " ");
            }
            //throws the cursor at the next line
            System.out.println();
        }
    }
}
