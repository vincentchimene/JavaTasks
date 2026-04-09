import java.util.Scanner;

public class NumbersNToOne{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter value for N: ");
        int n = input.nextInt();
        
        for (int i = n; i >= 1; i--){
            System.out.printf("%d%n", i);
        }
    }
}
