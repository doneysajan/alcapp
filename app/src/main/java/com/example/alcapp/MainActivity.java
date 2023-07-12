package com.example.alcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ALCAPP","OnCreate()");
    }
    @Override
    public void onStart() {

        super.onStart();
        Log.d("ALCAPP","OnStart()");
    }
    @Override
    public void onStop() {

        super.onStop();
        Log.d("ALCAPP","OnStop()");

    }
    @Override
    public void onDestroy()
    {
     super.onDestroy();
        Log.d("ALCAPP","OnDestroy()");
    }
    @Override
    public void onResume()
    {
        super.onResume();
        Log.d("ALCAPP","Onresume()");
    }
    @Override
    public void onPause()
    {
        super.onPause();
        Log.d("ALCAPP","Onpause()");
    }

}