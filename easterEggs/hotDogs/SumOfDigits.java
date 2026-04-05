/*
* A program that reads an integer between 0 and 1000
* And adds all the digits in the integer.
*/
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = scanner.nextInt();
        if (number < 0 || number > 1000) {
            System.out.printf("Number is not within range!%n");
        } else {
            int digit4 = number % 10;
            int digit3 = (number / 10) % 10;
            int digit2 = (number / 100) % 10;
            int digit1 = number / 1000;
            int sum = digit1 + digit2 + digit3 + digit4;
            System.out.printf("The sum of the digits is %d%n", sum);
            
        }

    }
}
