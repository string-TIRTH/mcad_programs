package com.example.mcad_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class p16_AutocompleteTV extends AppCompatActivity {

    String[] city_name={
            "Nadiad","Vallabh VidhyaNagar","Anand","Surat"
    };
    AutoCompleteTextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p16_autocomplete_tv);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,city_name);
        textView = findViewById(R.id.autoComplete);
        textView.setThreshold(1);
        textView.setAdapter(arrayAdapter);
        textView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Object obj = adapterView.getAdapter().getItem(i);
                Toast.makeText(getApplicationContext(),obj.toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}