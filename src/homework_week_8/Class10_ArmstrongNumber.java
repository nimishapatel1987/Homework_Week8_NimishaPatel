package homework_week_8;
//Program to input any number and check if it Armstrong number or not

public class Class10_ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153, originalNumber, remainder, result = 0;
        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + "is not an Armstrong number");
    }
}
