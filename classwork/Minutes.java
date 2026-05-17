public class Minutes{
    public static void minutesConverter(double minutes){
    double seconds = minutes * 60;
    double hours = minutes/60;
    System.out.printf("%.2f minutes in seconds is %.2f and in hour is %.2f%n", minutes, seconds, hours);
        
    }
    
    public static void main(String[] args){
    double minutes = 30;      
    minutesConverter(minutes);
    
    } 


}
