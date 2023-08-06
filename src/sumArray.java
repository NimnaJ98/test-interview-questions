public class sumArray {
    public static void main(String[] args) {
        Integer[] myArray = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i =0; i<myArray.length; i++)
            sum = sum + myArray[i];

        System.out.println("Sum of the array is : " + sum);
    }
}
