package com.example.arraylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simpleListView;
    String course[] = {"C-programming","Data Structure","Database","Python","Java","Operating System"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleListView = (ListView) findViewById(R.id.simpleLIstView);
        ArrayAdapter<String> array = new ArrayAdapter<String>(this,R.layout.item_view,R.id.itemTextView,course);
        simpleListView.setAdapter(array);
        simpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent in=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(in);

            }
        });



    }
}