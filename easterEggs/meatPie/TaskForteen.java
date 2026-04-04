/*
* A java program that asks for three integers and print their average.
*/
import java.util.Scanner;
public class TaskForteen{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number :");
        int secondNumber = input.nextInt();
        System.out.print("Enter the third number :");
        int thirdNumber = input.nextInt();
        
        float average = (firstNumber + secondNumber + thirdNumber)/3.0f;
        System.out.printf("Average of %d, %d and %d is %.2f%n",firstNumber,secondNumber, thirdNumber, average);
    }
}
