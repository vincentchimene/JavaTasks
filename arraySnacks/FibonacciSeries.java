import java.util.Arrays;
public class FibonacciSeries{
    public static int getFibonacciNumber(int position){
        int result = 0; 
        int beforeInitial = 1;
        int initial = 1;
        for(int count = 3; count <= position ; count++){
            result = beforeInitial + initial;
            beforeInitial = initial;
            initial = result;
        }
        if(result == 0){
            result = 1;
        }
        return result;

    }

    public static int[] getFibonacciSeries(int lastPosition){
        int[] fibonacciSeries = new int[lastPosition];
        for(int position = 1; position <= lastPosition; position++){
            fibonacciSeries[position - 1] = getFibonacciNumber(position); 
            //System.out.print(getFibonacciNumber(position) + " ");     
        }
        return fibonacciSeries;   
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(getFibonacciSeries(7)));
        //getFibonacciSeries(7);
    }





}
