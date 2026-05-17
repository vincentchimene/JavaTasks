public class Largest{
    public static int highest(int number1, int number2, int number3){

        int max = 0;
        if (number1 > max){
            max = number1;
        }
        if (number2 > max){
            max = number2;
        }
        if (number3 > max){
            max = number3;
        }
        return max;
    }

    public static void main(String[] args){
        System.out.println(highest(34, 398,45));   

    }
}
