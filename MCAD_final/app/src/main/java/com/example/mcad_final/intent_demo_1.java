package com.example.mcad_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class intent_demo_1 extends AppCompatActivity {
    EditText et;
    TextView tv;
    Button b;
    String msg;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_demo1);
        et = findViewById(R.id.et_intent_d_1);
        tv = findViewById(R.id.tv_intent_d_1);
        b = findViewById(R.id.b_intent_d_1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new
                        Intent(getApplicationContext(),intent_demo_2.class);
                startActivityForResult(intent, 2);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==2)
        {
            String message=data.getStringExtra("MESSAGE");
            tv.setText(message);
        }
    }
}




//    Intent i = new Intent();
//        i = getIntent();
//                bundle = i.getExtras();
//                str = bundle.getString("msg");
//                msg.setText(""+str)
//
//                ;