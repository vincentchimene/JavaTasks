/*
* A Java program that prompts the user to enter a three-digit integer
* and determines whether it is a palindrome integer
* (reads the same from left to right as from right to left).
*/
import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a three digit integer: ");
        int num = Math.abs(input.nextInt());

        int firstDigit = num / 100;
        int lastDigit = num % 10;

        if (firstDigit == lastDigit){
            System.out.printf("Number is a Palindrome%n");
        } 
        else{
            System.out.printf("Number is not a palindrome%n");
        }
    }
}
