package com.example.mcad_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Intent_bundle extends AppCompatActivity {

    EditText et;
    Button b;
    String msg;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_bundle);
        et = findViewById(R.id.et_intent_b_1);
        b = findViewById(R.id.b_intent_b_1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg = et.getText().toString();
                bundle = new Bundle();

                bundle.putString("msg",msg);
                Intent i = new Intent(getApplicationContext(),intent_bundle_2.class);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
    }
}