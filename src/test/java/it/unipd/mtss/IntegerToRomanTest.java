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
        //Arrange
        int numberToConvert = 1;
        String expectedRoman = "I";
        
        //Act
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        //Assert
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNumberTwoToRomanII() {
        //Arrange
        int numberToConvert = 2;
        String expectedRoman = "II";
        
        //Act
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        //Assert
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNumberThreeToRomanIII() {
        // Arrange
        int numberToConvert = 3;
        String expectedRoman = "III";
        
        //Act
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        //Assert
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

    @Test
    public void testConvertNumberThirtyNineToRomanXXXIX() {
        // Arrange
        int numberToConvert = 39;
        String expectedRoman = "XXXIX";
        
        // Act
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        // Assert
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNumberFortyToRomanXL() {
        // Arrange
        int numberToConvert = 40;
        String expectedRoman = "XL";
        
        // Act
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        // Assert
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNumberFortyFourToRomanXLIV() {
        // Arrange
        int numberToConvert = 44;
        String expectedRoman = "XLIV";
        
        // Act
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        // Assert
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNumberFortyNineToRomanXLIX() {
        // Arrange
        int numberToConvert = 49;
        String expectedRoman = "XLIX";
        
        // Act
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        // Assert
        assertEquals(expectedRoman, actualRoman);
    }

    @Test
    public void testConvertNumberFiftyToRomanL() {
        // Arrange
        int numberToConvert = 50;
        String expectedRoman = "L";
        
        // Act
        String actualRoman = IntegerToRoman.convert(numberToConvert);
        
        // Assert
        assertEquals(expectedRoman, actualRoman);
    }
}

