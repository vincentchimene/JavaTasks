import java.util.Scanner;
public class PatternTopAndBelow{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int maxRow = inputCollector.nextInt();
        for (int row = 1; row <= maxRow; row++){        
                for (int column = 1; column <= row; column ++){        
                    System.out.printf("*");          
                } 
                for (int column = 1; column <= row; column++){        
                    System.out.printf("*");          
            } 
 
                System.out.println();
        }
    }

}

