public class FahrenheitToCelciusConverter {



    public double convertToRealMeasuringUnit(double fahrenheit) {
        double celcius = 0.0;

        celcius = (fahrenheit - 32)* .5556;
        return celcius;
    }

    public double convertToVolapyk(double celcius) {
        double fahrenheit = 0.0;
        fahrenheit = celcius * 1.8 + 32;
        return fahrenheit;
    }




}
