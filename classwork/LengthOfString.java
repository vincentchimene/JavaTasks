public class LengthOfString{
    public static int length(String characters){
        int index = 0;
        for (int character : characters)
            index++;
        System.out.println(index);
        return index;
            
           

    }

    public static void main(String[] args){
        String characters = "king";
        length(characters);
    
    }
}
