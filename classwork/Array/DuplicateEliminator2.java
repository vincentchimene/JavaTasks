import java.util.Scanner;
public class DuplicateEliminator2{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        int array[] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        for(int index = 0; index < 10; index++){
            System.out.print("Enter the element: ");
            array[index] = inputCollector.nextInt();
        }
        for (int index = 0; index < 10; index++){
            for (int count = 0; count < 10; count++){
                if (array[index] == array[count]){
                    array[index] = -1;
                }

            }

        }
        for (int index = 0; index < 10; index++){
            if((array[index] != -1) && (array[index] >= 10) && (array[index] <= 100)){
                System.out.print(array[index] + " ");            
            
            }
        
        }
        
    }




}
