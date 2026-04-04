/*
* A java program that asks for a name and age and prints both in the format:
* I am (insert name) and I am (insert age) years old.
*/
import java.util.Scanner;
public class TaskTwentySix{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter figure for age: ");
        int age = input.nextInt();
        
        System.out.printf("I am %s and I am %d years old.%n", name, age);
    }
}
