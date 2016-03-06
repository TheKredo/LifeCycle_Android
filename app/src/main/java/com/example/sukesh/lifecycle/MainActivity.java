package com.example.sukesh.lifecycle;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
  Button b;
    //1.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        Log.d("sukesh","onCreate() was called");
    }

    //2.
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("sukesh","onstart() was called");
    }

    //3.
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("sukesh", "onStop() was called");
    }

    //4.
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("sukesh", "onRestart() was called");
    }

    //5.
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("sukesh", "onResume() was called");
    }

    //6.
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("sukesh", "onDestroy() was called");
    }

    //7.
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("sukesh", "onPause() was called");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d("sukesh", "ORIEANTATION CHANGED");
    }

    public void botman(View v)
    {

        Intent i=new Intent(this,ActB.class);
        startActivity(i);


    }



}
