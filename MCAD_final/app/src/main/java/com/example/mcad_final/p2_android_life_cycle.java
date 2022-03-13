package com.example.mcad_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class p2_android_life_cycle extends AppCompatActivity {

    String str="";
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2_android_life_cycle);
        tv = findViewById(R.id.tv_p2);
    }
    public void onStart()
    {
        super.onStart();
        str = str + "onStart called : ";
        tv.setText(str);

    }
    public void onPause()
    {
        super.onPause();
        str = str + "onPause called : ";
        tv.setText(str);
    }
    public void onRestart()
    {
        super.onRestart();
        str = str + "onRestart called : ";
        tv.setText(str);
    }
    public void onResume()
    {
        super.onResume();
        str = str + "onResume called : ";
        tv.setText(str);
    }
    public void onStop()
    {
        super.onStop();
        str = str + "onStop called : ";
        tv.setText(str);
    }
    public void onDestroy()
    {
        super.onDestroy();
        str = "";
        str = str + "onDestroy called : ";
        tv.setText(str);
    }
}