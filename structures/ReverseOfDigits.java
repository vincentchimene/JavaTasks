/**
* Write a method with the header: public static int reverse(int number)
* Returns the reversal of an integer (e.g., reverse(456) returns 654).
* Then write a method: public static boolean isPalindrome(int number)
* that uses reverse to return true if the number is a palindrome.
* Write a test program that prompts the user to enter an integer,
* and reports whether it is a palindrome.
*/

import java.util.Scanner;

public class ReverseOfDigits{
    public static int reverse(int number){
        
        String sum = ""; 
        while(number > 0){ 
           sum += number % 10;
           number /= 10;
        }
        int reversed = Integer.parseInt(sum);
        return reversed;
        
  }
    
    public static boolean isPalindrome(int number){
        boolean check = true;
        if (reverse(number) != number){
            check = false;     
        }
        System.out.printf("is Palindrome: %b%n", check);
        return check;    
    }     

    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter Number: ");  
        int number = inputCollector.nextInt();
        isPalindrome(number);
    }

}        

