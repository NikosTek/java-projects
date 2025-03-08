/*
Low and High Index Έστω ένας ταξινομημένος πίνακας με επαναλαμβανόμενα στοιχεία. Γράψτε μία μέθοδο int[] getLowAndHighIndexOf(int[] arr, int key) που να υπολογίζει και να επιστρέφει τα low και high index ενός πίνακα arr, για ένα ακέραιο key που λαμβάνει ως παράμετρο. • Γράψτε και μία main() που να βρίσκει το low και high index για τον πίνακα {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8}. Για παράδειγμα, αν δώσουμε ως τιμή το 8, θα πρέπει να επιστρέφει {7, 11}. • Hint. Ελέγξτε αν το key περιέχεται στον πίνακα και σε ποια θέση. Αν ναι, τότε από τη θέση αυτή μετρήστε τα στοιχεία όσο υπάρχουν στοιχεία
με ίδια τιμή και μέχρι να βρείτε το τέλος του πίνακα
 */
package ergasiesJava.ch6;

public class LowAndHighIndexApp {
    public static void main(String[] args) {

    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int low = 0;
        int high = 0;
        int pivot;

        if (arr == null) return new int[] {};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                low = i;
                break;
            }
        }

        high = low;
        pivot = low + 1;
        while (pivot < arr.length && arr[pivot++] == key) {
            high++;
        }

        return new int[] { low, high };
    }

}
