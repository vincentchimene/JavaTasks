/*
* A java program that calculates the area of a rectangle.
*/
import java.util.Scanner;
public class TaskTwenty{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length :");
        double length = input.nextDouble();
        System.out.print("Enter the width :");
        double width = input.nextDouble();
        
        double area = (length * width);
        System.out.printf("Area of rectangle is %.2f%n",area);
    }
}
