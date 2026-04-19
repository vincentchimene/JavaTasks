/**
* 6. Write a program that simulates a countdown from userinput to 1, then prints: Blast off!
*/

import java.util.Scanner;
public class CountDown{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.printf("Enter value for n: ");    
        int userInput = inputCollector.nextInt();
        
        for(int count = userInput; count >= 1; count--){
            System.out.printf("%d, ", count);          

        }    
            System.out.printf("Blast off!");  
    }


}
