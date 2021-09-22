import org.junit.jupiter.api.Test;


import java.util.Formatter;

import static org.junit.jupiter.api.Assertions.*;


public class FahrenheitToCelciusConverterTest {
    FahrenheitToCelciusConverter fahrenheitToCelciusConverter = new FahrenheitToCelciusConverter();

// F -> C
    @Test
    void Should_Return_Zero_Celius_When_Given_Thirty_Two_Fahrenheit() {
        double value = fahrenheitToCelciusConverter.convertToRealMeasuringUnit(32);
        assertEquals(0.0, value);
    }


    @Test
    void Should_Return_Ten_Celius_When_Given_Fifty_Fahrenheit() {
        double value = fahrenheitToCelciusConverter.convertToRealMeasuringUnit(50);
        String roundedvalue = String.format("%.0f", value);
        assertEquals(10, Double.parseDouble(roundedvalue));
    }

    @Test
    void Should_Return_thirtyeight_Celius_When_Given_Onehundred_Fahrenheit() {
        double value = fahrenheitToCelciusConverter.convertToRealMeasuringUnit(100);
        String roundedvalue = String.format("%.0f", value);
        assertEquals(38, Double.parseDouble(roundedvalue));
    }

    @Test
    void Should_Return_NegativeTwelve_Celius_When_Given_Onehundred_Fahrenheit() {
        double value = fahrenheitToCelciusConverter.convertToRealMeasuringUnit(10);
        String roundedvalue = String.format("%.0f", value);
        assertEquals(-12, Double.parseDouble(roundedvalue));
    }

// C -> F

    @Test
    void Should_Return_NegativeFour_Fahrenheit_When_Given_NegativeTwenty_Celcius() {
        double value = fahrenheitToCelciusConverter.convertToVolapyk(-20);
        assertEquals(-4, value);
    }

    @Test
    void Should_Return_Fifthy_Fahrenheit_When_Given_10_Celcius() {
        double value = fahrenheitToCelciusConverter.convertToVolapyk(10);
        assertEquals(50, value);
    }

    @Test
    void Should_Return_NegativeFour_Fahrenheit_When_Given_OneHudnred_Celcius() {
        double value = fahrenheitToCelciusConverter.convertToVolapyk(100);
        assertEquals(212, value);
    }

}
