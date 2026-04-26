import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BackToSenderTest{

    @Test
    public void testCollectionRateLessThan50(){
        BackToSender calc = new BackToSender();
        int collectionRate = 40;
        int result = calc.calculateRidersPay(collectionRate);
        int expected = 40 * 160 + 5000;
        assertEquals(expected, result);
    }

    @Test
    public void testCollectionRateEqualTo50(){
        BackToSender calc = new BackToSender();
        int collectionRate = 50;
        int result = calc.calculateRidersPay(collectionRate);
        int expected = 50 * 200 + 5000;
        assertEquals(expected, result);
    }
    
    @Test
    public void testCollectionRateEqualTo59(){
        BackToSender calc = new BackToSender();
        int collectionRate = 59;
        int result = calc.calculateRidersPay(collectionRate);
        int expected = 59 * 200 + 5000;
        assertEquals(expected, result);
    }

    @Test
    public void testCollectionRateEqualTo60(){
        BackToSender calc = new BackToSender();
        int collectionRate = 60;
        int result = calc.calculateRidersPay(collectionRate);
        int expected = 60 * 250 + 5000;
        assertEquals(expected, result);
    } 

    @Test
    public void testCollectionRateEqualTo69(){
        BackToSender calc = new BackToSender();
        int collectionRate = 69;
        int result = calc.calculateRidersPay(collectionRate);
        int expected = 69 * 250 + 5000;
        assertEquals(expected, result);
    }

    @Test
    public void testCollectionRateEqualTo70(){
        BackToSender calc = new BackToSender();
        int collectionRate = 70;
        int result = calc.calculateRidersPay(collectionRate);
        int expected = 70 * 500 + 5000;
        assertEquals(expected, result);
    }

    @Test
    public void testCollectionRateEqualTo110(){
        BackToSender calc = new BackToSender();
        int collectionRate = 110;
        int result = calc.calculateRidersPay(collectionRate);
        int expected = 110 * 500 + 5000;
        assertEquals(expected, result);
    }   
}
