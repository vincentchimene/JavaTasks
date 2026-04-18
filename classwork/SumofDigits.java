import java.util.Scanner;

public class SumofDigits{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter Number: ");  
        int number = inputCollector.nextInt();
        int sum = 0; 

        while(number > 0){ 
           sum += number % 10;
            number /= 10;
        
        }
        System.out.printf("%d%n", sum);
  }

}
