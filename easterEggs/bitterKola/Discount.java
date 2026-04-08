/*
* A program that reads a price and a discount percentage,
* calculates the discount amount, and displays the final price.
*/
import java.util.Scanner;

public class Discount{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter value for price: ");
        double originalPrice = input.nextDouble();
        System.out.printf("Enter value for discount percentage: ");
        double discountPercent = input.nextDouble();
        
        double discount = originalPrice * discountPercent / 100;
        double finalPrice = originalPrice - discount;
        System.out.printf("Final Price: %.2f%n", finalPrice);
    }
}
        
    
