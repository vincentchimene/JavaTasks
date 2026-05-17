/**
* A java function that reverses an array
*/
import java.util.Arrays;
import java.util.Scanner;
public class ArrayReverser3{
    public static int[] reverse(int[] array){
        int temp;

    for(int index = 0; index < (array.length)/2; index++){
        temp = array[index];
        array[index] = array[array.length -1 -index];
        array[array.length -1 -index] = temp;    
    }
        
        return array;
    }  

    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverse(array)));
        
    
    }
}

