package sg.com.kaplan.allconvert;

import java.text.NumberFormat;

import static android.R.attr.x;

/**
 * Created by Mia on 6/11/2017.
 * The following code is the conversion rates for Length.
 */

public class Length_Conversion {

    public Length_Conversion() { //No global variable are used.

    }

    public double lengthConvert(double originalNum, String originalUnit, String desiredUnit) {

        double num1 = originalNum;
        double num2 = 0.0d;

        String original = originalUnit.toLowerCase();
        String newU = desiredUnit.toLowerCase();


        switch (original) {
            case "millimeters": { //Conversion from Millimeters.
                switch (newU) {
                    case "inches":
                        num2 = num1 * 25.4d;
                        break;
                    case "feet":
                        num2 = num1 / 304.8d;
                        break;
                    case "yards":
                        num2 = num1 / 914.4d;
                        break;
                    case "miles":
                        num2 = num1 / 1609000.0d;
                        break;
                    case "millimeters":
                        num2 = num1;
                        break;
                    case "centimeters":
                        num2 = num1 / 10;
                        break;
                    case "meters":
                        num2 = num1 / 1000;
                        break;
                    case "kilometers":
                        num2 = num1 / 1000000;
                        break;
                }
                break;
            }

            case "centimeters": { //Conversion from Centimeters.
                switch (newU) {
                    case "inches":
                        num2 = num1 / 2.54d;
                        break;
                    case "feet":
                        num2 = num1 / 30.48d;
                        break;
                    case "yards":
                        num2 = num1 / 91.44d;
                        break;
                    case "miles":
                        num2 = num1 / 160934.0d;
                        break;
                    case "millimeters":
                        num2 = num1 * 10;
                        break;
                    case "centimeters":
                        num2 = num1;
                        break;
                    case "meters":
                        num2 = num1 / 100;
                        break;
                    case "kilometers":
                        num2 = num1 / 100000;
                        break;
                }
                break;
            }

            case "meters": { //Conversion from Meters.
                switch (newU) {
                    case "inches":
                        num2 = num1 * 39.3701d;
                        break;
                    case "feet":
                        num2 = num1 * 3.28084d;
                        break;
                    case "yards":
                        num2 = num1 * 1.09361d;
                        break;
                    case "miles":
                        num2 = num1 / 1609.34d;
                        break;
                    case "millimeters":
                        num2 = num1 * 1000;
                        break;
                    case "centimeters":
                        num2 = num1 * 100;
                        break;
                    case "meters":
                        num2 = num1;
                        break;
                    case "kilometers":
                        num2 = num1 * 1000;
                        break;
                }
                break;
            }

            case "kilometers": { //Conversion from Kilometers.
                switch (newU) {
                    case "inches":
                        num2 = num1 * 39370.1d;
                        break;
                    case "feet":
                        num2 = num1 * 3280.84d;
                        break;
                    case "yards":
                        num2 = num1 * 1093.61d;
                        break;
                    case "miles":
                        num2 = num1 / 1.60934d;
                        break;
                    case "millimeters":
                        num2 = num1 * 1000000;
                        break;
                    case "centimeters":
                        num2 = num1 * 100000;
                        break;
                    case "meters":
                        num2 = num1 * 1000;
                        break;
                    case "kilometers":
                        num2 = num1;
                        break;
                }
                break;
            }

            case "inches": { //Conversion from Inches.
                switch (newU) {
                    case "inches":
                        num2 = num1;
                        break;
                    case "feet":
                        num2 = num1 / 12.0d;
                        break;
                    case "yards":
                        num2 = num1 / 36.0d;
                        break;
                    case "miles":
                        num2 = num1 / 63360.0d;
                        break;
                    case "millimeters":
                        num2 = num1 * 25.4d;
                        break;
                    case "centimeters":
                        num2 = num1 * 2.54d;
                        break;
                    case "meters":
                        num2 = num1 * 0.0254d;
                        break;
                    case "kilometers":
                        num2 = num1 * 0.0000254d;
                        break;
                }
                break;
            }

            case "feet": { //Conversion from Feet.
                switch (newU) {
                    case "inches":
                        num2 = num1 * 12.0d;
                        break;
                    case "feet":
                        num2 = num1;
                        break;
                    case "yards":
                        num2 = num1 / 3.0d;
                        break;
                    case "miles":
                        num2 = num1 / 5280.0d;
                        break;
                    case "millimeters":
                        num2 = num1 * 304.8d;
                        break;
                    case "centimeters":
                        num2 = num1 * 30.48d;
                        break;
                    case "meters":
                        num2 = num1 * 0.3048d;
                        break;
                    case "kilometers":
                        num2 = num1 * 0.0003048d;
                        break;
                }
                break;
            }

            case "yards": { //Conversion from Yards.
                switch (newU) {
                    case "inches":

                        num2 = num1 * 36.0d;
                        break;
                    case "feet":

                        num2 = num1 * 3.0d;
                        break;
                    case "yards":
                        num2 = num1;
                        break;
                    case "miles":
                        num2 = num1 / 1760.0d;
                        break;
                    case "millimeters":
                        num2 = num1 * 914.4d;
                        break;
                    case "centimeters":
                        num2 = num1 * 91.44d;
                        break;
                    case "meters":
                        num2 = num1 * 0.9144d;
                        break;
                    case "kilometers":
                        num2 = num1 / 1093.61d;
                        break;
                }
                break;
            }

            case "miles": { //Conversion from Miles.
                switch (newU) {
                    case "inches":

                        num2 = num1 * 6330.0d;
                        break;
                    case "feet":
                        num2 = num1 * 5280.0d;
                        break;
                    case "yards":
                        num2 = num1 * 1760.0d;
                        break;
                    case "miles":
                        num2 = num1;
                        break;
                    case "millimeters":
                        num2 = num1 * 1609340.0d;
                        break;
                    case "centimeters":
                        num2 = num1 * 160934.0d;
                        break;
                    case "meters":
                        num2 = num1 * 1609.34d;
                        break;
                    case "kilometers":
                        num2 = num1 * 1.60934d;
                        break;
                }
                break;
            }
        }

        return num2; //Conversion result from the above calculations.
    }

}