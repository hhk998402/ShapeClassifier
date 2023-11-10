import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeClassifierTest {

    ShapeClassifier s;

    @BeforeEach
    public void setup() {
        s = new ShapeClassifier();
    }

    /**
     * This is an example test 
     */
    @DisplayName("Example Test")
    @Test
    public void example() {
        String answer = s.evaluateGuess("Equilateral,Large,Yes,100,100,100");
        assertEquals("Yes", answer);
    }

    @DisplayName("Test for valid square")
    @Test
    public void testValidSquare() {
        String answer = s.evaluateGuess("Square,Small,No,1,1,1,1");
        assertEquals("Yes", answer);

    }


}
