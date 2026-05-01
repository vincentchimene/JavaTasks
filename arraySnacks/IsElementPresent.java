/**
* A java function that checks whether an element occurs in an array
*/

public class IsElementPresent{

    public static boolean checkForArray(int[] array, int number){
        boolean result = false;
        for(int count = 0; count < array.length; count++){
            if (array[count] == number){
                result = true;
            }
        }
        System.out.println(result);
        return result;
        
    }

 public static void main(String[] args){
        int[] array = {23, 45, 56, 70, 31};
        int number = 45;
        checkForArray(array, number);
        
    
    }


}



