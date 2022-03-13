package com.example.mcad_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class spinner_demo extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spin1;
    TextView tv;
    ArrayAdapter adapter;
    String items [] = {"item1","item2","item3","item1","item2","item3","item1","item2","item3","item1","item2","item1","item2","item3","item3","item1","item2","item3","item1","item2","item3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_demo);


         spin1 = findViewById(R.id.spinner1);
         tv = findViewById(R.id.tv_spinner);
        spin1.setOnItemSelectedListener(this);

        adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,items);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);



        spin1.setAdapter(adapter);
    }
    public void onItemSelected(AdapterView<?> arg0, View
            arg1, int position, long id) {
        Toast.makeText(getApplicationContext(),items[position]
                ,Toast.LENGTH_LONG).show();
        tv.setText(items[position]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}