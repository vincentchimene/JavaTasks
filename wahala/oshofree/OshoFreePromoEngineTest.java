import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OshoFreePromoEngineTest{

    @Test

        public void testThatAnInvalidPromoCodeReturnsOriginalCartPrice(){
            double cartTotal = 5000.00;
            String promoCode = "BIGBOY20";
            OshoFreePromoEngine calc = new OshoFreePromoEngine();
            double result = calc.getFinalPrice(cartTotal, promoCode);
            double expected = 5000.00;
            assertEquals(expected, result);
        
         }


    @Test

        public void testThatAValidPromoCodeForCartTotalOf5000ReturnsheCorrectDiscountedPrice(){
            double cartTotal = 5000.00;
            String promoCode = "STARTER10";
            OshoFreePromoEngine calc = new OshoFreePromoEngine();
            double result = calc.getFinalPrice(cartTotal, promoCode);
            double expected = 4500.00;
            assertEquals(expected, result);
        }



    @Test

        public void testThatTheValidPromoCodeForCartTotalRanging5000To14999ReturnsTheCorrectDiscountedPrice(){
            double cartTotal = 12000.00;
            String promoCode = "STARTER10";
            OshoFreePromoEngine calc = new OshoFreePromoEngine();
            double result = calc.getFinalPrice(cartTotal, promoCode);
            double expected = 10800.00;
            assertEquals(expected, result);
        
         }


    @Test

        public void testThaAnInValidPromoCodeForCartTotalRanging5000To14999ReturnsTheOriginalCartPrice(){
            double cartTotal = 12000.00;
            String promoCode = "OSHOFREE35";
            OshoFreePromoEngine calc = new OshoFreePromoEngine();
            double result = calc.getFinalPrice(cartTotal, promoCode);
            double expected = 12000.00;
            assertEquals(expected, result);
        
         }


    @Test

        public void testThatTheValidPromoCodeForCartTotalRanging15000To29999ReturnsTheCorrectDiscountedPrice(){
            double cartTotal = 20000.00;
            String promoCode = "BIGBOY20";
            OshoFreePromoEngine calc = new OshoFreePromoEngine();
            double result = calc.getFinalPrice(cartTotal, promoCode);
            double expected = 16000.00;
            assertEquals(expected, result);
        
         }


    @Test

        public void testThatAnInvalidPromoCodeForCartTotalRanging15000To29999ReturnsTheOriginalCartPrice(){
            double cartTotal = 20000.00;
            String promoCode = "BIGB0";
            OshoFreePromoEngine calc = new OshoFreePromoEngine();
            double result = calc.getFinalPrice(cartTotal, promoCode);
            double expected = 20000.00;
            assertEquals(expected, result);
        
         }




    @Test

        public void testThatTheValidPromoCodeForCartTotalRanging30000AndAboveReturnsTheCorrectDiscountedPrice(){
            double cartTotal = 40000.00;
            String promoCode = "OSHOFREE35";
            OshoFreePromoEngine calc = new OshoFreePromoEngine();
            double result = calc.getFinalPrice(cartTotal, promoCode);
            double expected = 26000.00;
            assertEquals(expected, result);
        
         }


    @Test

        public void testThatAnInvalidPromoCodeForCartTotalRanging30000AndAboveReturnsTheCorrectDiscountedPrice(){
            double cartTotal = 40000.00;
            String promoCode = "OSHO35";
            OshoFreePromoEngine calc = new OshoFreePromoEngine();
            double result = calc.getFinalPrice(cartTotal, promoCode);
            double expected = 40000.00;
            assertEquals(expected, result);
        
         }
//
}

//    @Test
//
//        public void testThatAValidPromoCodeReturnsTheRightFinalPrice(){
//
//
//
//        }
//


//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path

//javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out OshoFreePromoEngineTest.java OshoFreePromoEngine.java
