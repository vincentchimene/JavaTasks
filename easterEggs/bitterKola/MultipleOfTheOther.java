/* 
* A Java program that reads two integers and determines
* whether the first is a multiple of the second.
*/ 
import java.util.Scanner;

public class MultipleOfTheOther{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter value for first number: ");
        double firstNumber = input.nextDouble();
        System.out.printf("Enter value for secondNumber: ");
        double secondNumber = input.nextDouble();
        if (firstNumber % secondNumber == 0){
            System.out.printf("Yes, the first number %.2f is a multiple of the second number %.2f%n", firstNumber, secondNumber);
        }
        else{
            System.out.printf("No, the first number %.2f is NOT a multiple of the second number %.2f.%n", firstNumber, secondNumber);    
        }
    }
}
