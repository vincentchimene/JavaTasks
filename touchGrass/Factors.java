/**
* 7. Write a program that prints all the factors of a number requested from the user.
*/

import java.util.Scanner;
public class Factors{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.printf("Enter number: ");    
        int number = inputCollector.nextInt();
        
        for(int count = 1; count <= number; count++){
            if (number % count == 0){
                System.out.printf("%d, ", count);
            }
        }    
    }
}
