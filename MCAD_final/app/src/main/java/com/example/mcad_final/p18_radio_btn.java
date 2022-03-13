package com.example.mcad_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class p18_radio_btn extends AppCompatActivity {

    RadioButton ce,ee,ec,me,civil;
    RadioGroup r_grp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p18_radio_btn);
        ce = findViewById(R.id.ce_dep);
        ee = findViewById(R.id.ee_dep);
        ec = findViewById(R.id.ec_dep);
        me = findViewById(R.id.me_dep);
        civil = findViewById(R.id.civil_dep);
        r_grp = findViewById(R.id.radio_grp);
        r_grp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i == ce.getId())
                {
                    Toast.makeText(getApplicationContext(),"Computer Department ",Toast.LENGTH_SHORT).show();
                }
                else if(i == ee.getId())
                {
                    Toast.makeText(getApplicationContext(),"Electrical Department",Toast.LENGTH_SHORT).show();
                }
                else if(i == ec.getId())
                {
                    Toast.makeText(getApplicationContext(),"Electrical Department",Toast.LENGTH_SHORT).show();
                }
                else if(i == me.getId())
                {
                    Toast.makeText(getApplicationContext(),"Mechanical Department",Toast.LENGTH_SHORT).show();
                }
                else if(i == civil.getId())
                {
                    Toast.makeText(getApplicationContext(),"Civil Department",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}