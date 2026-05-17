import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayReverser3Test{

    @Test
    public void testThatReverseArrayEqualsArray(){
        ArrayReverser3 calc = new ArrayReverser3();
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        int[] result = calc.reverse(array);
        int[] expected = {0,9,8,7,6,5,4,3,2,1};
        assertArrayEquals(expected, result);

    }
}



//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path

//javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out ArrayReverser3Test.java ArrayReverser3.java
