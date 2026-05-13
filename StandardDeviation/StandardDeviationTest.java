import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest{

    @Test

        public void testThatTheSumFuctionWorks(){
            double[] array = {10, 20, 30, 40, 50};
            StandardDeviation calc = new StandardDeviation();
            double result = calc.sumOfnumbers(array);
            double expected = 150.00;
            assertEquals(expected, result);
        
         }


    @Test

        public void testThatTheGetMeanOfnumbersWorks(){
            double[] array = {10, 20, 30, 40, 50};
            StandardDeviation calc = new StandardDeviation();
            double result = calc.getMeanOfnumbers(array);
            double expected = 30.00;
            assertEquals(expected, result);
        
         }

    @Test

        public void testThatTheGetVarianceWorks(){
            double[] array = {10, 20, 30, 40, 50};
            StandardDeviation calc = new StandardDeviation();
            double result = calc.getVariance(array);
            double expected = 200.00;
            assertEquals(expected, result);
        
         }


    @Test

        public void testThatgetStandardDeviation(){
            double[] array = {10, 20, 30, 40, 50};
            StandardDeviation calc = new StandardDeviation();
            double result = calc.getStandardDeviation(array);
            double expected = 14.14;
            assertEquals(expected, result);
        
         }

}




//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path

//javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out StandardDeviationTest.java StandardDeviation.java
