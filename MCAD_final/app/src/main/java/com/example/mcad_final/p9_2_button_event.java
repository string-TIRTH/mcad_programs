package com.example.mcad_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class p9_2_button_event extends AppCompatActivity {
    EditText et1,et2;
    TextView tv;
    Button concat;
    String s1,s2,s3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p9_2_button_event);
        et1 = findViewById(R.id.ed1);
        et2 = findViewById(R.id.ed2);
        tv = findViewById(R.id.string3);
        concat =findViewById(R.id.concat_btn);
        concat.setOnClickListener(concat_str);
    }
    View.OnClickListener concat_str = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            s1 = et1.getText().toString();
            s2 = et2.getText().toString();
            s3 = s1 + " "+s2;
            tv.setText(s3);
        }
    };
}