/*
* A java program that prints numbers from 1 to N(user input).
* Prints vertuically
*/
import java.util.Scanner;

public class NumbersOneToN{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter value for N: ");
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++){
            System.out.printf("%d%n", i);
        }
    }
}

