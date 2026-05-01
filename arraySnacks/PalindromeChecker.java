/**
* A function that tests if a string is a palindrome or not
*/

public class PalindromeChecker{

    public static boolean isPalindrone(String word){

        boolean check = true;
        for (int count = 0; count <= (word.length())/2; count++){
            if (word.charAt(count) != word.charAt(word.length() - 1 - count)){
                check = false;
                break;    
            }
        }
        System.out.println(check);        
        return check;
    }



    public static void main(String[] args){

        String word = "1234321";   
        isPalindrone(word); 
    }
}
