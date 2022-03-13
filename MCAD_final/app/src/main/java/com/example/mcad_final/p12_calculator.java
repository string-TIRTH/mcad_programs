package com.example.mcad_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class p12_calculator extends AppCompatActivity {

    EditText num_et;
    TextView ans_tv;

    Button add_btn,cls_btn;

    int sum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p12_calculator);
        ans_tv = findViewById(R.id.sum_tv);
        num_et = findViewById(R.id.number_input);
        add_btn = findViewById(R.id.add_btn);
        cls_btn = findViewById(R.id.clear_btn);

    }
    public void add_num(View view)
    {
        int temp = Integer.parseInt(num_et.getText().toString());
        sum = sum+temp;
        ans_tv.setText("Sum = "+sum);
    }public void clear_tv(View view)
    {
        sum=0;
        ans_tv.setText("Sum = "+sum);
    }
}