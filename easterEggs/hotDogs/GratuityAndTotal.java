/*
* A java program that reads the subtotal and the gratuity rate,
* then computes the gratuity and total.
*/

import java.util.Scanner;

public class GratuityAndTotal{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the value for subtotal%n");
        double subtotal = input.nextDouble();
        System.out.printf("Enter the figure for gratiuty rate in %% %n");
        double gratuityRate = (input.nextDouble())/10.0;
        double total = gratuityRate + subtotal;
        System.out.printf("Gratuity = $%.2f%nTotal = $%.2f%n", gratuityRate, total);
    }

}
