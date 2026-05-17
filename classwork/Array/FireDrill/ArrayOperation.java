import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation{
    public static int[] getArray(int[] array){
        Scanner inputCollector = new Scanner(System.in);
        for (int count = 0; count < 10; count++){
            System.out.println("Enter the integers");
            array[count] = inputCollector.nextInt();
        }

        return array;      
    }
    public static void main(String[] args){
        int[] array = new int[10];
      
       System.out.println(Arrays.toString(getArray(array)));
        }
    
}

