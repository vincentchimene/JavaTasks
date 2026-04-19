/**
* 2. A Java program that prompts the user to enter a lowercase or uppercase letter 
* and displays its corresponding telephone keypad number 
* (2-abc, 3-def, 4-ghi, 5-jkl, 6-mno, 7-pqrs, 8-tuv, 9=wxyz).
*/
import java.util.Scanner;
public class telephoneKeypad{
    public static void main(String[] args){
    Scanner inputCollector = new Scanner(System.in);
    System.out.printf("Enter a letter for the corresponding output.%n(2-abc, 3-def, 4-ghi, 5-jkl, 6-mno, 7-pqrs, 8-tuv, 9=wxyz).%n");
    String input = inputCollector.next();
    String lowerInput = input.toLowerCase();
    switch(lowerInput){
        case "a":
            System.out.printf("2%n");
            break;
        case "b":
            System.out.printf("2%n");
            break;
        case "c":
            System.out.printf("2%n");
            break;
        case "d":
            System.out.printf("3%n");
            break;
        case "e":
            System.out.printf("3%n");
            break;
        case "f":
            System.out.printf("3%n");
            break;
        case "g":
            System.out.printf("4%n");
            break;
        case "h":
            System.out.printf("4%n");
            break;
        case "i":
            System.out.printf("4%n");
            break;
        case "j":
            System.out.printf("5%n");
            break;
        case "k":
            System.out.printf("5%n");
            break;
        case "l":
            System.out.printf("5%n");
            break;
        case "m":
            System.out.printf("6%n");
            break;
        case "n":
            System.out.printf("6%n");
            break;
        case "o":
            System.out.printf("6%n");
            break;
        case "p":
            System.out.printf("7%n");
            break;
        case "q":
            System.out.printf("7%n");
            break;
        case "r":
            System.out.printf("7%n");
            break;
        case "t":
            System.out.printf("8%n");
            break;
        case "u":
            System.out.printf("8%n");
            break;
        case "v":
            System.out.printf("8%n");
            break;
        case "w":
            System.out.printf("9%n");
            break;
        case "x":
            System.out.printf("9%n");
            break;
        case "y":
            System.out.printf("9%n");
            break;
        case "z":
            System.out.printf("9%n");
            break;
        default:
            System.out.printf("invalid input%n");
    }


    }
}
