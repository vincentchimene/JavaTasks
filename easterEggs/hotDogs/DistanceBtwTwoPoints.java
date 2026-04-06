/* 
* A Java program that prompts the user to enter two points (x1, y1)
* and (x2, y2) and displays the distance between them using:
* distance = √((x2 − x1)² + (y2 − y1)²)
*/
import java.util.Scanner;
public class DistanceBtwTwoPoints{
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
        double distance = Math.sqrt( (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) ) ;
        System.out.printf("Distance between the points = %.2f%n", distance);
        
    }
}
