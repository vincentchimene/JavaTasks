/*
* A java program that asks for two numbers and swaps the two numbers.
*/
import java.util.Scanner;
public class TaskTwentyFour{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        double firstNumber = input.nextDouble();
        System.out.print("Enter second number :");
        double secondNumber = input.nextDouble();
        System.out.printf("First Number = %.2f%nSecond Number = %.2f%n",firstNumber, secondNumber);

        double transfer = firstNumber;
        firstNumber = secondNumber;
        secondNumber = transfer; 
        System.out.printf("First Number = %.2f%nSecond Number = %.2f%n",firstNumber, secondNumber);

    }
}
