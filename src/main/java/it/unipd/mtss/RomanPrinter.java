////////////////////////////////////////////////////////////////////
// Giovanni Possenti 2137987
// Cristiano Antoniazzo 2138489
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber.length() == 1) {
            String[] asciiChar = getAsciiLetter(romanNumber.charAt(0));
            return String.join("\n", asciiChar) + "\n";
        }
        return "";
    }

    private static String[] getAsciiLetter(char letter) {
        switch (letter) {
            case 'I': return new String[] {
                " _____  ",
                "|_   _| ",
                "  | |   ",
                "  | |   ",
                " _| |_  ",
                "|_____| "
            };
            case 'V': return new String[] {
                "__      __ ",
                "\\ \\    / / ",
                " \\ \\  / /  ",
                "  \\ \\/ /   ",
                "   \\  /    ",
                "    \\/     "
            };
            case 'X': return new String[] {
                "__   __ ",
                "\\ \\ / / ",
                " \\ V /  ",
                "  > <   ",
                " / . \\  ",
                "/_/ \\_\\ "
            };
            case 'L': return new String[] {
                " _       ",
                "| |      ",
                "| |      ",
                "| |      ",
                "| |____  ",
                "|______| "
            };
            case 'C': return new String[] {
                "  _____  ",
                " / ____| ",
                "| |      ",
                "| |      ",
                "| |____  ",
                " \\_____| "
            };
            case 'D': return new String[] {
                " _____   ",
                "|  __ \\  ",
                "| |  | | ",
                "| |  | | ",
                "| |__| | ",
                "|_____/  "
            };
            case 'M': return new String[] {
                " __  __  ",
                "|  \\/  | ",
                "| \\  / | ",
                "| |\\/| | ",
                "| |  | | ",
                "|_|  |_| "
            };
            default: return new String[] {"", "", "", "", "", ""};
        }
    }                   
}