package com.example.mcad_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class p9_3_button_event extends AppCompatActivity {

    EditText etdoller;
    TextView rup_dis;
    Button cbtn;
    int doller_rate = 70;
    int temp;
    float ans;
    boolean flag = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p9_3_button_event);

        etdoller = findViewById(R.id.doller_input);
        cbtn = findViewById(R.id.convert_btn);
        rup_dis = findViewById(R.id.rup_dis);
    }

    public void convert_money(View v)
    {
        temp = Integer.parseInt(etdoller.getText().toString());
        ans = doller_rate*temp;
        rup_dis.setText("Rupees = "+ans);
    }
}