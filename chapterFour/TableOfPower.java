/**
* (Tabular Output) Write a Java application that uses looping to print the following table of
values:
N   N²  N³  N⁴
1   1   1   1
2   4   8   16
3   9   27  81
4   16  64  256
5   25  125 625          

*/
public class TableOfPower{
    public static void main(String[] args){
        System.out.printf("%s   %-2s    %-3s    %-4s%n", "N", "N²", "N³", "N⁴");
        for (int count = 1; count <= 5; count++){
            System.out.printf("%d   %-2d    %-3d    %-3d%n", count, count*count, count*count*count, count*count*count*count);
        }
    }
}

