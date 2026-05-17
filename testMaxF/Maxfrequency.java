public class Maxfrequency{
    public static int getMax(int[] array){

        int maxF = 0; int indexCounter = 0;
        for (int count1 = 0; count1 < array.length; count1++){
            for (int count2 = 0; count2 < array.length; count2++){
                
                if (array[count1] == array[count2]){
                    indexCounter++;    
                }
                
            }
            if (indexCounter > maxF){
                    maxF = indexCounter; 
                                   
                }
            indexCounter = 0;
        }
        return maxF;
    }


    public static void main(String[] args){
        int[] array = {1,5,5,6,7,7,7,7,7,7,7,5,5,5,5,7,7,5,4};        

        System.out.println(getMax(array));
    }
}
