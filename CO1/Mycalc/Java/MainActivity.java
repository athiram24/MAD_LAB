package com.example.mycalculator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    EditText num1,num2,Result;
    Button b1,b2,b3,b4;
    Integer n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        num1 = (EditText) findViewById(R.id.Num1);
        num2 = (EditText) findViewById(R.id.Num2);
        Result = (EditText) findViewById(R.id.Result);
    }

        public void add(View v)
        {


            n1 = Integer.parseInt(String.valueOf(num1.getText()));
            n2 = Integer.parseInt(String.valueOf(num2.getText()));
            Result.setText(Integer.toString(n1+n2));

        }
    public void sub(View v)
    {


        n1 = Integer.parseInt(String.valueOf(num1.getText()));
        n2 = Integer.parseInt(String.valueOf(num2.getText()));
        Result.setText(Integer.toString(n1-n2));

    }
    public void mul(View v)
    {


        n1 = Integer.parseInt(String.valueOf(num1.getText()));
        n2 = Integer.parseInt(String.valueOf(num2.getText()));
        Result.setText(Integer.toString(n1*n2));

    }
    public void div(View v)
    {


        n1 = Integer.parseInt(String.valueOf(num1.getText()));
        n2 = Integer.parseInt(String.valueOf(num2.getText()));
        Result.setText(Integer.toString(n1/n2));

    }



    }
