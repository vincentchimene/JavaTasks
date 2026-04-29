/**
* A java function that reverses an array
*/
public class ArrayReverser{
    public static int[] reverse(int[] numbers){
        int[] reversedNumbers = new int[numbers.length];
        for(int counter = 0; counter < numbers.length; counter++){
            System.out.print(numbers[counter] + " ");
            reversedNumbers[numbers.length - 1 - counter] = numbers[counter];
        }
        System.out.println();
        for(int counter = 0; counter < numbers.length; counter++){
            System.out.print(reversedNumbers[counter] + " ");
        }
        System.out.println();
        return reversedNumbers;
    }  

    public static void main(String[] args){
        int[] numbers = {23, 45, 56, 70,31};
        reverse(numbers);
    
    }


}

