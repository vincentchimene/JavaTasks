/**
* A java function that prints sum of elements in an array
* using for loop
* using while loop
* using do while loop
*/

public class SumOfArrayElementsWithLoops{

    public static void forLoopSum(int[] array){
        int sum = 0;
        for(int count = 0; count < array.length; count++){
            sum += array[count];
        }
        System.out.printf("Sum by for loop: %d%n", sum); 
    }

    public static void whileLoopSum(int[] array){
        int sum = 0;
        int count = 0;
        while(count < array.length){
            sum += array[count];  
            count++;  
        }
        System.out.printf("Sum by while loop: %d%n", sum);
    }
    public static void doWhileLoopSum(int[] array){
        int sum = 0;
        int count = 0;
        do {
            sum += array[count];  
            count++; 
        }
        while(count < array.length);             
        
        System.out.printf("Sum by do while loop: %d%n", sum);
    }

 public static void main(String[] args){
        int[] array = {23, 45, 56, 70, 31};
        forLoopSum(array);
        whileLoopSum(array);
        doWhileLoopSum(array);
    
    }


}



