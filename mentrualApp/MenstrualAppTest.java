import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class MenstrualAppTest{

    //@Test
    //public static void testThatTheMenstrualAppClassExists(){
        
    //}   
    
    @Test
    public void testForFlowStartDateCalculation(){
        MenstrualApp calc = new MenstrualApp();
        LocalDate lastPeriod = LocalDate.of(2026, 4, 20);
        LocalDate result = calc.getFlowStartDate(lastPeriod);
        LocalDate expected = LocalDate.of(2026, 4, 20);
        assertEquals(expected, result);
        
    } 
    
    //@Test
    //public void testThatFlowEndDateIsLastPeriodDatePlusPeriodDuration(){
             
   // }


}
