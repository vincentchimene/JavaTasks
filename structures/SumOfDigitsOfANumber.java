/**
* 2.Write a method with the header: public static int sumDigits(long n)
* Returns the sum of the digits in the integer n.
* Write a test program that prompts the user to enter an integer
* and displays the sum of all its digits.
*/
import java.util.Scanner;
public class SumOfDigitsOfANumber{
    public static int sumDigits(long n){
        int sum = 0;
        for(int count = 1; n > 0; count++){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }    

    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n = inputCollector.nextLong();
        System.out.printf("Sum of the digits of %d is: %d%n", n, sumDigits(n));        
    }
}
