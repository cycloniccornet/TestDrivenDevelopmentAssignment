import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralToIntegerTest {

    RomanNumeralToInteger romanNumeralToInteger = new RomanNumeralToInteger();



    @Test
    public void Should_Return_String_When_Given_Zero() {
        String convertedInt = romanNumeralToInteger.convertNumberToRomannumeral(0);

        assertEquals("", convertedInt);
    }

    @Test
    public void Should_Return_III_When_Given_Three() {
        String convertedInt = romanNumeralToInteger.convertNumberToRomannumeral(3);

        assertEquals("III", convertedInt);
    }


    @Test
    public void Should_Return_I_When_Given_Four() {
        String convertedInt = romanNumeralToInteger.convertNumberToRomannumeral(4);


        assertEquals("IV", convertedInt);
    }

    @Test
    public void Should_Return_V_When_Given_Five() {
        String convertedInt = romanNumeralToInteger.convertNumberToRomannumeral(5);


        assertEquals("V", convertedInt);
    }

    @Test
    public void Should_Return_CC_When_Given_TwoHundred() {
        String convertedInt = romanNumeralToInteger.convertNumberToRomannumeral(200);


        assertEquals("CC", convertedInt);
    }

    @Test
    public void Should_Return__When_Given_TwoHundred() {
        String convertedInt = romanNumeralToInteger.convertNumberToRomannumeral(983);

        assertEquals("CMLXXXIII", convertedInt);
    }

}