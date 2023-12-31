package com.example.sharedpreference;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,mob,email;
    RadioGroup gender;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name1);
        email = (EditText) findViewById(R.id.email);
        mob = (EditText) findViewById(R.id.phno);
        gender = (RadioGroup) findViewById(R.id.radioGroup);



    }
    protected void onPause() {

        super.onPause();
        SharedPreferences sharedpreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedpreferences.edit();
        myEdit.putString("name",name.getText().toString());
        myEdit.putString("email",email.getText().toString());
        myEdit.putString("mobile",mob.getText().toString());
        myEdit.putInt("gender", gender.getCheckedRadioButtonId());
        myEdit.apply();

    }
    protected void onResume() {

        super.onResume();
        SharedPreferences sh = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        name.setText(sh.getString("name",""));
        email.setText(sh.getString("email",""));
        mob.setText(sh.getString("mobile",""));
        gender.check(sh.getInt("gender",-1));

    }
}

