package homework_week_8;
//Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered
//Before the user enter the number, print the message Enter number.
//If the user enters an invalid number,break out of the loop and print the minimum and maximum number
//Hind: Use an endless while loop
//      Create a class with the name MinAndMaxInputChallenge

import java.util.Scanner;

public class Class2_MinAndMaxInputChallenge {
    private static int i;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numner");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (i == 1) ;

        if (a > b) {
            System.out.printf("Between %d and %d, maximum is %d %n", a, b, a);
        } else {
            System.out.printf("Between %d and %d, maximum is %d %n", a, b, b);
        }
        int max = Math.max(a, b);
        System.out.printf("Maximum value of%d and %d using Math.max() is %d %n", a, b, max);

        //calculating minimum number
        System.out.println("Please enter number");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x < y) {
            System.out.printf("Between %d and %d, Minimum number is %d %n", x, y, x);
        } else {
            System.out.printf("Between %d and %d, Minium number is %d %n", x, y, y);
        }
        int min = Math.min(x, y);
        System.out.printf("Minimum value of %d and %d using Math.min() is %d %n", x, y, min);
        scanner.close();
    }
}
