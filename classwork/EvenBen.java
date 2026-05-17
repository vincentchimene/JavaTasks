public class EvenBen{
    public static void main(String[] args){
        String word = "thi ef";
        for (int count =1; count <= 100; count++){
            if (count%2 == 0){
                System.out.printf("%d ", count);
            }
        }
        System.out.println();
        String newWord = word.replace(" ","");
        System.out.println(newWord);

}

}
