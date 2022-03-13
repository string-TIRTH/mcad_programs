package com.example.mcad_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class p19_listview extends AppCompatActivity {

    ListView listView;
    String[] subjects = new String[] {
            "mcad","ajp","nma","ppdb"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p19_listview);
        listView = findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_2,android.R.id.text2,subjects);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item =(String) listView.getItemAtPosition(i);
                Toast.makeText(getApplicationContext(),item,Toast.LENGTH_SHORT).show();
            }
        });
    }
}