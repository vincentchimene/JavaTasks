/*
*
*/
import java.util.Scanner;
public class TaskSix{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        float sum = 0; int evenScoreCount = 0;
        for (int count = 1; count <= 10; count++){
            System.out.printf("%nEnter score%n");           
            int score = inputCollector.nextInt();
            if (score % 2 == 0){
                evenScoreCount++;
                sum += score; 
            }
                       
        }
        System.out.printf("%nAverage: %.2f%n", sum/evenScoreCount);
        
}
}
