package sg.edu.rp.soi.c347.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDone = (Button) findViewById(R.id.buttonDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // Get the EditText that user keys in name
                RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1);
                // Get the EditText that user keys in age
                RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2);
                RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3);
                RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4);
                RadioButton rb5 = (RadioButton) findViewById(R.id.radioButton5);
                // Put the name and age into an array
                String[] info = {rb1.getText().toString(),
                        rb2.getText().toString(),
                rb3.getText().toString(),
                rb4.getText().toString(),
                rb5.getText().toString()};
                // Create an intent to start another activity called
                //  DemoActivities (which we would create later)
                Intent i = new Intent(MainActivity.this,
                        secondAcitivty.class);
                // Pass the String array holding the name & age to new activity
                i.putExtra("info", info);
                // Start the new activity
                startActivity(i);
            }
        });
    }
}