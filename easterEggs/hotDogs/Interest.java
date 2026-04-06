/*
* A Java program that reads the balance and the annual percentage interest rate,
* then displays the interest for the next month using:
* interest = balance × (annualInterestRate / 1200)
*/
import java.util.Scanner;

public class Interest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter value for the balance: ");
        double balance = input.nextDouble();
        System.out.printf("Enter value for Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        double interest = balance * (annualInterestRate / 1200);

        System.out.printf("The interest for the next month  = %.2f%n", interest);
        
    }
}
