package com.example.createanaccount;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class AndroidAssign1 extends AppCompatActivity {
    EditText name ;
    EditText userName;
    EditText Password ;
    ImageButton imageButton;
    Button changePhoto;

    Button birthDate;
    TextView age;
    Spinner country;

    TextView gender;
    RadioButton female;
    RadioButton male;
    RadioButton notSpecified;
    EditText postal;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_assign1);

        name = findViewById(R.id.editTextName);
        userName = findViewById(R.id.editTextUsername);
        Password = findViewById(R.id.editTextPassword);
        imageButton = findViewById(R.id.imageButton);
        changePhoto = findViewById(R.id.buttonChangePhoto);

        birthDate = findViewById(R.id.buttonBirthDate);
        age = findViewById(R.id.textViewAge);
        country = findViewById(R.id.spinnerCountry);

        gender = findViewById(R.id.textViewGender);
        female = findViewById(R.id.radioButtonFemale);
        male = findViewById(R.id.radioButtonMale);
        notSpecified = findViewById(R.id.radioButtonNotSpecified);

        postal = findViewById(R.id.editTextPostalAdd);
        save = findViewById(R.id.buttonSave);

        changePhoto.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

            }
        });


    }
}
