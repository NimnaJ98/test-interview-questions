package numberPatterns;

import java.util.Scanner;

public class patternI {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();

        //loop for rows
        for(int i=0; i<row; i++)
        {
            number=1;
        //loop for columns
            for(int j=0; j<=i; j++)
            {
                //prints num
                System.out.print(number+ " ");
                //incrementing the value of number
                number++;
            }
            //throws the cursor at the next line after printing each row
            System.out.println();
        }
    }
}
