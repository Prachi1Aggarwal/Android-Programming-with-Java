package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    TextView heading_text,answer;
    Button btn;
    EditText input_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.button);
        heading_text=findViewById(R.id.text);
        answer= findViewById(R.id.ans);
        input_text= findViewById(R.id.value);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double kilos_entered= Double.parseDouble(input_text.getText().toString());
                answer.setText(""+convertToPounds(kilos_entered)+"lb");
            }
        });
    }
    public double convertToPounds(double kilos){
        double value_result = kilos*2.0462;
        return value_result;
    }
}