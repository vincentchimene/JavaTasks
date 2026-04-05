/* 
* A Java program that calculates the energy needed to heat
* water from an initial temperature to a final temperature.
* Prompts the user to enter the amount of water in kilograms
* and the initial and final temperatures. Using the formula:
* Q = M × (finalTemperature − initialTemperature) × 4184
*/
import java.util.Scanner;

public class HeatEnergy{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter amount of water, M in Kilogram %n");
        double mass = input.nextDouble();
        System.out.printf("Enter value for initial temperature%n");
        double initialTemperature = input.nextDouble();
        System.out.printf("Enter value for final temperature%n");
        double finalTemperature = input.nextDouble();
        double heatEnergy = mass * (finalTemperature - initialTemperature) * 4184;
        System.out.printf("Heat Energy,Q = %.2f joules%n", heatEnergy);
        
    }
}
