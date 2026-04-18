import java.util.Scanner;

public class SumofDigits2{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter Number: ");        
        int sum = 0; 

        for(int number = inputCollector.nextInt();number > 0;number /= 10){ 
           sum += number % 10;
        
        }
        System.out.printf("%d%n", sum);
  }

}
