/* 
* A java program that prompts the user to enter the number of minutes
* and displays the maximum number of years and remaining days for those minutes.
*/
import java.util.Scanner;

public class MinutesToYears{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();
        int year = minutes/(60*24*365);
        int remainingDays = (minutes % (60*24*365))/(60*24);
        System.out.printf("%d minutes = %d years and %d days%n", minutes, year, remainingDays);
   }
}
        

