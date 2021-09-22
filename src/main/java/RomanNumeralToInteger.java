import org.json.simple.JSONArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RomanNumeralToInteger {

    public String[] listNumerals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public int[] listInteger = {1000,900,500,400,100,90,50,40,10,9,5,4,1};


    public String convertNumberToRomannumeral (int numberToBeConverted) {
        String result = "";

        for (int i = 0; i < listInteger.length; i++) {
            int numbersOfSymbols = numberToBeConverted / listInteger[i];
            if (numbersOfSymbols != 0) result += listNumerals[i].repeat(numbersOfSymbols);
            numberToBeConverted %= listInteger[i];
        }

        return result;
    }

}
