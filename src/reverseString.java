public class reverseString {
    public static void main(String[] args) {
        String str = "12345";

        StringBuilder output = new StringBuilder();
        char[] characters = str.toCharArray();

        for (int i=characters.length-1; i>=0; i--)
            output.append(characters[i]);
        System.out.println(output);
    }
}
