public class countOccurrences {
    public static void main(String[] args) {
        String input = "ABRACADBRA";
        char search = 'A';
        int count = 0;

        for (int i=0; i<input.length(); i++)
            if (input.charAt(i) == search)
                count++;

        System.out.println(count + " times");
    }
}
