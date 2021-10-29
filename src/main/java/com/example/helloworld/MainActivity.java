package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;


// Note: 'implements View.OnClickListener' is required for class to receive button clicks.
// If no OnClickListener implemented for class, pressing 'Email valid?' button would be ignored.
public class MainActivity extends AppCompatActivity
        implements View.OnClickListener
{
    // 1 - private Button 'celciusToKelvinButton'
    // Note: Rename the button in app/res/activity_main
    private Button celsiusToKelvinButton;

    // 2 - private TextView kelvinTextView;
    // Note: Rename the button in app/res/activity_main
    private TextView kelvinTextView;

    // 3 - private TextInputEditText kelvinTextInput;
    // Note: Rename the button in app/res/activity_main
    private TextInputEditText kelvinTextInput;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // Call parent class function of same name
        super.onCreate(savedInstanceState);

        // Show display in app/res/activity_main
        setContentView(R.layout.activity_main);

        // 4 - Float k = Helpers.celciusToKelvin("100");
        Float k = Helpers.c2k(100);

        // Sanity check. Log result to console to ensure our function is working.
        // 5- Log.d("Celsius to Kelvin", Float.toString(a));
        Log.d("Celsius to Kelvin", Float.toString(k));

        // Get reference to button
        // 6 - celciusToKelvinButton = findViewById(R.id.celciusToKelvinButton);
        celsiusToKelvinButton = findViewById(R.id.celsiusToKelvinButton);

        celsiusToKelvinButton.setOnClickListener(this);

        // Get reference to text view so we can change text displayed
        // 7 - kelvinTextView = findViewById(R.id.kelvinTextView);
        kelvinTextView = findViewById(R.id.kelvinTextView);

        // Get reference to user input field
        // 8 - kelvinTextInput = findViewById(R.id.kelvinTextInput);
        kelvinTextInput = findViewById(R.id.kelvinTextInput);
    }

    @Override
    public void onClick(View view)
    {
        // Get value user entered and convert to floating point number
        // 9 - Float k = Float.parseFloat(emailTextInputEditText.getText().toString());
       Float k = Float.parseFloat(kelvinTextInput.getText().toString());

        // Sanity check. Print value user entered to console.
        // 10 - Log.d("User entered", Float.toString(k));
        Log.d("User entered", Float.toString(k));

        // Display result (in Kelvin) on screen
        // 11 - kelvinTextView.setText(Float.toString(Helpers.c2k(k)));

            kelvinTextView.setText(Float.toString(Helpers.c2k(k)));
        }
    }
