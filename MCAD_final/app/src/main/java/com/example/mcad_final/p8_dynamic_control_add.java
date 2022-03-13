package com.example.mcad_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class p8_dynamic_control_add extends AppCompatActivity {
    Button addnew, reset;
    LinearLayout llMain;
    TextView textView;
    Boolean flag = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p8_dynamic_control_add);
        addnew = findViewById(R.id.add_tv);
        reset = findViewById(R.id.reset);
        llMain = findViewById(R.id.ll_1);
    }

    public void add_textview(View v) {
        if (flag)
        {
            textView = new TextView(this);
            textView.setText("I am added dynamically to the view");
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT
            );
            textView.setLayoutParams(params);
            llMain.addView(textView);
            flag = false;
        }
    }
    public void remove_textview(View v)
    {
        llMain.removeView(textView);
        flag = true;
    }
}