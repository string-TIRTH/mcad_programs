package com.example.mcad_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class p17_autocompleteTV_btn extends AppCompatActivity {

    String[] city_name = {
            "Nadiad", "Vallabh VidhyaNagar", "Anand", "Surat"
    };
    AutoCompleteTextView textView;
    TextView tv;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p17_autocomplete_tv_btn);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, city_name);
        textView = findViewById(R.id.autoComplete);
        btn = findViewById(R.id.ok_btn);
        tv = findViewById(R.id.tv_label);
        textView.setThreshold(1);
        textView.setAdapter(arrayAdapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cityname = textView.getText().toString();
                tv.setText(cityname);
            }
        });
    }
}