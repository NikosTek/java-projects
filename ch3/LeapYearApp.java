/*
Θέλουμε να αναπτύξουμε ένα πρόγραμμα που να αποφαίνεται αν ένα έτος είναι δίσεκτο ή όχι. Δηλαδή να προτρέπει τον χρήστη να δώσει ένα έτος από το πληκτρολόγιο, να διαβάζει με Scanner το έτος (ακέραιος), να κάνει την επεξεργασία και να εμφανίζει στην οθόνη αν το έτος αυτό είναι δίσεκτο ή όχι.

Δίσεκτο είναι ένα έτος αν έχει 366 ημέρες, αντί 365. Πότε όμως ένα έτος έχει 366 ημέρες;

• Αν διαιρείται με το 4 ΕΚΤΟΣ ΕΑΝ – Διαιρείται ακριβώς και με το 100 – Αλλά όχι με το 400

• Άλλος τρόπος να το εκφράσουμε πιο απλά είναι: ένα έτος είναι δίσεκτο αν (διαιρείται ακριβώς με το 4 και όχι με το 100) ή αν (διαιρείται ακριβώς με το 400)
 */


package ergasiesJava.ch3;
import java.util.Scanner;

/** Ελέγχει αν ένα έτος είναι δίσεκτο.
 * Δίσεκτο είναι ένα έτος αν διαιρείται με το 4
 * και είτε δε διαιρείται με το 100 ή διαιρείται με το 100 και το 400.
 */
public class LeapYearApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        boolean isLeap = false;

        System.out.println("Please insert the year");
        year = in.nextInt();

        /*if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            isLeap = true;
        }*/

        isLeap = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

        System.out.println("Year: " + year + " is leap: " + isLeap);
    }




}
