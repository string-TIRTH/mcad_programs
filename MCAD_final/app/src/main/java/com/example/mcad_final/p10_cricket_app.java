package com.example.mcad_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class p10_cricket_app extends AppCompatActivity {

    TextView ind_score,eng_score;
    Button ip1,ip2,ip3,ip4,ip6;
    Button ep1,ep2,ep3,ep4,ep6;
    Button reset_score;
    int india_score = 0;
    int england_score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p10_cricket_app);
        ip1 = findViewById(R.id.ind_1);
        ip2 = findViewById(R.id.ind_2);
        ip3 = findViewById(R.id.ind_3);
        ip4 = findViewById(R.id.ind_4);
        ip6 = findViewById(R.id.ind_6);

        ep1 = findViewById(R.id.eng_1);
        ep2 = findViewById(R.id.eng_2);
        ep3 = findViewById(R.id.eng_3);
        ep4 = findViewById(R.id.eng_4);
        ep6 = findViewById(R.id.eng_6);

        reset_score = findViewById(R.id.reset_score);

        ind_score = findViewById(R.id.ind_score);
        eng_score = findViewById(R.id.eng_score);
    }

    public void india(View v)
    {

        if(ip1.getId() == v.getId())
        {
            india_score++;
        }
        else if(ip2.getId() == v.getId())
        {
            india_score+=2;
        }
        else if(ip3.getId() == v.getId())
        {
            india_score+=3;
        }
        else if(ip4.getId() == v.getId())
        {
            india_score+=4;
        }
        else if(ip6.getId() == v.getId())
        {
            india_score+=6;
        }
        ind_score.setText(""+india_score);
    }
    public void england(View v)
    {

        if(ep1.getId() == v.getId())
        {
            england_score++;
        }
        else if(ep2.getId() == v.getId())
        {
            england_score+=2;
        }
        else if(ep3.getId() == v.getId())
        {
            england_score+=3;
        }
        else if(ep4.getId() == v.getId())
        {
            england_score+=4;
        }
        else if(ep6.getId() == v.getId())
        {
            england_score+=6;
        }

        eng_score.setText(""+england_score);
    }
    public void reset(View v)
    {
        india_score=0;
        england_score=0;
        ind_score.setText("0");
        eng_score.setText("0");
    }
}