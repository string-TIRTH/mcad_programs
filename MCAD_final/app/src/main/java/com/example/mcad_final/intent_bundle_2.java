package com.example.mcad_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class intent_bundle_2 extends AppCompatActivity {

    Bundle bundle;
    TextView msg;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_bundle2);
        msg = findViewById(R.id.msg_intent_b_2);

        Intent i = new Intent();
        i = getIntent();
        bundle = i.getExtras();
        str = bundle.getString("msg");
        msg.setText(""+str);
    }
}