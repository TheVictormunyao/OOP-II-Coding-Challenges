import java.io.*;
class ArithmeticJava{
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 0;

        try {
            //code that may throw exception
            int answer = number1/number2;
            System.out.println("Answer: " + answer);
        } catch (ArithmeticException e) {
            //code to handle exception
            System.out.println("Error: Division by Zerro is NOT allowed!");

        } finally {
            //code that will always execute
            System.out.println("Program continues after handling exception.");
        }
    }
}