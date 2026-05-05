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

    @Test
    public void testConvertNumberFourToRomanIV() {
        // Arrange
        int numberToConvert = 4;
        String expectedRoman = "IV";
        
        // Act
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        // Assert
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNumberFiveToRomanV() {
        // Arrange
        int numberToConvert = 5;
        String expectedRoman = "V";
        
        // Act
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        // Assert
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNumberSixToRomanVI() {
        // Arrange
        int numberToConvert = 6;
        String expectedRoman = "VI";
        
        // Act
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        // Assert
        assertEquals(expectedRoman, actualRoman);
    }
    @Test
    public void testConvertNumberSevenToRomanVII() {
        // Arrange
        int numberToConvert = 7;
        String expectedRoman = "VII";
        
        // Act
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        // Assert
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNumberEightToRomanVIII() {
        // Arrange
        int numberToConvert = 8;
        String expectedRoman = "VIII";
        
        // Act
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        // Assert
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNumberNineToRomanIX() {
        // Arrange
        int numberToConvert = 9;
        String expectedRoman = "IX";
        
        // Act
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        // Assert
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNumberTenToRomanX() {
        // Arrange
        int numberToConvert = 10;
        String expectedRoman = "X";
        
        // Act
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        // Assert
        assertEquals(expectedRoman, actualRoman);
    }
    @Test
    public void testConvertNumberFourteenToRomanXIV() {
        // Arrange
        int numberToConvert = 14;
        String expectedRoman = "XIV";
        
        // Act
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        // Assert
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNumberNineteenToRomanXIX() {
        // Arrange
        int numberToConvert = 19;
        String expectedRoman = "XIX";
        
        // Act
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        // Assert
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNumberTwentyToRomanXX() {
        // Arrange
        int numberToConvert = 20;
        String expectedRoman = "XX";
        
        // Act
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        // Assert
        assertEquals(expectedRoman, actualRoman);
    }
}

