package com.example.mcad_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class p13_2_checkbox_event extends AppCompatActivity {

    String msg="";
    CheckBox cb1,cb2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p13_2_checkbox_event);
        cb1=findViewById(R.id.mcad_cb);
        cb2 = findViewById(R.id.ajp_cb);
        tv = findViewById(R.id.tv_subject);
    }
    public void getmsg(View v)
    {
        if(cb1.isChecked())
        {
            msg=msg+" MCAD ";
        }
        if(!cb1.isChecked())
        {
            msg="";
        }
        if(cb2.isChecked())
        {
            msg= msg+" AJP ";
        }
        if(!cb2.isChecked() && !cb1.isChecked())
        {
            msg="";
        }
        tv.setText("Selected subjects : "+msg);
    }
}