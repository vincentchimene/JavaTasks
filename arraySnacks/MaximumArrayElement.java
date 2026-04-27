/**
* A java function that returns the lagest element in an array
*/
public class MaximumArrayElement{
    public static int max(int[] numbers){
        int largest = 0;
        for(int counter = 0; counter < numbers.length; counter++){
            System.out.print(numbers[counter] + " ");
            if (numbers[counter] > largest){
                largest = numbers[counter];    
            }
        
        }
        System.out.println();
        return largest;
    }

    public static void main(String[] args){
        int[] numbers = {23, 45, 56, 70,31};
        int result = max(numbers);
        System.out.printf("The maximum array element is %d%n",result);

    
    }


}
