public class ReverseOfString{
    public static String reverse(String text){
        String sum = "";
        for (int index = 0; index < text.length(); index++)
            sum = text.charAt(index) + sum;
            
        System.out.println(sum);
        return sum;
                  

    }

    public static void main(String[] args){
        String text = "king";
        reverse(text);
    
    }
}
