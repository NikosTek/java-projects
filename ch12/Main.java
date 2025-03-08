/*
JavaBeans, Constructors Getters, Setters

Δημιουργήστε ένα package με όνομα model και μέσα σε αυτό ορίστε:

Μία κλάση User με πεδία id τύπου Long, firstname τύπου String, lastname τύπου String
Μία κλάση UserCredentials με πεδία id τύπου Long, username τύπου String και password τύπου String
Ορίστε default constructors και overloaded constructors, getters και setters για όλα τα πεδία
 */
package ergasiesJava.ch12;

public class Main {
    public static void main(String[] args) {
        User user = new User(1L, "Alice", "Wonderland");
        UserCredentials userCredentials = new UserCredentials(1L, "bob", "12345");

        System.out.println("{" + user.getId() + ", " + user.getFirstname() + ", " + user.getLastname() + "}");
        System.out.println("{" + userCredentials.getId() + ", " + userCredentials.getUsername() + ", " + userCredentials.getPassword() + "}");
    }
}
