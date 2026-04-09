/*
* A java program that prints values of characters A to Z.
* Prints vertically.
*/

public class ASCIIValuesAToZ{
    public static void main(String[] args){
        for (char i = 'A'; i <= 'Z'; i++){
            int ascii = (int) i;
            System.out.printf("%c: %d%n", i, ascii);
        }

    }

}

