/**
* A java function that prints range of elements in an array
*/

public class RangeOfArray{

    public static int getMax(int[] array){
        int max = array[0]; 
        for(int count = 1; count < array.length; count++){
            if (array[count] > max){
                max = array[count];
            }
        }
        System.out.printf("maximum value: %d%n", max);
        return max;
    }
    public static int getMin(int[] array){
        int min = array[0];
        for(int count = 1; count < array.length; count++){
            if (array[count] < min){
                min = array[count];
            }
        }
        System.out.printf("minimum value: %d%n", min);
        return min;
        }
    
    public static int getRangeOfArray(int[] array){
        int max = getMax(array);
        int min = getMin(array);        
        int range = max - min;

        System.out.printf("The Range of the Array: %d%n", range);
        return range;
    }    
  

    public static void main(String[] args){
        int[] array = {2,5,7,9,20};
      
           
        int result = getRangeOfArray(array);
        

    }



}



