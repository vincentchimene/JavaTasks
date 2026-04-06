/*
* A Java program that prompts the user to enter values for a, b, and c
* in the quadratic equation ax² + bx + c = 0 and displays the result.
* If the discriminant (b² − 4ac) is positive, displays two roots.
* If it is zero, display one root. 
* Otherwise, display: The equation has no real roots.
*/

import java.util.Scanner;

public class QuadraticSolution{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        double a = input.nextDouble();
        System.out.print("Enter value for b: ");
        double b = input.nextDouble();
        System.out.print("Enter value for c: ");
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0){
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("The roots are: %.2f and %.2f%n", r1, r2);
        }
        else if (discriminant == 0){
            double r = -b / (2 * a);
            System.out.printf("The root is: %.2f%n", r);
        } 
        else{
            System.out.printf("The equation has no real roots%n");
        }

    }
}
