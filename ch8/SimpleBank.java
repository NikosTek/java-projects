/*
Γράψτε μία μέθοδο void withdraw(double amount) η οποία κάνει ανάληψη ενός ποσό amount, μειώνοντας το balance αντίστοιχα.

Η withdraw(double amount) ελέγχει αν το amount είναι μικρότερο από το 0 ή μεγαλύτερο από το balance, οπότε τότε δημιουργεί ένα exception IllegalArgumentException. Το Exception αυτό η withdraw() το κάνει try / catch, στο catch κάνει System.err.println("Error: " + e.getMessage()); και μετά rethrow

Αλλάξτε επίσης τη main() ώστε να κάνει και αυτή με τη σειρά της try / catch το αντίστοιχο IllegalArgumentException και να ενημερώνει κατάλληλα τον χρήστη.
 */
package ergasiesJava.ch8;

import java.util.Scanner;

public class SimpleBank {
    static double balance = 500;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)  {
        try {
            deposit(100);
        } catch (Exception e) {
            System.out.println("An error happened. Try again...");
        }
    }

    public static void deposit(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Amount must be positive.");
            }
            balance += amount;
            System.out.println("Successfully deposited: " + amount);    // log
        } catch (Exception e) {
            System.err.println("Error. " + e.getMessage());             // log
            throw e;
        }
    }

    public static void withdraw(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Amount must be positive.");
            }
            if (amount > balance) {
                throw new IllegalArgumentException("Amount must be less than balance.");
            }
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);    // log
        } catch (Exception e) {
            System.err.println("Error. " + e.getMessage());             // log
            throw e;
        }
    }
}
