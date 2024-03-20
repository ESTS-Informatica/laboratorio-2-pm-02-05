
/**
 * Write a description of class PropertyTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PropertyTest {

    @Test
    public void testConstructor() {
        // Fixture
        Property property1 = new Property("T3 Monte Belo", 150000.0);

        // Verification
        assertEquals("T3 Monte Belo", property1.getDescription());
        assertEquals(150000.0, property1.getPrice(), 0.001);
    }
    
    
    @Test
    public void testToString() {
        Property property1 = new Property("T3 Monte Belo", 150000.0);
        String expected = "Descrição: T3 Monte Belo\n Preço: 150000.0";
        assertEquals(expected, property1.toString());
    }

}
