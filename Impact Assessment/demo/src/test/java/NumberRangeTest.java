import com.example.NumberRange;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the NumberRange class.
 */
public class NumberRangeTest {

    /**
     * Tests the generateRangeList method with valid input.
     * Should return the expected result for valid input.
     */
    @Test
    public void generateRangeList_ValidInput_ShouldReturnExpectedResult() {
        NumberRange numberRange = new NumberRange();
        
        int[] numbers = {1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31};
        
        String expected = "1, 3, 6-8, 12-15, 21-24, 31";
        String result = numberRange.generateRangeList(numbers);

        assertEquals(expected, result, "Should return the expected result for valid input");
    }

    /**
     * Tests the generateRangeList method with empty input.
     * Should return an empty string for empty input.
     */
    @Test
    public void generateRangeList_EmptyInput_ShouldReturnEmptyString() {
        NumberRange numberRange = new NumberRange();
        
        int[] numbers = {};
        
        String expected = "";
        String result = numberRange.generateRangeList(numbers);

        assertEquals(expected, result, "Should return an empty string for empty input");
    }

    /**
     * Tests the generateRangeList method with single number input.
     * Should return a string with a single number for single number input.
     */
    @Test
    public void generateRangeList_SingleNumberInput_ShouldReturnSingleNumberString() {
        NumberRange numberRange = new NumberRange();
        
        int[] numbers = {42};
        
        String expected = "42";
        String result = numberRange.generateRangeList(numbers);

        assertEquals(expected, result, "Should return a string with a single number for single number input");
    }
}
