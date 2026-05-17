import java.util.Scanner;
public class PatternConnected{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int maxRow = inputCollector.nextInt();
        for (int row = 1; row <= maxRow; row++){
            if (row % 2 == 0){
                for (int column = 1; column <= row - 1; column++){
                    if (column % 2 != 0){
                        System.out.print("|");
                    }
                    else{
                        System.out.print(" ");    
                    }                
                }
            }
            if (row % 2 != 0){
                for (int column = 1; column <= row; column++){
                    if (column % 2 == 0){
                        System.out.print("-");
                    }
                    else{
                        System.out.print("*"); 
                    }     
                }        
            }
            System.out.println();
            }           
        }
    }
