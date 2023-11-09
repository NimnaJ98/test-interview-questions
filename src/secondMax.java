public class secondMax {

    public static void main(String[] args) {
        int[] myArray = {56, -1, 12, 87, 99, 100};
        int max = 0;
        int secondMax = 0;

        for (int i=0; i<myArray.length; i++) {
            if (myArray[i] > max) {
                secondMax = max;
                max = myArray[i];
            } else {
                if (secondMax < myArray[i]) {
                    secondMax = myArray[i];
                }
            }
        }
        System.out.println(secondMax);
    }
}
