import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PizzaWahalaTest {

@Test
    public void testBoxesOfPizzaForSapaSize(){
        int numberOfGuest = 40;
        String pizzaType = "sapa size"
        int result = PizzaWahala.boxesOfPizza;
        int expected = 10;
        assertEquals(expected, result);
    }
}
