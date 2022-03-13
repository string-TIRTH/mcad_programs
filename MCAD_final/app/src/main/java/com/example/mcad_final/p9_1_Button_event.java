package com.example.mcad_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class p9_1_Button_event extends AppCompatActivity {
    int count = 0;
    TextView ctv;
    Button mbtn,pbtn,zbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p9_1_button_event);
        ctv = findViewById(R.id.count_tv);
        mbtn = findViewById(R.id.btnm1);
        pbtn = findViewById(R.id.btnp1);
        zbtn = findViewById(R.id.btn0);
        pbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                ctv.setText("Count :"+count);
            }
        });
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                ctv.setText("Count :"+count);
            }
        });
        zbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                ctv.setText("Count :"+count);
            }
        });
    }
}