//collect cart total and promo code
//calculate discount
//calculate final price
//if invalid promo code
//    return cart toal
//else return final price
//

public class OshoFreePromoEngine{
    
    public static double getFinalPrice(double cartTotal, String promoCode){
        int discount = 0;
        if(cartTotal < 5000.00){
            discount = (promoCode.toUpperCase() == "STARTER10")? 0 : 0;                    
        }
        else if(cartTotal <= 14999.00){
            discount = (promoCode.toUpperCase() == "STARTER10")? 10 : 0;
        }
        else if(cartTotal <= 29999.00){
            discount = (promoCode.toUpperCase() == "BIGBOY20")? 20 : 0;  
        }
        else if(cartTotal >= 30000.00){
        discount = (promoCode.toUpperCase() == "OSHOFREE35" )? 35 : 0;
        }
        double finalPrice = cartTotal - discount * cartTotal / 100;
        return finalPrice;
    }



    public static void main(String[] args){
        double cartTotal = 15000;
        String promoCode = "BIGBOY20"; 
        System.out.println(getFinalPrice(cartTotal, promoCode)); 
    }

}

