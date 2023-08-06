import java.util.Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int[] myArray = {100, -1, 12, 87, 99, 500};
        int size = myArray.length;

        Arrays.sort(myArray);
        System.out.println("Sorted Array : " + Arrays.toString(myArray));

        int secondLargest = myArray[size-2];
        System.out.println("Second largest number : " + secondLargest);
    }
}
