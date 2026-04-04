/*
* A java program that calculates the area of a triangle.
*/
import java.util.Scanner;
public class TaskTwentyOne{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Base :");
        double base = input.nextDouble();
        System.out.print("Height:");
        double height = input.nextDouble();
        
        double area = base * height/2;
        System.out.printf("Area of triangle is %.2f%n",area);
    }
}
