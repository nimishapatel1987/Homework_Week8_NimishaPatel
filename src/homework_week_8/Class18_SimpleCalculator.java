package homework_week_8;

public class Class18_SimpleCalculator {
    public static void main(String[] args) {

    }

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionalResult() {
        return firstNumber + secondNumber;
    }

    public double getSubstractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return this.secondNumber = 0;
        } else {
            return firstNumber / secondNumber;
        }
    }
}
