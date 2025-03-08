/*
Αναπτύξτε ένα utility class με όνομα ValidationUtils με public static μεθόδους για data validation, όπως έλεγχος αν ένα string έχει μήκος 1-31 chars,
και αν ένας αριθμός είναι ανάμεσα σε 1 και 10
 */
package ergasiesJava.ch14.validation_utils;

public class ValidationUtil {
    private ValidationUtil() {

    }

    public boolean isStringLengthValid(String input) {
        return input != null && !input.isEmpty() && input.length() <= 31;
    }

    public boolean isIntBetween1And10(int number) {
        return number >= 1 && number <= 10;
    }
}
