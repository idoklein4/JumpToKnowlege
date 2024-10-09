package com.example.jumptoknowlege;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_Account_recovery extends AppCompatActivity {
    Button btnAccept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_account_recovery);
        btnAccept = (Button) findViewById(R.id.btnAccept);
        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenet = new Intent(MainActivity_Account_recovery.this, MainActivity_Password_recovery.class);
                startActivity(intenet);
            }
        });
    }
}
