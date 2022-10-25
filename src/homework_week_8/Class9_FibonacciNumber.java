package homework_week_8;
//Display Fibonacci series

public class Class9_FibonacciNumber {
    public static void main(String[] args) {

        int n = 9, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + "terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.println(firstTerm + ", ");

            //compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
