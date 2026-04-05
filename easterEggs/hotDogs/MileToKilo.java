/*
* A Java program that reads in a number in miles and converts it to kilometers.
*/
import java.util.Scanner;

public class MileToKilo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the value for miles%n");
        double miles = input.nextDouble();
        double kilometers = 1.6 * miles;
        System.out.printf("%.2f miles = %.2f kilometers%n", miles, kilometers);
    }

}
