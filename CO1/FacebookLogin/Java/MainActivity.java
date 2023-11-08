package com.example.facebookpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name1;
    EditText passwd;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name1=(EditText) findViewById(R.id.e1);
        passwd=(EditText) findViewById(R.id.e1);

        b1=(Button) findViewById(R.id.button2);

    }
    public void click(View view)
    {
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        String str=name1.getText().toString();
        if(!passwd.getText().toString().equals("Admin"))
        {
            Toast.makeText(this,"Please enter the valid password!",Toast.LENGTH_SHORT).show();
        }
        intent.putExtra("username",str);
        startActivity(intent);

    }
}