package sg.edu.rp.c346.id22004686.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button but;
    EditText input;
    TextView display;
    ToggleButton tbtn;
    RadioGroup rgGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but = findViewById(R.id.display);
        input = findViewById(R.id.Input);
        display = findViewById(R.id.DisplayView);
        tbtn = findViewById(R.id.toggleButton);
        rgGender = findViewById(R.id.rgGenders);



        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(input.getText().toString());
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (tbtn.isChecked()){
                    input.setEnabled(true);
                } else {
                    input.setEnabled(false);
                }
            }
        });

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = "";
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.Male){
                    // Write the code when male selected
                    stringResponse +="He said";
                }
                else if(checkedRadioId == R.id.Female){
                    // Write the code when female selected
                    stringResponse+="She said";

                }
                display.setText(stringResponse+" "+ input.getText().toString());
            }
        });

    }
}