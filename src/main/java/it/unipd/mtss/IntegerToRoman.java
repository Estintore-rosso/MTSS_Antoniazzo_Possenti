////////////////////////////////////////////////////////////////////
// Giovanni Possenti 2137987
// Cristiano Antoniazzo 2138489
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int numero) {

        if (numero < 1 || numero > 1000) {
            throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 1000");
        }

        int[] valori = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simboli = {
            "M", "CM", "D", "CD", "C", "XC",
            "L", "XL", "X", "IX", "V", "IV", "I"
        };
        
        String roman = "";
        
        for (int i = 0; i < valori.length; i++) {
            while (numero >= valori[i]) {
                roman += simboli[i];
                numero -= valori[i];
            }
        }
        
        return roman;
    }
}