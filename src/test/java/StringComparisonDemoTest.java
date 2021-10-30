import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class StringComparisonDemoTest {

    @Test
    @DisplayName("Test that i1 and i2 are equal")
    void testThati1Equali2() {
        assertEquals(StringComparisonDemo.i1, StringComparisonDemo.i2);
    }

    @Test
    @DisplayName("Test i1 and i3 are not equal")
    void testThati1NotEquali3() {
        assertNotEquals(StringComparisonDemo.i1, StringComparisonDemo.i3);
    }

}