public class reverseString {
    public static void main(String[] args) {
        String str = "12345";
        System.out.println(reverse(str));
    }
    public static String reverse(String word){
        StringBuilder output = new StringBuilder();
        char[] characters = word.toCharArray();
        for (int i=characters.length-1; i>=0; i--)
            output.append(characters[i]);

        return output.toString();
    }
}
