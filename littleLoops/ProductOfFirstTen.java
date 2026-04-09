/*
* A java program that uses a while loop to compute the product of integers 1 to 10.
*/


public class ProductOfFirstTen{
    public static void main(String[] args){
        int product = 1;
        int i = 1; 
        while (i <= 10){
            product *= i;  
            i++;
        }
        System.out.printf("%d%n", product);
    }

}

