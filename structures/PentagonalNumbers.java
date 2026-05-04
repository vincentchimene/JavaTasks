/**
* 1.Write a Java method with the header: public static int getPentagonalNumber(int n)
* Returns the nth pentagonal number using the formula n(3n−1)/2.
* Write a test program that displays the first 100 pentagonal numbers,
* 10 per line, using the %7d format specifier.
*/

public class PentagonalNumbers{
    public static int getPentagonalNumber(int n){
        return (n * (3 * n - 1)/2);

    }

    public static void main(String[] args){
        for(int count = 1; count <= 100; count++){
            System.out.printf("%7d", getPentagonalNumber(count));
            if (count % 10 == 0){
                System.out.println();
            }    
        }
    
    }


}
