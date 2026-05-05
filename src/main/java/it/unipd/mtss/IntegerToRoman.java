////////////////////////////////////////////////////////////////////
// [Giovanni] [Possenti] [2137987]
// [Cristiano] [Antoniazzo] 2138489]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {
        String roman = "";
        
        while (number >= 1) {
            roman += "I";
            number -= 1;
        }
        
        return roman;
    }
}