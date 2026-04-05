/*
* A Java program that reads in a number in square meters and converts it to ping.
* Using the relation:
* 1 square meter is 0.3025 ping.
*/
import java.util.Scanner;

public class SqrMeterToPingConverter{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the value for Square meters%n");
        double sqrmeters = input.nextDouble();
        double ping = 0.3025 * sqrmeters;
        System.out.printf("%.3f square meters = %.3f ping%n", sqrmeters, ping);
    }

}
