package sg.com.kaplan.allconvert;

/**
 * Created by Mia on 6/11/2017.
 * The following code is the conversion rates for an Area.
 */

public class Area_Conversion {

    public double areaConvert(double originalNumber, String originalUnit, String newUnit) {

        double num1 = originalNumber;
        double num2 = 0.0d;

        String originalU = originalUnit.toLowerCase();
        String newU = newUnit.toLowerCase();

        switch (originalU) {

            case "square inches": //Conversion from square inches.
                switch (newU) {
                    case "square inches":
                        num2 = num1;
                        break;
                    case "square feet":
                        num2 = num1 / 144.0d;
                        break;
                    case "square yards":
                        num2 = num1 / 1296.0d;
                        break;
                    case "square miles":
                        num2 = num1 / 4014000000.0d;
                        break;
                    case "acres":
                        num2 = num1 / 6273000.0d;
                        break;
                    case "square kilometers":
                        num2 = num1 / 1550000000.0d;
                        break;
                    case "square meters":
                        num2 = num1 / 1550.0d;
                        break;
                }
                break;
            case "square feet":  //Conversion from square feet.
                switch (newU) {
                    case "square inches":
                        num2 = num1 * 144.0d;
                        break;
                    case "square feet":
                        num2 = num1;
                        break;
                    case "square yards":
                        num2 = num1 / 9.0d;
                        break;
                    case "square miles":
                        num2 = num1 / 27880000.0d;
                        break;
                    case "acres":
                        num2 = num1 / 43560.0d;
                        break;
                    case "square kilometers":
                        num2 = num1 / 10760000.0d;
                        break;
                    case "square meters":
                        num2 = num1 / 10.7639d;
                        break;
                }
                break;
            case "square yards": //Conversion from square yards.
                switch (newU) {
                    case "square inches":
                        num2 = num1 * 1296.0d;
                        break;
                    case "square feet":
                        num2 = num1 * 9.0d;
                        break;
                    case "square yards":
                        num2 = num1;
                        break;
                    case "square miles":
                        num2 = num1 / 3098000.0d;
                        break;
                    case "acres":
                        num2 = num1 / 4840.0d;
                        break;
                    case "square kilometers":
                        num2 = num1 / 1196000.0d;
                        break;
                    case "square meters":
                        num2 = num1 / 1.19599d;
                        break;
                }
                break;
            case "square miles": //Conversion from square miles.
                switch (newU) {
                    case "square inches":
                        num2 = num1 * 4014000000.0d;
                        break;
                    case "square feet":
                        num2 = num1 * 27880000.0d;
                        break;
                    case "square yards":
                        num2 = num1 * 3098000.0d;
                        break;
                    case "square miles":
                        num2 = num1;
                        break;
                    case "acres":
                        num2 = num1 * 640.0d;
                        break;
                    case "square kilometers":
                        num2 = num1 * 2.58999d;
                        break;
                    case "square meters":
                        num2 = num1 * 2590000.0d;
                        break;
                }
                break;
            case "acres": //Conversion from acers.
                switch (newU) {
                    case "square inches":
                        num2 = num1 * 6273000.0d;
                        break;
                    case "square feet":
                        num2 = num1 * 43560.0d;
                        break;
                    case "square yards":
                        num2 = num1 * 4840.0d;
                        break;
                    case "square miles":
                        num2 = num1 / 640.0d;
                        break;
                    case "square acres":
                        num2 = num1;
                        break;
                    case "square kilometers":
                        num2 = num1 / 247.105d;
                        break;
                    case "square meters":
                        num2 = num1 * 4046.86d;
                        break;
                }
                break;
            case "kilo": //Conversion from square kilometers.
                switch (newU) {
                    case "square inches":
                        num2 = num1 * 1550000000.0d;
                        break;
                    case "square feet":
                        num2 = num1 * 10760000.0d;
                        break;
                    case "square yards":
                        num2 = num1 * 1196000.0d;
                        break;
                    case "square miles":
                        num2 = num1 / 2.58999d;
                        break;
                    case "acres":
                        num2 = num1;
                        break;
                    case "square kilometers":
                        num2 = num1;
                        break;
                    case "square meters":
                        num2 = num1 * 1000000.0d;
                        break;
                }
                break;
            case "square meters": //Conversion from square meters.
                switch (newU) {
                    case "square inches":
                        num2 = num1 * 1550.0d;
                        break;
                    case "square feet":
                        num2 = num1 * 10.7639d;
                        break;
                    case "square yards":
                        num2 = num1 * 1.19599d;
                        break;
                    case "square miles":
                        num2 = num1 / 2590000.0d;
                        break;
                    case "acres":
                        num2 = num1 / 4046.86d;
                        break;
                    case "square kilometers":
                        num2 = num1 / 1000000.0d;
                        break;
                    case "square meters":
                        num2 = num1;
                        break;
                }
        }

        return num2; //Conversion result from the above calculations.
    }
}