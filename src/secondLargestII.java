public class secondLargestII {
    public static void main(String[] args) {
        int t;
        int[] myArray = {56, -1, 12, 87, 99, 100};
        int size = myArray.length;

        for (int i =0; i<size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (myArray[i] > myArray[j]) {
                    t = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = t;
                }
            }
        }
        System.out.println("2nd largest : " + myArray[size-2]);
    }
}
