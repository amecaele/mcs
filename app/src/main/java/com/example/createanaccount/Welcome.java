package com.example.createanaccount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Welcome extends AppCompatActivity {
    Button createanaccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        createanaccount = findViewById(R.id.buttonCreateanaccount);

        createanaccount.setOnClickListener(o->{
            startActivity(new Intent(Welcome.this, MainActivity.class));
        });

    }

}
