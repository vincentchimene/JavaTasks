import java.util.Scanner;
public class PrintTenNumbers{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        int[] numbers = new int[10];

        for(int count = 0; count < 10; count++){
            System.out.println("Enter number");
            numbers[count] = inputCollector.nextInt();
        }
            
        for(int counter = 0; counter < numbers.length; counter++)
            System.out.print(numbers[counter] + " ");
    }


}
