/*
* A java program that prompts the user to enter the side of a hexagon
* and displays its area using:
* Area = (3√3 / 2) × s²
*/
import java.util.Scanner;

public class AreaOfHexagon{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter length of each side: ");
        double side = input.nextDouble();
        double area = ((Math.sqrt(3) * 3)/2) * side * side;
        System.out.printf("Area of Hexagon = %.2f%n", area);
      
    }
}
