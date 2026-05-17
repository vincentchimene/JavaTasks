import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxfrequencyTest{

    @Test
    public void testThatTheActualFromTheMaxMethodEqualsTheExpected(){
        Maxfrequency calc = new Maxfrequency();
        int[] array = {1,5,5,6,7,7,7,7,7,7,7,5,5,5,5,7,7,5,4};
        int result = calc.getMax(array);
        int expected = 9;
        assertEquals(expected, result);
    }

    @Test
    public void testThatTheActualFromTheMaxMethodEqualsTheExpectedTest1(){
        Maxfrequency calc = new Maxfrequency();
        int[] array = {1,2,2,2,3};
        int result = calc.getMax(array);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void testThatTheActualFromTheMaxMethodEqualsTheExpectedTest2(){
        Maxfrequency calc = new Maxfrequency();
        int[] array = {1,5,5,6,4};
        int result = calc.getMax(array);
        int expected = 2;
        assertEquals(expected, result);
    }


//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path

// javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out MaxfrequencyTest.java Maxfrequency.java
}
