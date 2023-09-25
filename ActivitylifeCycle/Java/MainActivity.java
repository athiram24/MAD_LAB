package com.example.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onStart() {

        super.onStart();
        Log.d("Lifecycle", "onStart invoked");
    }

    protected void onPause() {

        super.onPause();
        Log.d("Lifecycle", "onPause invoked");
    }

    protected void onResume() {

        super.onResume();
        Log.d("Lifecycle", "onResume invoked");
    }
    protected void onStop() {

        super.onStop();
        Log.d("Lifecycle", "onStop invoked");
    }
    protected void onRestart() {

        super.onRestart();
        Log.d("Lifecycle", "onRestart invoked");
    }
    protected void onDestroy() {

        super.onDestroy();
        Log.d("Lifecycle", "onDestroy invoked");
    }
}