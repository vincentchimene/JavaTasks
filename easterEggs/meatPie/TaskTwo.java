/*
* A Java program that asks for your age and prints it.
*/
import java.util.Scanner;
public class TaskTwo{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = input.nextInt();
        System.out.printf("You are %d years old.%n",age);
    }
}
