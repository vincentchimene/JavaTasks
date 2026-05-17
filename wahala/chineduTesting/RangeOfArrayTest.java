import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RangeOfArrayTest{

    @Test
    public void testThatItgivesTheMinValue(){
        RangeOfArray calc = new RangeOfArray();
        int[] array = {2,5,7,9,20};
        int result = calc.getMin(array);
        int expected = 2;
        assertEquals(expected, result);
    }

     @Test
    public void testThatItgivesTheMaxValue(){
        RangeOfArray calc = new RangeOfArray();
        int[] array = {2,5,7,9,20};
        int result = calc.getMax(array);
        int expected = 20;
        assertEquals(expected, result);
    }
    
     @Test
    public void testThatItgivesTheRangeOfTheArray(){
        RangeOfArray calc = new RangeOfArray();
        int[] array = {2,5,7,9,20};
        int result = calc.getRangeOfArray(array);
        int expected = 18;
        assertEquals(expected, result);
    }

   
}
