public class Kata{
    public static void main(String[] args){
        System.out.printf("%d", max(23, 26));
    }
        


        public static int max(int num1, int num2){
            int maximum = num2;
            if (num1 > num2){
                maximum = num1;       
            }
            return maximum;
        }
    
    public static int subtraction(int number1, int number2){
        int minus = number1 - number2;
        return minus;
    }
           
  

    public static boolean isEven(int number){
        return number % 2 == 0;
        }

    public static boolean isPrime(int number){
        boolean checkPrime = true;
        for (int count = 2; count <= number/2; count++){
            if (number % count == 0){
                checkPrime = false;
                break;
            }
        }
        return checkPrime;
    }
        
    public static float divide(int number1, int number2){
        if (number2 == 0){
            return 0;
        }
        else{
        int quotient = number1 / number2;
        return quotient;
        }
    }
           

    public static int factorOf(int number){
        int factorCount = 0;     
        for (int count = 1; count <= number; count++){
            if (number % count == 0){               
                factorCount++;    
            }

        }
        return factorCount;
    }


    public static long squareOf(int number){
        return (number * number);    
    }


    public static long factorialOf(int number){
        int factorial = 1;
        for (int count = 2; count <= number; count++){
            factorial *= count;
        }
        return factorial;    
    }
}





