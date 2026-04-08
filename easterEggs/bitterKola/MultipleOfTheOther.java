/* 
* A Java program that reads two integers and determines
* whether the first is a multiple of the second.
*/ 
import java.util.Scanner;

public class MultipleOfTheOther{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter value for first number: ");
        int firstNumber = input.nextInt();
        System.out.printf("Enter value for secondNumber: ");
        int secondNumber = input.nextInt();
        if (firstNumber % secondNumber == 0){
            System.out.printf("Yes, the first number %d is a multiple of the second number %d%n", firstNumber, secondNumber);
        }
        else{
            System.out.printf("No, the first number %d is NOT a multiple of the second number %d%n", firstNumber, secondNumber);    
        }
    }
}
