/**
* 1. Write a program that keeps asking user input until they enter a negative number
* then print the average of all positive numbers entered.
*/
import java.util.Scanner;
public class AverageOfUserInput{
    public static void main(String[] args){
    Scanner inputCollector = new Scanner(System.in);
    double sum = 0;
    int count = 0;
    while(true){
        System.out.printf("Enter the inputs, enter a negative number to get the average%n");
        int number = inputCollector.nextInt();
        if (number >= 0){
            sum += number;
            count++;
        }
        else break;
       

    } 
    System.out.printf("Average = %.2f%n", sum/count);
  }
}
