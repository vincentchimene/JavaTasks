/*
* A Java program that prompts the user to enter the weight of a package
* and displays the shipping cost based on:
* $2.5 for 0 < w ≤ 2 
* $4.5 for 2 < w ≤ 4 
* $7.5 for 4 < w ≤ 10 
* $10.5 for 10 < w ≤ 20 
* If weight > 20, display:
* The package cannot be shipped.
*/
import java.util.Scanner;
public class PerimeterOfRectangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the weight of the package: %n");
        double weight = input.nextInt();
        double shippingCost = 0;

        if ((weight > 0) && (weight <= 2)){
            shippingCost = 2.5;
            System.out.printf("Shipping Cost: %.2f%n", shippingCost);
        }
         else if ((weight > 2) && (weight <= 4)){
            shippingCost = 4.5;
            System.out.printf("Shipping Cost: %.2f%n", shippingCost);
        }
         else if ((weight > 4) && (weight <= 10)){
            shippingCost = 7.5;
            System.out.printf("Shipping Cost: %.2f%n", shippingCost);
         }
         else if ((weight > 10) && (weight <= 20)){
            shippingCost = 10.5;
            System.out.printf("Shipping Cost: %.2f%n", shippingCost);
        }
        else{
            System.out.printf("The package cannot be shipped%n");    
        }

    }


}
