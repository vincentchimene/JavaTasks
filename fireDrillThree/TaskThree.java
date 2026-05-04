/*
*Collect 10 scores and put them in an array
*/
import java.util.Scanner;
public class TaskThree{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        int[] array = new int[10];
        for (int count = 0; count < 10; count++){
            System.out.print("Enter number: ");
            array[count] = inputCollector.nextInt();
           
        }
        for (int count = 0; count < 10; count++){
            System.out.print(array[count] + " ");
        }
    }

}
