package homework_week_8;
//Display right angle triangle of @ using nested for loops

import java.util.Scanner;

public class Class8_RightAngleTriangle {
    public static void main(String[] args) {
        trianglePattern();
    }

    public static void trianglePattern() {
        System.out.println("Enter number of rows: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; i++)
                System.out.print("@");
            System.out.println(" ");
        }
        scanner.close();
    }


}
