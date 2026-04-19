/**
* 4. A Java program that prompts the user to enter two characters:
* The first representing a student's major
* (I = Information Management, C = Computer Science, A = Accounting)
* The second a digit 1-4 representing year 
* (1-Freshman, 2-Sophomore, 3-Junior, 4-Senior).
* Display the full major name and year status.
*/
import java.util.Scanner;
public class StudentsInfo{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        String major = "";
        String year = "";
        System.out.printf("Enter Letter representing the student's major%n(I = Information Management, C = Computer Science, A = Accounting)%n");
        String majorCode = inputCollector.next();
        System.out.printf("Enter digit representing the student's year%n(1-Freshman, 2-Sophomore, 3-Junior, 4-Senior)%n");
        int yearCode = inputCollector.nextInt();
        switch (majorCode){
            case "I":
                 System.out.println("Information Management");
                 break;
            case "C":
                 System.out.println("Computer Science");
                 break;
            case "A":
                 System.out.println("Accounting");
                 break;
            default:
                 System.out.println("Invalid major Code entered!");
        }

        switch (yearCode){
            case 1:
                 System.out.println("Freshman");
                 break;
            case 2:             
                 System.out.println("Sophomore");
                 break;
            case 3:
                 System.out.println("Junior");
                 break;
            case 4:            
                 System.out.println("Senior");
                 break;
            default:
                 System.out.println("Invalid major Code entered!");
                break;
        }

    
    }

}
