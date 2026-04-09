/*
* A Java program that reads two integers and prints: 
*   *the sum if both are positive, 
*   *the product if both are negative, 
*   *and the difference (larger minus smaller) if they have opposite signs. 
*/
import java.util.Scanner;

public class IntegerComparison{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter value for first number: ");
        int firstNumber = input.nextInt();
        System.out.printf("Enter value for secondNumber: ");
        int secondNumber = input.nextInt();
        int sum = 0;
        int product = 0;
        int difference = 0;
                    
           
        if (firstNumber > 0 && secondNumber > 0){
            sum = firstNumber + secondNumber;
            System.out.printf("Sum: %d", sum);
        }
        if (firstNumber < 0 && secondNumber < 0){
            product = firstNumber * secondNumber;
            System.out.printf("Product: %d", product);
        }
         if ((firstNumber < 0 && secondNumber > 0) || (firstNumber > 0 && secondNumber < 0)){
            difference = Math.abs(firstNumber - secondNumber);
            System.out.printf("Difference: %d", difference);
         }
    }
}
