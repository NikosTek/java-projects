
/*
Υλοποιήστε μία utility class με όνομα StringUtils
με public static μεθόδους για string manipulation,
όπως να γίνεται reverse ένα string, να μετατρέπεται
ένα string σε uppercase,
και να ελέγχεται εάν ένα string είναι παλινδρομικό
 */
package ergasiesJava.ch14.strutil;

public class StringUtils {
    private StringUtils() {

    }

    public String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public String toUppercase(String input) {
        return input.toUpperCase();
    }

    public boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }
}
