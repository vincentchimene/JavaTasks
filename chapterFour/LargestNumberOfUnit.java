/**
* A Java application that inputs a series of 10 integers and
* determines and prints the largest integer.
* Your program should use at least the following three variables:
* a) counter: A counter to count to 10 (i.e., to keep track of 
* how many numbers have been input and to determine when
* all 10 numbers have been processed).
* b) number: The integer most recently input by the user.
* c) largest: The largest number found so far.
*/
import java.util.Scanner;
public class LargestNumberOfUnit{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        int largest = 0;
        for (int counter = 1; counter <= 10; counter++){
            System.out.println("Enter whole numbers: ");
            int number = inputCollector.nextInt();
            if (number > largest){
                largest = number;            
            }
        }
        System.out.printf("Largest number: %d%n", largest);
    }

}
