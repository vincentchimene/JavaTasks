/*
*Collect 10 scores and print Average
*/
import java.util.Scanner;
public class TaskTwo{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        int sum = 0;
        for (int count = 1; count <= 10; count++){
            System.out.printf("%nEnter score%n");           
            int score = inputCollector.nextInt();
            sum += score;            
        }
        System.out.printf("Average: %d%n", sum/10);
        
}
}
