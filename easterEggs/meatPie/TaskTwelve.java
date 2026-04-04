/*
* A Java program that asks for two numbers and prints them.
*/
import java.util.Scanner;
public class TaskTwelve{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number :");
        int secondNumber = input.nextInt();
        System.out.printf("First Number is %d%nSecond Number is %d%n",firstNumber,secondNumber );
    }
}
