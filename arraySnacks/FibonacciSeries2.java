import java.util.Arrays;
public class FibonacciSeries2{
    public static int[] getFibonacciSeries(int lastPosition){
        int[] fiboSeries = new int[lastPosition];
        if(lastPosition <= 0){return new int[0];}
        fiboSeries[0] = 1;
        if (lastPosition > 1){ fiboSeries[1] = 1;}
        for(int index = 2; index < lastPosition; index++){
            fiboSeries[index] = fiboSeries[index - 1] + fiboSeries[index - 2];
        }
        return fiboSeries;
    }


    public static void main(String[] args){
        System.out.println(Arrays.toString(getFibonacciSeries(0)));      

    }



}
