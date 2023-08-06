public class palindromeString {
    public static void main(String[] args) {
        String str =  "ABCDCBA";
        StringBuilder reverseStr = new StringBuilder();

        for (int i = str.length()-1; i>=0; --i)
            reverseStr.append(str.charAt(i));

        //equalsIgnoreCase is used to ignore lower upper case differences
        if (str.equalsIgnoreCase(reverseStr.toString()))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");
    }
}
