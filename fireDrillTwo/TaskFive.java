/*
*Collect 10 scores and print Sum and Average
*/
import java.util.Scanner;
public class TaskFive{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        int sum = 0;
        for (int count = 1; count <= 10; count++){
            System.out.printf("%nEnter score%n");           
            int score = inputCollector.nextInt();
            if (score % 2 == 0){
                sum += score; 
            }
                       
        }
        System.out.printf("%nSum: %d%n", sum);
        
}
}
