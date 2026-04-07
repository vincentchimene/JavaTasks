/*
* A Java program that prompts the user to enter a month and a year
* and displays the number of days in that month.
* The program accounts for leap years.
*/
import java.util.Scanner;

public class DaysInMonth{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter figure for month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();

        int days;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            days = 31;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11){
            days = 30;
        }
        else if (month == 2){
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                days = 29;
            }
            else{
                days = 28;
            }
        }
        else{
            System.out.printf("Invalid month%n");
            return;
        }

        System.out.printf("Number of days: %d%n", days);
    }
}
