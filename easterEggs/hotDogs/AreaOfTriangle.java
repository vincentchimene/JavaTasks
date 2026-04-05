/*
* A java program that reads in the length of sides of an equilateral
* triangle and computes the area using the formula:
* area = (√3 / 4) × (length of sides)²
*/
import java.util.Scanner;

public class AreaOfTriangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the value for length of sides.%n");
        double lengthOfSides = input.nextDouble();
        double area = (Math.sqrt(3) / 4) * lengthOfSides * lengthOfSides;
        System.out.printf("Area of Triangle = %.2f%n", area);
    }

}
