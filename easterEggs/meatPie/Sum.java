/*
* A Java program that takes two numbers and print their sum.
*/
import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.printf("The sum of %d and %d is %d%n", firstNum, secondNum, sum);
    }
}
