/*
Arrays as Collections Έστω ένας πίνακας με στοιχεία ακεραίων της επιλογής σας. Γράψτε μεθόδους που κάνουν τα παρακάτω:

1.Αναζήτηση ενός στοιχείου στον πίνακα (Επιστρέφει την θέση του στοιχείου)
2.Φιλτράρισμα των ζυγών (επιστρέφει void, μόνο εκτύπωση των ζυγών)
3.Mapping κάθε στοιχείου του πίνακα με το διπλάσιο (η μέθοδος επιστρέφει πίνακα)
4.Έλεγχος αν υπάρχει έστω ένας θετικός αριθμός (η μέθοδος πρέπει να επιστρέφει boolean)
5.Έλεγχος αν όλα τα στοιχεία του πίνακα είναι θετικοί (η μέθοδος πρέπει να επιστρέφει boolean)
 */
package ergasiesJava.ch6;

public class ArraysAsCollections {
    public static void main(String[] args) {

    }

    public static int getPosition(int[] arr, int value) {
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }

        return positionToReturn;
    }

    public static void getEvens(int[] arr) {
        for (int el : arr) {
            if (el % 2 == 0) System.out.println(el);
        }
    }

    public static int[] mapToDouble(int[] arr) {
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    public static boolean anyPositive(int[] arr) {
        boolean isAnyPositive = false;

        for (int el : arr) {
            if (el > 0) {
                isAnyPositive = true;
                break;
            }
        }
        return isAnyPositive;
    }

    public static boolean AllArePositive(int[] arr) {

        int count = 0;

        for (int el : arr) {
            if (el > 0) {
                count++;
            }
        }

        return count == arr.length;
    }
}
