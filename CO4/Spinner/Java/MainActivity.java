package com.example.spinneradapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{


    EditText name;
    EditText phone;
    EditText email,address;
    Button btn;
    String string;
    Spinner spinner;
    String []course = {"Course","MCA","Mtech","Btech","BCA"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button);
        name = (EditText)findViewById(R.id.Name);
        phone = (EditText)findViewById(R.id.phno);
        email = (EditText)findViewById(R.id.email);
        address = (EditText)findViewById(R.id.Address);



        //spinner and adapter initialiazation
        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_spinner_item, course);
        spinner.setAdapter(ad);
        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
    }
    public void onClick(View view)
    {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);

    }






    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        //Toast.makeText(this,"You have selected",Toast.LENGTH_SHORT).show();
        TextView tv = (TextView) view;
        String string = ((TextView) view).getText().toString();
        Toast.makeText(this,"Selected "+string,Toast.LENGTH_SHORT).show();



    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}