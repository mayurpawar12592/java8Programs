import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {

        String str = "madam";
        String reverseStr = new StringBuilder(str).reverse().toString();
        System.out.println("is Palindrome " + str.toLowerCase().equalsIgnoreCase(reverseStr.toLowerCase()));

       // System.out.println(IntStream.range(0, str.length()/2));
        boolean isItPalindrome = IntStream.range(0, str.length()/2).
                noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i -1));

        if (isItPalindrome)
        {
            System.out.println(str+" is a palindrome");
        }
        else
        {
            System.out.println(str+" is not a palindrome");
        }
    }
}
