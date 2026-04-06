/*
* A program that prompts the user to enter the distance to drive,
* the fuel efficiency of the car in miles per gallon, and the price per gallon,
* then displays the cost of the trip.
*/
import java.util.Scanner;
public class CostOfTrip{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter value for distance in miles: ");
        double distance = input.nextDouble();
        System.out.printf("Enter value for fuel efficiency in miles per gallon: ");
        double fuelEfficiency = input.nextDouble();
        System.out.printf("Enter value for unit price of fuel in price per gallon: ");
        double unitPrice = input.nextDouble();

        double costOfTrip = unitPrice * (distance / fuelEfficiency);

        System.out.printf("The cost of trip = %.2f%n", costOfTrip);
        
    }
}
