/*
* A Java program that declares a variable counter and uses the pre-increment 
* operator three times, printing the value of the counter after each increment.
*/
public class TaskSix{
    public static void main(String[] args){
        int counter = 0;
        System.out.printf("Initial counter = %d%n", counter);
        counter = ++counter;
        System.out.printf("counter = %d%n", counter);
        counter = ++counter;
        System.out.printf("counter = %d%n", counter);
        counter = ++counter;
        System.out.printf("counter = %d%n", counter);   
    }

}

