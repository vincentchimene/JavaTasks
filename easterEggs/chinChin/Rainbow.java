/*
* A Java program that randomly generates an integer between 1 and 7
* and displays the name of a colour in the rainbow
* — violet, indigo, blue, green, yellow, orange, and red
* — for numbers 1 through 7 respectively.
*/
public class Rainbow{
    public static void main(String[] args){
        int number = (int)(Math.random() * 7) + 1;
        System.out.printf("Generated number: %d%n", number);

        if (number == 1){
            System.out.printf("Violet%n");
        }
        else if (number == 2){
            System.out.printf("Indigo%n");
        }
        else if (number == 3){
            System.out.printf("Blue%n");
        }
        else if (number == 4){
            System.out.printf("Green%n");
        }
        else if (number == 5){
            System.out.printf("Yellow%n");
        }
        else if (number == 6){
            System.out.printf("Orange%n");
        }
        else if (number == 7){
            System.out.printf("Red%n");
        }
    }
}
