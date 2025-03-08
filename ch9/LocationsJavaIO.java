/*
Έστω ένα αρχείο locations.txt με τοποθεσίες,
latitude και longitude. Αναπτύξτε ένα πρόγραμμα
που να διαβάζει και να γράφει σε ένα άλλο αρχείο
με το συγκεκριμένο format.
Input img.png Output img_1.png
 */

package ergasiesJava.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class LocationsJavaIO {
    public static void main(String[] args) {
        String inFilePath = "C:/tmp/in.txt";
        String outFilePath = "C:/tmp/out.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
             PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {

            String line;
            String firstLine = reader.readLine();
            String[] tokens;
            String[] headerTokens = firstLine.split(",");

            while ((line = reader.readLine()) != null) {
                tokens = line.split(",");
                ps.printf("{ location: '%s', latitude: %s, longitude: %s },\n", tokens[0], tokens[1], tokens[2]);
                System.out.printf("{ location: '%s', latitude: %s, longitude: %s },\n", tokens[0], tokens[1], tokens[2]);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
