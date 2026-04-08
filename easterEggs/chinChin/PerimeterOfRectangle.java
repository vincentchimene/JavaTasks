/*
* A Java program that reads two edges of a rectangle and 
* computes the perimeter if the input is valid.
* The input is valid only if both edges are of different lengths.
* Otherwise, display that the input is invalid.
*/
import java.util.Scanner;

public class PerimeterOfRectangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter value for length: ");
        double length = input.nextDouble();
        System.out.printf("Enter value for width: ");
        double width = input.nextDouble();
        if (length == width){
            System.out.printf("Invalid inputs%n"); 
        }
        else{
            double perimeter = 2 * (length + width);  
            System.out.printf("Perimeter of Rectangle: %.2f%n", perimeter);         

        }
    }
}
