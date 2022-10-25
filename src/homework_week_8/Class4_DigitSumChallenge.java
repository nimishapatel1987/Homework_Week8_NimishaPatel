package homework_week_8;
//Write a method with a name sumDigits that has one int parameter called number.
//If the parameter is >=10 then the method should process the number and return sum of all digits, otherwise return -1
// to indicate an invalid value.
//the number from 0-9 have 1 digit so we don't want to process them;also we don't want to process negative numbers,so
//also return -1 for negative numbers.
//For example calling the method sumDigit (125)should return 8 since 1+2+5 = 8
//Calling the method sumDigit(1)should return -1 as per requirements described above

public class Class4_DigitSumChallenge {
    public static void main(String[] args) {
        //should return 8 => 1+2+5 = 8
        System.out.println("Sum of 125 is = " + sumDigits(125));
        //should return 17 => 8+5+4 = 17
        System.out.println("sum of 854 is = " + sumDigits(854));
        //should return 9 => 1+8 = 9
        System.out.println("sum of 18 is = " + sumDigits(18));
        //should return -1
        System.out.println("Sum of -3 is = " + sumDigits(-3));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sumDigit = 0;
        //convert number to string
        String numberToString = Integer.toString(number);
        //Map through all char of the string
        for (char c : numberToString.toCharArray()) {
            //convert the char to  number afain
            sumDigit += Integer.parseInt(String.valueOf(c));
        }
        return sumDigit;
    }
}
