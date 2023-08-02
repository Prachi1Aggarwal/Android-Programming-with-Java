package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcome_text, counter_text;
    Button btn;
    int counter=0;
    public int increment(){
        return ++counter;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= findViewById(R.id.btn);
        welcome_text= findViewById(R.id.textview);
        counter_text= findViewById(R.id.head);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                welcome_text.setText(""+increment());
            }
        });

    }
}