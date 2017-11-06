package sg.com.kaplan.allconvert;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Mia on 6/11/2017.
 * The following code is the conversion rates for Weight.
 */

public class Weight_Conversion {

    public Weight_Conversion() { //No global variable are used.
    }

    public double weightConvert(double originalNum, String originalUnit, String desiredUnit) {

        double num1 = originalNum;
        double num2 = 0.0d;

        String original = originalUnit.toLowerCase();
        String newU = desiredUnit.toLowerCase();

        switch (original) {
            case "milligrams": //Conversion from Milligrams.
                switch (newU) {
                    case "pounds":
                        num2 = originalNum * .0000022046d;
                        break;
                    case "kilograms":
                        num2 = num1 / 1000000;
                        break;
                    case "grams":
                        num2 = num1 / 1000;
                        break;
                    case "milligrams":
                        num2 = originalNum;
                        break;
                }
                break;

            case "grams": //Conversion from Grams.
                switch (newU) {
                    case "pounds":
                        num2 = originalNum * 2.20462d;
                        break;
                    case "kilograms":
                        num2 = num1 / 1000000;
                        break;
                    case "grams":
                        num2 = originalNum;
                        break;
                    case "milligrams":
                        num2 = num1 * 1000;
                        break;
                }
                break;

            case "kilograms": //Conversion from Kilograms.
                switch (newU) {
                    case "pounds":
                        num2 = originalNum * 2.20462d;
                        break;
                    case "kilograms":
                        num2 = originalNum;
                        break;
                    case "grams":
                        num2 = num1 / 453.592d;
                        break;
                    case "milligrams":
                        num2 = num1 * 1000000;
                        break;
                }
                break;

            case "pounds":
                switch (newU) {
                    case "pounds":
                        num2 = originalNum;
                        break;
                    case "kilograms":
                        num2 = originalNum * 0.453592d;
                        break;
                    case "grams":
                        num2 = originalNum * 453.592d;
                        break;
                    case "milligrams":
                        num2 = originalNum * 453592.0d;
                        break;
                }
                break;
        }
        return num2; //Conversion result from the above calculations.
    }
}
