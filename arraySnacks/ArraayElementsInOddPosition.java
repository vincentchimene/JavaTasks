/**
* A java function that prints elements in odd positions in an array
*/

public class ArraayElementsInOddPosition{

    public static void oddElements(int[] array){
    
        for(int count = 0; count < array.length; count++){
            if (count % 2 == 1){
                System.out.print(array[count] + " ");
            }
        }
        System.out.println();
        
    }

 public static void main(String[] args){
        int[] array = {23, 45, 56, 70, 31};
        oddElements(array);
        
    
    }


}



