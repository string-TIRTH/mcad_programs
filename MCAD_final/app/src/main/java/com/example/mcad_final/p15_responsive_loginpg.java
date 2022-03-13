package com.example.mcad_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class p15_responsive_loginpg extends AppCompatActivity {

    TextView tv;
    EditText uname,pass;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p15_responsive_loginpg);
        tv = findViewById(R.id.tv);
        btn = findViewById(R.id.login_btn);
        uname= findViewById(R.id.username);
        pass = findViewById(R.id.password);
    }
    public void Login(View view)
    {
        String username,password;
        username = uname.getText().toString().trim();
        password = pass.getText().toString().trim();
        if(username.equals("Admin"))
        {
            if(password.equals("1234"))
            {
                tv.setText("Login Successful :");
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Login Failed :",Toast.LENGTH_SHORT).show();

            }
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Login Failed :",Toast.LENGTH_SHORT).show();
        }
    }
}