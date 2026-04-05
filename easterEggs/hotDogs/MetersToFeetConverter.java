/*
* A Java program that reads in a number in meters and converts it to feet.
*/
import java.util.Scanner;

public class MetersToFeetConverter{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the value for meters%n");
        double meters = input.nextDouble();
        double feet = 3.2786* meters;
        System.out.printf("%.3f meters = %.3f feet%n", meters, feet);
    }

}
