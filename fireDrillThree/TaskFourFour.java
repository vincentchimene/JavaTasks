public class TaskFourFour{
    public static int[] getArrayElementsAtEvenIndex(int[] array){
        int evenLength = (array.length() + 1)/2;
        int count2 = 0;
        int[] evenArray = new int[evenLength];
        for (int count = 0; count < array.length; count++){
            if (count % 2 == 0){
                evenArray[count2] = array[count];
                count2++;
            }
            
        }
        return evenArray;
        
    }

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7};
        int[] check = getArrayElementsAtEvenIndex(array);
        for (int count = 0; count < check.length; count++){
            System.out.print(check[count] + " ");
        }
    
    }
}
