/*
* A Java program that plays the rock paper scissors game.
* The computer randomly generates 0, 1, or 2
* representing scissor, rock, and paper.
* The user enters a value and the program displays
* whether the user wins, loses, or draws.
*/
import java.util.Scanner;

public class RockPaperScissors{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int computer = (int)(Math.random() * 3);
        System.out.print("Enter 0 (scissor), 1 (rock) or 2 (paper): ");
        int user = input.nextInt(); 
        System.out.printf("Computer chose: %d%n", computer);

        if (user == computer){
            System.out.printf("Draw%n");
        }
        else if ((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1)){
            System.out.printf("You win%n");
        }
        else if ((user == 0 && computer == 1) || (user == 1 && computer == 2) || (user == 2 && computer == 0)){
            System.out.printf("You lose%n");
        }
        else{
            System.out.printf("Invalid input%n");
        }
    }
}
