public class PizzaWahala{
    public static String pizzaOrderDetails(double numberOfGuest, String pizzaType){
        pizzaType = pizzaType.tolowerCase();
        int pricePerBox;
        double numberOfSlice; 
        
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
                System.out.println("Invalid Order!");
                return;
        }

        int boxesOfPizza = (int)math.ceil(numberOfGuest/numberOfSlice);
        int leftOverSlice = (int)(boxesOfPizza * numberOfSlice - numberOfGuest);
        int customerBill = pricePerBox * boxesOfPizza;
        

        // STILL WORKING ON THIS!!!


    }
}
