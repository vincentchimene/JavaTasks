public class TaskFour{
    public static int[] getArrayElementsAtEvenIndex(int[] array){
        String evenString = ""; 
        int count2 = 0;
        for (int count = 0; count < array.length; count++){
            if (count % 2 == 0){
                evenString = evenString + array[count] ;
            }

        }
        System.out.println(evenString);
        int[] arrayEven = new int[evenString.length()];
        for (int count = 0; count < evenString.length(); count++){
            arrayEven[count] = evenString.charAt(count)-'0';    
        }
        return arrayEven;

    }
    
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7};
        int[] check = getArrayElementsAtEvenIndex(array);
        for (int count = 0; count < check.length; count++){
            System.out.print(check[count] + " ");
        }

    }


}








