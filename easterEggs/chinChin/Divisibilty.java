/*
* A java program that prompts the user to enter an integer and determines:
* a) whether it is divisible by both 4 and 5
* b) whether it is divisible by 4 or 5
* c) whether it is divisible by 4 or 5 but not both
*/

import java.util.Scanner;
public class Divisibilty{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a whole number: ");
        int number = input.nextInt();

        if ((number % 4 == 0) || (number % 5 == 0)){
            System.out.printf("%d is divisible by either 4 or 5%n", number);
            if ((number % 4 == 0) && (number % 5 == 0)){
                System.out.printf("%d is divisible by both 4 and 5%n", number);   
            } 
            else{
                System.out.printf("%d is divisible by either 4 or 5 but not both%n", number);           
            } 
        }       
        else{
                System.out.printf("%d is not divisible by either 4 or 5%n", number);    
        }

    }
}
