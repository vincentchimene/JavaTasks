/*
* A program that prompts the user to enter the initial velocity u in 
* meters/second,time span t in seconds, and acceleration a in meters/second²,
* then returns the distance covered using Newton’s equation:
* s = ut + ½at²
*/
import java.util.Scanner;

public class Distance{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter value for initial Velocity, u in m/s%n");
        double u = input.nextDouble();
        System.out.printf("Enter value for time, t in s%n");
        double t = input.nextDouble();
        System.out.printf("Enter value for acceleration, a in m/s^2%n");
        double a = input.nextDouble();
        double distance = u * t + 0.5 * a * t * t;
        System.out.printf("Distance, s = %.2f meters%n", distance);
        
    }

}
