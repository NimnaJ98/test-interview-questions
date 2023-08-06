public class secondLargestII {
    public static void main(String[] args) {
        int[] myArray = {100, -1, 12, 87, 99, 500};
        int size = myArray.length;
        int largest, secondLargest = 0;

        for (int i=0; i<size; i++)
            for(int j = i+1; j<size; j++)
                if (myArray[i]>myArray[j])
                    largest = myArray[i];
//                    secondLargest = myArray[j];
    }
}
