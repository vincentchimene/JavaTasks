import java.util.Scanner;
public class ArrayReverser{
    public static void main(String[] args){
        int temp; int[] array = new int[10];
        Scanner inputCollector = new Scanner(System.in);
        for(int index = 0; index < 10; index++){
            System.out.print("Enter the element: ");
            array[index] = inputCollector.nextInt();
        }

    for(int index = 0; index < (array.length)/2; index++){
        temp = array[index];
        array[index] = array[array.length -1 -index];
        array[array.length -1 -index] = temp;    
    }

    for(int count = 0; count < array.length; count++ ){

        System.out.print(array[count] + " ");
    }
    System.out.println();

}
}

