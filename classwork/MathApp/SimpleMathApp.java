public class SimpleMathApp{
    int number1 = 20;
    int number2 = 30;

    public static double calculate(String operator){

        switch (operator){
            case "+":
                return getSum(number1, number2);
                break;
            case "-":
                return getDifference(number1, number2);
                break;
            case "*":
                return getProduct(number1, number2);
                break;
            case"/":
                return getQuotient(number1, number2);
                break;        
        }
    }
    public stati




}
