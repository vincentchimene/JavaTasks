import java.util.Scanner;

public class SquareOfDigitsReversed{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter Number: ");  
        int number1 = inputCollector.nextInt();
        int number2 = number1; 

        int count1 = 1;
        while(number1 > 10){
            number1 /= 10;
            count1 *= 10;
        }

        int count2 = 1;
        while(count1 >= count2){
            int digit = (number2/(count1/count2)) % 10;
            System.out.printf("%d%n", digit * digit);
            count2 *= 10;
        }
    }
}
