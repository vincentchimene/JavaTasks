/*
* A Java program that asks user's favourite colour and prints it.
*/
import java.util.Scanner;
public class TaskNine{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("What is your favourite colour? ");
        String colour = input.nextLine();
        System.out.printf("Your favourite colour is %s.%n",colour);
    }
}
