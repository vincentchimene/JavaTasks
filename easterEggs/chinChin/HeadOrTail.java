/*
* A Java program that lets the user guess whether the
* flip of a coin results in heads or tails.
* The program randomly generates an integer 0 or 1 
* (representing head or tail), prompts the user to enter a guess, 
* and reports whether the guess is correct.
*/

import java.util.Scanner;

public class HeadOrTail{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Make your guess (1 for Head, 0 for Tail): ");
        int guess = input.nextInt();
        int number = (int)(Math.random() * 2);
        if (guess == 1){
            if (number == 1){           
                System.out.printf("You guessed: Head%nCoin shows: Head%nCorrect%n");
            } 
            else{
                System.out.printf("You guessed: Head%nCoin shows: Tail%nWrong%n");
            }       
        }
        else if (guess == 0){
            if (number == 1){           
                System.out.printf("You guessed: Tail%nCoin shows: Head%nWrong%n");
            } 
            else{
                System.out.printf("You guessed: Tail%nCoin shows: Tail%nCorrect%n");
            }       
        } 
        else{
            System.out.printf("Invalid Entry!");
        }   
    }
}                      

