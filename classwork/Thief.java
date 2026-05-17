/*
* A java program that simulates the catching of a thief. 
* Hint: The program ends when i shout thief o.
*/
import java.util.Scanner;
public class Thief{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        String check = "";
        while(true){
            System.out.println("Stop the Thief!");
            String action = inputCollector.nextLine();
            check = action.toLowerCase();
            //System.out.println(check);
            if (check.equals("thief")){
                inputCollector.close();
                return;
        }
         
        }
    }


}
