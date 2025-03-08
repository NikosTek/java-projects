/*
Γράψτε ένα πρόγραμμα που διαβάζει από τον χρήστη 3 ακέραιους αριθμούς που αναπαριστούν ημέρα, μήνα, έτος και την εμφανίζει σε μορφή: ΗΗ/ΜΜ/ΕΕ Π.χ.
Αν δώσουμε 5 12 2022 θα πρέπει εμφανίσει 05/12/22
 */

package ergasiesJava.ch2;
import java.util.Scanner;
public class DateApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;
        int formattedYear = 0;

        System.out.print("Please insert three integers for day, month, year: ");
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();
        formattedYear = year % 100;

        System.out.printf("%02d/%02d/%2d\n", day, month, formattedYear);
    }
}
