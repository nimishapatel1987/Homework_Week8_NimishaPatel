package homework_week_8;
//program to input any number and check if it is prime or not

public class Class12_PrimeNumberOrNot {
    public static void main(String[] args) {
        int num = 2;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            //condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number. ");
        else
            System.out.println(num + " is not a prime number. ");
    }
}
