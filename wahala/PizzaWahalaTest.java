import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PizzaWahalaTest {

@Test
    public void testBoxesOfPizzaForSapaSize(){
        PizzaWahala calc = new PizzaWahala();
        int numberOfGuest = 40;
        String pizzaType = "sapa size";
        int result = calc.pizzaWahala.boxesOfPizza;
        int expected = 10;
        assertEquals(expected, result);
    }
}
