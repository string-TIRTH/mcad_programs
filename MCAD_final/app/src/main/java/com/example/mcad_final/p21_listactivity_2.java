package com.example.mcad_final;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class p21_listactivity_2 extends ListActivity {

    String[] country;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p21_listactivity2);

        country = new String[]{
                "1","2","3"
        };
        // setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,country));
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.rfile_p20, R.id.label,country));
    }
    public void onListItemClick(ListView parent, View v, int position, long id)
    {
        Toast.makeText(this, country[position], Toast.LENGTH_SHORT).show();
    }
}