package homework_week_8;

import java.util.Scanner;

//Program in Java to display the pattern like a triangle with a number
//Input number of rows: 10
//Expected Output:
public class Class6_Triangle {
    public static void main(String[] args) {
        int i, j, n;
        System.out.println("Input number of rows : ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
