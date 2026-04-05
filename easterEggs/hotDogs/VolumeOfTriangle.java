/*
* A java a program that reads in the length of sides of 
* an equilateral triangle and computes the volume of the
* triangular prism using:
* volume = area × length
*/
import java.util.Scanner;

public class VolumeOfTriangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the value for length of sides.%n");
        double lengthOfSides = input.nextDouble();
        double area = (Math.sqrt(3) / 4) * lengthOfSides * lengthOfSides;
        double volume = area * lengthOfSides;

        System.out.printf("Volume of Triangle = %.2f%n", volume);
    }

}
