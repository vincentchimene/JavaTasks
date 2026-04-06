/*
* A Java program that prompts the user to enter three integers
* and displays them in non-decreasing order.
*/


import java.util.Scanner;

public class NonDecreasingOrder{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter value for first integer: ");
        int num1 = input.nextInt();
        System.out.printf("Enter value for second integer: ");
        int num2 = input.nextInt();
        System.out.printf("Enter value for third integers: ");
        int num3 = input.nextInt();

        if (num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 > num3){
            int temp = num1;
            num1 = num3;
            num3 = temp;
        }

        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.printf("Accending Order: %d %d %d%n", num1, num2, num3);

    }
}
