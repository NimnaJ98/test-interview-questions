import java.util.Arrays;
import java.util.Collections;

public class reverseIntArray {
    public static void main(String[] args) {
        Integer[] myArray = {10, 20, 30, 40, 50};
        System.out.println("Original Array : " + Arrays.asList(myArray));

        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reversed Array : " + Arrays.asList(myArray));
    }
}
