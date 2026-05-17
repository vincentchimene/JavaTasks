import java.util.Scanner;
public class SumOfPrimeFactors{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.printf("Enter number: ");
        double number = inputCollector.nextInt();
        double sum = 0;
        for(double count = 2; number > 1; ){
            if(number % count == 0){
                number = number/count;
                sum = sum + count;
               
            }
            else{
                count++; 
                       
            }      
        }
        System.out.println(sum);
    }

}
