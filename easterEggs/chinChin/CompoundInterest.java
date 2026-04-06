/*
* A Java program that reads the Simple Interest and Compound Interest
* for a given Principal, Rate, and Time and displays both results. 
*/
import java.util.Scanner;

public class CompoundInterest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter value for the Principal: ");
        double principal = input.nextDouble();
        System.out.printf("Enter value for Interest Rate: ");
        double rate = input.nextDouble();
        System.out.printf("Enter value for Time: ");
        double time = input.nextDouble();
        System.out.printf("Enter value for compound frequency: ");
        int n = input.nextInt();

        double simpleInterest = principal * rate * time / 100;
        double amount = principal * Math.pow(1 + (rate / 100) / n, n * time);
        double compoundInterest = amount - principal;

        System.out.printf("The simple interest = %.2f%n", simpleInterest);
        System.out.printf("The Compound interest = %.2f%n", compoundInterest);
        
    }
}
