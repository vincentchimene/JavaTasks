/*
* A java program that prompts the user to enter a weight in pounds
* and height in inches and displays the BMI.
*/
import java.util.Scanner;

public class BmiCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter value for the weight in pounds: ");
        double weight = input.nextDouble();
        System.out.printf("Enter value for height in inches: ");
        double height = input.nextDouble();
        double bmi = weight * 703 / (height * height);
        System.out.printf("Body Mass Index(BMI) = %.2f%n", bmi);
        
    }
}
