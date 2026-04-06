/*
* A Java program that prompts the user to enter an integer.
* If the number is a multiple of 5, the program displays HiFive.
* If the number is divisible by 2, it displays HiEven.
*/
import java.util.Scanner;

public class HiFiveHiEven{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a whole number: ");
        int number = input.nextInt();
        if (number % 5 == 0 && number % 2 == 0){
            System.out.printf("HiFive%nHiEven%n");  
        }
        else if (number % 5 == 0){
            System.out.printf("HiFive%n");        
        }
        else if (number % 2 == 0){
            System.out.printf("HiEven%n");  
        }
        else
            System.out.printf("Niether even nor multiple of 5%n");
    }
} 
