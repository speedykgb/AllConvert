package sg.com.kaplan.allconvert;

/**
 * Created by Mia on 6/11/2017.
 * The following code is the conversion rates for Temprature.
 */

public class Temp_Conversion {

    public double tempConvert(double originalNum, String originalUnit, String desiredUnit) {
        double num2 = 0.0d;
        double num3;

        String original = originalUnit.toLowerCase();
        String newU = desiredUnit.toLowerCase();

        switch (original) {
            case "celsius": { //Conversion from Celsius.
                switch (newU) {
                    case "celsius":
                        num2 = originalNum;
                        break;
                    case "fahrenheit":
                        num2 = (originalNum * (9.0 / 5.0)) + 32d;
                        break;
                    case "kelvin":
                        num2 = originalNum + 273.15d;
                        break;
                }
                break;
            }
            case "fahrenheit": //Conversion from Fahrenheit.
            {
                switch (newU) {
                    case "celsius":
                        num3 = (-originalNum - 32d);
                        num2 = num3 * (5.0 / 9.0);
                        break;
                    case "fahrenheit":
                        num2 = originalNum;
                        break;
                    case "kelvin":
                        num2 = ((originalNum - 32d) * (5.0 / 9.0)) + 273.15d;
                        break;
                }
                break;
            }
            case "kelvin": //Conversion from Kelvin.
            {
                switch (newU) {
                    case "celsius":
                        num2 = originalNum - 273.15d;
                        break;
                    case "fahrenheit":
                        num2 = ((originalNum - 273.15d) * (9.0 / 5.0)) + 32d;
                        break;
                    case "kelvin":
                        num2 = originalNum;
                        break;
                }
                break;
            }
        }

        return num2; //Conversion result from the above calculations.
    }
}
