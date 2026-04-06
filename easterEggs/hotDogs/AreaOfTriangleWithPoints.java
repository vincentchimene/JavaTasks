/*
* A Java program that prompts the user to enter three points
* (x1,y1), (x2,y2), (x3,y3) of a triangle and displays its area using:
* s = (side1 + side2 + side3)/2
* area = √(s(s − side1)(s − side2)(s − side3))
*/

import java.util.Scanner;
public class AreaOfTriangleWithPoints{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter value for x1: ");
        double x1 = input.nextDouble();
        System.out.printf("Enter value for y1: ");
        double y1 = input.nextDouble();
        System.out.printf("Enter value for x2: ");
        double x2 = input.nextDouble();
        System.out.printf("Enter value for y2: ");
        double y2 = input.nextDouble();
        System.out.printf("Enter value for x3: ");
        double x3 = input.nextDouble();
        System.out.printf("Enter value for y3: ");
        double y3 = input.nextDouble();
        
        double side1 = Math.sqrt( (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) );
        double side2 = Math.sqrt( (x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2) );
        double side3 = Math.sqrt( (x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1) );
        
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.printf("Area of Triangle = %.2f%n", area);
        
    }
}

