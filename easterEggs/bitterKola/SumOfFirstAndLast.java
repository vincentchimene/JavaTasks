/*
* A java program that prompts user to enter a five digit integer
* and computes the sum of the first and last integer.
*/
import java.util.Scanner;
public class SumOfFirstAndLast{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a Five digit number: ");
        int number = input.nextInt();
        if ((number < 10000) || (number > 99999)){
            System.out.printf("Invalid Entry! Not a 5-digit number.%n");
        }
        else {
            int last = number % 10;
            int first = number / 10000;
            int sum = last + first;
            System.out.printf("Sum of first and last digits: %d%n", sum);
        }

    }
}
