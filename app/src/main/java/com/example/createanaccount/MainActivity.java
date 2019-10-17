package com.example.createanaccount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    EditText repeatPass;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        email = findViewById(R.id.editTextE);
        password = findViewById(R.id.editTextCP);
        repeatPass = findViewById(R.id.editTextRP);
        next = findViewById(R.id.textsize);
        // button is listening or waiting for instruction




//        password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if (password.getText().toString() < 8) {
//                    return;
//                }
//                password.setText("khg");
//            }
//        });



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!eChecker(email.getText().toString())){
                    Toast.makeText(MainActivity.this, "wrong email", Toast.LENGTH_LONG).show();
                }
                else if (emptyChecker()){
                    Toast.makeText(MainActivity.this, "Can not leave blank box.", Toast.LENGTH_LONG).show();
                }
                else if (!passwordMatchChecker(password, repeatPass)){
                    Toast.makeText(MainActivity.this, "please use same password", Toast.LENGTH_SHORT).show();
                }
                else {
                    startActivity(new Intent(MainActivity.this, AndroidAssign1.class));
                }
            }

        });
    }


    public boolean eChecker(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    public boolean passwordMatchChecker(TextView p1, TextView p2) {
        if (p1.getText().toString().equals(p2.getText().toString())) return true;
        else return false;
    }

    public boolean emptyChecker() {
        if (email.getText().toString().isEmpty()
                || password.getText().toString().isEmpty()
                || repeatPass.getText().toString().isEmpty()) ;
        return false;

    }

}


