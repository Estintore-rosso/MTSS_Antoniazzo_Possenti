////////////////////////////////////////////////////////////////////
// Giovanni Possenti 2137987
// Cristiano Antoniazzo 2138489
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class RomanPrinterTest {

    // ==========================================
    // TEST LETTERE SINGOLE
    // ==========================================

    @Test
    public void testPrintNumberOneToAsciiI() {
        // Arrange
        int number = 1;
        String expected = 
            " _____  \n" +
            "|_   _| \n" +
            "  | |   \n" +
            "  | |   \n" +
            " _| |_  \n" +
            "|_____| \n";
            
        // Act
        String actual = RomanPrinter.print(number);
        
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintNumberFiveToAsciiV() {
        // Arrange
        int number = 5;
        String expected = 
            "__      __ \n" +
            "\\ \\    / / \n" +
            " \\ \\  / /  \n" +
            "  \\ \\/ /   \n" +
            "   \\  /    \n" +
            "    \\/     \n";
            
        // Act
        String actual = RomanPrinter.print(number);
        
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintNumberTenToAsciiX() {
        // Arrange
        int number = 10;
        String expected = 
            "__   __ \n" +
            "\\ \\ / / \n" +
            " \\ V /  \n" +
            "  > <   \n" +
            " / . \\  \n" +
            "/_/ \\_\\ \n";
            
        // Act
        String actual = RomanPrinter.print(number);
        
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintNumberFiftyToAsciiL() {
        // Arrange
        int number = 50;
        String expected = 
            " _       \n" +
            "| |      \n" +
            "| |      \n" +
            "| |      \n" +
            "| |____  \n" +
            "|______| \n";
            
        // Act
        String actual = RomanPrinter.print(number);
        
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintNumberOneHundredToAsciiC() {
        // Arrange
        int number = 100;
        String expected = 
            "  _____  \n" +
            " / ____| \n" +
            "| |      \n" +
            "| |      \n" +
            "| |____  \n" +
            " \\_____| \n";
            
        // Act
        String actual = RomanPrinter.print(number);
        
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintNumberFiveHundredToAsciiD() {
        // Arrange
        int number = 500;
        String expected = 
            " _____   \n" +
            "|  __ \\  \n" +
            "| |  | | \n" +
            "| |  | | \n" +
            "| |__| | \n" +
            "|_____/  \n";
            
        // Act
        String actual = RomanPrinter.print(number);
        
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintNumberOneThousandToAsciiM() {
        // Arrange
        int number = 1000;
        String expected = 
            " __  __  \n" +
            "|  \\/  | \n" +
            "| \\  / | \n" +
            "| |\\/| | \n" +
            "| |  | | \n" +
            "|_|  |_| \n";
            
        // Act
        String actual = RomanPrinter.print(number);
        
        // Assert
        assertEquals(expected, actual);
    }

    
    //test eccezione
    @Test(expected = IllegalArgumentException.class)
    public void testPrintZeroThrowsException() {
        // Act
        RomanPrinter.print(0);
    }
}