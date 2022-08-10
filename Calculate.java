package HW4.exceptions;
import HW4.exceptions.morethanexeption.MoreThanHundredException;
import java.util.Scanner;

public class Calculate {
        public static void main(String[] args) {
            int firstNumber;
            int secondNumber;
            int result = 0;
            String action;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number:");
            firstNumber = scanner.nextInt();
            System.out.println("Enter the math operand (+, -, *, /)");
            action = scanner.next();
            System.out.println("Enter second integer number:");
            secondNumber = scanner.nextInt();
            scanner.close();

            switch (action) {
                case "+" -> result = firstNumber + secondNumber;
                case "-" -> result = firstNumber - secondNumber;
                case "*" -> result = firstNumber * secondNumber;
                case "/" -> result = firstNumber / secondNumber;
                default -> System.out.println("Invalid operator");
            }
            System.out.println("Result is: " + result);
        }

    private static void checkForException(int firstNumber) throws MoreThanHundredException {
        if (firstNumber > 100) {
            throw new MoreThanHundredException("Result cannot be more than 100");
        }
    }
    public int divide( int firstNumber,int secondNumber) {
        try {
            return firstNumber / secondNumber;
        } catch (ArithmeticException e) {
            System.err.println("Cannot be divided by 0");
        }
        return 0;
    }
}

