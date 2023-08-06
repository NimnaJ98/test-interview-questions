import java.util.Arrays;
import java.util.Collections;

public class reverseStringArray {
    public static void reverse(String[] myArray){
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reversed Array : " + Arrays.asList(myArray));
    }

    public static void main(String[] args) {
        String[] myArray = {"A", "B", "C", "D"};
        System.out.println("Original Array : " + Arrays.asList(myArray));
        reverse(myArray);
    }
}
