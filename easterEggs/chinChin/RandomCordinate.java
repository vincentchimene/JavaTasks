/*
* A Java program that displays a random coordinate point inside a rectangle
* centred at (0, 0) with width 50 and height 150.
*/
public class RandomCordinate{
    public static void main(String[] args){
        int x = (int)(Math.random() * 50) + 1;
        int y = (int)(Math.random() * 150) + 1;

        System.out.printf("coordinate: (%d,%d)%n", x, y);

    }
}
