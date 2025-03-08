/*
Abstract Classes

Δημιουργήστε μία κλάση Animal με πεδία name (String) και age (int)

Δημιουργήστε δύο derived κλάσεις Dog και Cat που κληρονομούν από το Animal και κάνουν override την μέθοδο speak() και την toString()
Δείξτε τη χρήση τους σε μία main. Δημιουργήστε και μία πολυμορφική μέθοδο doSpeak(Animal animal)
 */
package ergasiesJava.ch15;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat(2, "White Cat");
        Animal dog = new Dog(3, "Black Dog");
        cat.speak();
        dog.speak();
        System.out.println(cat);
        System.out.println(dog);
    }

    public static void doSpeak(Animal animal) {
        animal.speak();
    }
}
