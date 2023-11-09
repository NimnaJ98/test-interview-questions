package numberPatterns;

import java.util.Scanner;

public class patternVII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++)
        {
            for (int j = row; j >= i; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
