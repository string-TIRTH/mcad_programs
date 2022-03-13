package com.example.mcad_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class p13_1_checkbox_event extends AppCompatActivity {

    String msg="";
    CheckBox cb1,cb2,cb3;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p13_1_checkbox_event);
        cb1=findViewById(R.id.cricket);
        cb2 = findViewById(R.id.chess);
        cb3 = findViewById(R.id.ftball);
        tv = findViewById(R.id.games);
    }
    public void getmsg(View v)
    {
        if(cb1.isChecked())
        {
            msg=msg+" Cricket ";
        }
        if(!cb1.isChecked())
        {
            msg="";
        }
        if(cb2.isChecked())
        {
            msg= msg+" Chess ";
        }
        if(!cb2.isChecked() && !cb1.isChecked())
        {
            msg="";
        }
        if(cb3.isChecked())
        {
            msg= msg+" Football ";
        }
        if(!cb3.isChecked() && !cb2.isChecked() &&!cb1.isChecked())
        {
            msg="";
        }
        tv.setText(msg);
    }
}