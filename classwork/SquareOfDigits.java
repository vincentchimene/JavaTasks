import java.util.Scanner;

public class SquareOfDigits{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter Number: ");  
        int number = inputCollector.nextInt();
        int sum = 0; 

        while(number > 0){ 
          int n = number % 10;
           System.out.println(n * n);
           number /= 10;
        
        }
       
  }

}
