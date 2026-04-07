/*
* A Java program that generates two single-digit integers
* and finds their difference.
* The result is always positive.
*/
public class AbsoluteDifference{
    public static void main(String[] args){
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        System.out.printf("First number: %d%n", num1);
        System.out.printf("Second number: %d%n", num2);

        int difference = Math.abs(num1 - num2);

        System.out.printf("The Absolute difference: %d%n", difference);
    }
}
