public class StandardDeviation{
    public static double sumOfnumbers(double[] array){
        double sum = 0; 
        for(int index = 0; index < array.length; index++){
            sum += array[index];
        }
        return sum;

    }
    public static double getMeanOfnumbers(double[] array){
        double mean;
        mean = sumOfnumbers(array)/array.length;
        return mean;    
    }   
    
    public static double getVariance(double[] array){
        double mean = getMeanOfnumbers(array);
        double sumOfSquareDeviations = 0;
        for(int index = 0; index < array.length; index++){
            double squareDeviation = (array[index] - mean) * (array[index] - mean);   
             sumOfSquareDeviations += squareDeviation;
        }
        double variance = sumOfSquareDeviations/array.length;
        return variance;
    }

    public static double getStandardDeviation(double[] array){
        double standardDeviation = Math.sqrt(getVariance(array));
        return  standardDeviation;
    }

    public static void main(String[] args){
        double[] array = {10, 20, 30, 40, 50};
        System.out.printf("Sum of numbers: %.2f%n", sumOfnumbers(array));
        System.out.printf("Mean Of numbers: %.2f%n", getMeanOfnumbers(array));
        System.out.printf("Variance: %.2f%n", getVariance(array));
        System.out.printf("Standard Deviation: %.2f%n", getStandardDeviation(array));
  







    }
    
    
}
