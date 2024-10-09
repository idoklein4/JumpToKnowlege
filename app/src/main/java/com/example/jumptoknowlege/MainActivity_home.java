package com.example.jumptoknowlege;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_home extends AppCompatActivity {
    Button btnLogin;
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);
        btnLogin =(Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener()

                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intenet = new Intent(MainActivity_home.this, MainActivity_login.class);
                        startActivity(intenet);
                    }
                });
        btnRegister =(Button)findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v)
            {
                Intent intenet = new Intent(MainActivity_home.this, MainActivity_register.class);
                startActivity(intenet);
            }
        });


    }
}