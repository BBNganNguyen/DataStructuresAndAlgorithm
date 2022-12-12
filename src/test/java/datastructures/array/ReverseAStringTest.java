package datastructures.array;

import com.datastructures.array.ReverseAString;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ReverseAStringTest {
    @Test
    public void testReverseAString() {
        assertTrue("".equals(ReverseAString.reverseString("")));
        assertTrue("cba".equals(ReverseAString.reverseString("abc")));
        assertFalse("123".equals(ReverseAString.reverseString("123")));
    }


}
