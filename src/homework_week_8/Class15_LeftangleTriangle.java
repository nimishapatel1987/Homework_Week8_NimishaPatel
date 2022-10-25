package homework_week_8;
//Display left angle triangle of * using nested for loop

public class Class15_LeftangleTriangle {
    public static void main(String[] args) {

        int i, j, row = 6;
        for (i = 0; i < row; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
