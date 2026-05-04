/**
* 4. Write a method with the header: public static void reverse(int number)
* Displays an integer in reverse order (e.g., reverse(3456) displays 6543). 
* Write a test program that prompts the user to enter an integer and displays its reversal.
*/

import java.util.Scanner;
public class ReverseOfDigitsVoid{
    public static void reverse(int number){
        
        String sum = ""; 
        while(number > 0){ 
           sum += number % 10;
           number /= 10;
        }
        int reversed = Integer.parseInt(sum);
        System.out.printf("Reversed Number: %d%n", reversed);
    }

     public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter Number: ");  
        int number = inputCollector.nextInt();
        reverse(number);
    }
}
