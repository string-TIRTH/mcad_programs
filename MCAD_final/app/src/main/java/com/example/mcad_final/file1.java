package com.example.mcad_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class file1 extends AppCompatActivity {

    ImageView img;
    Button hide,show,change;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file1);
        img = findViewById(R.id.img1);
        show = findViewById(R.id.show);
        hide = findViewById(R.id.hide);
        change = findViewById(R.id.change);
    }
    public void showf(View view) {
        img.setVisibility(View.VISIBLE);
    }
    public void hidef(View view) {
        img.setVisibility(View.INVISIBLE);
    }
    public void changef(View view) {
        if(count%2 ==0)
        img.setImageResource(R.drawable.ic_launcher_background);
        else
            img.setImageResource(R.drawable.ic_launcher_foreground);
        count++;
    }
}