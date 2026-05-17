
public class PizzaWahala{

    public static String pizzaOrderDetails(double numberOfGuest, String pizzaType){
     
         int pricePerBox;
        double numberOfSlice;
        String message; 
        
        switch(pizzaType){
            case "sapa size":
                pricePerBox = 2500;
                numberOfSlice = 4;
                break;
            case "small money":
                pricePerBox = 2900;
                numberOfSlice = 6;
                break;               
            case "big boys":
                pricePerBox = 4000;
                numberOfSlice = 8;
                break;
            case "odogwu":
                pricePerBox = 5200;
                numberOfSlice = 12;
                break;
            default:
                message = "Invalid Order!";
                return message;
        }

        int boxesOfPizza = (int)Math.ceil(numberOfGuest/numberOfSlice);
        int leftOverSlice = (int)(boxesOfPizza * numberOfSlice - numberOfGuest);
        int customerBill = pricePerBox * boxesOfPizza;
        message = "Boxes of pizza to buy: " + boxesOfPizza + "\nNumber of left over slices: " + leftOverSlice + "\nCustomer will pay: " + customerBill; 
        return message;


    }


    public static void main(String[] args) {
        System.out.println(pizzaOrderDetails(40, "sapa size"));
        
 }
}
