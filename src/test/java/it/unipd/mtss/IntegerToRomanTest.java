////////////////////////////////////////////////////////////////////
// Giovanni Possenti 2137987
// Cristiano Antoniazzo 2138489
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvertNumberOneToRomanI() {

        int numberToConvert = 1;
        String expectedRoman = "I";
        
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNumberTwoToRomanII() {

        int numberToConvert = 2;
        String expectedRoman = "II";
        
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNumberThreeToRomanIII() {

        int numberToConvert = 3;
        String expectedRoman = "III";
        
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        assertEquals(expectedRoman, actualRoman);
    }
}