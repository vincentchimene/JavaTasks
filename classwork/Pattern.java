import java.util.Scanner;
public class Pattern{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int count = 0;
        int maxRow = inputCollector.nextInt();
        for (int row = 1; row <= maxRow; row++){
            for (int column = 1; column <= row; column ++){
                count++;                
                System.out.printf("%-5d",count);
            }   
                System.out.println();
                System.out.println();
        }
    }

}
