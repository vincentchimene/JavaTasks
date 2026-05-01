/**
* A java function that prints elements in even positions in an array
*/

public class ArrayElementsInEvenPosition{

    public static void evenElements(int[] array){
    
        for(int count = 0; count < array.length; count++){
            if (count % 2 == 0){
                System.out.print(array[count] + " ");
            }
        }
        System.out.println();
        
    }

 public static void main(String[] args){
        int[] array = {23, 45, 56, 70, 31};
        evenElements(array);
        
    
    }


}



