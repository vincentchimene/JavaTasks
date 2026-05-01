/**
* A java function that prints running total of elements in an array
*/

public class RunningTotal{

    public static void runningTotal(int[] array){
        int sum = 0;
        for(int count = 0; count < array.length; count++){
            sum += array[count];
            System.out.println(sum); 
        }
        
    }

 public static void main(String[] args){
        int[] array = {23, 45, 56, 70, 31};
        runningTotal(array);
        
    
    }


}



