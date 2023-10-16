import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

public class testing {
    @Test
    public void singleDigit() {
        assertEquals(1, new romaninteger().romanToInt("I"));
        assertEquals(5, new romaninteger().romanToInt("V"));
        assertEquals(10, new romaninteger().romanToInt("X"));
        assertEquals(50, new romaninteger().romanToInt("L"));
        assertEquals(100, new romaninteger().romanToInt("C"));
        assertEquals(500, new romaninteger().romanToInt("D"));
        assertEquals(1000, new romaninteger().romanToInt("M"));
    }

    @Test
    public void repetition() {
        assertEquals(2, new romaninteger().romanToInt("II"));
        assertEquals(20, new romaninteger().romanToInt("XX"));
        assertEquals(200, new romaninteger().romanToInt("CC"));
    }

    @Test
    public void manyLettersInOrder() {
        assertEquals(6, new romaninteger().romanToInt("VI"));
        assertEquals(15, new romaninteger().romanToInt("XV"));
    }
    @Test
    void SubtractiveNotation() {
            assertEquals(4, new romaninteger().romanToInt("IV"));
            assertEquals(14, new romaninteger().romanToInt("XIV"));
            }


@Test
    void FirstNumber() {
            assertEquals(1, new romaninteger().romanToInt("I"));
            }

@Test
    void InvalidLetter() {
            assertEquals(0, new romaninteger().romanToInt("W"));
            }

@Test
    void InvalidAndValidLetter() {
            assertEquals(0, new romaninteger().romanToInt("IZ"));
            }

@Test
    void InValid() {
            assertEquals(0, new romaninteger().romanToInt("ZZ"));
            }

@Test
    void testNull() {
            assertEquals(0, new romaninteger().romanToInt(null));
}
}