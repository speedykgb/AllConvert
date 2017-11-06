package sg.com.kaplan.allconvert;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
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

import java.util.Stack;

public class Volume extends AppCompatActivity {

    //Instance variables for accessing spinners & textViews
    private Spinner spinner1, spinner2;
    private EditText textField1;
    private TextView textView;
    private Double number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Select listener
        AdapterView.OnItemSelectedListener onSpinner = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };

        setContentView(R.layout.volume);
        setSpinnerItems(); // To populate the spinners
        spinner1.setOnItemSelectedListener(onSpinner); //Listener activation
    }

    public void convertVolume(View view) {
        InputMethodManager inputManager = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);

        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);

        Volume_Conversion converter = new Volume_Conversion(); //field where user inputs number for conversion.
        textField1 = (EditText) findViewById(R.id.volume_input);
        String numStr = textField1.getText().toString();

        if (numStr.equals("")) {
            number = 0.0;
        } else if (numStr.equals(".")) {
            number = 0.0;
        } else if (numStr.contains("..")) {
            number = 0.0;
        } else {
            number = new Double(numStr);
        }


        textView = (TextView) findViewById(R.id.volume_textView3); //textview for displaying the result of the conversion.
        String originalUnits = spinner1.getSelectedItem().toString();
        String newUnits = spinner2.getSelectedItem().toString();
        Double finalNumber = converter.volumeConvert(number, originalUnits, newUnits); //input numbers & units into volume_convert class to get output
        String finalString = Double.toString(finalNumber); //Convert double to string for display
        textView.setText(finalString);
    }

    public void setSpinnerItems() {
        spinner1 = (Spinner) findViewById(R.id.volume_unit_spinner1);
        spinner2 = (Spinner) findViewById(R.id.volume_unit_spinner2);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, //get options from string array
                R.array.volume_units, android.R.layout.simple_spinner_item);
        // Define which layout to use when user is presented with conversion choices.
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
    }


}
