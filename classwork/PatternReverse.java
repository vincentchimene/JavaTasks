import java.util.Scanner;
public class PatternReverse{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int maxRow = inputCollector.nextInt();
        for (int row = 1; row <= maxRow; row++){
            for (int column = 1; column <= maxRow-row; column++){
                System.out.print(" ");
            }

            for(int count = 1; count <= row; count++){
                System.out.print("*");                   
            }

           System.out.println();     
        }
    }

}
