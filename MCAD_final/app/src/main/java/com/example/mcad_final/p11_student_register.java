package com.example.mcad_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class p11_student_register extends AppCompatActivity {

    EditText name,email,dep,rollno,hobbies,gender;
    Button btn;
    TextView tvname,tvdep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p11_student_register);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        dep = findViewById(R.id.dep);
        rollno = findViewById(R.id.rollno);
        hobbies = findViewById(R.id.hobbies);
        gender = findViewById(R.id.gender);

        tvname = findViewById(R.id.tvname);
        tvdep = findViewById(R.id.tvdep);
    }
    public void display(View v)
    {
        tvname.setText(name.getText().toString());
        tvdep.setText((dep.getText().toString()));
    }
}