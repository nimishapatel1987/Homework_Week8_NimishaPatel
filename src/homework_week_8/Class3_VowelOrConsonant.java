package homework_week_8;
//Java program that takes the user to provide a single character from the alphabet.
//Print Vowel of consonant, depending on the userprint.
//If the user input is not a letter(between a and z or A and Z), or is a string of length > 1, print an error message.

import java.util.Scanner;

public class Class3_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Provide single character from the alphabet: ");
        String letter = scan.next();

        if (scan.hasNext()) {
            letter = letter.toLowerCase();
            if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
                System.out.println("Vowel");
            } else if (letter.length() > 1) {
                System.out.println("Error");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Error");
        }
    }
}
