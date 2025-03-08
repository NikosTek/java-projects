/*
Θέλουμε να αναπτύξουμε ένα πρόγραμμα που να μετατρέπει ακέραιες θερμοκρασίες Φαρενάιτ (Fahrenheit) στην κλίμακα Κελσίου.
Το πρόγραμμα θα εκτυπώνει κατάλληλο μήνυμα και θα διαβάζει στη συνέχεια την ακέραια θερμοκρασία
από τον χρήστη Θα τη μετατρέπει στην κλίμακα Κελσίου σύμφωνα με τον τύπο (5/9)(fahrenheit-32).

Επειδή όλα τα μέλη της παράστασης είναι int το αποτέλεσμα θα είναι int αποκόπτοντας τα δεκαδικά και δε θα είναι ακριβές,
αλλά αυτό δε μας πειράζει σε αυτό το στάδιο. Προσοχή στον τρόπο που θα δώσετε την παράσταση μετατροπής.
Αν δώσετε (5/9)(fahrenheit-32) τότε επειδή 5/9 είναι 0 το τελικό αποτέλεσμα θα είναι 0 (επειδή οι 5 και 9 είναι int,
το αποτέλεσμα της διαίρεσης 5/9 θα είναι int δηλ. 0).

Καλύτερα λοιπόν να δώσουμε την παράσταση ως: 5 * (fahrenheit-32) / 9 που είναι ακριβώς το ίδιο, αλλά αποφεύγουμε το 5/9 που δίνει 0.
 */

package ergasiesJava.ch2;
import java.util.Scanner;

public class FahrenheitToCelsiusApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fahrenheit = 0;
        int celsius = 0;

        System.out.print("Please insert degrees Fahrenheit: ");
        fahrenheit = scanner.nextInt();

        celsius = 5 * (fahrenheit - 32) / 9;

        System.out.printf("%d\u2109 = %d\u2103\n", fahrenheit, celsius);
    }
}
