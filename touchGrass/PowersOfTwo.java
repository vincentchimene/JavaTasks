/**
* 5. Write a program that uses a for loop to display the first n powers of 2,
* where n is entered by the user.
*/
import java.util.Scanner;
public class PowersOfTwo{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.printf("Enter value for n: ");    
        int n = inputCollector.nextInt();
        double power = 0;
        for(int count = 1; count <= n; count++){
            power = Math.pow(2.0,count);
            System.out.printf("%.2f, ", power);          

        }    
    
    }


}
