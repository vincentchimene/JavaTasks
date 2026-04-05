/* 
*A java program that prompts the user to enter take-off speed, v (m/s)
* and acceleration a (m/s²),
* then displays the minimum runway length needed using:
* length = v² / (2a)
*/
import java.util.Scanner;

public class RunwayLength{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter value for take-off speed, v in m/s%n");
        double speed = input.nextDouble();
        System.out.printf("Enter value for acceleration, a in m/s^2%n");
        double acceleration = input.nextDouble();
        double minimumLength = speed * speed / (2 * acceleration);
        System.out.printf("Minimum runway length = %.2f meters%n", minimumLength);
        
    }
}
