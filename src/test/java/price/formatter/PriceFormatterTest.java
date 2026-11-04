package price.formatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Write your tests for the PriceFormatter here. See the specification of the
 * PriceFormatter and formatPrice method in the PriceFormatter class and the
 * readme file.
 */
public class PriceFormatterTest {
   
    @Test
    void SetUp() {
        PriceFormatter formatter = new PriceFormatter();
    }

    
    @Test
    void TestingFormatter1() {
        PriceFormatter formatter = new PriceFormatter();
        assertEquals("3,14 €", formatter.formatPrice(3.141592653589793));
    }

    @Test
    void TestingFormatter2() {
        PriceFormatter formatter = new PriceFormatter();
        assertEquals("100 000 €", formatter.formatPrice(100000));
    }
    @Test
    void TestingFormatter3() {
        PriceFormatter formatter = new PriceFormatter();
        assertEquals("1 000 €", formatter.formatPrice(1000));
    }

    @Test
    void TestingFormatter4() {
        PriceFormatter formatter = new PriceFormatter();
        assertEquals("10,99 €", formatter.formatPrice(10.991));

    }

    @Test
    void TestingFormatter5() {
        PriceFormatter formatter = new PriceFormatter();
        String testi = formatter.formatPrice(1000);
        assertTrue(testi.endsWith(" €"));
        assertEquals("1 000 €", testi);

    }
}
