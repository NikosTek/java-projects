/*
Αναπτύξτε μία μέθοδο που εμφανίζει ένα μενού με επιλογές από 1 έως 4 (και 5 για Exit) καθώς και μία μέθοδο int getChoice() για να διαβάσετε το choice του χρήστη με Scanner Ο Scanner να δηλωθεί σε επίπεδο κλάσης.

Στη μέθοδο int getChoice() αν ο χρήστης δώσει μη-ακέραιο ελέγξτε κατάλληλα με state-testing (hasNextInt()) Επίσης, Αν η επιλογή δεν είναι μεταξύ 1-5 τότε δημιουργεί (throws) ένα IllegalArgumentException, το οποίο παρότι είναι RunTimeException, θα μπορούσαμε στη συγκεκριμένη περίπτωση να κάνουμε recover και να κάναμε try/catch στη main.

Αναπτύξτε επίσης μία μέθοδο void printChoice(int choice) που εκτυπώνει την επιλογή.

Διαμορφώστε τη main ώστε να κάνει catch το exception και να επικοινωνεί με τον χρήστη με κατάλληλο μήνυμα.

Στο πλαίσιο της ενδεικτικής λύσης έχει υλοποιηθεί περαιτέρω και μία μέθοδος log(Exception e) που γράφει σε ένα αρχείο (log file) ένα timestamp με LocalDateTime.now() καθώς και το message του Exception.

Επίσης, έχει υλοποιηθεί η βοηθητική μέθοδος isValidChoice(int choice)
 */

package ergasiesJava.ch8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ExceptionsApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        while (true) {
            try {
                printMenu();
                choice = getChoice();
                if (choice == 5) break;
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Choice. Try again.");
            }
        }
        System.out.println("Goodbye!");
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
        System.out.println("1. Επιλογή 1");
        System.out.println("2. Επιλογή 2");
        System.out.println("3. Επιλογή 3");
        System.out.println("4. Επιλογή 4");
        System.out.println("5. Exit");
    }

    public static int getChoice() throws IllegalArgumentException  {
        int choice;

        while (!in.hasNextInt()) {
            System.out.println("Παρακαλώ εισάγετε ένα ακέραιο μεταξύ 1-5");
            in.nextLine();
        }
        choice = in.nextInt();
        in.nextLine();  // nextInt does not consume newline

        try {
            if (!isValidChoice(choice)) throw new IllegalArgumentException("Error. Επιλογή: " + choice + ".\nH επιλογή πρέπει να είναι μεταξύ 1-5.");
            return choice;
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    public static void printChoice(int choice)  {
        System.out.println("Choice: " + choice);
    }

    public static boolean isValidChoice(int choice) {
        return (choice >= 1) && (choice <= 5);
    }

    public static void log(Exception e) {
        Path path = Paths.get("C:/tmp/log.txt");    // Create a path with nio

        try (PrintStream ps = new PrintStream(new FileOutputStream(path.toFile(), true))) { // true is for append
            ps.println(LocalDateTime.now() + "\n" + e.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
