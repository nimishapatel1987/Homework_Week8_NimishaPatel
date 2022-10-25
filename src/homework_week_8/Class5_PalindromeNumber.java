package homework_week_8;
//Write a method isPalindrome with one int parameter called number
//The method needs to return a boolean
//It should return true if the number is a palindrome number otherwise it should return false
//Check the tips below for more info about palindromes
//Example Input/Output
//    isPalindrome(-1221)
//    isPalindrome(707)
//    isPalindrome(11212)


public class Class5_PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int oroginalNumber = number;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return oroginalNumber == reverse;
    }
}
